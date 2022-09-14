package week2.day2;

public class SquareRoot {

	public static void main(String[] args) {
		
		//Repeated Subtraction Method of Square Root
		int n=8;
		int toSubtract=1;
		int count=0;
		while(n>0) {
			n=n-toSubtract;
			count=count+1;
			toSubtract=toSubtract+2;
		}

		if(n<0) {
			System.out.println(count-1);
		}else {
			System.out.println(count);
		}

	}

}
