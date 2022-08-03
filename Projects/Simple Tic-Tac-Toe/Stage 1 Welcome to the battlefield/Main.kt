package tictactoe

import kotlin.random.Random

fun main() {
    val board = MutableList(3){ MutableList(3) { 'O' } }
    val random = Random
    for (i in board.indices) {
        for (c in board[i].indices) {
            if (random.nextBoolean()) board[i][c] = 'X'
        }
        println(board[i].joinToString(" "))
    }
}