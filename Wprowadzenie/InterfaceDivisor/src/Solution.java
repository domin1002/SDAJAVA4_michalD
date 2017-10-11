import java.util.*;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

//Napisz klas� MyCalculator implementuj�c� interfejs AdvancedArithmetic
//Metoda divisorSum powinna zwraca� sum� dzielnik�w liczby podaj przez u�ytkownika
//Przyk�ad: u�ytkownik wpisa� cyfr� 6
//Dzielniki to: 1, 2, 3, 6
//Suma dzielnik�w: 12

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {

        int suma=0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                suma += i;
        }
        return suma;
    }

}


public class Solution {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(myCalculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(myCalculator.divisorSum(n) + "\n");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
