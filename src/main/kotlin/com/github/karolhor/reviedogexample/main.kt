package com.github.karolhor.reviedogexample

import com.github.karolhor.reviedogexample.other.Compute
import java.util.UUID

fun main() {
    val id = UUID.randomUUID()
//    val id = UUID.randomUUID().let {it.toString() }
    val sum = Compute.add(5, 3)
//    println("Example msg: $id")
    println("Result: $sum")
}
