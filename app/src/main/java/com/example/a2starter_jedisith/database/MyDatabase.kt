package com.example.a2starter_jedisith.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

// @TODO: Add your list of Entitys in the arrayOf() parameter. Example:  arrayOf(Person::class)
//@Database(entities = arrayOf(), version = 1, exportSchema = false)
//public abstract class MyDatabase : RoomDatabase() {
//
//    // @TODO: Add your DAOS here
//    // For example:
//    // abstract fun wordDao(): WordDao
//
//    companion object {
//        // Singleton prevents multiple instances of database opening at the
//        // same time.
//        @Volatile
//        private var INSTANCE: MyDatabase? = null
//
//        fun getDatabase(context: Context): MyDatabase {
//            // if the INSTANCE is not null, then return it,
//            // if it is, then create the database
//            return INSTANCE ?: synchronized(this) {
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    MyDatabase::class.java,
//                    "starwars_database"         //@TODO the name of your database in sql
//                ).allowMainThreadQueries().build()  // @TODO: Remove allowMainThreadQueries in production!
//                INSTANCE = instance
//                // return instance
//                instance
//            }
//        }
//    }
//}