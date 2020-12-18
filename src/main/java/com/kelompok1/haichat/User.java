/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1.haichat;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mirfa
 */
public class User implements Serializable{
    private int id;
    private String nama;
    private String username;
    private String password;

    public User() {
        
    }

    public User(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public List<User> getAllUser() {
        List<User> listUser = new ArrayList<>();
        try {
            ResultSet resultSet = DBHelper.selectQuery("SELECT * FROM user;");
            while (resultSet.next()) {                
                System.out.println(resultSet.getString(1) + ". " + resultSet.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listUser;
    }
    
    public User login(String username, String password) {
        User user = null;
        try {
            
            ResultSet resultSet = DBHelper.selectQuery(
                    "SELECT * FROM user where username=\"" + username 
                            + "\" and password = \"" + password + "\";");
            while (resultSet.next()) {         
                user= new User();
                user.setId(resultSet.getInt(1));
                user.setNama(resultSet.getString(2));
                user.setUsername(resultSet.getString(3));
                user.setPassword(resultSet.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public void register() {
        try {
            id = DBHelper.insertQueryGetId(
                    "insert into user(nama, username, password) values(\'" 
                            + nama + "\', \'" + username + "\', \'" 
                            + password + "\');");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public User cariUser(String username) {
        User user = null;
        try {
            
            ResultSet resultSet = DBHelper.selectQuery(
                    "SELECT * FROM user where username=\"" + username + "\";");
            while (resultSet.next()) {         
                user= new User();
                user.setId(resultSet.getInt(1));
                user.setNama(resultSet.getString(2));
                user.setUsername(resultSet.getString(3));
                user.setPassword(resultSet.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public User getById(int id) {
        User user = null;
        try {
            
            ResultSet resultSet = DBHelper.selectQuery(
                    "SELECT * FROM user where id=" + id + ";");
            while (resultSet.next()) {         
                user= new User();
                user.setId(resultSet.getInt(1));
                user.setNama(resultSet.getString(2));
                user.setUsername(resultSet.getString(3));
                user.setPassword(resultSet.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    
}
