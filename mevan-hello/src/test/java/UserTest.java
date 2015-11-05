import com.ujipin.hello.User;
import org.junit.Test;

/**
 * Created by Johnny on 15/11/5.
 */
public class UserTest {

    @Test
    public void testHello(){
        User user = new User();
        user.sayHello();
    }
}
