package com.zhangchao.todolist;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class SimplePaddingDecoration extends RecyclerView.ItemDecoration {

    private int dividerHeight;


    public SimplePaddingDecoration(View.OnClickListener context) {
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = dividerHeight;//类似加了一个bottom padding
    }
}