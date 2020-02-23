package com.yuhao.service.impl;

import com.yuhao.entity.Student;
import com.yuhao.service.StudentService;

public class StudentServiceImpl implements StudentService {


	public int count() {
		// TODO Auto-generated method stub
		return 10;
	}

	public Student getById(Integer id) {
		// TODO Auto-generated method stub
		return new Student(id,"tst"+id);
	}

	public String sayHello(String somebody) {
		// TODO Auto-generated method stub
		return "hi," + somebody;
	}

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
