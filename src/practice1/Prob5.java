package practice1;

public class Prob5 {

	public static void main(String[] args) {
		for (int i = 1; i <=99; i++) {
			int n = 0;
			String str = String.valueOf(i);
			int num;
			if (str.length() == 2) {
				num = Character.getNumericValue(str.charAt(1));
				if (num != 0 && num % 3 == 0) { //10의 자리
					n++;
				}
			}
			num = Character.getNumericValue(str.charAt(0));
			if (num != 0 && num % 3 == 0) { //1의 자리
				n++;
			}
			if (n != 0) {
				System.out.print(i + " ");
				for (int j = 0; j < n; j++) {
					System.out.print("짝");
				}
				System.out.println("");
			}
		}
	}

}
