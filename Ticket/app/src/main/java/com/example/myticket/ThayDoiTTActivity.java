package com.example.myticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThayDoiTTActivity extends AppCompatActivity {
    Button btnCapnhat;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_capnhatthongtin);

        btnCapnhat = (Button) findViewById (R.id.btnCapNhat);

        btnCapnhat.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (ThayDoiTTActivity.this,XemTTTKActivity.class);
                startActivity (i);
            }
        });
    }
}
