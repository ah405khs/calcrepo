package simpleCalculator;

public class Calculator {
	private int result=0;

	public void add(int x, int y) {
		result=x+y+0; //merge의 의미를 알려주기 위해서.
	}
	
	public void sub(int x, int y) {
		result=x-y;
	}
	public void multi(int x, int y) {
		result=x*y;
	}
	public int getResult() {
		return result;
	}
	public int decrease(){
		return --result;
	}
	public int increase(){
		return ++result;
	}
}
