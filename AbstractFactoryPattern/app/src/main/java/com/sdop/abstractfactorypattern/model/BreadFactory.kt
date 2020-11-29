package com.sdop.abstractfactorypattern.model

import com.sdop.abstractfactorypattern.model.bread.*
import com.sdop.abstractfactorypattern.model.fillings.Filling
import com.sdop.abstractfactorypattern.model.fillings.FillingType

object BreadFactory : AbstractFactory() {

    override fun getBread(breadType: BreadType): Bread =
        when (breadType) {
            is BreadType.Brioche -> Brioche()
            is BreadType.Baguette -> Baguette()
            is BreadType.Roll -> Roll()
        }

    override fun getFilling(fillingType: FillingType): Filling {
        throw RuntimeException("BreadFactory not support getFilling")
    }
}

