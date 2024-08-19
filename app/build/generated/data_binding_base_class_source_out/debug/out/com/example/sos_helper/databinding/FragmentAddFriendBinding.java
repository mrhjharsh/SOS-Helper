// Generated by view binder compiler. Do not edit!
package com.example.sos_helper.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sos_helper.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddFriendBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final RecyclerView rvFriendRequest;

  @NonNull
  public final SearchView svSearch;

  private FragmentAddFriendBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull RecyclerView rvFriendRequest, @NonNull SearchView svSearch) {
    this.rootView = rootView;
    this.rvFriendRequest = rvFriendRequest;
    this.svSearch = svSearch;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddFriendBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddFriendBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_friend, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddFriendBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rvFriendRequest;
      RecyclerView rvFriendRequest = ViewBindings.findChildViewById(rootView, id);
      if (rvFriendRequest == null) {
        break missingId;
      }

      id = R.id.svSearch;
      SearchView svSearch = ViewBindings.findChildViewById(rootView, id);
      if (svSearch == null) {
        break missingId;
      }

      return new FragmentAddFriendBinding((LinearLayoutCompat) rootView, rvFriendRequest, svSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
