//Given 2 numbers N and K followed by N elements,print the number of repetition of K otherwise print '-1' if the element not found.
//Sample Testcase :
//INPUT
//6 2
//1 2 3 5 7 8
//OUTPUT
//0

#include<iostream>
using namespace std;

int main()
{
    int size,e,count=0,flag=1;
    cin>>size>>e;
    int a[size];
    for(int i=0;i<size;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<size;i++)
    {
         if(a[i]==e)  
         {
             count+=1;
         }
         else if(a[i]!=e)
         {
             flag+=1;
         }
    }
    if(count>=2)
    {
        cout<<e;
    }
    else if(flag==size)
    {
        cout<<0;
    }
    else
    {
        cout<<-1;
    }
}
