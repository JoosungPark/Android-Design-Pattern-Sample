package com.sdop.abstractfactorypattern.model.fillings

data class Tomato(
    override val name: String = "Tomato",
    override val calories: String = " : 17.7 kcal"
) : Filling