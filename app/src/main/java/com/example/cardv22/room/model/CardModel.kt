package com.example.cardv22.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CardModel (
 @PrimaryKey(autoGenerate = true)
 val id:Int,
 val  name: String,
 val list: List<CategoryModel>
)
