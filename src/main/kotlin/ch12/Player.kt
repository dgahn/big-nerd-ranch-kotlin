package ch12

class Player {
    var name = "마드리갈"
    get() = field.capitalize()
    set(value) {
        field = value.trim()
    }
    var healthPoints = 89
    val isBlessed = true
    private val isImmortal = false

    fun castFireball(numFireBalls: Int = 2) {
        println("한 덩어리의 파이어볼이 나타난다. (x$numFireBalls)")
    }

    fun auraColor(): String {
        val auraVisible = isBlessed && healthPoints > 50 || isImmortal
        return if (auraVisible) {
            "GREEN"
        } else {
            "NONE"
        }
    }

    fun formatHealthStatus() =
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

}

fun main() {
    val player = Player()
    player.name = "estragon "
    println(player.name + "TheBrave")
    player.castFireball()

    printPlayerStatus(player)
}

private fun printPlayerStatus(player: Player) {
    println("(Aura: ${player.auraColor()}) (Blessed: ${if (player.isBlessed) "Yes" else "No"})")
    println("${player.name} ${player.formatHealthStatus()}")
}
