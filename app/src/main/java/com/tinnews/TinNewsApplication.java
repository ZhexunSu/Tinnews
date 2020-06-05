package com.tinnews;

import android.app.Application;

import androidx.room.Room;

import com.ashokvarma.gander.Gander;
import com.ashokvarma.gander.imdb.GanderIMDB;
import com.facebook.stetho.Stetho;
import com.tinnews.database.AppDatabase;

public class TinNewsApplication extends Application {

    private static AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        // TODO: new code here.
        Gander.setGanderStorage(GanderIMDB.getInstance());
        Stetho.initializeWithDefaults(this);
        database = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "tin_db").build();
    }

    public static AppDatabase getDatabase() {
        return database;
    }
}
