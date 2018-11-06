package com.yernarkt.swoosh

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exercise.*

class ExerciseActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        val selectedSkill = intent.getStringExtra("SelectedSkill")
        val selectedValue = intent.getStringExtra("SelectedLeague")

        tvMessage.text = "Looking for a $selectedValue $selectedSkill league near you…"
    }
}
