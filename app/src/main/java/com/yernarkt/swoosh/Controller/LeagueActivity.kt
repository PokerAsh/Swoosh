package com.yernarkt.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.NonNull
import android.widget.Toast
import com.yernarkt.swoosh.R
import com.yernarkt.swoosh.Util.EXTRA_PLAYER
import com.yernarkt.swoosh.model.PlayerInfoData
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var player = PlayerInfoData("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        nextBtnBehavior()
        toggleBtnBehavior()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        if (savedInstanceState != null )
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
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
