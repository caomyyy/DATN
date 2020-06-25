package com.example.myticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TimKiemActivity extends AppCompatActivity {

    Button btnOK, btnThoat;
    RadioGroup rdChieuDi;
    RadioButton rbdi, rbve;
    EditText edtNgay,edtGio;
    String diemdon, diemdung;
    private  Spinner spnCategory, spnCategory2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_timkiem);

        spnCategory = (Spinner) findViewById (R.id.spnCategory);
        spnCategory2 = (Spinner)findViewById (R.id.spnCategory2) ;
        btnOK = (Button) findViewById (R.id.btnOK);
        edtNgay = (EditText) findViewById (R.id.edtNgay);
        edtGio = (EditText) findViewById (R.id.edtGio);
        btnThoat = (Button) findViewById (R.id.btnThoat);
        rdChieuDi = (RadioGroup)findViewById (R.id.rgChieuDi);
        rbdi = (RadioButton) findViewById (R.id.rbdi);
        rbve = (RadioButton) findViewById (R.id.rbve);




/////////Chọn điểm đón, điểm dừng
        List<String> List1 = new ArrayList<> (); //List1 là danh sách điểm đón/dừng ở Nam Định
        List1.add("Thành phố Nam Định");
        List1.add("Huyện Nam Trực");
        List1.add(" Huyện Hải Hậu");
        List1.add("Huyện Nghĩa Hưng");
        List1.add("Huyện Vụ Bản");
        List<String> List2 = new ArrayList<> ();
        List2.add("Bến xe  Giáp Bát");
        List2.add("Bến Xe Mỹ Đình");
        List2.add("Bến Xe Yên Nghĩa ");
        List2.add("Hồ Gươm");
        List2.add("Đại học Bách Khoa Hà Nội");
        ArrayAdapter<String> adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item,List1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<> (this , android.R.layout.simple_spinner_item,List2);//
        adapter1.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        adapter2.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spnCategory.setAdapter(adapter1);
        spnCategory2.setAdapter (adapter2);
        spnCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(TimKiemActivity.this, spnCategory.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        spnCategory2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(TimKiemActivity.this, spnCategory2.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //////Chọn ngày đi


        /////////chọn Giờ
        ///////Xác nhận


        btnThoat.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (TimKiemActivity.this,TrangChuActivity.class);
                startActivity (intent);
            }
        });
    }

}
