package ch05

/*
익명 함수를 통해서 함수가 어떻게 실행할지에 대한 방법을 정의할 수 있다.
 */

fun main() {
    val numLetters = "Mississippi".count() { it == 's' }
    println(numLetters)
}