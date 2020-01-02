package ch05

/*
{}을 통해서 함수를 정의하고 ()를 통해서 함수를 호출한다.
 */

/*
함수를 변수에 저장해서 호출할 수 있다.
 */

fun main() {
//    println({
//        val currentYear = 2019
//        "SimVillage 방문을 환영합니다, 촌장님! (copyright $currentYear)"
//    }())
    val greetingFunction = {
        val currentYear = 2019
        "SimVillage 방문을 환영합니다, 촌장님! (copyright $currentYear)"
    }

    println(greetingFunction())
}