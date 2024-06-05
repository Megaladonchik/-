package com.example.mycat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
        Button result;
        Button normativ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        result = findViewById(R.id.resultgo);
        normativ = findViewById(R.id.normgo);
    }
    public void Result(View first){
        Intent lol = new Intent(this, MainActivity2.class);
        startActivity(lol);
    }
    public void Norm(View first){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}