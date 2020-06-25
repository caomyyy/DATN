package com.example.myticket;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myticket.Server.APIUtils;
import com.example.myticket.Server.DataClient;

import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DangNhapActivity extends AppCompatActivity {
    EditText edtSDTDN, edtMatKhauDN;
    Button btnDangKyDN, btnDangNhapDN;
    String sdt, matkhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_dangnhap);


        anhxa();


       btnDangKyDN.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (DangNhapActivity.this, DangKyActivity.class);
                startActivity (intent);
            }
        });

       btnDangNhapDN.setOnClickListener (new View.OnClickListener ( ) {
           @Override
           public void onClick(View v) {
               sdt = edtSDTDN.getText ().toString ();
               matkhau = edtMatKhauDN.getText ().toString ();
               if (sdt.length () >0 && matkhau.length () >0){
                    DataClient dataClient =APIUtils.getData ();
                    Call<List<Nguoidung>>  callback = dataClient.Logindata (sdt, matkhau);
                    callback.enqueue (new Callback<List<Nguoidung>> ( ) {
                        @Override
                        public void onResponse(Call<List<Nguoidung>> call, Response<List<Nguoidung>> response) {
                            ArrayList<Nguoidung> mangnguoidung = (ArrayList<Nguoidung>) response.body ();
                            if (mangnguoidung.size () >0){
                                Intent intent = new Intent (DangNhapActivity.this, TrangChuActivity.class);
                                intent.putExtra ("mangnguoidung", mangnguoidung);
                                startActivity (intent);
                                Toast.makeText (DangNhapActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show ( );
                            }
                        }

                        @Override
                        public void onFailure(Call<List<Nguoidung>> call, Throwable t) {

                        }
                    });

               } else {
                   Toast.makeText (DangNhapActivity.this, "Điền đầy đủ thông tin", Toast.LENGTH_SHORT).show ( );
               }

           }
       });
    }

    private void anhxa() {
        btnDangKyDN = (Button) findViewById (R.id.btnDangKyDN);
        btnDangNhapDN = (Button) findViewById (R.id.btnDangNhapDN);
        edtMatKhauDN = (EditText) findViewById (R.id.edtMatKhauDN) ;
        edtSDTDN = (EditText) findViewById (R.id.edtSDTDN) ;
    }
}
