/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1.haichat;

import static com.kelompok1.haichat.DBHelper.bukaKoneksi;
import com.kelompok1.haichat.ui.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author mirfa
 */
public class Main {
    public static void main(String[] args) {
        bukaKoneksi();
        new Login().setVisible(true);
    }
}
