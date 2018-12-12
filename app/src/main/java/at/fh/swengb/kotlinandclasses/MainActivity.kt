package at.fh.swengb.kotlinandclasses

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_copy.*

class MainActivity : AppCompatActivity() {

    val livingThingList = mutableListOf<LivingThing>()
    var player = Player(10, 2, "WinOrDie", 300, 80, true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_copy)
//
//        val lion = Lion("Lannister", 200, 50, true)
//        val dragon = Dragon("Targaryen", 250, 40, true, 10)
//
//        livingThingList.add(lion)
//        livingThingList.add(dragon)
//        Log.e("TAAAG", "List Size: ${livingThingList.size}")
//
//        updateTextViews()
//        info.text = "Press Button to Start"
//        linearLayout.visibility = View.GONE
//        linearLayout2.visibility = View.GONE

        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                progressBar.progress = p1
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
    }

    fun start(v: View) {

    }

    fun attackFirstMonster(v: View) {
        val monsterToAttack = livingThingList.firstOrNull() ?: return
        player.attack(monsterToAttack)
        updateList()
        updateTextViews()
    }

    fun monsterAttacksPlayer(v: View) {
        val monsterThatAttacks = livingThingList.firstOrNull() ?: return
        monsterThatAttacks.attack(player)
        updateList()
        updateTextViews()
    }

    private fun updateList() {
        livingThingList.removeAll { !it.isAlive }
    }

    private fun updateTextViews() {
        val monster = livingThingList.firstOrNull() ?: return
        monsterName.text = monster.name
        monster_health.text = monster.health.toString()
        playerName.text = player.name
        player_health.text = player.health.toString()
        player_lvl.text = player.level.toString()
    }
}



class Car(val color: String, val model: String, val year: Int, val fuelType: String) {
    fun start() {
        // Implement start behaviour
    }

    fun stop() {
        // Implement stop behaviour
    }

    fun accelerate() {
        // Implement acceleration behaviour
    }
}
