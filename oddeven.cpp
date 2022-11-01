//You are provided with a number check whether its odd or even. 
//
//Print "Odd" or "Even" for the corresponding cases.
//
//Note: In case of a decimal, Round off to nearest integer and then find the output. Incase the input is zero, print "Zero".
//
//Input Description:
//A number is provided as the input.
//
//Output Description:
//Find out whether the number is odd or even. Print "Odd" or "Even" for the corresponding cases. Note: In case of a decimal, Round off to nearest integer and then find the output. In case the input is zero, print "Zero".
//
//Sample Input :
//2
//Sample Output :
//Even


#include<iostream>
#include<cmath>
using namespace std;

int main()
{
    float num;
    cin>>num;
    int c=round(num);
    if(c%2==0)
    {
        cout<<"Even";
    }
    else if(c==0)
    {
        cout<<"Zero";
    }
    else
    {
        cout<<"Odd";
    }
    
}
