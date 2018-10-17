#include <iostream>
#include <iomanip> // For SetW and output formatting
#include <string> // For access to the string variable
#include <cmath> // For access to the mathematical Library functions

using namespace std;

int main()
{
	//SetW application plus getline vs Cin, as well as Mathematical library functions
	
	//int num1 = 2897, num2 = 5, num3 = 837, num4 = 34, num5 = 7, num6 = 1623, num7 = 390, num8 = 3456, num9 = 12;

	string mySchool;

	cout << "Enter the name of your school: ";
	//cin >> mySchool; // cin stops reading after spaces or tabs

	getline(cin, mySchool);

	cout << "You study at: " << mySchool << endl;


	/*
	//Display the first row of numbers
	cout << setw(6) << num1 << setw(6) << num2 << setw(6) << num3 << endl;

	//Display the second row of numbers
	cout << setw(6) << num4 << setw(6) << num5 << setw(6) << num6 << endl;

	//Display the third row of numbers
	cout << setw(6) << num7 << setw(6) << num8 << setw(6) << num9 << endl;
	*/



	return 0;
}