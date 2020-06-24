package com.example.myticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class TaiKhoanActivity extends AppCompatActivity {
    Button btnThayDoiTT;
    TextView txtTenND, txtNgaySinh, txtSDT,txtMatKhau, txtCMT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_taikhoan);
        anhxa();
        init();


    }

    private void init() {
        Intent intent = getIntent ();
        ArrayList<Nguoidung> nguoidungArrayList = intent.getParcelableArrayListExtra ("mangnguoidung");
        txtNgaySinh.setText(nguoidungArrayList.get (0).getNgaysinh ());
        txtCMT.setText(nguoidungArrayList.get (0).getCmt ());
        txtTenND.setText(nguoidungArrayList.get (0).getTennd ());
        txtSDT.setText(nguoidungArrayList.get (0).getSdt ());
        txtMatKhau.setText(nguoidungArrayList.get (0).getMatkhau ());

    }

    private void anhxa() {
        txtTenND = (TextView) findViewById (R.id.txtTenND);
        txtMatKhau = (TextView) findViewById (R.id.txtMatKhau);
        txtSDT = (TextView) findViewById (R.id.txtSDT);
        txtCMT = (TextView) findViewById (R.id.txtCMT);
        txtNgaySinh = (TextView) findViewById (R.id.txtNgaySinh);
        btnThayDoiTT = (Button) findViewById (R.id.btnThayDoiTT);
    }
}
