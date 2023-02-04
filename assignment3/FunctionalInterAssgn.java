package assignment3;

@FunctionalInterface
interface Calculator{
	double cube(float num); //abstract method
	default double square(float num) {
		return num*num;
	}
	default double add(float num1,float num2) {
		return num1+num2;
	}
	
	static double mul(float num1,float num2) {
		return num1*num2;
	}
	static double sub(float num1,float num2) {
		return num1-num2;
	}
	static double div(float num1,float num2) {
		return num1/num2;
	}
}
public class FunctionalInterAssgn implements Calculator{
	public double cube(float num) {
		return num*num*num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterAssgn f=new FunctionalInterAssgn();
		
		System.out.println("Cube "+f.cube(3));
		System.out.println("Square "+f.square(4.5f));
		System.out.println("Addition "+f.add(4, 8));
		System.out.println("Multiplication "+Calculator.mul(8.5f, 9));
		System.out.println("Substraction "+Calculator.sub(21.5f, 9));
		System.out.println("Division "+Calculator.div(8, 9));
	}
}
