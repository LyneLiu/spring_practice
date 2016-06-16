package autoconfig;

import com.spring_practice.config.stereo_autoconfig.CDPlayer;
import com.spring_practice.config.stereo_autoconfig.CDPlayerConfig;
import com.spring_practice.config.stereo_autoconfig.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by nn_liu on 2016/5/27.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class AutoCDPlayerTest {

    /*
     * 通过Bean的id完成依赖注入操作
     * 1、默认的情况下bean id为添加@Component注解的类名的第一个字母小写；
     * 2、通过@Component("beanName")为bean添加id，并通过beanName获取bean
     */
    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void playTest(){
        cdPlayer.play();
    }

}
