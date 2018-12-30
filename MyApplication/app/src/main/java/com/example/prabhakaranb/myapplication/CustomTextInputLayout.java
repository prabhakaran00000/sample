package com.example.prabhakaranb.myapplication;

import android.content.Context;

import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.util.AttributeSet;

public class CustomTextInputLayout extends TextInputLayout {


    public CustomTextInputLayout(Context context) {
        super(context);
    }

    public CustomTextInputLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextInputLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void hideError(){
     indicatorViewController.errorView.setVisibility(GONE);
    }


}
