package jp.techacademy.noriyoshi.kotlinlog

abstract class Animal
{
    var name: String
    constructor(name: String, age: Int)
    {
        this.name = name
    }
    abstract fun say()
}
