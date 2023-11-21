package com.plcoding.roomguideandroid

import androidx.room.Database
import androidx.room.RoomDatabase

// BingChat
@Database(
    entities = [Contact::class],
    version = 1,
    exportSchema = false
)
abstract class ContactDatabase: RoomDatabase() {

    abstract val dao: ContactDao
}