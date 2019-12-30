package ch04


fun main() {
    val name = "마드리갈"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    castFireball(5)
    castFireball()
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "Yes" else "No"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean) =
    if (isBlessed && healthPoints > 50 || isImmortal) {
        "GREEN"
    } else {
        "NONE"
    }

private fun castFireball(numFireBalls: Int = 2) = println("한 덩어리의 파이어볼리 나타난다. (x$numFireBalls)")


private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> " 최상의 상태임!"
        in 90..99 -> " 약간의 철과상만 있음."
        in 75..90 ->
            if (isBlessed) {
                " 경미한 상처가 있지만 빨리 치유됨!"
            } else {
                " 경미한 상처만 있음."
            }
        in 15..74 ->
            " 많이 다친 것 같음."
        else -> " 최악의 상태임!"
    }
