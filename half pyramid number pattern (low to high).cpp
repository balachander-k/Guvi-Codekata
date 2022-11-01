//Write a code to generate a half pyramid pattern using numbers.
//
//Input Description:
//Given an integer R indicates number of rows.
//
//Where 1<=R<=100.
//
//Output Description:
//Print the number half pyramid pattern with the size R.
//
//Sample Input :
//5
//Sample Output :
//1
//22
//333
//4444
//55555


#include<iostream>
using namespace std;

int main()
{
    int size;
    cin>>size;
    for(int i=1;i<=size;i++)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<i;
        }
        cout<<endl;
    }
}
