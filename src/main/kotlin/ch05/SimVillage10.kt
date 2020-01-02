package ch05

/**
 * 이름이 있는 함수가 인자로 전달될 수 있게 해주는 문법이 "함수 참조"다
 **/

fun main() {
    val greetingFunction =
        runSimulation3("김선달", ::printConstructionCost) {
                playerName: String, numBuildings: Int ->
            val currentYear = 2019
            println("$numBuildings 채의 건물이 추가됨")
            "SimpVillage 방문을 환영합니다, $playerName! (copyright $currentYear)"
        }
}

inline fun runSimulation3(playerName: String,
                          costPrint: (Int) -> Unit,
                          greetingFunction: (String, Int) -> String) {
    val numBuildings = (1..3).shuffled().last() // 1, 2, 3 중 하나를 무작위로 선택한다.
    costPrint(numBuildings)
    println(greetingFunction(playerName, numBuildings))
}

fun printConstructionCost(numberBuildings: Int) {
    val cost = 500
    println("건축 비용: ${cost * numberBuildings}")
}