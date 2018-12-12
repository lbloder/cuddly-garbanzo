package at.fh.swengb.kotlinandclasses

open class Rectangle(val a: Double, val b: Double): Shape {
    override fun calculateArea(): Double {
        return a*b
    }
}