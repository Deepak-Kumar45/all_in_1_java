package com.topics.java8;

interface FunctionalLamdba {
    public void printMsg(String str);
}

interface MyStringFun {
    public String run(String str);
}

public class LambdaExpressionExample {
    public void printFun(String msg, MyStringFun stringFunction) {
        String result = stringFunction.run(msg);
        System.err.println(result);
    }

    public static void main(String[] args) {
        LambdaExpressionExample example = new LambdaExpressionExample();
        MyStringFun fun1 = (str) -> str + "!!";
        example.printFun("Hello", fun1);

        MyStringFun fun2 = (str) -> str + "??";
        example.printFun("How are you", fun2);

        // Implementing functional interface without lambda function using anonymous
        // inner class.
        // FunctionalLamdba withoutLamdba = new FunctionalLamdba() {
        // @Override
        // public void printMsg(String str) {
        // System.out.println(str);
        // }
        // };
        // withoutLamdba.printMsg("Implementing functional interface using anonynomus
        // innner class");

        // FunctionalLamdba withLambda = (str) -> {
        // System.out.println(str);
        // };
        // withLambda.printMsg("Implementing functional interface using lambda
        // expression");
    }
}
