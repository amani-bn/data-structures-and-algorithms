// package com.Main;

public class Main {

    public static void main(String[] args) {

      reverseArray();
    }//end main()

  public static void reverseArray(){
    int [] arr={1,2,3,4,5,6};
    System.out.print("[");
    for (int i=arr.length-1;i>=0;i--){
      if (i< arr.length-1) {
        System.out.print(", ");
      }// end if
      System.out.print(arr[i]);
    }// end for
    System.out.print("]");
    }// end reverseArray()
}//end class

