package ru.rzn.sbt.javaschool.basics;

public class LethalWeapon {
	
	public LethalWeapon() {
		nextSerial++;
	}
	
	public LethalWeapon(String color, Double power, int roundsLeft) {
		nextSerial++;
		this.color = color;
		this.power = power;
		this.roundsLeft = roundsLeft;
	}
	
	public String color;
	private int roundsLeft;
	private Double power;
	
	private static long nextSerial = 0;
	
	private final long serial = nextSerial;
	
	public final long getSerial() {
		return serial;
	}
	
	public Double getPower() {
		return power;
	}
	
	public void setPower(Double power) {
		this.power = power;
	}
	
	public void reload(int cntBullets) {
		roundsLeft += cntBullets;
	}
	
	public void pewPew() {
		roundsLeft -= 2;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null) return false;
		if (obj.getClass() != getClass()) return false;
		LethalWeapon o = (LethalWeapon)obj;
		if (!o.color.equals(color)) return false;
		if (Math.abs(o.power - power) > Double.MIN_VALUE) return false;
		if (o.roundsLeft != roundsLeft) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		int result = power.hashCode() + roundsLeft + color.hashCode();
		return result;
	}
}
