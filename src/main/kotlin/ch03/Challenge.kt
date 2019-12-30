package ch03


fun main() {
    val name = "마드리갈"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (!auraVisible) {
        "None"
    } else {
        when (karma) {
            in 0..5 -> "red"
            in 6..10 -> "orange"
            in 11..15 -> "purple"
            in 16..20 -> "green"
            else -> "None"
        }
    }

    val healthStatus = when (healthPoints) {
        100 -> "최상의 상태임!"
        in 90..99 -> "약간의 철과상만 있음."
        in 75..90 ->
            if (isBlessed) {
                "경미한 상처가 있지만 빨리 치유됨!"
            } else {
                "경미한 상처만 있음."
            }
        in 15..74 ->
            "많이 다친 것 같음."
        else -> "최악의 상태임!"
    }

    println("(HP: $healthPoints) (Aura: $auraColor) -> $name $healthStatus")
}