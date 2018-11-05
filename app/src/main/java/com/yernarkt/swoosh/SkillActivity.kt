package com.yernarkt.swoosh

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        finishBtnBehavior()
    }

    private fun finishBtnBehavior() {
        btnFinish.setOnClickListener {
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }
    }
}
