package kow.tritonDigital;

public class StwAndo {
	
	public static void printStwAndo() {
        final String multipleOfThree = "Stw";
        final String multipleOFive =  "Ando";
		
		for (int i = 1; i <= 100; i++) {
			StringBuilder sb = new StringBuilder("");			

			if ((i % 3) == 0) {
				sb.append(multipleOfThree);
			}

			if ((i % 5) == 0) { 
				sb.append(multipleOFive);
			}

			if (sb.length() == 0) {
				sb.append(i);
			}

			System.out.print(sb.toString() + " ");

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printStwAndo();

	}

}
