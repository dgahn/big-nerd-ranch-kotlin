package ch09

/**
 * 람다를 전달하여 해당 람다를 실행하게 한다.
 * apply는 해당 객체가 가지고 있는 메소드를 실행하는 것이고
 * let은 람다를 인자로 전달하여 해당 함수를 실행하는 것이다.
 */

fun main() {
    val firstItemSquared = listOf(1,2,3).first().let {
        it * it
    }
    println(firstItemSquared)

    println(formatGreeting("dgahn"))
}

fun formatGreeting(vipGuest: String?): String {
    return vipGuest?.let {
        "오랜만입니다, $it. 테이블이 준비되어 있으니 들어오시죠."
    } ?: "저희 술집에 오신 것을 환영합니다. 곧 자리를 마련해 드리겠습니다."
}
