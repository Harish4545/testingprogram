public class ArmStrong {

	public static void main(String[] args) {

		int number=153,remainder,on;
		double result=0;
		on=number;

		while(on!=0) {

			remainder=on%10;
			result=result+Math.pow(remainder, 3);
			on=on/10;
			System.out.println(remainder);

			System.out.println(result);
			System.out.println(on);

		} 

		if (result==number) {
			System.out.println("armstrong");
		} else {
			System.out.println("Not armstrong");
		}



	}

}
