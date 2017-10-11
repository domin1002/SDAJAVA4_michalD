import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//Utwórz klasê Arithmetic z metod¹ add, która przyjmuje dwie liczby jako parametry i zwraca ich sumê.
//Utwórz klasê Adder dziedzicz¹c¹ po klasie Arithmetic. 

public class Solution{
    public static void main(String []args){
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
