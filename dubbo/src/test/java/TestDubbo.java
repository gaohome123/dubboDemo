import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by gaolei on 2017/10/7.
 */
public class TestDubbo {

    public static void main(String[] args) throws IOException {
        new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
        System.in.read();
    }
}
