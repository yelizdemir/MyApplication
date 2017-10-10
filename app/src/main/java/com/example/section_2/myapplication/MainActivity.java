package com.example.section_2.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView txtMesaj;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMesaj =(TextView) findViewById(R.id.txt_mesaj);
        txtMesaj.setText(R.string.karsilama_html);


    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "onStart Çalıştı", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "onResume Çalıştı", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause Çalıştı", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy Çalıştı", Toast.LENGTH_SHORT).show();
    }
}
