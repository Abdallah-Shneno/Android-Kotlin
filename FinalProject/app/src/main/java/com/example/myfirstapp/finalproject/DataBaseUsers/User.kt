package com.example.myfirstapp.finalproject.DataBaseUsers

import android.os.Parcel
import android.os.Parcelable

data class User(
                 var userId : String? ,
                 var userName : String? ,
                 var email : String? ,
                 var phoneNumber : String? ,
                 var s_code : Int? ,
                 var password : String? ,
                 ) : Parcelable{


    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()

    )

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<User> {
        const val userNameColl = "username"
        const val emailColl = "email"
        const val phoneNumberColl = "phoneNumber"
        const val passwordColl = "password"
        const val s_codeColl = "s_code"
        const val tableName = "USER"
        const val idColl = "id"
        const val createTable = "CREATE TABLE $tableName (" +
                "$idColl INTEGER PRIMARY KEY AUTOINCREMENT," +
                "$userNameColl TEXT NOT NULL," +
                "$emailColl TEXT NOT NULL," +
                "$s_codeColl INTEGER NOT NULL," +
                "$phoneNumberColl TEXT NOT NULL," +
                "$passwordColl TEXT NOT NULL)"
        const val selectAll : String = "SELECT * FROM $tableName "


        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}
