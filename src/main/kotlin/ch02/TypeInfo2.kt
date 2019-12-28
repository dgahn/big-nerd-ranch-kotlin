package ch02

/*
코틀린에서는 읽기 전용 변수인 val 라는 키워드를 제공해준다.
 */

fun main() {
    val playerName: String = "에스트라곤"
    var experiencePoints: Int = 5
//    playerName = "마드리길" // error
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
}

/*
val 키워드로 선언한 변수는 초기화되면 이후로는 변경할 수 없다. 만약 선언한 변수를 다음에 변경할 필요가 없다면 val로 선언하는 것을 권장한다.
 */

