
public class rectangle {

	int width;
	int length;
	
	
	public rectangle( int width2, int length2) {
	
		width=width2;
		length=length2;
	}
public int getArea() {
	return length*width;
}	
public int getPerimeter() {
	return 2*(length +width);
}
}
