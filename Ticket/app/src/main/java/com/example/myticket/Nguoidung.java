package com.example.myticket;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Nguoidung implements Parcelable {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("tennd")
    @Expose
    private String tennd;
    @SerializedName("sdt")
    @Expose
    private String sdt;
    @SerializedName("cmt")
    @Expose
    private String cmt;
    @SerializedName("ngaysinh")
    @Expose
    private String ngaysinh;
    @SerializedName("gioitinh")
    @Expose
    private String gioitinh;
    @SerializedName("matkhau")
    @Expose
    private String matkhau;

    protected Nguoidung(Parcel in) {
        iD = in.readString ( );
        tennd = in.readString ( );
        sdt = in.readString ( );
        cmt = in.readString ( );
        ngaysinh = in.readString ( );
        gioitinh = in.readString ( );
        matkhau = in.readString ( );
    }

    public static final Creator<Nguoidung> CREATOR = new Creator<Nguoidung> ( ) {
        @Override
        public Nguoidung createFromParcel(Parcel in) {
            return new Nguoidung (in);
        }

        @Override
        public Nguoidung[] newArray(int size) {
            return new Nguoidung[size];
        }
    };

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getTennd() {
        return tennd;
    }

    public void setTennd(String tennd) {
        this.tennd = tennd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString (iD);
        dest.writeString (tennd);
        dest.writeString (sdt);
        dest.writeString (cmt);
        dest.writeString (ngaysinh);
        dest.writeString (gioitinh);
        dest.writeString (matkhau);
    }
}