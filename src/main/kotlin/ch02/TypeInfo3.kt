package ch02

/*
초기화로 인해 타입이 정해져 있는 경우 컴파일러가 타입 추론을 해준다.
 */

fun main() {
    val playerName = "에스트라곤"
    var experiencePoints = 5
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
}