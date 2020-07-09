package com.example.myticket.Retrofit;

public class APIUtils {
    public static final String Base_Url = "http://192.168.7.101/mycao/";
    public static final  String URL_LOGIN = "login.php";


    public static DataClient getData(){
        return RetrofitClient.getClient (Base_Url).create (DataClient.class);

    }
}
