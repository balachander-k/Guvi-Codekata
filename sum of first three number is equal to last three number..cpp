//You are given given task is to print whether array is ‘majestic’ or not.A ‘majsetic’ array is an array whose sum of first three number is equal to last three number.
//
//Input Description:
//You are given a number ‘n’,Next line contains ‘n’ space separated
//
//Output Description:
//Print 1 if array is majestic and 0 if it is not
//
//Sample Input :
//7
//1 2 3 4 6 0 0
//Sample Output


#include<iostream>
using namespace std;


int main()
{
    int num,temp;
    cin>>num;
    int n[num];
    for(int i=0;i<num;i++)
    {
        cin>>n[i];
    }
    for(int i=0;i<num;i++)
    {
        if((n[i]+n[i+1]+n[i+2])==(n[num-1]+n[num-2]+n[num-3]))
        {
            cout<<1;
            break;
        }
        else
        {
            cout<<0;
            break;
        }
    }
}
