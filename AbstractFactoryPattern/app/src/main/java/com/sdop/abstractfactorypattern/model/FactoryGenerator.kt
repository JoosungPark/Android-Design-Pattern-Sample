package com.sdop.abstractfactorypattern.model

object FactoryGenerator {
    fun getFactory(type: FactoryType): AbstractFactory =
        when (type) {
            is FactoryType.Bread -> BreadFactory
            is FactoryType.Filling -> FillingFactory
        }
}

sealed class FactoryType {
    object Bread : FactoryType()
    object Filling : FactoryType()
}