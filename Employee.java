package com.mycompany.thegioididong;

public class Employee {
    private String sanpham1;
    private String soluong1;
    private String gia1;
    

public Employee(){
    
}
    public Employee(String sanpham1, String soluong1, String gia1) {
        this.sanpham1 = sanpham1;
        this.soluong1 = soluong1;
        this.gia1 = gia1;
    }

    public String getSanpham1() {
        return sanpham1;
    }

    public void setSanpham1(String sanpham1) {
        this.sanpham1 = sanpham1;
    }

    public String getSoluong1() {
        return soluong1;
    }

    public void setSoluong1(String soluong1) {
        this.soluong1 = soluong1;
    }

    public String getGia1() {
        return gia1;
    }

    public void setGia1(String gia1) {
        this.gia1 = gia1;
    }
    
}


