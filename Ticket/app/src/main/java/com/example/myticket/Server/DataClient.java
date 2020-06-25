package com.example.myticket.Server;

import com.example.myticket.Nguoidung;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface DataClient {

    @FormUrlEncoded
    @POST("insert.php")
    Call<String> InsertData (
                            @Field ("TenND") String tennd
                            , @Field ("SDT") String sdt
                            , @Field ("NgaySinh") String ngaysinh
                            , @Field ("CMT") String cmt
                            , @Field ("GioiTinh") String gioitinh
                            , @Field ("MatKhau") String matkhau);

    @FormUrlEncoded
    @POST("login.php")
    Call<List<Nguoidung>> Logindata(@Field ("SDT" ) String sdt,
                                    @Field ("MatKhau") String matkhau);

}




