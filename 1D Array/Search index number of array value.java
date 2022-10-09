/*QUESTION = Wirte a program take an array as input form user. Search for 
a given number x and print the index at which it occurs.*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args){
	int size;
    Scanner sc = new Scanner(System.in);
    // input array size
    System.out.print("Enter size of Array = ");
    size =sc.nextInt();
    
    //input Search number
    System.out.print("Enter Search index value = ");
    int x = sc.nextInt();
    
       int [] a = new int  [size];
       //input array index value
            for (int i= 0 ; i<size; i++){
                System.out.print("Enter " +i+" index value = ");
                    a[i] = sc.nextInt();
            }
            // output 
            for (int i= 0 ; i<size; i++){
                if (x==a[i]){
                    System.out.print("index number "+i);
                }
            }
    }
  }
  
