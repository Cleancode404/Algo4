//random double value in [a,b)
public static double uniform(double a, double b){
	return a + StdRandom.uniform() *(b-a);
}

//random int value in [0..n)
public static int uniform(int n){
	return (int) (StdRandom.uniform()*n);
}

//random int value drawn from discrete distribution (i withi probability a[i])
public static int discrete(double[] a){
	//Entries in a[] must nonngeative and sum to 1.
	double r = StdRandom.uniform();
	double sum = 0.0;
	for (int i = 0; i < a.length; i++){
		sum = sum + a[i];
		if (sum >= r){
			return i;
		}
		
	}
	return -1;
}

//randomly shuffle the elements in an array of double values
//see exercise 1.1.36
public static void shuffle(double[] a){
	int n = a.length;
	for (int i = 0; i < n; i++){
		//exchange a[i] with random elelemtn in a[i...n-1]
		
		int r = i + StdRandom.uniform(n-1);
		double temp = a[i];
		a[i]= a[r];
		a[r] = temp;
	}
}