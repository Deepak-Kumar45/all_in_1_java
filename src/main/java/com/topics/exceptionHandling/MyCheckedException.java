package com.topics.exceptionHandling;

public class MyCheckedException extends Exception {

	private static final long serialVersionUID = 1L;

	public MyCheckedException() {
		super();
	}

	public MyCheckedException(String msg) {
		super(msg);
	}

	public MyCheckedException(Throwable cause) {
		super(cause);
	}

	public MyCheckedException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
