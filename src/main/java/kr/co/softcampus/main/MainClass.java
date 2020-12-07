package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean obj1 = new TestBean();
		obj1.setData1(100);
		
		System.out.printf("obj1.data1  :  %d\n",obj1.getData1());
		System.out.println("----------------------------------");
		
		
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		
		System.out.printf("t1.data1  :  %d\n",t1.getData1());
		System.out.println("----------------------------------");
		
		TestBean t2 = ctx.getBean("t1",TestBean.class);
		System.out.printf("t2.data1 :  %d\n",t2.getData1());
		System.out.printf("t2.data2 :  %f\n",t2.getData2());
		System.out.printf("t2.data3 :  %s\n",t2.getData3());
		System.out.printf("t2.data4 :  %s\n",t2.getData4());
		System.out.printf("t2.data5 :  %s\n",t2.getData5());
		System.out.printf("t2.data6 :  %s\n",t2.getData6());
		
		ctx.close();
	}

}
