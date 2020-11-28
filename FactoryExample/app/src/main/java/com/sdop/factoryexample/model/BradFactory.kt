package com.sdop.factoryexample.model

class BradFactory {
    fun getBread(breadType: String): Bread? {
        if (breadType == "BRI") {
            return Brioche()
        } else if (breadType == "BAG") {
            return Baguette()
        } else if (breadType == "ROL") {
            return Roll()
        } else {
            return null
        }
    }
}