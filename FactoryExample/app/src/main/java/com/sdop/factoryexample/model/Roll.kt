package com.sdop.factoryexample.model

class Roll : Bread {
    override val name: String
        get() = "Roll"

    override val calories: String
        get() = "75 kcal"
}