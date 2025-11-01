package pe.edu.tecsup.app;

public class CasteoData {

    public static void main(String[] args) {

        // From text yto int data point
        String number = "123";
        int numberText = Integer.parseInt(number);
        System.out.println("Number: " + numberText );

        //From data point to text data
        int text = 456;
        String textNumber = String.valueOf(text);
        System.out.println("Text: " + textNumber);

        //From double data point to integer
        double numberDouble = 45.34;
        int numberInteger = (int)numberDouble;
        System.out.println("Integer number: " + numberInteger);

        //From integer data point to double data
        int numberIntegers = 45;
        double numberDoubles = (double)numberIntegers;
        System.out.println("Double number: " + numberDoubles);

    }
}
