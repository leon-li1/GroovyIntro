package com.test.demo

class FirstGroovyProgram {
    static void main(String[] args) {
        Integer age = 34
        println("Hello $age!")
        5.times { print it }
        println()
        def lis = [1, 2, 3, 4, 5]
        lis.each { print it }
        println()
        def m = ["a": 1, "b": 2]
        def m2 = m.entrySet()
        println m2.getClass()
        println(m2)
    }
}
