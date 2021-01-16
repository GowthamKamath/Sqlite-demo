package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity9 extends AppCompatActivity {

    TextView contents;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        contents = (TextView) findViewById(R.id.content);
        dbHelper = new DBHelper(MainActivity9.this,DBHelper.DBNAME,null,DBHelper.DBVERSION);
        String data = dbHelper.displayUsers();
        contents.setText(data);

    }

    public void goBack(View view) {
        Intent i = new Intent(this,MainActivity5.class);
        startActivity(i);
    }
}