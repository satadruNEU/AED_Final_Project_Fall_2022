/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.manufacturer;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author satad
 */
public class Brand {
    
    private String brandName;
    private String phoneName;
    private int price;
    private int phone_id;
    
    public Brand(String brandName, String phoneName, int price, int phone_id){
        this.setBrandName(brandName);
        this.setPhoneName(phoneName);
        this.setPrice(price);
        this.setPhone_id(phone_id);
    }
    
    public void addBrands(){
        try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/supply_chain_management", "root", "Shubham@1");
                java.sql.Statement statement = connection.createStatement();
                
                statement.executeUpdate("insert into supply_chain_management.stocks" + "(brand_name,phone_name,price,phone_id)" + "values ('"+brandName+"','"+phoneName+"', '"+price+"', '"+phone_id+"')");
                JOptionPane.showMessageDialog(null, "Stocks successfully added!");
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,e);
            }
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPhone_id() {
        return phone_id;
    }

    public void setPhone_id(int phone_id) {
        this.phone_id = phone_id;
    }
    
    
    
}
