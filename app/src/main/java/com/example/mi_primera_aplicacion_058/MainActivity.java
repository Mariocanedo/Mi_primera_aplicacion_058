package com.example.mi_primera_aplicacion_058;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // buscar y enlazar la vista

        TextView textView = findViewById(R.id.textView4);
        textView.setText("Este textview esta seteado con otro valor");

    }
}