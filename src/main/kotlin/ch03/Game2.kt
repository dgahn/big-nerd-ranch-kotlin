package ch03

/*
조건 표현식을 통해서 코드를 좀 더 간결하게 표현할 수 있다.
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

    println(auraColor)

    val healthStatus = if (healthPoints == 100) {
        " 최상의 상태임!"
    } else if (healthPoints >= 90) {
        " 약간의 철과상만 있음."
    } else if (healthPoints >= 75) {
        if (isBlessed) {
            " 경미한 상처가 있지만 빨리 치유됨!"
        } else {
            " 경미한 상처만 있음."
        }
    } else if (healthPoints >= 15) {
        " 많이 다친 것 같음."
    } else {
        " 최악의 상태임!"
    }

    println(name + " " + healthStatus)
}
