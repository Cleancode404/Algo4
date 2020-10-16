//anatomy of a static method

public static double sqrt (double c){
	if (c < 0) return Double.NaN;
	double eps =1e-15;
	double t = c;
	
	while (Math.abs(t - c/t)> eps*t)
		t = (c/t + t) /2.0;
	return t;
}