package javaconfig;

import com.spring_practice.config.stereo_javaconfig.CDPlayer;
import com.spring_practice.config.stereo_javaconfig.CDPlayerConfig;
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
public class JavaCDPlayerTest {

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void testPlay(){
        cdPlayer.play();
    }
}
