package ch05

/**
 * 반환 타입으로 함수 타입을 작성할 수 있다.
 * 코틀린의 람다는 클로저다.
 * 클로저는 "close over"가 합쳐진 용어고
 * 다른 함수에 포함된 함수에서 자신을 포함하는 함수의 매개변수와 변수를 사용할 수 있는 것을 말한다.
 * 클로저는 익명 함수가 자신이 포함된 함수의 변수 참조를 갖는다는 것을 의미한다.
 **/

fun main() {
    runSimulation4()
}

fun runSimulation4() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("김선달"))
    println(greetingFunction("김선달"))
    println(greetingFunction("김선달"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "병원"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2019
        numBuildings += 1
        println("$numBuildings 채의 ${structureType}이 추가됨")
        "SimpVillage 방문을 환영합니다, $playerName! (copyright $currentYear)"
    }
}