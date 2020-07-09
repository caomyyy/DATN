package com.example.myticket;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Nguoidung {

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

}