package at.fh.swengb.kotlinandclasses

import android.util.Log

class Dragon(name: String, health: Int, attackStrength: Int, isAlive: Boolean, private var aggresionLevel: Int): LivingThing(name, health, attackStrength, isAlive) {

    override fun attack(attackee: LivingThing) {
        breathFire()
        super.attack(attackee)
    }

    override fun takeDamageFrom(attacker: LivingThing, damage: Int) {
        super.takeDamageFrom(attacker, damage)

        if(isAlive) {
            aggresionLevel = aggresionLevel + 20
            if (aggresionLevel > 20) {
                attack(attacker)
            }
        }
    }

    private fun breathFire() {
        Log.i("DRAGON", "The Dragon breaths fire")
    }
}