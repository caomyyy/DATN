package com.example.myticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class TimKiemActivity extends AppCompatActivity {
    private Spinner spnCategory, spnCategory2;
    Button btnOK, btnThoat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_timkiem);
        spnCategory = (Spinner) findViewById (R.id.spnCategory);
        spnCategory2 = (Spinner)findViewById (R.id.spnCategory2) ;
        btnOK = (Button) findViewById (R.id.btnOK);
        btnThoat = (Button) findViewById (R.id.btnThoat);

        btnOK.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (TimKiemActivity.this , ChonGheActivity.class);
                startActivity (intent);
            }
        });
        List<String> list = new ArrayList<> ();
        list.add("Điểm 1");
        list.add("Điểm 2");
        list.add("Điểm 3");
        list.add("Điểm 4");
        list.add("Điểm 5");
        List<String> list2 = new ArrayList<> ();//
        list2.add("Điểm 1");
        list2.add("Điểm 2");
        list2.add("Điểm 3");
        list2.add("Điểm 4");
        list2.add("Điểm 5");
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,list);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<> (this , android.R.layout.simple_spinner_item,list2);//
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        adapter2.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spnCategory.setAdapter(adapter);
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

    }

}
