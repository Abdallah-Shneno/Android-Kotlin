package com.example.myfirstapp.customadaptor

import android.os.Parcel
import android.os.Parcelable

data class ItemCounter(
                var id: Int,
                var image: Int,
                var title: String?,
                var quantity: Int,
                var desc: String?,
                var price: String?
        ) : Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readInt(),
                parcel.readInt(),
                parcel.readString(),
                parcel.readInt(),
                parcel.readString(),
                parcel.readString()
        ) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
                parcel.writeInt(id)
                parcel.writeInt(image)
                parcel.writeString(title)
                parcel.writeInt(quantity)
                parcel.writeString(desc)
                parcel.writeString(price)
        }

        override fun describeContents(): Int {
                return 0
        }

        companion object CREATOR : Parcelable.Creator<ItemCounter> {
                override fun createFromParcel(parcel: Parcel): ItemCounter {
                        return ItemCounter(parcel)
                }

                override fun newArray(size: Int): Array<ItemCounter?> {
                        return arrayOfNulls(size)
                }
        }
}