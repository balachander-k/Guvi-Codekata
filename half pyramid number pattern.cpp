//Write a code to generate a half pyramid number pattern.
//
//Input Description:
//Given an even integer R indicates number of rows.
//
//Where 1<=R<=100
//
//Output Description:
//Print the number pattern based on the given integer R.
//
//Sample Input :
//5
//Sample Output :
//12345
//1234
//123
//12
//1


#include<iostream>
using namespace std;

int main()
{
    int size;
    cin>>size;
    for(int i=size;i>=1;i--)
    {
        for(int j=1;j<=i;j++)
        {
            cout<<j;
        }
        cout<<endl;
    }
}
