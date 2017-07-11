import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinu.spring.Travel;


public class Main {

	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Object o=ctx.getBean("travel");
	    Travel t=(Travel)o;
	    t.jour();
		

	}

}
