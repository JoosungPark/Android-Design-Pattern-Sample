package com.sdop.abstractfactorypattern.model

import com.sdop.abstractfactorypattern.model.bread.*
import com.sdop.abstractfactorypattern.model.fillings.Cheese
import com.sdop.abstractfactorypattern.model.fillings.Filling
import com.sdop.abstractfactorypattern.model.fillings.FillingType
import com.sdop.abstractfactorypattern.model.fillings.Tomato

object FillingFactory : AbstractFactory() {
    override fun getBread(breadType: BreadType): Bread {
        throw RuntimeException("BreadFactory not support getFilling")
    }

    override fun getFilling(fillingType: FillingType): Filling =
        when (fillingType) {
            is FillingType.Cheese -> Cheese()
            is FillingType.Tomato -> Tomato()
        }
}