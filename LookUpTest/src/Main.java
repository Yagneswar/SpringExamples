import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.spring.MySingleton;


public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MySingleton ms=(MySingleton)ctx.getBean("s");
		
		ms.m1();
		System.out.println("==================");
		ms.m1();
		System.out.println("================");
		ms.m1();
	}

}
