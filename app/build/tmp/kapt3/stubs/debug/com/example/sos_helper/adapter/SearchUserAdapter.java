package com.example.sos_helper.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/sos_helper/adapter/SearchUserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/sos_helper/adapter/SearchUserAdapter$ItemViewHolder;", "listAddFriends", "", "Lcom/example/sos_helper/database/model/LoginClass;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewHolder", "app_debug"})
public final class SearchUserAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.sos_helper.adapter.SearchUserAdapter.ItemViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.sos_helper.database.model.LoginClass> listAddFriends = null;
    
    public SearchUserAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.sos_helper.database.model.LoginClass> listAddFriends) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.sos_helper.adapter.SearchUserAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.sos_helper.adapter.SearchUserAdapter.ItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/sos_helper/adapter/SearchUserAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "txtFriendEmail", "Landroidx/appcompat/widget/AppCompatTextView;", "getTxtFriendEmail", "()Landroidx/appcompat/widget/AppCompatTextView;", "txtFriendName", "getTxtFriendName", "vAdd", "getVAdd", "()Landroid/view/View;", "app_debug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final androidx.appcompat.widget.AppCompatTextView txtFriendName = null;
        @org.jetbrains.annotations.NotNull
        private final androidx.appcompat.widget.AppCompatTextView txtFriendEmail = null;
        @org.jetbrains.annotations.NotNull
        private final android.view.View vAdd = null;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.appcompat.widget.AppCompatTextView getTxtFriendName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.appcompat.widget.AppCompatTextView getTxtFriendEmail() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.view.View getVAdd() {
            return null;
        }
    }
}