package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal{
  public static void main(String[] args){

    System.out.print("Enter length of array: ");
    Scanner input = new Scanner(System.in);
    int length = input.nextInt();
    char[] arrInput = new char [length];
    char[] arrOutput = new char [length];

    for(int index = 0; index < arrInput.length; index++){
      System.out.print("Enter element: ");
      arrInput[index] = input.next().charAt(0);
    }
    for(int index = 0; index < arrInput.length; index++){
      arrOutput[length-index-1] = arrInput[index];
    }




    String numbersAsString = Arrays.toString(arrOutput);
    System.out.println("Reversed symbols: " + numbersAsString);
  }
}