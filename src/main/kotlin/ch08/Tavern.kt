package ch08

import kotlin.math.roundToInt

private const val TAVERN_NAME = "Taernyl's Folly"

var playerGold = 10
var playerSilver = 10

fun main() {
    placeOrder("shandy,Dragon's Breath, 5.91", 3)
}

private fun performPurchase(price: Double) {
    displayBalance()
    val totalPurchase = playerGold + (playerSilver / 100.0)
    println("지갑 전체 금액: 금화 $totalPurchase")

    val remainingBalance = totalPurchase - price
    if (remainingBalance < 0) {
        println("잔액이 부족합니다.")
        return
    }
    println("금화 $price 로 술을 구입함.")
    println("남은 잔액: ${"$%.2f".format(remainingBalance)}")

    val remainingGold = remainingBalance.toInt()
    val remainingSilver = (remainingBalance % 1 * 100).roundToInt()
    playerGold = remainingGold
    playerSilver = remainingSilver
    displayBalance()
}

private fun displayBalance() {
    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")
}

private fun placeOrder(menuData: String, quantity: Int) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("마드리갈은 ${tavernMaster}에게 주문한다.")

    val (type, name, price) = menuData.split(',')
    val message = "마드리갈은 금화 $price 로 $name ($type)를 구입한다."
    println(message)

    for (i in 0..quantity) {
        performPurchase(price.toDouble())
    }

    val phrase = if (name == "Dragon's Breath") {
        "마드리갈이 감탄한다: ${toDragonSpeak("와, $name 진짜 좋구나!")}"
    } else {
        "마드리갈이 말한다: 감사합니다 $name."
    }
    println(phrase)
}

private fun toDragonSpeak(phrase: String) =
    phrase.replace(Regex("[aeiouAEIOU]")) {
        when (it.value) {
            "a", "A" -> "4"
            "e", "E" -> "3"
            "i", "I" -> "1"
            "u", "U" -> "|_|"
            else -> it.value
        }
    }



