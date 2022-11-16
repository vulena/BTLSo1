package com.ltdd.baikt1;

public class Member {
    String hoten,nghedanh,que;
    int soLuotThich,hinhAnh;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public int getSoLuotThich() {
        return soLuotThich;
    }

    public void setSoLuotThich(int soLuotThich) {
        this.soLuotThich = soLuotThich;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public Member(String hoten, String nghedanh, String que, int soLuotThich, int hinhAnh) {
        this.hoten = hoten;
        this.nghedanh = nghedanh;
        this.que = que;
        this.soLuotThich = soLuotThich;
        this.hinhAnh = hinhAnh;
    }
}
