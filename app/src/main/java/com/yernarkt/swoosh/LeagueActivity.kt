package com.yernarkt.swoosh

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        nextBtnBehavior()
        toggleBtnBehavior()
    }

    private fun toggleBtnBehavior() {
        tBtnMens.setOnClickListener {
            selectedLeague = "Mens"
            tBtnWomens.isChecked = false
            tBtnCo_ed.isChecked = false
        }

        tBtnWomens.setOnClickListener {
            selectedLeague = "Womens"
            tBtnMens.isChecked = false
            tBtnCo_ed.isChecked = false
        }

        tBtnCo_ed.setOnClickListener {
            selectedLeague = "Co-ed"
            tBtnMens.isChecked = false
            tBtnWomens.isChecked = false
        }
    }

    private fun nextBtnBehavior() {
        next.setOnClickListener {
            if (!selectedLeague.equals("")) {
                val intent = Intent(this, SkillActivity::class.java)
                intent.putExtra("League", selectedLeague)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please select the league", Toast.LENGTH_LONG).show()
            }
        }
    }
}
