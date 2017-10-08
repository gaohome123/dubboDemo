import com.gaolei.provider.IServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by gaolei on 2017/10/7.
 */
public class TestDubbo {

    public static void main(String[] args) throws IOException {
       ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
        IServer server = (IServer)context.getBean("server");
        String mes= server.sayHello("-----------------------张三-------------------");
        System.out.println(mes);
        System.out.println(server.queryUser());
    }
}
