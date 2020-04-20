package SamouczekProgramisty.ObiektyPakiety;

import com.sun.xml.internal.fastinfoset.util.StringArray;

public class TabliceAlfabet{

    public TabliceAlfabet(int a){

        String[] Alfabet = {"a", "b", "c", "d","e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "r", "s", "t", "u", "w", "y",
                "z"};
        String[] AlfabetTabOfX = new String[a];

        for (int i = 0; i < (a) ; i++) {
            System.out.print(Alfabet[i]+ ", ");
            AlfabetTabOfX[i]=Alfabet[i];
        }


    }
}
