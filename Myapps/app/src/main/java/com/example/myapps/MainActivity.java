package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
//membuat class MainActivity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mendeklarasikan variabel Auto complete actv1 dengan id actv1
        final AutoCompleteTextView actv1 = (AutoCompleteTextView)findViewById(R.id.actv1);
        //mendeklarasikan variabel Button dengan id button
        Button button = (Button)findViewById(R.id.button);
        //mendeklarasikan variabel image dengan id image
        ImageView image = (ImageView) findViewById(R.id.image);
        // menawarkan sugesti setelah user memasukan 1 karakter
        actv1.setThreshold(1);
        //membuat adapter
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,kota);
        //menghubungkan actv1 dengan adapter
        actv1.setAdapter(adapter);

        //menambahkan fungsi click di image
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actv1.showDropDown();

            }
        });
    }
    // Mengisi data yang nantinya akan menjadi sugesti pencarian
    private static final String[] kota = new String []{"aceh","Banyuwangi","cirebon","Denpasar"};

}