package com.ltdd.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListMem extends AppCompatActivity {

    private ListView listView;
    ArrayList<Member> items = new ArrayList<>();
    MemberAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mem);

        listView = (ListView) findViewById(R.id.list_view);
        items.add(new Member("Nguyễn Thanh Tâm","Trung Tá", "Quảng Bình",4,R.drawable.congan1)) ;
        items.add(new Member("Phạm Minh Tùng","Thiếu tá", "Hà Tĩnh",4,R.drawable.congan1)) ;
        items.add(new Member("Nguyễn Ngọc Thương","Trung Tá", "Hà Tĩnh",5,R.drawable.congan1));
        items.add(new Member("Trần Thị NGọc ","Trung tá", "Quảng Ninh",5,R.drawable.congan1));

        adapter = new MemberAdapter(ListMem.this,items);
        listView.setAdapter(adapter);
    }
}