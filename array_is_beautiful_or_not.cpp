//you are given with array of numbers.you have to find whether array is beautiful or not. A beautiful array is an array whose sum of all numbers is divisible by 2, 3 and 5
//
//Input Description:
//You are given a number ‘n’ denoting the size of array.Next line contains n space separated numbers.
//
//Output Description:
//Print 1 if array is beautiful and 0 if it is not
//
//Sample Input :
//5
//5 25 35 -5 30
//Sample Output :
//1


#include<iostream>
using namespace std;

int main()
{
    int size,flag=0,s;
    cin>>size;
    int a[size];
    for(int i=0;i<size;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<size;i++)
    {
        flag+=a[i];
    }
    if(flag%2==0&&flag%3==0&&flag%5==0)
    {
        cout<<1;
    }
    else
    {
        cout<<0;
    }
    
}
