package com.myself223.card

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import com.example.cardv22.room.dao.CardDatabase
import com.myself223.card.data.shared.Prefs

class App : Application() {
    companion object{
        lateinit var prefs: Prefs
        lateinit var database: CardDatabase
    }

    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(this)
        database = Room.databaseBuilder(
            this,
            CardDatabase::class.java,
            "Room Android"

        ).allowMainThreadQueries().build()
    }

}