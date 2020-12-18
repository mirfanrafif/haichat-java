/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1.haichat;

import java.io.Serializable;

/**
 *
 * @author mirfa
 */
public class Chat implements Serializable{
    private User pengirim;
    private User penerima;
    private String isichat;

    public Chat(User pengirim, User penerima, String isichat) {
        this.pengirim = pengirim;
        this.penerima = penerima;
        this.isichat = isichat;
    }

    public Chat() {
    }

    public User getPengirim() {
        return pengirim;
    }

    public void setPengirim(User pengirim) {
        this.pengirim = pengirim;
    }

    public User getPenerima() {
        return penerima;
    }

    public void setPenerima(User penerima) {
        this.penerima = penerima;
    }

    public String getIsichat() {
        return isichat;
    }

    public void setIsichat(String isichat) {
        this.isichat = isichat;
    }

    
    
}
