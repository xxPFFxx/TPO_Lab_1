package first_part;

public class ArcsinFunc {
    public static double arcsin(double x) {
        if (Math.abs(x) >= 1) {
            return Double.NaN;
        }
        double res = x;
        long chisl = 1;
        long znam = 2;
        for (int i = 2; i<17; i++){
            res += Math.pow(x, 2 * i - 1) * chisl / (znam * (2 * i - 1));
            chisl = chisl * (2L * i - 1);
            znam = znam * (2L * i);
        }
        return res;
    }
}