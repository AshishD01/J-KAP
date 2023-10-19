package com.fil.LambdaExpression;

interface Sqr {
	double getProduct(int x, int y);
}

public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sqr product = (x, y) -> Math.pow(x, y);

		int result = (int) product.getProduct(3, 4);
		System.out.println("Result: " + result);

	}

}
