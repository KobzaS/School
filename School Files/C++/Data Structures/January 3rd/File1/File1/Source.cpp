#include <iostream>
#include <vector>

using namespace std;

typedef double Real;

int main()
{
	Real a[5];
	vector <double> b(5);
	double tempor = 0;
	for (double &temp : a)
	{
		double val;
		cout << "Please enter in a number. ";
		cin >> val;
		temp = val;
	}
	for (double i : a)
	{
		cout << i << endl;
	}
	for (double i : a)
	{
		tempor += i;
		
	}
	cout << "the average is " << tempor / 5 << endl;
	system("pause");
	return 0;
}