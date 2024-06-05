package com.example.mycat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Style> styles = new ArrayList<>();


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        RecyclerView rv = findViewById(R.id.rvNames);
        StyleAdapter adapter = new StyleAdapter(this, styles);
        rv.setAdapter(adapter);

        Style s = new Style();
        s.setStyleName("Баттерфляй");
        s.setImageResourse(R.drawable.bat);
        styles.add(s);

        s = new Style();
        s.setStyleName("Спина");
        s.setImageResourse(R.drawable.spina);
        styles.add(s);

        s = new Style();
        s.setStyleName("Брасс");
        s.setImageResourse(R.drawable.brass);
        styles.add(s);

        s = new Style();
        s.setStyleName("Кроль");
        s.setImageResourse(R.drawable.kroll);
        styles.add(s);

        s = new Style();
        s.setStyleName("Комплекс");
        s.setImageResourse(R.drawable.komp);
        styles.add(s);




    }
}