import java.util.Scanner;


public class ValidSquare {
    public static void main(String[] args) {
        int[] p1 = {1,0};
        int[] p2 = {0,1};
        int[] p3 = {0,-1};
        int[] p4 = {-1,0};
        validSquare(p1, p2, p3, p4);


    }


    static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        boolean a = vertical(p1, p2, p4, p2) && vertical(p1, p3, p4, p3) && vertical(p2, p1, p3, p1) && vertical(p1, p4, p2, p3);

        if(a) {
            return true;
        }
        else {
            boolean b = vertical(p1, p3, p2, p3) && vertical(p3, p2, p4, p2) && vertical(p1, p4, p2, p4) && vertical(p1, p2, p3, p4);
            if(b) {
                return true;
            }
            else {
                return vertical(p1, p2, p3, p2) && vertical(p2, p3, p4, p3) && vertical(p2, p1, p4, p1) && vertical(p1, p3, p2, p4);
            }

        }
    }

    public static boolean vertical(int[] a, int[] b, int[] u, int[] v) {
        int y1 = a[1]-b[1];
        int y2 = u[1]-v[1];
        int x1 = a[0]-b[0];
        int x2 = u[0]-v[0];
        return (y1!=0 || y2!=0) && (y2*y1+x2*x1==0);
    }
}
