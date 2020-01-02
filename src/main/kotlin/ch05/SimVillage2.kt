package ch05

/**
 * 코트린에서 익명 함수의 마지막 코드는 암시적으로 값을 리턴한다.
 */

fun main() {
    val greetingFunction = {
        val currentYear = 2019
        "SimVillage 방문을 환영합니다, 촌장님! (copyright $currentYear)"
    }
}