
import org.junit.Before;
import com.kelompok1.haichat.DBHelper;
import com.kelompok1.haichat.Kontak;
import com.kelompok1.haichat.User;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mirfa
 */
public class KontakTes {
    
    @Before
    public void init() {
        DBHelper.bukaKoneksi();
    }
    
    @Test
    public void tesAmbilSemuaKontak() {
        List<Kontak> list = new Kontak().getAllKontak(7);
        for (Kontak kontak : list) {
            System.out.println(kontak.getId() + " " 
                    + kontak.getUser1().getNama() + " " 
                    + kontak.getUser2().getNama());
        }
        Assert.assertNotNull(list);
    }
    
    @Test
    public void tesAmbilKontakKosong() {
        List<Kontak> list = new Kontak().getAllKontak(3);
        Assert.assertEquals(true, list.isEmpty());
    }
    
//    @Test
//    public void tesTambahKontak() {
//        User user1 = new User().getById(6);
//        User user2 = new User().getById(7);
//        Kontak kontak= new Kontak();
//        kontak.setUser1(user1);
//        kontak.setUser2(user2);
//        kontak.save();
//        Assert.assertNotNull(kontak.getId());
//    }
    
    @Test
    public void tesCariTeman() {
        Assert.assertEquals(true, new Kontak().cariTeman(6, "rafif"));
        
    }
}
