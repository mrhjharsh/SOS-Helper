package com.example.sos_helper.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0019"}, d2 = {"Lcom/example/sos_helper/repository/LoginDetailsRepository;", "", "()V", "fbInstance", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getFbInstance", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "setFbInstance", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "list", "", "Lcom/example/sos_helper/model/LoginDetails;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "loginLiveData", "Landroidx/lifecycle/MutableLiveData;", "getLoginLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setLoginLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "fetchDetailsFromFireBase", "", "getLiveData", "app_debug"})
public final class LoginDetailsRepository {
    public androidx.lifecycle.MutableLiveData<java.util.List<com.example.sos_helper.model.LoginDetails>> loginLiveData;
    public com.google.firebase.firestore.FirebaseFirestore fbInstance;
    public java.util.List<com.example.sos_helper.model.LoginDetails> list;
    
    public LoginDetailsRepository() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.sos_helper.model.LoginDetails>> getLoginLiveData() {
        return null;
    }
    
    public final void setLoginLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.sos_helper.model.LoginDetails>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.FirebaseFirestore getFbInstance() {
        return null;
    }
    
    public final void setFbInstance(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.sos_helper.model.LoginDetails> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.sos_helper.model.LoginDetails> p0) {
    }
    
    private final void fetchDetailsFromFireBase() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.sos_helper.model.LoginDetails>> getLiveData() {
        return null;
    }
}