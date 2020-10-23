package exercise4;

import java.util.Scanner;

public class ArrayOutput{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int length = input.nextInt();
    int[] array = new int [length];
    String spaces = "";

    for(int index = 0; index < array.length; index++){
      array[index] = input.nextInt();
    }
    for(int i = 0; i < array.length; i++){
      if(i !=0 ){
        spaces += " ";
        System.out.println(spaces + array[i]);
      }else{
        System.out.println(array[i]);
      }
    }
  }
}