package ch05

/**
 * 익명 함수의 리턴 타입도 타입 추론을 통해서 해결할 수 있다.
 */

fun main() {
    val greetingFunction = {
        playerName: String, numBuildings: Int ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "SimpVillage 방문을 환영합니다, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("김선달", 2))
}
