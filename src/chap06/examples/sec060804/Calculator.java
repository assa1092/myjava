package chap06.examples.sec060804;

public class Calculator {
	
//	double areaRectangle(int width) {
//		System.out.println("int type");
//		return width*width;
//	}
	
	
	// 정사각형의 넓이.
	double areaRectangle(double width) {
		System.out.println("double type");
		return width*width;
	}
	
	// 직사각형의 넓이.
	double areaRectangle(double width, double height) {
		return width*height;
	}
	

}
