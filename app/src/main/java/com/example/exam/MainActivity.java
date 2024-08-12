package com.example.exam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioButton ans1,ans2,ans3,ans4;
    Button submit;

    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        ans1=findViewById(R.id.ans1);
        ans2=findViewById(R.id.ans2);
        ans3=findViewById(R.id.ans3);
        ans4=findViewById(R.id.ans4);

        submit=findViewById(R.id.btn);

        submit.setOnClickListener(new View.OnClickListener() {
            int score=0;
            @Override
            public void onClick(View view) {
                String Value= checkanswer();
                if (!Value.isEmpty()){

                    score=score+2;
                    Toast.makeText(MainActivity.this, "Right Answer! Score = " +score, Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,qus2.class);
                    startActivity(i);
                }else{
                    Toast.makeText(MainActivity.this, "You are selected a wrong answer", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this,tryagain.class);
                    startActivity(i);
                }
            }
        });
    }
    private String checkanswer(){
        String ans="";

        if (ans2.isChecked()){
            ans="MODI";

        }else {
            ans="";
        }
        return ans;
    }
}