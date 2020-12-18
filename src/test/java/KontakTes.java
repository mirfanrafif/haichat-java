
import org.junit.Before;
import com.kelompok1.haichat.DBHelper;
import com.kelompok1.haichat.Kontak;
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
        List<Kontak> list = new Kontak().getAllKontak(3);
        Assert.assertNotNull(list);
    }
    
    public void tesTambahKontak() {
        
    }
}
