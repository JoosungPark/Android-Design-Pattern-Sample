package com.sdop.abstractfactorypattern.model

import com.sdop.abstractfactorypattern.model.bread.Bread
import com.sdop.abstractfactorypattern.model.bread.BreadType
import com.sdop.abstractfactorypattern.model.fillings.Filling
import com.sdop.abstractfactorypattern.model.fillings.FillingType

abstract class AbstractFactory {
    abstract fun getBread(breadType: BreadType): Bread
    abstract fun getFilling(fillingType: FillingType): Filling
}