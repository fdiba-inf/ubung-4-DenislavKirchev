package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement{
  public static void main(String[] args){

    System.out.print("Enter length of array: ");
    Scanner input = new Scanner(System.in);
    int length = input.nextInt();
    double [] arr = new double [length];
    double maxElement = 0.0;

    for(int index = 0; index < arr.length; index++){
      System.out.print("Enter number: ");
      arr[index] = input.nextDouble();
      if(maxElement<arr[index]){
        maxElement = arr[index];
      }
    }
    System.out.print("Max number: " + maxElement);
    
  }
}