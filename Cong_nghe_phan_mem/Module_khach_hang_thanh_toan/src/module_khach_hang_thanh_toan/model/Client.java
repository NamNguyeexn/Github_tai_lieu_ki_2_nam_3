/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module_khach_hang_thanh_toan.model;

/**
 *
 * @author Nam
 */
public class Client {
    private int id;
    private String name;
    private String address;
    private String tel;
    private String email;
    private String note;

    public Client() {
    }

    public Client(int id, String name, String address, String tel, String email, String note) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.note = note;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
