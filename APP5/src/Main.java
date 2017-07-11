import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.spring.A;
import com.sathya.spring.B;

public class Main {
	public static void main(String ar[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		A aobj=(A)ctx.getBean("a");
		aobj.show();
		System.out.println("====================");
		B bobj=(B)ctx.getBean("m");
		bobj.display();
	}

}
