package ch09

/**
 * 수신자인 menuFile 객체에게 수행되는 모든 함수를 보기 좋게 작성할 수 있다.
 */

import java.io.File

fun main() {
    val menuFile = File("menu-file.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }
}