package jp.techacademy.noriyoshi.kotlinlog

import android.util.Log

open class Dog: Animal {
    constructor(name: String, age: Int) : super(name, age)

    override fun say()
    {
        Log.d("kotlintest", "「私の名前は" + this.name + "です。年は" + this.name + "歳です。」")
    }


    fun think()
    {
        Log.d("kotlintest", "「私は" + this.name + "について考える。」")
    }
}