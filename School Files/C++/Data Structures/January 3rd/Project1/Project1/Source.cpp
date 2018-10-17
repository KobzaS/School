#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int numCourse;
	double totalGrade = 0, totalCred = 0;
	cout << "Please enter the number of courses: ";
	cin >> numCourse;
	vector <double> percent(numCourse), credits(numCourse);
	
	for (int i = 0; i < numCourse; i++)
	{
		cout << "How many credits was the course worth? ";
		cin >> credits[i];
		cout << "What percentage grade did you get? ";
		cin >> percent[i];

	}
	for (int i = 0; i < numCourse; i++)
	{
		double grade = 0;
		grade += credits[i] * percent[i];
		totalCred += credits[i];
		totalGrade += grade;
	}
	cout << "Your GPA is " << totalGrade / totalCred << endl;
	system("pause");
	return 0;
}