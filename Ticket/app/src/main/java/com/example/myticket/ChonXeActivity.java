package com.example.myticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChonXeActivity extends AppCompatActivity {
    Button btntrolai, btntieptuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_chonxe);


        btntieptuc = (Button) findViewById (R.id.btntieptuc);
        btntrolai = (Button) findViewById (R.id.btntrolai);



        btntieptuc.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (ChonXeActivity.this, ChonGheActivity.class);
                startActivity (i);
            }
        });
        btntrolai.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (ChonXeActivity.this, TimKiemActivity.class);
                startActivity (i);
            }
        });
    }
}
