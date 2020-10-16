//typical implementations of static methods

//absolute value of an int value
public static int abs(int x){
	if (x < 0) return -x;
	else	   return x;
}


//absolute value of an double value
public static double abs(double x){
	if (x < 0.0) return -x;
	else		 return x;
}

//test if a number is prime
public static boolean isPrime(long n){
	if (n < 2) return false;
	for (long i = 2; i*i <=n, i++)
		if (n%i == 0) return false;
	return true;
}

//sqare root (newton's method)
public static double sqrt(double c){
	if (c < 0.0) return Double.NaN;
	double eps = 1e-15;
	double t = c;
	while (Math.abs(t - c/t) > eps*t)
		t = (c/t + t)/2.0;
	return t;
}

//hypotenuse of a right triangle

public static double hypotenuse(double a, double b){
	return Math.sqrt(a*a + b*b);
}


//harmonic number
public static double harmonic (int n){
	double sum = 0.0;
	for (int i = 0, i <=n; i++)
		sum += 1.0/i;
	return sum;
}