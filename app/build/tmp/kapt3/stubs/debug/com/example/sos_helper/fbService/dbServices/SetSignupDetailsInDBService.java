package com.example.sos_helper.fbService.dbServices;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/example/sos_helper/fbService/dbServices/SetSignupDetailsInDBService;", "", "()V", "startService", "", "activity", "Landroid/app/Activity;", "firestoreInstance", "Lcom/google/firebase/firestore/FirebaseFirestore;", "name", "", "email", "password", "cPassword", "signUpCallbacks", "Lcom/example/sos_helper/fbService/dbServices/SetSignupDetailsInDBService$SignUpCallbacks;", "SignUpCallbacks", "app_debug"})
public final class SetSignupDetailsInDBService {
    
    public SetSignupDetailsInDBService() {
        super();
    }
    
    public final void startService(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestoreInstance, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    java.lang.String cPassword, @org.jetbrains.annotations.NotNull
    com.example.sos_helper.fbService.dbServices.SetSignupDetailsInDBService.SignUpCallbacks signUpCallbacks) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/sos_helper/fbService/dbServices/SetSignupDetailsInDBService$SignUpCallbacks;", "", "onFail", "", "onSuccess", "app_debug"})
    public static abstract interface SignUpCallbacks {
        
        public abstract void onSuccess();
        
        public abstract void onFail();
    }
}