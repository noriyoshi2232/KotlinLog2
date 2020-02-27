package jp.techacademy.noriyoshi.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Human("メンバ変数から取得",0)

        Log.d("kotlintest", "私の名前は" + dog.name + "です。" +"年は" + dog.name +"です。")

        val bigdog = BigDog("hobbyから取得", 0)

        Log.d("kotlintest", "私は" + bigdog.name + "について考える。")
        }
    }

