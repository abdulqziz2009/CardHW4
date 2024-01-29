package com.myself223.card.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.myself223.card.data.room.cardModel

@Dao
interface Dao {
    @Insert
    fun insertNotes(cardModel: cardModel)
}