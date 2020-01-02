package ch05

/**
 * 람다를 사용하면 JVM 상에서 람다마다 객체가 생성되어 메모리를 할당하게 되는데
 * 이런 자원의 낭비를 해결하기 위해 "인라인"이라는 최적화 방법을 제공한다.
 */

fun main() {
    val greetingFunction =
        runSimulation2("김선달") {
                playerName: String, numBuildings: Int ->
            val currentYear = 2019
            println("$numBuildings 채의 건물이 추가됨")
            "SimpVillage 방문을 환영합니다, $playerName! (copyright $currentYear)"
        }
}

inline fun runSimulation2(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() // 1, 2, 3 중 하나를 무작위로 선택한다.
    println(greetingFunction(playerName, numBuildings))
}