package com.example.myticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class XemTTTKActivity extends AppCompatActivity {
    Button btnTrangChu , btnTDTT;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_taikhoan);

        btnTrangChu = (Button) findViewById (R.id.btnTrangChu);
        btnTDTT = (Button) findViewById (R.id.btnThayDoiTT);



        btnTrangChu.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (XemTTTKActivity.this, TrangChuActivity.class);
                startActivity (i);
            }
        });
        btnTDTT.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (XemTTTKActivity.this, ThayDoiTTActivity.class);
                startActivity (i);
            }
        });

    }
}
