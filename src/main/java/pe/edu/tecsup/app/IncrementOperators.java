package pe.edu.tecsup.app;

public class IncrementOperators {
    public static void main(String[] args) {
        int valor1 = 5;
        System.out.println("Original value: " + valor1);

        //Postfix incrementing value1
        valor1++;
        System.out.println("Incremented value: " + valor1);

        //Prefix incrementing value1
        ++valor1;
        System.out.println("Incremented value: " + valor1);

        valor1+=10;
        System.out.println("Value incremented by 10: " + valor1);

        //Decrement operators
        int valor2 = 10;
        System.out.println("Original value: " + valor2);

        //Postfix decrementing value2
        valor2--;
        System.out.println("Decremented value: " + valor2);

        --valor2;
        System.out.println("Decremented value: " + valor2);

        valor2-=3;
        System.out.println("Decremented value by 3: " + valor2);

        int valor3 = 20;
        System.out.println("Original value: " + valor3);

        //Fixed increment by multiplication
        valor3*=9;
        System.out.println("Incremented value: " + valor3);

        valor3/=2;
        System.out.println("Incremented value: " + valor3);


    }
}
