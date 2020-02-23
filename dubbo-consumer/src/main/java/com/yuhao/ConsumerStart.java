package com.yuhao;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuhao.entity.Student;
import com.yuhao.service.StudentService;

public class ConsumerStart {
	 
	private static ClassPathXmlApplicationContext context;
	private static StudentService studentService;

	public static void main(String[] args) throws IOException {
		
		context = new ClassPathXmlApplicationContext("classpath:ApplicantionContext.xml");
		
		context.start();
		
		StudentService studentService =
				(StudentService)context.getBean("studentServiceDemo");
				int count = studentService.count();
				System.out.println("count is " + count);
				String hello = studentService.sayHello("tom");
				System.out.println(" hello is : " + hello);
				Student student = studentService.getById(10);
				System.out.println("student is " + student);
		        System.out.println("加法"+studentService.add(1, 2));
		        System.out.println("乘法"+studentService.multiply(2, 4));
				System.in.read(); // 按任意键退出
		
	}
	
	

}
