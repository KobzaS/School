#include <iostream>

using namespace std;

int main()
{
	int sum = 0;

	for (int i = 1; i <= 5; i++)
	{
		int input;
		cout << "Please enter an integer number: ";
		cin >> input;
		sum += input;
		
	}

	cout << "\nThe total of your numbers is " << sum << endl;

	return 0;
}