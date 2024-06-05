package com.example.mycat;

import static java.security.AccessController.getContext;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "style.db";
    public static final String TABLE_NAME = "Styles";
    public static final String ID = "ID";
    public static final String Names = "Names";
    public static final String First = "hundredFirst";
    public static final String Second = "hundredSecond";
    public static final String Third = "hundredThird";
    public static final String Fourth = "hundredKms";

    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Создание таблицы для стилей
        String SQL_CREATE_ENTRIES = "CREATE TABLE " + DatabaseHelper.TABLE_NAME + " (" +
        DatabaseHelper.ID + " INTEGER PRIMARY KEY," +
        DatabaseHelper.Names + " TEXT," +
        DatabaseHelper.First + " TEXT," +
        DatabaseHelper.Second + " TEXT," +
        DatabaseHelper.Third + " TEXT," +
        DatabaseHelper.Fourth + " TEXT)";

        final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + DatabaseHelper.TABLE_NAME;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Обновление базы данных (пример)
        if (oldVersion < newVersion) {
            db.execSQL("DROP TABLE IF EXISTS style");
            onCreate(db);
        }
    }

    public boolean insertData(String ID, String Name, String First100, String Second100, String Fhird100, String KMS100) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.ID, ID);
        values.put(DatabaseHelper.Names, Name);
        values.put(DatabaseHelper.First, First100);
        values.put(DatabaseHelper.Second, Second100);
        values.put(DatabaseHelper.Third, Fhird100);
        values.put(DatabaseHelper.Fourth, KMS100);

        long result = db.insert(DatabaseHelper.TABLE_NAME, null, values);

        return result != -1; // если result == -1, данные не были добавлены
    }
    public void ADD1(){



        ContentValues values = new ContentValues();
        values.put(ID, 1);
        values.put(Names, "Баттерфляй");
        values.put(First, "1:01,90");
        values.put(Second, "1:10,50");
        values.put(Third, "1:20,50");
        values.put(Fourth, "58,40");
        SQLiteDatabase db = this.getWritableDatabase();
        long newRowID = db.insert("style", null, values);
        db.close();
    }
}
