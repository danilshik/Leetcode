package tasks

open class BaseTask {

    open fun tests(){}

    open fun test(result: Any?, expected: Any?){
        println("Result $result")
        println("Expected $expected")
        println("Equals ${result == expected}")
    }

}