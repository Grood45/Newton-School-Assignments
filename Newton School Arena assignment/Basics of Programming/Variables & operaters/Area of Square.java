/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
Area of Square
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a side of a square, your task is to calculate its area.
Input
The first line of the input contains the side of the square.

Constraints:
1 <= side <=100
Output
You just have to print the area of a square
Example
Sample Input:-
3

Sample Output:-
9

Sample Input:-
6

Sample Output:-
36Area of Square
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a side of a square, your task is to calculate its area.
Input
The first line of the input contains the side of the square.

Constraints:
1 <= side <=100
Output
You just have to print the area of a square
Example
Sample Input:-
3

Sample Output:-
9

Sample Input:-
6

Sample Output:-
36

*******************************************************************************/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AREAOFSQURE {
    public static void main (String[] args) {
                   // Your code here
   
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   System.out.println(a*a);
  
    }
}