package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);

		Teacher teacher1 = new Teacher();
		teacher1.setName("Divyansh");
		teacher1.setSalary(25000);

//		ApplicationContext teacherContext = new ClassPathXmlApplicationContext("config.xml");
		Teacher teacher2 = (Teacher) context.getBean("teacher1");
		System.out.println(student1);

		Student student2 = (Student) context.getBean("student2");

		System.out.println(teacher1);
		
		System.out.println(teacher2);
		System.out.println(student2);
	}
}
