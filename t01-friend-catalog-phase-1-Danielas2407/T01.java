// 12S20031 - Daniel Andres Simangunsong
import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nIM;
        String namaLengkap;
        String programStudi;
        String usernameGitHub;
        String noTelepon;
        
        nIM = input.nextLine();
        namaLengkap = input.nextLine();
        programStudi = input.nextLine();
        usernameGitHub = input.nextLine();
        noTelepon = input.nextLine();
        System.out.println(nIM + "#" + namaLengkap + "#" + programStudi + "#" + usernameGitHub + "#" + noTelepon);
    }
}
