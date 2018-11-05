package com.yernarkt.swoosh

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        nextBtnBehavior()
    }

    private fun nextBtnBehavior() {
        next.setOnClickListener {
            val intent = Intent(this, SkillActivity::class.java)
            startActivity(intent)
        }
    }
}
