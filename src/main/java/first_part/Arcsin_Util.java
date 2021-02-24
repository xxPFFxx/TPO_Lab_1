package first_part;

public class Arcsin_Util {
    public static double arcsin(double num){
        if (Math.abs(num) >=1){
            return Double.NaN;
        }
        double res = 0;
        int chisl = 1;
        int znam = 1;
        for (int i = 1; i < 7; i++){
            res += Math.pow(num, 2*i-1) * chisl / (znam*(2*i-1));
            chisl = chisl * (2*i - 1);
            znam = znam * (2*i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arcsin_Util.arcsin(0.5));
    }
}
