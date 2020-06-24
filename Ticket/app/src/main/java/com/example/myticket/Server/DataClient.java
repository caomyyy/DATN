package com.example.myticket.Server;

import com.example.myticket.Nguoidung;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface DataClient {

    @FormUrlEncoded
    @POST("insert.php")
    Call<String> InsertData(@Field ("tennd") String tennd
                            ,@Field ("sdt") String sdt
                            ,@Field ("ngaysinh") String ngaysinh
                            ,@Field ("cmt") String cmt
                            ,@Field ("gioitinh") String gioitinh
                            ,@Field ("matkhau") String matkhau);

    @FormUrlEncoded
    @POST("login.php")
    Call<String> Logindata(@Field ("user") String user,
                           @Field ("password") String password);

}



