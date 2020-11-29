package com.sdop.factoryexample.model

class BreadFactory {
    fun getBread(breadType: BreadType): Bread = when (breadType) {
        is BreadType.Brioche -> Brioche()
        is BreadType.Baguette -> Baguette()
        is BreadType.Roll -> Roll()
    }
}

sealed class BreadType {
    object Brioche : BreadType()
    object Baguette : BreadType()
    object Roll : BreadType()
}