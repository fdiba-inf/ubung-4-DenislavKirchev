package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex{
  public static void main(String[] args){

    System.out.print("Enter length of array: ");
    Scanner input = new Scanner(System.in);
    int length = input.nextInt();
    double [] arr = new double [length];
    double minElement = Double.MAX_VALUE;
    int minIndex = 0;

    for(int index = 0; index < arr.length; index++){
      System.out.print("Enter number: ");
      arr[index] = input.nextDouble();
      if(minElement > arr[index]){
        minElement = arr[index];
        minIndex = index;
      }
    }
    System.out.print("Min index: " + minIndex);
    
  }
}