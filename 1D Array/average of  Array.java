/*QUESTION = Write a program  to average of  Array */

import java.util.*;
import java.io.*;
public class Main
{
  public static void main (String[]args)
  {
    int size, avg, sum = 0;
    Scanner sc = new Scanner (System.in);
    // input size of array
      System.out.print ("Enter sizr of Array = ");
      size = sc.nextInt ();

    int[] a = new int[size];
    // input value of array
    for (int i = 0; i < size; i++)
      {
	System.out.print ("enter " + i + " index value = ");
	a[i] = sc.nextInt ();
      }
    // average of Array
    for (int i = 0; i < size; i++)
      {
	sum = sum + a[i];
      }
    avg = sum / size;

    System.out.print ("average of Array  = " + avg);
  }
}
