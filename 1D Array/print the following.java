/*QUESTION = Take integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args){
	int size;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of Array = ");
    size =sc.nextInt();
    
            int[] a = new int [size];
            for(int i=0; i<size; i++){
                System.out.print("enter "+i+ " index value = ");
                a[i] = sc.nextInt();
            }
                    for(int i=0; i<size; i++){
                        if (a[i]>0) {
                            System.out.println("postive number = "+ a[i]);
                        }else if (a[i]<0){
                            System.out.println("negative number = "+ a[i]);
                        }else{
                        System.out.println("zero number = "+ a[i]);
                        }
                            if (a[i]%2==0){
                                System.out.println("even number  = "+ a[i]);
                            }else {
                                System.out.println("odd number  = "+ a[i]);
                            }
                        }
                         
                        }
  }
  
