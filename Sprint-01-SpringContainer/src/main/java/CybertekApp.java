import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {

        BeanFactory bean = new ClassPathXmlApplicationContext("config.xml");

        Mentor fullTimeMentor = bean.getBean("fullTimeMentor",Mentor.class);

        Mentor partTimeMentor = bean.getBean("partTimeMentor",Mentor.class);


        fullTimeMentor.createMentor();
        partTimeMentor.createMentor();


    }


}
