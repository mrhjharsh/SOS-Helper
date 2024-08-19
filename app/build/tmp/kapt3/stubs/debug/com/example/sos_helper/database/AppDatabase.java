package com.example.sos_helper.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/sos_helper/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "loginDetailDao", "Lcom/example/sos_helper/database/dao/LoginDetailDao;", "app_debug"})
@androidx.room.Database(entities = {com.example.sos_helper.database.model.LoginDetailsModel.class}, version = 3)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.sos_helper.database.dao.LoginDetailDao loginDetailDao();
}