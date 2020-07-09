package com.example.myticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ChonGheActivity extends AppCompatActivity {
    Button btndatve , btntrolai;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_chonghe);

        btndatve = (Button) findViewById (R.id.btndatveghe);
        btntrolai = (Button) findViewById (R.id.btntrolaighe);
        btndatve.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (ChonGheActivity.this, TrangChuActivity.class);
                startActivity (i);
            }
        });
        btntrolai.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (ChonGheActivity.this, ChonGheActivity.class);
                startActivity (i);
            }
        });

    }
}
