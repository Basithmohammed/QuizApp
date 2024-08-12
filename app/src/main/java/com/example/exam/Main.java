package com.example.exam;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Main extends AppCompatActivity {



    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

//        start=findViewById(R.id.btn);
//
//
//
//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String nameData=score.getText().toString();
//
//                SharedPreferences sp=getSharedPreferences("user", Context.MODE_PRIVATE);
//                SharedPreferences.Editor ed=sp.edit();
//                ed.putString("value",nameData);
//                ed.commit();
//
//            }
//        });

        Button next =(Button) findViewById(R.id.btn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Main.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}