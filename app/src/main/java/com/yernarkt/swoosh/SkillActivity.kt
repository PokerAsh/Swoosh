package com.yernarkt.swoosh

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var selectedValue: String = ""
    var selectedLeague: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        selectedLeague = intent.extras!!.getString("League")


        finishBtnBehavior()
        toggleBtnBehavior()
    }

    private fun toggleBtnBehavior() {
        tBtnBeginner.setOnClickListener {
            selectedValue = "beginner"
            tBtnBaller.isChecked = false
        }

        tBtnBaller.setOnClickListener {
            selectedValue = "baller"
            tBtnBeginner.isChecked = false
        }
    }

    private fun finishBtnBehavior() {
        btnFinish.setOnClickListener {
            if (!selectedValue.equals("")) {
                val intent = Intent(this, ExerciseActivity::class.java)
                intent.putExtra("SelectedSkill", selectedValue)
                if (selectedLeague != null)
                    intent.putExtra("SelectedLeague", selectedLeague)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please select your skill", Toast.LENGTH_LONG).show()
            }
        }
    }
}
