package com.yuhao.service;

import com.yuhao.entity.Student;

/**
 * @于浩
 */
public interface StudentService {

	Student getById(Integer id);
	int count();
	String sayHello(String somebody);
	int add(int a,int b);
	int multiply(int a,int b);
}
