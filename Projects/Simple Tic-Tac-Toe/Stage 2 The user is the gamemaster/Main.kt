package tictactoe

fun main() {

    val input = readln().toList().toTypedArray()
    println(
        """
        ---------
        | %s %s %s |
        | %s %s %s |
        | %s %s %S |
        ---------
    """.trimIndent().format(*input)
    )

}