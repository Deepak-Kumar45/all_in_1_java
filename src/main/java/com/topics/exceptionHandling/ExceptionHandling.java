package com.topics.exceptionHandling;

public class ExceptionHandling {
	
	public void testMyCheckedException(boolean condition) throws Exception{
		if(condition) {
			throw new MyCheckedException("Condition is "+condition,new Throwable(" for error prone code"));
		}
		System.out.println("Condition is "+condition);
		
	}
	
	public static void main(String[] args) {
		ExceptionHandling handling=new ExceptionHandling();
		try {			
			handling.testMyCheckedException(true);
		}catch (MyCheckedException e) {
			System.out.println(e.getMessage()+" " +e.getCause());
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
