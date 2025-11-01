package pe.edu.tecsup.app;

import javax.swing.*;

public class InputDatos2 {

    public static void main(String[] args) {

        String name;
        int age;

        //Data entry
        name=JOptionPane.showInputDialog(null, "Enter your name: ");
        String age2 = JOptionPane.showInputDialog(null, "Enter your age: ");
        age = Integer.parseInt(age2);

        //Data output
        JOptionPane.showMessageDialog(null, "Name: " + name + "\n" +
                                                         "Age: " + age );
    }

}
