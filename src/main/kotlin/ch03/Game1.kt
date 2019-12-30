package ch03

/*
비교연산자를 통해서 출력을 다르게하는 프로그램을 짤 수 있다.
기존 자바와 비슷한데 다른 것은 다음 연산자다.

== : 값이 같은지 비교한다.
!= : 값이 다른지 비교한다.
=== : 같은 인스턴스인지 비교한다.
!== : 다른 인스턴스인지 비교한다.
 */

/*
연산자의 우선순위
1순위 : !
2순위 : <, <=, >, >=
3순위 : ==, !=
4순위 : &&
5순위 : ||
 */

fun main() {
    val name = "마드리갈"
//    var healthPoints = 100
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
//    if (isBlessed && healthPoints > 50 || isImmortal) {
    if (auraVisible) {
        println("GREEN")
    } else {
        println("NONE")
    }

    if (healthPoints == 100) {
        println(name + " 최상의 상태임!")
    } else if (healthPoints >= 90) {
        println(name + " 약간의 철과상만 있음.")
    } else if (healthPoints >= 75) {
        if (isBlessed) {
            println(name + " 경미한 상처가 있지만 빨리 치유됨!")
        } else {
            println(name + " 경미한 상처만 있음.")
        }
    } else if (healthPoints >= 15) {
        println(name + " 많이 다친 것 같음.")
    } else {
        println(name + " 최악의 상태임!")
    }
}