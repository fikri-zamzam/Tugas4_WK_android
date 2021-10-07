package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //membuat variabel Listview
        ListView list = (ListView) findViewById(R.id.listview);
        //mengisi data array
        String[] namaHewan = {"singa","kucing","Anjing","Harimau"};
        //membuat adapter agar dapat menghubungkam array dan listView
        ArrayAdapter<String>myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, namaHewan);
        // Menghubungkan list dan adapter
        list.setAdapter(myAdapter);
    }
}