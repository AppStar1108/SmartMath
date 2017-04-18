package com.example.hussain.smartmath;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hussain on 18/10/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABSE_VERSION = 1;

    private static final String DATABASE_NAME = "users.db";
    private static final String TABLE_NAME = "users";

    private static final String CLOUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_PASSWORD = "password";

    SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table users(id integer primary key not null , " +
            "name text not null, username text not null, password text not null);";

    public DatabaseHelper(Context context){

        super(context, DATABASE_NAME, null, DATABSE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;

    }
//this will insert user inputted data into the database from register page
    public void insertUser(User u){
        db = this.getReadableDatabase();
        ContentValues values  = new ContentValues();

        String query = "select * from users";
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(CLOUMN_ID, count);
        values.put(COLUMN_NAME, u.getName());
        values.put(COLUMN_USERNAME, u.getUsername());
        values.put(COLUMN_PASSWORD, u.getPassword());
        db.insert(TABLE_NAME, null, values);
    }

    public String searchPass(String username){

        db = this.getReadableDatabase();
        String query = "select * username, password from " + TABLE_NAME;
        Cursor cursor =db.rawQuery(query, null);
        String a;
        String b;
        b = "Not found";

        if(cursor.moveToFirst()){
            do{
                a = cursor.getString(0);


                if(a.equals(username)){
                    b = cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
    }
        return b;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query ="DROP TABLE IF EXIST" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }
}
