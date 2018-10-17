#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	double day1, day2, day3, day4, total;

	//Get the sales for each day.
	cout << "Enter the sales for day 1: ";
	cin >> day1;
	cout << "Enter the sales for day 2: ";
	cin >> day2;
	cout << "Enter the sales for day 3: ";
	cin >> day3;
	cout << "Enter the sales for day 4: ";
	cin >> day4;

	//Calculate the total sales.
	total = day1 + day2 + day3 + day4;

	//Display the sales figures.
	cout << "\nSales Figures\n";
	cout << "-----------\n";
	cout << setprecision(2) << fixed;
	cout << "Day 1: " << setw(8) << day1 << endl;
	cout << "Day 2: " << setw(8) << day2 << endl;
	cout << "Day 3: " << setw(8) << day3 << endl;
	cout << "Day 4: " << setw(8) << day4 << endl;
	cout << "Total: " << setw(8) << total << endl;
}