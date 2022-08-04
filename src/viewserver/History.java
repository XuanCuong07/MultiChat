/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewserver;

/**
 *
 * @author BVCN 88
 */
public class History {
    private String username;
    private String ngay;

    public History() {
    }

    public History(String username, String ngay) {
        this.username = username;
        this.ngay = ngay;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
}
