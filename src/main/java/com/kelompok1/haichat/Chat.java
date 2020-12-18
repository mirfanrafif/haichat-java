/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1.haichat;

/**
 *
 * @author mirfa
 */
public class Chat {
    private String usernamePengirim;
    private String usernamePenerima;
    private String isichat;

    public Chat(String usernamePengirim, String usernamePenerima, String isichat) {
        this.usernamePengirim = usernamePengirim;
        this.usernamePenerima = usernamePenerima;
        this.isichat = isichat;
    }

    public Chat() {
        
    }

    public String getUsernamePengirim() {
        return usernamePengirim;
    }

    public void setUsernamePengirim(String usernamePengirim) {
        this.usernamePengirim = usernamePengirim;
    }

    public String getUsernamePenerima() {
        return usernamePenerima;
    }

    public void setUsernamePenerima(String usernamePenerima) {
        this.usernamePenerima = usernamePenerima;
    }

    public String getIsichat() {
        return isichat;
    }

    public void setIsichat(String isichat) {
        this.isichat = isichat;
    }
    
    
}
