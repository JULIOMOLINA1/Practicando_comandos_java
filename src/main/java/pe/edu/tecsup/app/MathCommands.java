package pe.edu.tecsup.app;

public class MathCommands {
    public static void main(String[] args) {

        //Square root calculation
        int valor = 9;
        System.out.println("Square of: " + valor + " = "+ Math.sqrt(valor));
        //Power calculation
        int base = 2;
        int exponent = 3;
        System.out.println("The power calculation of 2 raised to 3 = "+Math.pow(base, exponent));
        //Absolute value of a number
        double absolute = -2.5;
        System.out.println("The absolute value of: " + absolute+ " = "+ Math.abs(absolute));
        //Identify the greater value
        double number1=50.2;
        int number2=3;
        System.out.println("Greater value: "+Math.max(number1, number2));
        System.out.println("Smaller value: "+Math.min(number1, number2));
        //Round a value
        double total = 5.2826;
        System.out.println(total + " rounded = "+Math.round(total));
        //Round down
        System.out.println(total + " rounded down = "+Math.floor(total));
        //Round up
        System.out.println(total + " rounded up = "+Math.ceil(total));
        //Random number between 0.0 to 1.0
        double random = Math.random();
        System.out.println("Random number: "+ random);
        //PI number function
        System.out.println("PI value is: " + Math.PI);
        //Sine of an angle
        System.out.println("Sine of an 90-degree angle: "+Math.sin(Math.PI/2));
        //Cosine of an angles
        System.out.println("Cosine of an 180-degree angle: "+Math.cos(Math.PI));
        //Natural logarithm of a number
        int log = 100;
        System.out.println("Logarithm of: "+log+ " = "+Math.log(log));
        //Logarithm base 10
        System.out.println("Logarithm base 10 of: "+log+ " = "+Math.log10(log));

    }
}
