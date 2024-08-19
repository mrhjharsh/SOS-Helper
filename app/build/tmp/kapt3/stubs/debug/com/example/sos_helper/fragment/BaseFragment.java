package com.example.sos_helper.fragment;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/example/sos_helper/fragment/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "fbInstance", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getFbInstance", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "setFbInstance", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "sharedPref", "Lcom/example/sos_helper/sharedPreference/SharedPref;", "getSharedPref", "()Lcom/example/sos_helper/sharedPreference/SharedPref;", "setSharedPref", "(Lcom/example/sos_helper/sharedPreference/SharedPref;)V", "firebaseTokenGenerator", "", "init", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "popupAndNavigate", "from", "", "to", "app_debug"})
public class BaseFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject
    public com.google.firebase.firestore.FirebaseFirestore fbInstance;
    public com.example.sos_helper.sharedPreference.SharedPref sharedPref;
    public android.app.Activity activity;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.FirebaseFirestore getFbInstance() {
        return null;
    }
    
    public final void setFbInstance(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.sos_helper.sharedPreference.SharedPref getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.NotNull
    com.example.sos_helper.sharedPreference.SharedPref p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public final void setActivity(@org.jetbrains.annotations.NotNull
    android.app.Activity p0) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    public final void popupAndNavigate(int from, int to) {
    }
    
    public final void firebaseTokenGenerator() {
    }
}