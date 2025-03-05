package com.topics.extra;

class ObjectPass{
	int val;
}

public class PassbyValueAndReference {

	private static void modifyObject(int val) {
		val=50;
		System.out.println("Var inside method = "+val);
	}	
	
	private static void modifyObject2(ObjectPass object) {
		object=new ObjectPass(); // reassigning the object
		object.val=200;
		System.out.println("Object Var inside method = "+object.val);
	}
	
	public static void main(String[] args) {
		ObjectPass objectPass=new ObjectPass();
		objectPass.val=100;
		modifyObject2(objectPass);
		System.out.println("Object Var outside method = "+objectPass.val);
		
	}
	
}
