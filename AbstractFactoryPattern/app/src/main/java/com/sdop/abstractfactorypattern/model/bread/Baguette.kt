package com.sdop.abstractfactorypattern.model.bread

data class Baguette(
    override val name: String = "Baguette",
    override val calories: String = " : 65 kcal"
) : Bread