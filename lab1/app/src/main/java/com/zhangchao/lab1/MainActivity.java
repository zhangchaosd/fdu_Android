package com.zhangchao.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview2;
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview2 = (TextView)findViewById(R.id.textView2);
        ed = (EditText) findViewById(R.id.editTextTextPersonName);
    }

    public void button2_click(android.view.View view) {
        textview2.setText(ed.getText());
        Log.d("onclick", ed.getText().toString());
    }
}