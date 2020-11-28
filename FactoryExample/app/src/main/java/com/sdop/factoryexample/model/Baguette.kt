package com.sdop.factoryexample.model

class Baguette : Bread {
    override val name: String
        get() = "Baguette"

    override val calories: String
        get() = " : 65 kcal"
}