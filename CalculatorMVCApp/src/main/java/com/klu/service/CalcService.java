package com.klu.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mult(int a,int b) {
		return a*b;
	}
	public double div(int a,int b) {
		if(b==0) {
			throw new ArithmeticException("Division by 0 is not allow");
		}
		return (double) a/b;
	}
	public int mod(int a,int b) {
		return a%b;
	}
}
