package com.example.myfirstapp.finalproject.DataBaseUsers

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.myfirstapp.finalproject.DataBaseUsers.User.CREATOR.s_codeColl

class DataBaseHelper(context: Context) : SQLiteOpenHelper(
    context, dataBaseName, null, dataBaseVersion
) {
    lateinit var sqlOperation: SQLiteDatabase

    init {
        sqlOperation = writableDatabase
    }

    companion object {

        const val dataBaseName: String = "Users"
        const val dataBaseVersion: Int = 1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(User.createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun insertion(
        userName: String,
        email: String,
        phoneNumber: String,
        password: String,
    ): Boolean {
        val s = ContentValues()
        s.put(User.userNameColl, userName)
        s.put(User.emailColl, email)
        s.put(User.phoneNumberColl, phoneNumber)
        s.put(User.s_codeColl, "0000")      ////////////////////////////////////
        s.put(User.passwordColl, password)
        return sqlOperation.insert(User.tableName, null, s) > 0

    }

    fun readAll(): ArrayList<User> {
        var array = ArrayList<User>()
        var index = sqlOperation.rawQuery(User.selectAll, null)
        index.moveToFirst()
        while (!index.isAfterLast) {
            var user = User(
                index.getString(0),
                index.getString(1),
                index.getString(2),
                index.getString(3),
                index.getInt(4),
                index.getString(5)
            )
            array.add(user)
            index.moveToNext()
        }
        index.close()
        return array

    }

      fun changePass(name: String, password: String): Boolean {
        var contentValues = ContentValues()
        contentValues.put(User.passwordColl, password)
        return sqlOperation.update(
            User.tableName, contentValues, "" +
                    "$this.name = ${User.userNameColl} " , null
        ) > 0
          //  and $s_codeColl = ${User.s_codeColl.toInt()}
    }
//    fun changeProfileData ( name: String, email: String , phone: String , oldPass : String, newPass: String ): Boolean {
//        var contentValues = ContentValues()
//        contentValues.put(User.userNameColl, name)
//        contentValues.put(User.emailColl, email)
//        contentValues.put(User.phoneNumberColl, phone)
//        contentValues.put(User.passwordColl, newPass)
//        return sqlOperation.update(
//            User.tableName, contentValues, "" +
//                    "$oldPass = ${User.passwordColl} and $name = ${User.userNameColl} " , null
//        ) > 0
//        //  and $s_codeColl = ${User.s_codeColl.toInt()}
//    }
}