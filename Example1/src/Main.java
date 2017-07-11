import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.spring.business.DemoBean;


public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Object o=ctx.getBean("db");
		DemoBean db=(DemoBean)o;
		db.insertCustomer(10, "S", "BBSR");

		
	}

}
