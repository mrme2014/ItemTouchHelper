package com.qiaomu.itemtouchhelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.qiaomu.lib.itemtouchhelper.ItemTouchHelper;
import com.qiaomu.lib.itemtouchhelper.ItemTouchHelperCallback;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyler = (RecyclerView) findViewById(R.id.recylerView);
        List<String> list = initList();
        MessageListAdapter adapter = new MessageListAdapter(this, list);
        recyler.setLayoutManager(new LinearLayoutManager(this));
        recyler.addItemDecoration(new DividerItemDecoration(this,1));
        recyler.setAdapter(adapter);

        ItemTouchHelperCallback callback = new ItemTouchHelperCallback(ItemTouchHelperCallback.DRAG_FLAGS_VERTICAL,adapter);
        ItemTouchHelper helper = new ItemTouchHelper(callback);
        helper.attachToRecyclerView(recyler);

    }

    private List<String> initList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("itemtouchhelper_" + i);
        }
        return list;
    }
}
