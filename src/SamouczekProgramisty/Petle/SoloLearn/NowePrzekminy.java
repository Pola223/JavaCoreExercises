package SamouczekProgramisty.Petle.SoloLearn;

public class NowePrzekminy {

    private static String c(int f,int t){
        if(f==t)
            return "" + t;
        else
            return(f + c(f+1,t));
    }

    public static void main(String[] args){
        System.out.println(c(2,5));

        int suma = 0;
        int x=0;

        for (int i = 0; i < 1500 ; i++) {
            suma = suma+i;
        }
        x=(1/suma);
        System.out.println(x);
    }
}
