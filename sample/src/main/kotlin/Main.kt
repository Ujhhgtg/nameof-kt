package dev.ujhhgtg.nameof

class ClassName

fun functionName() {}

val propertyName: String
    get() = ""

object ObjectName

fun main() {
    fun localFunctionName() {}
    val variableName = ""

    println("class: ${nameof(ClassName::class)}")
    println("function: ${nameof(::functionName)}")
    println("local function: ${nameof(::localFunctionName)}")
    println("function compat: ${nameof(functionName())}")
    println("property: ${nameof(::propertyName)}")
    println("property compat: ${nameof(propertyName)}")
    println("object: ${nameof(ObjectName::class)}")
    println("variable: ${nameof(variableName)}")
}
