package ch04

/*
코틀린에서 함수의 매개변수는 읽기 전용인 val로 선언이 된다. 그러므로 바꿀 수 없음을 인지해야한다.
 */

/*
하나의 명령문이 싱행되는 함수를 정의할 때는 헤더에 정의하는 반환 타입, 몸체를 나타내는 중괄호, 몸체 내부의 return 문을 모두 생략할 수 있다.
 */

/*
코틀린에서는 함수의 인자를 전달할 때 인자를 지정해서 전달할 수 있다.
printPlayerStatus(healthStatus = status, auraColor = "NONE", isBlessed = true, name = "마드리갈")
지명 함수 인자는 인자의 순서를 지키지 않아도 되고 코드의 가독성을 올려준다.
 */

/*
Nothing은 Unit과 비슷하지만 호출 코드로 제어가 복귀되지 않는다.
예외를 발생시킬 때 사용하는 반환타입이다.
 */

fun main() {
    val name = "마드리갈"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    castFireball(5)
    castFireball()
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "Yes" else "No"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    return if (auraVisible) {
        "GREEN"
    } else {
        "NONE"
    }
}

private fun castFireball(numFireBalls: Int = 2) = println("한 덩어리의 파이어볼리 나타난다. (x$numFireBalls)")


private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
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
