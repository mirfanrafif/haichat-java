/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1.haichat;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mirfa
 */
public class Kontak {

    private int id;
    private User user1;
    private User user2;

    public Kontak() {
    }

    public Kontak(int id, User user1, User user2) {
        this.id = id;
        this.user1 = user1;
        this.user2 = user2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    public List<Kontak> getAllKontak(int id) {
        List<Kontak> listKontaks = null;
        try {
            ResultSet resultSet = DBHelper.selectQuery(
                    "SELECT * FROM kontak where id_user1=" + id
                    + " or id_user2=" + id + ";");
            listKontaks = new ArrayList();
            while (resultSet.next()) {
                Kontak kontak = new Kontak();
                kontak.setId(id);
                kontak.setUser1(new User().getById(resultSet.getInt(2)));
                kontak.setUser2(new User().getById(resultSet.getInt(3)));

                listKontaks.add(kontak);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKontaks;
    }

    public void save() {
        try {
            id = DBHelper.insertQueryGetId(
                    "insert into kontak(id_user1, id_user2) values("
                    + user1.getId() + ", " + user2.getId() + ");");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean cariTeman(int id, String username) {
        List<Kontak> listkontak = new Kontak().getAllKontak(id);
        boolean sudahBerteman = false;

        for (Kontak kontak : listkontak) {
            if (kontak.getUser1().getUsername().equals(username)
                    || kontak.getUser2().getUsername().equals(username)) {
                sudahBerteman = true;
                break;
            }
        }

        return sudahBerteman;
    }

}
