package com.tinnews.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.tinnews.model.Article;

@Database(entities = {Article.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract RoomDao dao();
}

