package ch02

/*
변수와 상수는 지정한 데이터 타입을 갖는데 코틀린은 변수나 상수의 값을 확인하여 타입을 자동으로 처리해준다.
 */

fun main() {
    var experiencePoints: Int = 5
//    val experiencePoints: Int = "thirty-two"  // error
    experiencePoints += 5
    println(experiencePoints)
}

/*
코틀린은 정적 타입 시스템을 사용하기 때문에 Int 데이터 타입의 변수에 String 값을 넣으면 에러가 발생한다.
이러한 기능을 정적 타입 검사라고 한다.
 */

