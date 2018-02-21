import java.util.Scanner;
public class rectangletest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<=2;i++) {
		System.out.println("Enter the width and the length of Rectangle");

		int width=scanner.nextInt();	
		int length=scanner.nextInt();
		
		
			
			
		rectangle rectangle1= new rectangle(width,length); 
		System.out.println(rectangle1.getArea());
		System.out.println(rectangle1.getPerimeter());
		
		}

	}

}
