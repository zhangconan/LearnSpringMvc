import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zkn on 2016/11/23.
 */
public class SprintgIoCTest01 {

    @Test
    public void testSpringIoC01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        classPathXmlApplicationContext.getBean("studentScope");
    }
}
