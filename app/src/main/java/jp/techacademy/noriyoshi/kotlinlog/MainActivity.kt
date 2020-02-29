package jp.techacademy.noriyoshi.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("メンバ変数から取得", 3)
        dog.say()
        val thikable= Dog("hobbyから取得",3)
        dog.think()
    }
}