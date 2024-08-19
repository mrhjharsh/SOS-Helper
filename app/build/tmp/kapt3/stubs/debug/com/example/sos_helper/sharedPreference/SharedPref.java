package com.example.sos_helper.sharedPreference;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/sos_helper/sharedPreference/SharedPref;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "IS_LOGGED_IN", "", "IS_ON_BOARDING_SHOWN", "USER_EMAIL", "USER_INSERTED", "editor", "Landroid/content/SharedPreferences$Editor;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getIsLoggedIn", "", "getIsUserInserted", "getOnBoardingShown", "getUserEmail", "setIsLoggedIn", "", "value", "setIsUserInserted", "setOnBoardingShown", "setUserEmail", "app_debug"})
public final class SharedPref {
    @org.jetbrains.annotations.NotNull
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.NotNull
    private android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull
    private android.content.SharedPreferences.Editor editor;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String IS_ON_BOARDING_SHOWN = "isOnBoardingShown";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String IS_LOGGED_IN = "isLoggedIn";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String USER_EMAIL = "userEmail";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String USER_INSERTED = "userInserted";
    
    public SharedPref(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        super();
    }
    
    public final void setOnBoardingShown(boolean value) {
    }
    
    public final boolean getOnBoardingShown() {
        return false;
    }
    
    public final void setIsLoggedIn(boolean value) {
    }
    
    public final boolean getIsLoggedIn() {
        return false;
    }
    
    public final void setIsUserInserted(boolean value) {
    }
    
    public final boolean getIsUserInserted() {
        return false;
    }
    
    public final void setUserEmail(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserEmail() {
        return null;
    }
}