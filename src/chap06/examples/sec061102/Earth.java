package chap06.examples.sec061102;

public class Earth {
	
	// Constance 상수
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA= 4 * Math.PI * EARTH_RADIUS *EARTH_RADIUS;
	}

}
