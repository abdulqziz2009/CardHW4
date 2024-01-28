package com.example.cardv22.room.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cardv22.room.model.CardModel


@Database(entities = [CardModel::class], version = 1)
abstract class CardDatabase : RoomDatabase() {
    abstract fun getDao(): CardDao
}