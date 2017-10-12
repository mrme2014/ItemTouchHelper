package com.qiaomu.itemtouchhelper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.qiaomu.itemtouchhelper.callback.ItemTouchActionCallback;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by qiaomu on 2017/10/11.
 */

public class MessageListAdapter extends RecyclerView.Adapter<MessageListAdapter.MessageHolder> implements ItemTouchActionCallback {
    private Context mContext;
    private List<String> mList;

    public MessageListAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public MessageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MessageHolder messageHolder = new MessageHolder(LayoutInflater.from(mContext).inflate(R.layout.message_list_item, parent, false));
        return messageHolder;
    }

    @Override
    public void onBindViewHolder(MessageHolder holder, final int position) {
        holder.contentTv.setText(mList.get(position));
        holder.deleteTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "delete onclick" + position, Toast.LENGTH_SHORT).show();
            }
        });

        holder.moreTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "moreTv onclick" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public View getContentView(RecyclerView.ViewHolder holder) {
        MessageHolder messageHolder = (MessageHolder) holder;
        return messageHolder.contentTv;
    }

    @Override
    public int getMenuWidth(RecyclerView.ViewHolder holder) {
        MessageHolder messageHolder = (MessageHolder) holder;
        return messageHolder.moreTv.getWidth() + messageHolder.deleteTv.getWidth();
    }

    @Override
    public void onMoved(int fromPos, int toPos) {
        Collections.swap(mList, fromPos, toPos);
        notifyItemMoved(fromPos, toPos);
    }

    public static class MessageHolder extends RecyclerView.ViewHolder {
        public TextView contentTv;
        public TextView deleteTv;
        public TextView moreTv;

        public MessageHolder(View itemView) {
            super(itemView);
            contentTv = (TextView) itemView.findViewById(R.id.list_item);
            deleteTv = (TextView) itemView.findViewById(R.id.delete);
            moreTv = (TextView) itemView.findViewById(R.id.more);
        }
    }
}
