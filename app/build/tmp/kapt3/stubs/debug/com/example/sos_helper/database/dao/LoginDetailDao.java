package com.example.sos_helper.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/sos_helper/database/dao/LoginDetailDao;", "", "getAllLoginDetails", "Lcom/example/sos_helper/database/model/LoginDetailsModel;", "insert", "", "loginDetailsModel", "update", "app_debug"})
@androidx.room.Dao
public abstract interface LoginDetailDao {
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.sos_helper.database.model.LoginDetailsModel loginDetailsModel);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    com.example.sos_helper.database.model.LoginDetailsModel loginDetailsModel);
    
    @androidx.room.Query(value = "Select * from loginDetailTable")
    @org.jetbrains.annotations.NotNull
    public abstract com.example.sos_helper.database.model.LoginDetailsModel getAllLoginDetails();
}