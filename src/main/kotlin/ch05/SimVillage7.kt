package ch05

/**
 * 익명 함수를 람다라고 부른다.
 * 익명 함수의 정의는 람다 표현식이다.
 * 익명 함수의 반환 결과는 람다 결과다.
 **/


fun main() {
    val greetingFunction = {
            playerName: String, numBuildings: Int ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "SimpVillage 방문을 환영합니다, $playerName! (copyright $currentYear)"
    }
    runSimulation("김선달", greetingFunction)
}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() // 1, 2, 3 중 하나를 무작위로 선택한다.
    println(greetingFunction(playerName, numBuildings))
}