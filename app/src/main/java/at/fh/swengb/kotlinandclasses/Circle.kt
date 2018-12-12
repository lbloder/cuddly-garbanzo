package at.fh.swengb.kotlinandclasses

import kotlin.math.PI
import kotlin.math.pow

class Circle(val r: Double): Shape {

    override fun calculateArea(): Double {
        return r.pow(2) * PI
    }
}