package ch02

/*
val 같은 경우 진정한 상수가 아니다. val 변수가 다른 값을 반환하는 특별한 경우가 있다. 컴파일 시점 상수를 사용하기 위해서는
모든 함수의 외부에 정의되어야한다. 컴파일 시점 상수는 기본 타입 중 하나가 되어야 한다.
(String, Int, Double, Float, Long, Short, Byte, Char, Boolean)

상수에 대한 키워드는 const다.
 */

const val MAX_EXPERIENCE: Int = 5000

fun main() {
    val playerName = "에스트라곤"
    var experiencePoints = 5
    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
}