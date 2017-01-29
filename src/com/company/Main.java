package com.company;
import com.sun.scenario.effect.Color4f;
import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner a = new Scanner(System.in);
        System.out.println("Would you like to enter RGB, Hex or HTML names?");
        String ans = a.next();

        if(ans.equalsIgnoreCase("RGB"))
        {
            System.out.println("Enter number for red between 0-255");
            int red1 = a.nextInt();
            System.out.println("Enter number for green between 0-255");
            int green1 = a.nextInt();
            System.out.println("Enter number for blue between 0-255");
            int blue1 = a.nextInt();
            String r1 = Integer.toHexString(red1);
            String g1 = Integer.toHexString(green1);
            String b1 = Integer. toHexString(blue1);
            if(r1.length() == 1)
            {
                r1 = "0" + r1;
            }
            if(g1.length() == 1)
            {
                g1 = "0" + g1;
            }
            if(b1.length() == 1)
            {
                b1 = "0" + b1;
            }

            Colors cc4 = new Colors(r1 + g1 + b1);
            System.out.println("Your color name is: " + cc4.colorName());
            RBG aa = new RBG(red1, green1, blue1);
            System.out.println("The hex code is: " + aa.comb());
        }
        else if(ans.equalsIgnoreCase("Hex"))
        {
            System.out.println("Enter your hex color code");
            String hex1 = a.next();
            Colors cc3 = new Colors(hex1);
            System.out.println("Your color name is: " + cc3.colorName());
            int red2 = Integer.parseInt(hex1.substring(0,2), 16);
            int green2 = Integer.parseInt(hex1.substring(2,4), 16);
            int blue2 = Integer.parseInt(hex1.substring(4,6), 16);
            System.out.println("Your RGB color code is: RGB(" + red2 + ", " + green2 + ", " + blue2 + ")");
        }
        else
        {
            System.out.println("Enter a HTML color to get RGB and Hex code");
            String c1 = a.next();
            Colors cc1 = new Colors(c1);
            System.out.println("Your hex code is " + cc1.list());
            int red3 = Integer.parseInt(cc1.list().substring(0,2), 16);
            int green3 = Integer.parseInt(cc1.list().substring(2,4), 16);
            int blue3 = Integer.parseInt(cc1.list().substring(4,6), 16);
            System.out.println("Your RGB color code is: RGB(" + red3 + ", " + green3 + ", " + blue3 + ")");

        }
    }
}
