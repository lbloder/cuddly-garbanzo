package at.fh.swengb.kotlinandclasses

import android.util.Log

open class LivingThing(val name: String, var health: Int, val attackStrength: Int, var isAlive: Boolean) {
    open fun attack(attackee: LivingThing) {
        Log.i("LivingThing", "Attacking ${attackee.name} with attackStrength: ${attackStrength}")
        attackee.takeDamageFrom(this, attackStrength)
    }

    open fun takeDamageFrom(attacker: LivingThing, damage: Int) {
        Log.i("LivingThing", "${name} is taking ${damage} damage from: ${attacker.name}")
        health = health - damage

        if (health <= 0) {
            Log.i("LivingThing", "${name} was beaten by ${attacker.name}")
            isAlive = false
        }
    }
}