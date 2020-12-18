
import com.kelompok1.haichat.DBHelper;
import com.kelompok1.haichat.User;
import java.util.List;
import junit.framework.Assert;
import org.junit.Before;
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
public class UserTest {
    User user;
    
    @Before
    public void init() {
        DBHelper.bukaKoneksi();
        user= new User();
    }
    
    @Test
    public void testLogin() {
        User user = this.user.login("irfan", "irfan");
        Assert.assertEquals("irfan", user.getNama());
    }
    
    @Test
    public void testGagalLogin() {
        User user = this.user.login("irfan", "rfan");
        Assert.assertEquals(null, user);
    }
    
    @Test
    public void testAllUser() {
        List<User> user = new User().getAllUser();
        Assert.assertNotNull(user);
    }
    
    
}
