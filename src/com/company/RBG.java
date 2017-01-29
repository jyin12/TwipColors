package com.company;

/**
 * Created by Yin on 1/25/2017.
 */
public class RBG {
    public static int red;
    public static int green;
    public static int blue;

    public RBG(int  r, int g, int b)
    {
        red = r;
        green = g;
        blue = b;
    }

    public static String comb()
    {
        String rr = Integer.toHexString(red);
        String gg = Integer.toHexString(green);
        String bb = Integer.toHexString(blue);
        if(rr.length() == 1)
        {
            rr = "0" + rr;
        }
        if(gg.length() == 1)
        {
            gg = "0" + gg;
        }
        if(bb.length() == 1)
        {
            bb = "0" + bb;
        }

        return rr + gg + bb;
    }
}
