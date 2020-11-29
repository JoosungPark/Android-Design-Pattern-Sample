package com.sdop.abstractfactorypattern.model.bread

data class Roll(
    override val name: String = "Roll",
    override val calories: String = " : 75 kcal"
) : Bread