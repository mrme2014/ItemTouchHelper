package com.qiaomu.itemtouchhelper;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.qiaomu.itemtouchhelper.itemtouchhelper.ItemTouchHelper;

import static com.qiaomu.itemtouchhelper.itemtouchhelper.ItemTouchHelper.ACTION_STATE_DRAG;
import static com.qiaomu.itemtouchhelper.itemtouchhelper.ItemTouchHelper.ACTION_STATE_SWIPE;

/**
 * Created by qiaomu on 2017/10/11.
 */

public class ItemTouchHelperCallback extends ItemTouchHelper.Callback {
    public static final int DRAG_FLAGS_HORIZONTAL = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
    public static final int DRAG_FLAGS_VERTICAL = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
    public static final int DRAG_FLAGS_ALL = DRAG_FLAGS_HORIZONTAL | DRAG_FLAGS_VERTICAL;

    private int mDragFlags;
    private ItemTouchActionCallback mActionCallback;

    public ItemTouchHelperCallback(ItemTouchActionCallback callback) {
        this(0, callback);
    }

    public ItemTouchHelperCallback(int dragFlags, ItemTouchActionCallback callback) {
        mDragFlags = dragFlags;
        mActionCallback = callback;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return makeMovementFlags(mDragFlags, ItemTouchHelper.START);
    }

    @Override
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
        super.onSelectedChanged(viewHolder, actionState);
        if (actionState == ACTION_STATE_DRAG && viewHolder != null)
            viewHolder.itemView.setAlpha(0.7f);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        mActionCallback.onMoved(viewHolder.getAdapterPosition(), target.getAdapterPosition());
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

    }

    @Override
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        viewHolder.itemView.setAlpha(1f);
    }

    @Override
    public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        if (actionState == ACTION_STATE_SWIPE) {
            int translateX = mActionCallback.getMenuWidth(viewHolder);
            View contentView = mActionCallback.getContentView(viewHolder);
            if (dX < -translateX) {
                dX = -translateX;
                contentView.setTranslationX(dX);
            } else {
                contentView.setTranslationX(dX);
            }
        } else {
            super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        }

    }

}
