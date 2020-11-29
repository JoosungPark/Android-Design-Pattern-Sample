package com.sdop.abstractfactorypattern.model.bread

sealed class BreadType {
    object Brioche : BreadType()
    object Baguette : BreadType()
    object Roll : BreadType()
}