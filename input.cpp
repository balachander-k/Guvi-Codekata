
/*Write a code to get the input in the given format and print the output in the given format.

Input Description:
A single line contains a string.

Output Description:
Print the characters in a string separated by line.

Sample Input :
guvigeek
Sample Output :
g
u
v
i
g
e
e
k#include<iostream>*/

using namespace std;

int main()
{
    string n;
    cin>>n;
    for(int i=0;i<n.length();i++)
    {
        cout<<n[i]<<endl;
    }
}
