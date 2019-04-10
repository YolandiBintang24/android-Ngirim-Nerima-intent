package com.yolandi.aplikasichat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendExtrasBundle(View v){
        EditText psn = (EditText) findViewById(R.id.inputPesan);
        String pesan = psn.getText().toString();


        Intent chat = new Intent(this, secondActivity.class);
        Bundle data = new Bundle();
        data.putString("name", pesan);
        chat.putExtras(data);
        startActivity(chat);
    }
}
