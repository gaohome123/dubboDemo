import com.alibaba.dubbo.config.annotation.Reference;
import com.gaolei.provider.IServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * Created by gaolei on 2017/10/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring.xml"})
public class TestDubbo {

    @Reference
    private IServer server;

    @Test
    public  void  run() throws IOException {
       String mes= server.sayHello("-----------------------张三-------------------");
        System.out.println(mes);
        System.out.println(server.queryUser());
    }
}
