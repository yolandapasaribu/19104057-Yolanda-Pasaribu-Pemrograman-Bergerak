package id.yolanda_19104057.modul10

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class Quote(
    var id: Int = 0,
    var title: String? = null,
    var description: String? = null,
    var category: String? = null,
    var date: String? = null
) : Parcelable