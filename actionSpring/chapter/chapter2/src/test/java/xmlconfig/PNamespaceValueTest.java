package xmlconfig;

import com.spring_practice.config.stereo_xmlconfig.properties.CDPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by nn_liu on 2016/5/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:xmlconfig/PNamespaceValueTest.xml"})
public class PNamespaceValueTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule();

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void play() {
        cdPlayer.play();
    }
}
