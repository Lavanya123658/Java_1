
/*
 * Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As each number is read display 
it only if it’s not a duplicate of any number already read display the complete set of unique values input after 
the user enters each new value.
 */

import java.util.*;
class main_3{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        dup_check d=new dup_check();
        d.read(a);
        d.print(a);
    }
}
