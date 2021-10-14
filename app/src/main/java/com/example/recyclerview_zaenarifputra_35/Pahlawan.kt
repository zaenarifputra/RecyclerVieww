package com.example.recyclerview_zaenarifputra_35

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pahlawan(
    val imgPahlawan: Int,
    val namePahlawan: String,
    val descPahlawan: String
) : Parcelable
