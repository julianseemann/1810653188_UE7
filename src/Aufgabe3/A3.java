package Aufgabe3;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A3
{
    public static void main(String[] args)
    {
        String eingabe = JOptionPane.showInputDialog("Bitte E-Mail eingeben: ");
        try
        {
            checkEmail(eingabe);
            System.out.println("Ihre E-Mail: " + eingabe);
        }
        catch (Exception e)
        {
            System.err.println("Ungültige Eingabe");
        }
    }


    public static void checkEmail(String email) throws Exception
    {
        Pattern pattern = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );
        Matcher m = pattern.matcher(email);

        if(!m.find())
        {
            throw new Exception();
        }
    }
}
