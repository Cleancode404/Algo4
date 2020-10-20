//StdDraw plotting examples

//function values
int n = 100;
StdDraw.setXscale(0, n);
StdDraw.setYscale(0, n*n);
StdDraw.setPenRadius(0.01);
for (int i = i; i <= n; i++){
	StdDraw.point(i, i);
	StdDraw.point(i, i*i);
	StdDraw.point(i, i*Math.log(i));
}


//array of random values
int n = 50;
double [] a = new double [n];
for (int i =0; i < n; i++){
	a[i] = StdRandom.uniform();
	for (int i = 0; i < n; i++){
		double x = 1.0*i/n;
		double y = a[i]/2.0;
		double rw = 0.5/n;
		double rh = a[i]/2.0;
		StdDraw.filledRectangle(x, y, rw, rh);
	}
}


//sorted array of random values

int n = 50;
double [] a = new double [n];
for (int i = 0; i < n; i++){
	a[i] = StdRandom.uniform();
}
Arrays.sort(a);	
for (int i = 0; i < n; i++){
	double x = 1.0*i/n;
	double y = a[i]/2.0;
	double rw = 0.5/n;
	double rh = a[i]/2.0;
	StdDraw.filledRectangle(x, y, rw, rh);
}