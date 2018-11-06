package com.yernarkt.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.yernarkt.swoosh.R
import com.yernarkt.swoosh.Util.EXTRA_PLAYER
import com.yernarkt.swoosh.model.PlayerInfoData
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var player = PlayerInfoData("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        nextBtnBehavior()
        toggleBtnBehavior()
    }

    private fun toggleBtnBehavior() {
        tBtnMens.setOnClickListener {
            player.league = "Mens"
            tBtnWomens.isChecked = false
            tBtnCo_ed.isChecked = false
        }

        tBtnWomens.setOnClickListener {
            player.league = "Womens"
            tBtnMens.isChecked = false
            tBtnCo_ed.isChecked = false
        }

        tBtnCo_ed.setOnClickListener {
            player.league = "Co-ed"
            tBtnMens.isChecked = false
            tBtnWomens.isChecked = false
        }
    }

    private fun nextBtnBehavior() {
        next.setOnClickListener {
            if (player.league != "") {
                val intent = Intent(this, SkillActivity::class.java)
                intent.putExtra(EXTRA_PLAYER, player)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please select the league", Toast.LENGTH_LONG).show()
            }
        }
    }
}
