package jp.techacademy.noriyoshi.kotlinlog

import android.util.Log

open class Human {

    var name: String
    var age: Int


    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }


    open fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" )
    }
}