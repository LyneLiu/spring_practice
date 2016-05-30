package conditional_beans;

import com.spring_practice.anvanced_wiring.conditional_beans.MagicConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

/**
 * Created by nn_liu on 2016/5/30.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MagicConfig.class)
public class MagiExistsTest {


    @Autowired
    @Qualifier("applicationContext")
    ApplicationContext applicationContext;

    @Test
    public void isNullOfBean(){
        assertTrue(applicationContext.containsBean("magicBean"));
    }
}
