// 12S20026 - Mastuari Octafina Rumapea
// 12S20031 - Daniel Andres Simangunsong
import java.util.*;
import java.lang.Math;

public class q02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        
        size = 5;
        String register;
        String find;
        String[] kata = new String[size];
        String[] jeniskata = new String[size];
        String[] artikata = new String[size];
        int proses;
        String pilihan;
        String[] kamus = new String[size];
        int end;
        
        end = 4;
        boolean finds;
        
        finds = false;
        kata[0] = "";
        kata[1] = "";
        kata[2] = "";
        kata[3] = "";
        kata[4] = "";
        do {
            pilihan = input.nextLine();
            if (pilihan.equals("register")) {
                inregister(kata, jeniskata, artikata, kamus);
            } else {
                if (finds == false) {
                    infind(kata, kamus);
                } else {
                    do {
                        find = input.nextLine();
                    } while (!find.equals("---"));
                }
            }
        } while (!pilihan.equals("---"));
    }
    
    public static void infind(String[] inkata, String[] inkamus) {
        String find;
        
        do {
            find = input.nextLine();
            if (find.equals(inkata[0])) {
                System.out.println(inkamus[0]);
            } else {
                if (find.equals(inkata[1])) {
                    System.out.println(inkamus[1]);
                } else {
                    if (find.equals(inkata[2])) {
                        System.out.println(inkamus[2]);
                    } else {
                        if (find.equals(inkata[3])) {
                            System.out.println(inkamus[3]);
                        } else {
                            if (find.equals(inkata[4])) {
                                System.out.println(inkamus[4]);
                            }
                        }
                    }
                }
            }
        } while (find.equals("---"));
    }
    
    public static void inregister(String[] inkata, String[] injeniskata, String[] inartikata, String[] inkamus) {
        boolean finds;
        int size;
        
        size = 5;
        inkata[size - 1] = input.nextLine();
        injeniskata[size - 1] = input.nextLine();
        inartikata[size - 1] = input.nextLine();
        inkamus[size - 1] = inkata[size - 1] + "#" + injeniskata[size - 1] + "#" + inartikata[size - 1];
        size = size - 1;
        finds = true;
    }
}
