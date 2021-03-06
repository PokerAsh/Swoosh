package com.yernarkt.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.yernarkt.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtnBehavior()
    }

    private fun getStartedBtnBehavior() {
        btnGetStarted.setOnClickListener {
            val intent = Intent(this, LeagueActivity::class.java)
            startActivity(intent)
        }
    }
}
