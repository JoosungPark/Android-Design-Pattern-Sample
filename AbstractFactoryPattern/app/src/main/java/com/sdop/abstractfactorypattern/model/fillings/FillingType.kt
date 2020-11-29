package com.sdop.abstractfactorypattern.model.fillings

sealed class FillingType {
    object Cheese : FillingType()
    object Tomato : FillingType()
}