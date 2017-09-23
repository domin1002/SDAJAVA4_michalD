import java.lang.reflect.Method;

class Printer
{
   //tutaj napisz kod tak, aby projekt si� skompilowa� i uruchomi� poprawnie
	//nale�y utworzy� tylko jedn� metod�
    public Object printArray(Object[] a){ //każda klasa dziedziczy po klasie Object więc typem wspólnym
        for(int i=0; i<a.length; i++){    // dla int oraz string jest właśnie ona
            System.out.println(a[i]);;
        }
        return null;
    }
 
}

public class Solution {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) { //sprawdzenie wszyskich metod z klasy printer
            String name = method.getName();     //pobranie nazwy

            if(name.equals("printArray"))       //sprawdzenie czy któraś z nich nazywa się printArray
                count++;
        }

        if(count > 1)System.out.println("Tworzenie dw�ch metod printArray nie jest dozwolone");
      
    }
}