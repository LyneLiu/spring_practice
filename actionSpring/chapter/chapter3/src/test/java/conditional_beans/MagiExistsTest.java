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

    /**
     * 更正：当Spring 容器中配置了相同类型的 Bean，对该类型的成员变量进行自动注入时，Spring 容器将无法确定到底要用哪一个 Bean，就会发生异常。
     * Spring 允许我们通过 @Qualifier 注释指定注入 Bean 的名称，用来消除歧义！
     */
    @Autowired
    @Qualifier("applicationContext")
    ApplicationContext applicationContext;

    @Test
    public void isNullOfBean(){
        assertTrue(applicationContext.containsBean("magicBean"));
    }
}
