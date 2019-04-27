package _04Ñ­»·½á¹¹;

public class OutterBreak {
	public static void main(String[] args) {
		
		outter : for (int i = 1; i <= 5; i++) {
			
			inner : for (int j = 0; j < i; j++) {
				
				if(i==3){
					break outter;
				}
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		
	}
}
