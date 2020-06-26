package com.example.myticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myticket.Retrofit.APIUtils;
import com.example.myticket.Retrofit.DataClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class DangKyActivity extends AppCompatActivity implements View.OnFocusChangeListener {
    EditText edtNgaySinh, edtSDT, edtHoTen, edtCMT, edtMatKhau;
    RadioGroup rgGioiTinh;
    Button btnOKDK, btnDangNhapDK;

    String tennd, sdt, cmt, ngaysinh, gioitinh, matkhau;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_dangky);
        anhxa();

        edtNgaySinh.setOnFocusChangeListener (this);
        btnDangNhapDK.setOnClickListener (new View.OnClickListener ( ) {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent (DangKyActivity.this, DangNhapActivity.class);
                startActivity (intent);
            }
        });


        btnOKDK.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                tennd = edtHoTen.getText ( ).toString ( );
                sdt = edtSDT.getText ( ).toString ( );
                cmt = edtCMT.getText ( ).toString ( );
                ngaysinh = edtNgaySinh.getText ( ).toString ( );

                switch (rgGioiTinh.getCheckedRadioButtonId ( )) {
                    case R.id.rdNam:
                        gioitinh = "Nam";
                        break;
                    case R.id.rdNu:
                        gioitinh = "Nữ";
                        break;
                    case R.id.rdKhac:
                        gioitinh = "Khác";
                        break;
                }

                matkhau = edtMatKhau.getText ( ).toString ( );
                if (tennd.length () >0 && sdt.length () >0 && cmt.length () >0 && ngaysinh.length () >0
                        && gioitinh.length () >0 && matkhau.length () >0){
                    DataClient dataClient = APIUtils.getData ();
                    Call<String> callback = dataClient.InsertData (tennd, sdt, cmt, ngaysinh, gioitinh, matkhau);
                    callback.enqueue (new Callback<String> ( ) {
                        @Override
                        public void onResponse(Call<String> call, Response<String> response) {
                            String result = response.body ();
                            if(result.equals ("success")){
                                Toast.makeText (DangKyActivity.this, "Thêm thành công", Toast.LENGTH_SHORT).show ( );
                            }
                        }

                        @Override
                        public void onFailure(Call<String> call, Throwable t) {
                            Toast.makeText (DangKyActivity.this, "Thất bại", Toast.LENGTH_SHORT).show ( );

                        }
                    });

                }else {
                    Toast.makeText (DangKyActivity.this, "Điền đầy đủ thông tin", Toast.LENGTH_SHORT).show ( );
                }





            }
        });


    }

    private void anhxa() {
        edtNgaySinh = (EditText) findViewById (R.id.edtNgaySinh);
        edtCMT = (EditText) findViewById (R.id.edtCMT);
        edtHoTen = (EditText) findViewById (R.id.edtHoTen);
        edtSDT = (EditText) findViewById (R.id.edtSDT);
        edtMatKhau = (EditText) findViewById (R.id.edtMatKhau);
        rgGioiTinh = (RadioGroup) findViewById (R.id.rgGioiTinh);
        btnOKDK = (Button) findViewById (R.id.btnOKDK);
        btnDangNhapDK = (Button) findViewById (R.id.btnDangNhapDK);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        int id  = v.getId ();
        switch (id) {
            case R.id.edtNgaySinh :
                if(hasFocus){
                    DatePickerFragment datePickerFragment = new DatePickerFragment ();
                    datePickerFragment.show(getSupportFragmentManager (),"Ngày Sinh");
                }
        }
    }
}


