package edu.kh.polymorphism.ex2.dto;

//각자 계산기 구현하기
public class NewCalculator implements Calculator {

	@Override
	public int plus(int a, int b) {
		return a + b;
	}

	@Override
	public int minus(int a, int b) {
		return a - b;
	}

	@Override
	public int multiple(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		return a / b;
	}

	@Override
	public double divide2(int a, int b) {
		return (double) a / b;
	}

	@Override
	public double areaOfCircle(double r) {
		return Calculator.PI * r * r; // PI*r*r 도 가능(부모calculator에 있는 PI를 상속받아서 내꺼처럼 쓸 수 있으니까)
	}

	@Override
	public int square(int a, int x) {
		return (int) Math.pow(a, x);

	}

}
