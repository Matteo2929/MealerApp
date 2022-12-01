// Generated by view binder compiler. Do not edit!
package com.example.mealerapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mealerapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOrderViewClientBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button complain;

  @NonNull
  public final Button goLeft;

  @NonNull
  public final Button goRight;

  @NonNull
  public final ImageView imageComplaint;

  @NonNull
  public final TextView mealOne;

  @NonNull
  public final TextView welcomeMessage;

  private ActivityOrderViewClientBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button complain, @NonNull Button goLeft, @NonNull Button goRight,
      @NonNull ImageView imageComplaint, @NonNull TextView mealOne,
      @NonNull TextView welcomeMessage) {
    this.rootView = rootView;
    this.complain = complain;
    this.goLeft = goLeft;
    this.goRight = goRight;
    this.imageComplaint = imageComplaint;
    this.mealOne = mealOne;
    this.welcomeMessage = welcomeMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOrderViewClientBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOrderViewClientBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_order_view_client, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOrderViewClientBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.complain;
      Button complain = ViewBindings.findChildViewById(rootView, id);
      if (complain == null) {
        break missingId;
      }

      id = R.id.go_left;
      Button goLeft = ViewBindings.findChildViewById(rootView, id);
      if (goLeft == null) {
        break missingId;
      }

      id = R.id.go_right;
      Button goRight = ViewBindings.findChildViewById(rootView, id);
      if (goRight == null) {
        break missingId;
      }

      id = R.id.imageComplaint;
      ImageView imageComplaint = ViewBindings.findChildViewById(rootView, id);
      if (imageComplaint == null) {
        break missingId;
      }

      id = R.id.meal_one;
      TextView mealOne = ViewBindings.findChildViewById(rootView, id);
      if (mealOne == null) {
        break missingId;
      }

      id = R.id.welcome_message;
      TextView welcomeMessage = ViewBindings.findChildViewById(rootView, id);
      if (welcomeMessage == null) {
        break missingId;
      }

      return new ActivityOrderViewClientBinding((ConstraintLayout) rootView, complain, goLeft,
          goRight, imageComplaint, mealOne, welcomeMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}