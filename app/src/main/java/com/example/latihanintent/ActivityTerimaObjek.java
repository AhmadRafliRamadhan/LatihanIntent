package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTerimaObjek extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terima_objek);

        textView = findViewById(R.id.tvGw);

        MyBio biodata = getIntent().getParcelableExtra("biodata");
        textView.setText("Nama saya" + biodata.getName() + "\n umur saya " + biodata.getAge());
    }
}
