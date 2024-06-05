package com.example.mycat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.Preference;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText editText1 = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);
        final EditText editText3 = findViewById(R.id.editText3);
        Button saveBut = findViewById(R.id.save1);
        Button saveBut2 = findViewById(R.id.save2);
        Button saveBut3 = findViewById(R.id.save3);
        saveBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editText = editText1.getText().toString().trim();
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(MainActivity2.this);
                pref.edit().putString("1", editText).apply();
                TextView savedText1 = findViewById(R.id.saveText1);
                String svText = pref.getString("1", "");
                savedText1.setText(svText);
            }
        });
        saveBut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editText1 = editText2.getText().toString().trim();
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(MainActivity2.this);
                pref.edit().putString("2", editText1).apply();
                TextView savedText2 = findViewById(R.id.saveText2);
                String svText1 = pref.getString("2", "");
                savedText2.setText(svText1);
            }
        });
        saveBut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editText2 = editText3.getText().toString().trim();
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(MainActivity2.this);
                pref.edit().putString("3", editText2).apply();
                TextView savedText3 = findViewById(R.id.saveText3);
                String svText2 = pref.getString("3", "");
                savedText3.setText(svText2);
            }
        });
    }
}