package com.yernarkt.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import com.yernarkt.swoosh.R
import com.yernarkt.swoosh.Util.EXTRA_PLAYER
import com.yernarkt.swoosh.model.PlayerInfoData
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player: PlayerInfoData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

        finishBtnBehavior()
        toggleBtnBehavior()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null)
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
    }

    private fun toggleBtnBehavior() {
        tBtnBeginner.setOnClickListener {
            player.skill = "beginner"
            tBtnBaller.isChecked = false
        }

        tBtnBaller.setOnClickListener {
            player.skill = "baller"
            tBtnBeginner.isChecked = false
        }
    }

    private fun finishBtnBehavior() {
        btnFinish.setOnClickListener {
            if (player.skill != "") {
                val intent = Intent(this, ExerciseActivity::class.java)
                intent.putExtra(EXTRA_PLAYER, player)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please select your skill", Toast.LENGTH_LONG).show()
            }
        }
    }
}
