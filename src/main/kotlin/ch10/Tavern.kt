package ch10

/**
 * 코틀린의 리스트는 기본적으로 UnMutable이다.
 * 만약 Mutable한 리스트를 만들고 싶다면 mutableListOf()를 사용해야한다.
 */

import java.io.File

private const val TAVERN_NAME = "Taernyl's Folly"

var playerGold = 10
var playerSilver = 10
var patronList = mutableListOf("Eli", "Mordoc", "Sophie")
val lastName = listOf("Ironfoot", "Fernsworth", "Baggins")
val menuList = File("data/tavern-menu-items.txt")
    .readText()
    .split("\n")
val uniquePatrons = mutableSetOf<String>()

fun main() {
    if (patronList.contains("Eli")) {
        println("술집 주인이 말한다: Eli는 안쪽 방에서 카드하고 있어요.")
    } else {
        println("술집 주인이 말한다: Eli는 여기 없어요.")
    }

    if (patronList.containsAll(listOf("Sophie", "Mordoc"))) {
        println("술집 주인이 말한다: 네, 모두 있어요.")
    } else {
        println("술집 주인이 말한다: 아니오, 나간 사람도 있습니다.")
    }

    println("*** Welcome to Taernyl's Folly ***")
    var max = 0;
    menuList.forEach {
        val (_, b, c) = it.split(',')
        max = if (max < b.length) {
            b.length + c.length
        } else {
            max
        }
    }

    val menuLength = max + 10
    menuList.forEach {
        val (_, b, c) = it.split(',')
        print(b)
        for(i in 0..menuLength - b.length - c.length) {
            print(".")
        }
        println(c)
    }


//    patronList.forEachIndexed {
//        index, patron ->
//        println("좋은 밤입니다, $patron 님 = 당신은 #${index + 1} 번째 입니다.")
//        placeOrder(patron, "shandy,Dragon's Breath, 5.91")
//    }
//
//    menuList.forEachIndexed { index, data ->
//        println("$index: $data")
//    }
    (0..9).forEach {
        val first = patronList.shuffled().first()
        val last = lastName.shuffled().first()
        val name = "$first $last"
        uniquePatrons += name
    }
    println(uniquePatrons)

    var orderCount = 0
    while (orderCount <= 9) {
        placeOrder(
            uniquePatrons.shuffled().first(),
            menuList.shuffled().first()
        )
        orderCount++
    }
}

private fun performPurchase(price: Double) {
    displayBalance()

    println("금화 $price 로 술을 구입함.")

    displayBalance()
}

private fun displayBalance() {
    println("플레이어의 지갑 잔액: 금화: $playerGold 개, 은화: $playerSilver 개")
}

private fun placeOrder(patronName: String, menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("${patronName}은 ${tavernMaster}에게 주문한다.")

    val (type, name, price) = menuData.split(',')
    val message = "${patronName}은 금화 $price 로 $name ($type)를 구입한다."
    println(message)

    performPurchase(price.toDouble())

    val phrase = if (name == "Dragon's Breath") {
        "${patronName}이 감탄한다: ${toDragonSpeak("와, $name 진짜 좋구나!")}"
    } else {
        "${patronName}이 말한다: 감사합니다 $name."
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