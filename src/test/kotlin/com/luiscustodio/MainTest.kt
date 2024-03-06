package com.luiscustodio

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

fun <T> last(list: List<T>): T = list[list.lastIndex]


class P01Test {
    @Test
    fun `find the last element of a list`() {
        assertThat(last(listOf(1, 1, 2, 3, 5, 8)), equalTo(8))
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun `last element in empty list`() {
        last(listOf<Int>())
    }
}

class P19Test {
    @Test
    fun `rotate a list N places to the left`() {
        val testInput = "abcdefghijk".toList()
        val expected = "defghijkabc".toList()
        assertThat(rotate(3, testInput).size, equalTo(testInput.size))
        assertThat(rotate(3, testInput), equalTo(expected))
    }

    @Test
    fun `rotate a list N places to the left with negative numbers`() {
        val testInput = "abcdefghijk".toList()
        val expected = "jkabcdefghi".toList()
        assertThat(rotate(-2, testInput).size, equalTo(testInput.size))
        assertThat(rotate(-2, testInput), equalTo(expected))
    }

    private fun rotate(index: Int, toList: List<Char>): List<Char> {
        if (index < 0) {
            val offset = toList.size + index
            return toList.drop(offset) + toList.take(offset)
        }
        return toList.drop(index) + toList.take(index)
    }
}