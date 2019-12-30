package ch03

/*
문자열 템플릿을 통해서 문자열 안에 변수 값을 넣을 수 있다.
문자열 내부의 표현식은 {}을 통해서 출력할 수 있다.
 */

fun main() {
    val name = "마드리갈"
//    var healthPoints = 100
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) {
        "GREEN"
    } else {
        "NONE"
    }

    val healthStatus = when (healthPoints) {
        100 -> " 최상의 상태임!"
        in 90..99 -> " 약간의 철과상만 있음."
        in 75..90 ->
            if (isBlessed) {
                " 경미한 상처가 있지만 빨리 치유됨!"
            } else {
                " 경미한 상처만 있음."
            }
        in 15..74 ->
            " 많이 다친 것 같음."
        else -> " 최악의 상태임!"
    }

    println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "Yes" else "No"})")
    println("$name $healthStatus")
}