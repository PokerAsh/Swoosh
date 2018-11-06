package com.yernarkt.swoosh.model

import android.os.Parcel
import android.os.Parcelable

class PlayerInfoData(var league: String, var skill: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(league)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PlayerInfoData> {
        override fun createFromParcel(parcel: Parcel): PlayerInfoData {
            return PlayerInfoData(parcel)
        }

        override fun newArray(size: Int): Array<PlayerInfoData?> {
            return arrayOfNulls(size)
        }
    }
}