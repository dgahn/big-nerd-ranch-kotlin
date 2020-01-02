package ch05

/**
 * 함수 인자는 {} 를 통해서 단축 문법을 사용할 수 있다.
 **/

fun main() {
    val greetingFunction =
    runSimulation("김선달") {
            playerName: String, numBuildings: Int ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "SimpVillage 방문을 환영합니다, $playerName! (copyright $currentYear)"
    }
}
