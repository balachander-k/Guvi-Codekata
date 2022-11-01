//Ria is always fascinated by the number 2. She always wants to know who came second in a race, the second person to set foot on the moon and so on. She is given a list of numbers and asked to find the maximum. As always, she reports the second highest number as the maximum because according to her, 2 is higher than 1. Find out which was the number that Ria would have reported, given a list of N numbers.
// 
//
//Input Description:
//Size of the array followed by the elements of the array.
//
//Output Description:
//Second largest element of the array.
//
//Sample Input :
//10
//1 9 8 7 6 5 2 3 4 10
//Sample Output :
//9

#include<iostream>
using namespace std;

int main()
{
    int size,a[100],temp;
    cin>>size;
    for(int i=0;i<size;i++)
    {
        cin>>a[i];
    }
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    cout<<a[1];
}
