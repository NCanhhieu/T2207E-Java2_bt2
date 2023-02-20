/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2java2;

/**
 *
 * @author Admin
 */
public  class phone {
   
    String hoten;
    String sdt;
    String emai;

    public phone() {
    }

    public phone(String hoten, String sdt, String emai) {
        
        this.hoten = hoten;
        this.sdt = sdt;
        this.emai = emai;
    }
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

}
