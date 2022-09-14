package week2.day2;

public class SizeOfLastStringInWord {

	public static void main(String[] args) {
		String s="I";
		String[] sArray = s.split(" ");
		System.out.println(sArray[sArray.length-1].length());	
	}

}
