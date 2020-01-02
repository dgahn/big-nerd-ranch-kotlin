package ch05

/**
 * 익명 함수 안의 매개변수가 하나인 경우에는 "it"을 사용할 수 있다.
 */

fun main() {
    val greetingFunction: (String) -> String = {
        val currentYear = 2019
        "SimVillage 방문을 환영합니다. $it 님! (copyright $currentYear)"
    }
    println(greetingFunction("김선달"))

    var t = "Mississippi".count({ it == 's'})
    println(t)
}