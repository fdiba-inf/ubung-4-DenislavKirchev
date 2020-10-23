package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput{
  public static void main(String[] args){

    System.out.print("Enter length of array: ");
    Scanner input = new Scanner(System.in);
    int length = input.nextInt();
    int[] arr = new int [length];

    for(int index = 0; index < arr.length; index++){
      System.out.print("Enter number: ");
      arr[index] = input.nextInt();
    }
    String numbersAsString = Arrays.toString(arr);
    System.out.println("Numbers: " + numbersAsString);
  }
}