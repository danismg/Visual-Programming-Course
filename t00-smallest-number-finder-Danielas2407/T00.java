// 12S20031 - Daniel Andres Simangunsong
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, z;
        int s;
        
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        if (x < y) {
            s = x;
        } else {
            s = y;
        }
        if (z < s) {
            s = z;
        }
        System.out.println(s);
    }
}
