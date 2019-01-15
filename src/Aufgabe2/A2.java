package Aufgabe2;

import javax.swing.*;

public class A2
{
    public static void main (String[]args)
    {
        ziffer();
    }

    public static void ziffer()
    {
        try
        {
            Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl eingeben"));
        }
        catch (NumberFormatException a)
        {
            System.err.println("Das war keine Zahl");
            ziffer();
        }
    }
}
