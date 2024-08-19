package com.example.sos_helper.database.service;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/sos_helper/database/service/DataBaseService;", "", "activity", "Landroid/app/Activity;", "lifecycleCoroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "(Landroid/app/Activity;Landroidx/lifecycle/LifecycleCoroutineScope;)V", "database", "Lcom/example/sos_helper/database/AppDatabase;", "getAllLoginDetails", "", "callBack", "Lcom/example/sos_helper/database/service/DataBaseService$DataBaseServiceCallBack;", "insert", "loginDetailsModel", "Lcom/example/sos_helper/database/model/LoginDetailsModel;", "update", "DataBaseServiceCallBack", "app_debug"})
public final class DataBaseService {
    @org.jetbrains.annotations.NotNull
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleCoroutineScope lifecycleCoroutineScope = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.sos_helper.database.AppDatabase database = null;
    
    public DataBaseService(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleCoroutineScope lifecycleCoroutineScope) {
        super();
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull
    com.example.sos_helper.database.model.LoginDetailsModel loginDetailsModel) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    com.example.sos_helper.database.model.LoginDetailsModel loginDetailsModel) {
    }
    
    public final void getAllLoginDetails(@org.jetbrains.annotations.NotNull
    com.example.sos_helper.database.service.DataBaseService.DataBaseServiceCallBack callBack) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/sos_helper/database/service/DataBaseService$DataBaseServiceCallBack;", "", "getAllLoginDetails", "", "loginDetailsModel", "", "Lcom/example/sos_helper/database/model/LoginClass;", "app_debug"})
    public static abstract interface DataBaseServiceCallBack {
        
        public abstract void getAllLoginDetails(@org.jetbrains.annotations.NotNull
        java.util.List<com.example.sos_helper.database.model.LoginClass> loginDetailsModel);
    }
}