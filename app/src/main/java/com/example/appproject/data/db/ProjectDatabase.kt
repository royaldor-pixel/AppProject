package com.example.appproject.data.db

import android.content.Context
import androidx.room.*
import com.example.appproject.data.db.entities.ProjectItem

@Database(
    entities = [ProjectItem::class],
    version = 1
)
abstract class ProjectDatabase : RoomDatabase() {

    abstract fun getProjectDao(): ProjectDao

    companion object {
        @Volatile //使其他线程可以访问
        private var instance: ProjectDatabase? = null

        private val LOCK = Any()

        /**
         *  每次创建database实体时，调取operator函数
         *  若database实体不存在，将线程加锁，使得其他
         *  线程无法访问，并且创建数据库实体
         **/

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }

        /**
         *  创建数据库
         **/

        private fun createDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            ProjectDatabase::class.java,
            "ProjectDB.db"
        ).build()
    }
}