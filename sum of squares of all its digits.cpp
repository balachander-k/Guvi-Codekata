//Given a number N, print the sum of squares of all its digits.
//Input Size : 1 <= N <= 100000
//Sample Testcase :
//INPUT
//12
//OUTPUT
//5


#include<iostream>
using namespace std;

int main()
{
    int n,rem,count=0;
    cin>>n;
    while(n!=0)
    {
        rem=n%10;
        count=count+rem*rem;
        n=n/10;
    }
    cout<<count;
}
