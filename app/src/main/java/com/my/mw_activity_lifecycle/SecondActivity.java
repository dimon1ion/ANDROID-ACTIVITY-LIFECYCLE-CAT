package com.my.mw_activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.my.mw_activity_lifecycle.models.Cat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        if (intent != null){
            Cat cat = (Cat)intent.getSerializableExtra("cat");
            if (cat != null){
                if (!cat.getName().isEmpty()){
                    TextView catName = (TextView)findViewById(R.id.text_catName);
                    catName.setText(cat.getName());
                }
                if (!cat.getSound().isEmpty()){
                    TextView catSound = (TextView)findViewById(R.id.text_catSound);
                    catSound.setText(cat.getSound());
                }
            }
        }

    }
}