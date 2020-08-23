package xml;

import com.bbxx.pojo.Role;
import com.bbxx.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultiXML {
    @Test
    public void testMulti() {
        var context = new ClassPathXmlApplicationContext("multi_xml\\son_one.xml", "multi_xml\\son_two.xml");
        User user = context.getBean("user", User.class);
        Role role = context.getBean("role", Role.class);
        System.out.println(user + ":" + role);
        context.close();
    }

    @Test
    public void testMultiXML() {
        var context = new ClassPathXmlApplicationContext("multi_xml\\parent.xml");
        User user = context.getBean("user", User.class);
        Role role = context.getBean("role", Role.class);
        System.out.println(user + ":" + role);
        context.close();
    }
}
