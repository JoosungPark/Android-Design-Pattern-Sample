package com.sdop.abstractfactorypattern.model.bread

data class Brioche(
    override val name: String = "Brioche",
    override val calories: String = " : 85 kcal"
) : Bread