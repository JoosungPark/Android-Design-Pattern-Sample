package com.sdop.abstractfactorypattern.model.fillings

data class Cheese(
    override val name: String = "Cheese",
    override val calories: String = " : 155 kcal"
) : Filling