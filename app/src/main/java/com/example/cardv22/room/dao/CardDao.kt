package com.example.cardv22.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cardv22.room.model.CardModel

@Dao
interface CardDao {

    @Query("SELECT * FROM cardmodel")
    fun getALLcard(): List<CardModel>

    @Insert
    fun insertCard(model: CardModel)
}



