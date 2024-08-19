package com.example.sos_helper.fragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010\u001d\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/sos_helper/fragment/SearchFriendFragment;", "Lcom/example/sos_helper/fragment/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/example/sos_helper/database/service/DataBaseService$DataBaseServiceCallBack;", "()V", "binding", "Lcom/example/sos_helper/databinding/FragmentSearchFriendBinding;", "loginDetailsModel", "", "Lcom/example/sos_helper/database/model/LoginClass;", "loginDetailsModelFiltered", "loginDetailsViewModel", "Lcom/example/sos_helper/viewModel/LoginDetailsViewModel;", "filterUsers", "", "newText", "", "getAllLoginDetails", "init", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_debug"})
public final class SearchFriendFragment extends com.example.sos_helper.fragment.BaseFragment implements android.view.View.OnClickListener, com.example.sos_helper.database.service.DataBaseService.DataBaseServiceCallBack {
    private com.example.sos_helper.viewModel.LoginDetailsViewModel loginDetailsViewModel;
    private com.example.sos_helper.databinding.FragmentSearchFriendBinding binding;
    private java.util.List<com.example.sos_helper.database.model.LoginClass> loginDetailsModel;
    private java.util.List<com.example.sos_helper.database.model.LoginClass> loginDetailsModelFiltered;
    
    public SearchFriendFragment() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void init() {
    }
    
    private final void setAdapter(java.util.List<com.example.sos_helper.database.model.LoginClass> loginDetailsModelFiltered) {
    }
    
    private final void filterUsers(java.lang.String newText) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    @java.lang.Override
    public void getAllLoginDetails(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.sos_helper.database.model.LoginClass> loginDetailsModel) {
    }
}