package com.qiaomu.lib.itemtouchhelper;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by qiaomu on 2017/10/11.
 */

public interface ItemTouchActionCallback {
    /**
     *
     * @param holder 手指所在条目所持有的viewhodler
     * @return 返回侧滑时需要跟着手指移动的View,如果该条目不可滑动，请返回null
     */
    View getContentView(RecyclerView.ViewHolder holder);

    /**
     * 请告诉我们你的侧滑菜单宽度是多少，才能准确的计算视图最大滑动距离
     * @param holder
     * @return
     */
    int getMenuWidth(RecyclerView.ViewHolder holder);

    /**
     *长按已触发，上下拖动不断回调
     * @param fromPos
     * @param toPos
     */
    void onMove(int fromPos, int toPos);

    /**
     * 拖拽已结束，位置交换完成
     * @param fromPos
     * @param toPos
     */
    void onMoved(int fromPos, int toPos);
}
