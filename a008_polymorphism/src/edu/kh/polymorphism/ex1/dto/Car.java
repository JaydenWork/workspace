package edu.kh.polymorphism.ex1.dto;

public class Car {
	
	// 필드
	private int wheel; // 바퀴 개수
	private int seat; // 좌석 수
	private String fuel; // 연료
	
	
	//기본 생성자
	public Car() {}
	
	//매개변수 생성자
	public Car(int wheel, int seat, String fuel) {
		super();
		this.wheel = wheel;
		this.seat = seat;
		this.fuel = fuel;
	}
	
	


	public int getWheel() {
		return wheel;
	}


	public void setWheel(int wheel) {
		this.wheel = wheel;
	}


	public int getSeat() {
		return seat;
	}


	public void setSeat(int seat) {
		this.seat = seat;
	}


	public String getFuel() {
		return fuel;
	}


	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	@Override
	public String toString() {
		return String.format("%d / %d / %s", wheel, seat, fuel);
	}
	
	

}
