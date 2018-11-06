package com.yernarkt.swoosh.Controller

import android.os.Bundle
import com.yernarkt.swoosh.R
import com.yernarkt.swoosh.Util.EXTRA_PLAYER
import com.yernarkt.swoosh.model.PlayerInfoData
import kotlinx.android.synthetic.main.activity_exercise.*

class ExerciseActivity : BaseActivity() {
    lateinit var playerInfoData: PlayerInfoData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)

        playerInfoData = intent.getParcelableExtra(EXTRA_PLAYER)

        tvMessage.text = "Looking for a ${playerInfoData.league} ${playerInfoData.skill} league near you…"
    }
}
