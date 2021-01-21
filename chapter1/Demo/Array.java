//array creation and initilization*/

//long form 
double[] a;
a = new double [n];
for (int i = 0; i < n; i++){
	a[i] = 0.0;
}

//short form
double[] a = new double[n];

//initilizing declaration
int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//delcare two dimentional array
double [][] a = new double[m][n];

double [][] a;
a = new double[m][n];
for (int i = 0; i < m; i++)
	for (int j = 0; j < n; j++)
		a[i][j] = 0.0;
	
	
//find maximum of the array values
double max = a[0];
for (int i = 1; i<a.length; i++){
	if (a[i] > max){
		max = a[i];
	}
}


//compute the average of array values
int n = a.length;
double sum = 0.0;
for (int i = 0; i < n; i++){
	sum += a[i];
double average = sum /n;
}

//copy to another array
int n = a.length;
double[] b = new double[n];
for (int i = 0; i < n; i++){
	b[i] = a[i];
}

//reverse the elements within an array
int n = a.length;
for (int i = 0; i < n/2; i++){
	double temp = a[i];
	a[i] = a[n-i-1]
	a[n-i-1] = temp;
}


//matrix-matrix multiplication or square matrix c[][]= a[][]*b[][]
int n = a.length;
double [][] c = new double[n][n];
for (int i = 0; i < n; i++){
	for (int j = 0; j < n; j++){
		//compute dot product of row i and column j
		for (int k = 0; k < n; k++){
			c[i][j] += a[i][k]*b[k][j];
		}
	}
} 




















