package com.my.mw_activity_lifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.my.mw_activity_lifecycle.models.Cat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_one).setOnClickListener(view -> {
            Intent secondActivity = new Intent(this, SecondActivity.class);
            String catName =((EditText)findViewById(R.id.edit_one)).getText().toString();
            String catSound =((EditText)findViewById(R.id.edit_two)).getText().toString();
            Cat cat = new Cat(catName, catSound);
            secondActivity.putExtra("cat", cat);
            startActivity(secondActivity);
        });
    }
}