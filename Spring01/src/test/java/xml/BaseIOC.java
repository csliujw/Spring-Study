package xml;

import com.bbxx.annotation.AnnotationConfig;
import com.bbxx.pojo.User;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BaseIOC {
    @Test
    public void testIOC() {
        var context1 = new ClassPathXmlApplicationContext("base\\bean.xml");
        var context2 = new FileSystemXmlApplicationContext("D:\\Code\\Spring-Study\\Spring01\\src\\main\\resources\\base\\bean.xml");
        User user1 = context1.getBean("user", User.class);
        User user2 = context2.getBean("user", User.class);
        System.out.println(user1);
        System.out.println(user2);
        context1.close();
        context2.close();
    }

    @Test
    public void testIOCByAnnotationConfigApplicationContext() {
        var context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        var bean = context.getBean(User.class);
        System.out.println(bean);
        context.close();
    }
}
