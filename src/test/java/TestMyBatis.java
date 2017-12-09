import com.blue.domain.User;
import com.blue.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by BlueBreeze on 2017/12/9.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Autowired
    private IUserService userService = null;

    @Test
    public void test1() {
        User user = userService.getUserById(1);
    }
}