package jp.techacademy.minami.jommo.kotlinlog2

import android.util.Log

open class Dog: Animal, Movable{

    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age){
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    //　movableインタフェースのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest", this.name + "(" +this.age + "歳)" + "全力で走った。")
    }
}