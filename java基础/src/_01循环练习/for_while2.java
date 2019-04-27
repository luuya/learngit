package _01Ñ­»·Á·Ï°;

public class for_while2 {
	public static void main(String[] args) {
		for (int line = 0; line <= 9; line++) {
			for (int i = 1; i <= line; i++) {
				System.out.print(i+"*"+line+"="+i*line);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		
	}
}
