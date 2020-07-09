package com.example.myticket;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TrangChuActivity extends AppCompatActivity {

Button btnTrangchu, btnTaiKoan, btnVe, btndatve;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_home);

    btnTrangchu = (Button) findViewById (R.id.btnTrangChuHome);
    btndatve = (Button) findViewById (R.id.btnDatveHome);
    btnTaiKoan = (Button) findViewById (R.id.btntaikhoanHome);
    btnVe = (Button) findViewById (R.id.btnVeHome);



        btndatve.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (TrangChuActivity.this,TimKiemActivity.class);
                startActivity (i);
            }
        });
        btnTaiKoan.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (TrangChuActivity.this,XemTTTKActivity.class);
                startActivity (i);
            }
        });
        btnVe.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (TrangChuActivity.this,ThongTinVeActivity.class);
                startActivity (i);
            }
        });

    }



}
