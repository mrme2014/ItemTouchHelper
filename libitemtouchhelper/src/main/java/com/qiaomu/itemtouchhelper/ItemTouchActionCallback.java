package com.qiaomu.itemtouchhelper;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by qiaomu on 2017/10/11.
 */

public interface ItemTouchActionCallback {
    View getContentView(RecyclerView.ViewHolder holder);

    int getMenuWidth(RecyclerView.ViewHolder holder);

    void onMoved(int fromPos, int toPos);
}
