package xml;

import com.bbxx.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的各种实例化方式
 */
public class BeanInstantiation {

    @Test
    public void constructor() {
        var context = new ClassPathXmlApplicationContext("bean_instantiation\\bean_instantiation.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user+": constructor");
    }

    @Test
    public void staticFactory() {
        var context = new ClassPathXmlApplicationContext("bean_instantiation\\bean_instantiation.xml");
        User user_static_factory = context.getBean("user_static_factory", User.class);
        System.out.println(user_static_factory+": static factory");
    }

    @Test
    public void factory() {
        var context = new ClassPathXmlApplicationContext("bean_instantiation\\bean_instantiation.xml");
        User user_factory = context.getBean("user_factory", User.class);
        System.out.println(user_factory+": factory");
    }
}
