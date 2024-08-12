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

public class qus3 extends AppCompatActivity {

    RadioButton ans1,ans2,ans3,ans4;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_qus3);


        ans1=findViewById(R.id.ans1);
        ans2=findViewById(R.id.ans2);
        ans3=findViewById(R.id.ans3);
        ans4=findViewById(R.id.ans4);

        submit=findViewById(R.id.btn);

        submit.setOnClickListener(new View.OnClickListener() {
            int score=4;
            @Override
            public void onClick(View view) {
                String Value= checkanswer();
                if (!Value.isEmpty()){
                    score=score+2;
                    Toast.makeText(qus3.this, "Right Answer! Score= "+score, Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(qus3.this,qus4.class);
                    startActivity(i);
                }else{
                    Toast.makeText(qus3.this, "You are selected a wrong answer", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(qus3.this,tryagain.class);
                    startActivity(i);
                }
            }
        });
    }
    private String checkanswer(){
        String ans="";
        if (ans4.isChecked()){
            ans="30";
        }else {
            ans="";
        }
        return ans;
    }

    }
