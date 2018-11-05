package com.yernarkt.swoosh

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exercise.*

class ExerciseActivity : BaseActivity() {

    var selectedSkill: String? = ""
    var selectedValue: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        selectedSkill = intent.extras!!.getString("SelectedSkill")
        selectedValue = intent.extras!!.getString("SelectedLeague")

        if(selectedSkill != null || selectedValue != null){
            tvMessage.text = String.format("Looking for a %s %s league near you…", selectedSkill, selectedValue)
        }
    }
}
