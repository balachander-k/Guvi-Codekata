//Pk finds it difficult to judge the minimum element in the list of elements given to him. Your task is to develop the algorithm in order to find the minimum element.
//
// 
//
//Note:Don’t use sorting
// 
//
//Input Description:
//You are given ‘n’ number of elements. Next line contains n space separated numbers.
//
//Output Description:
//Print the minimum element
//
//Sample Input :
//5
//3 4 9 1 6
//Sample Output :
//1


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
        for(int j=i+1;j<num;j++)
        {
            if(n[i]>n[j])
            {
            temp=n[i];
            n[i]=n[j];
            n[j]=temp;
            }
        }
    }
    cout<<n[0];
}

