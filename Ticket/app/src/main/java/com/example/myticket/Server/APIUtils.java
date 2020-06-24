package com.example.myticket.Server;

public class APIUtils {
    public static final String Base_Url = "http://trankienbk.ihostfull.com/data/";
    public static DataClient getData(){
        return RetrofitClient.getClient (Base_Url).create(DataClient.class);
    }
}
