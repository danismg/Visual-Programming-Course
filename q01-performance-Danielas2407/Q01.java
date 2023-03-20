// 12S20031 - Daniel Andres Simangunsong
import java.util.*;
import java.lang.Math;

public class Q01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kredit, nilaihuruf;
        double performa;
        boolean berhenti;
        
        berhenti = false;
        performa = 0.0;
        while (!berhenti) {
            kredit = input.nextLine();
            nilaihuruf = input.nextLine();
            if (nilaihuruf.equals("A")) {
                performa = Integer.parseInt(kredit) * 4.0;
            } else {
                if (nilaihuruf.equals("AB")) {
                    performa = Integer.parseInt(kredit) * 3.5;
                } else {
                    if (nilaihuruf.equals("B")) {
                        performa = Integer.parseInt(kredit) * 3.0;
                    } else {
                        if (nilaihuruf.equals("BC")) {
                            performa = Integer.parseInt(kredit) * 2.5;
                        } else {
                            if (nilaihuruf.equals("C")) {
                                performa = Integer.parseInt(kredit) * 2.0;
                            } else {
                                if (nilaihuruf.equals("D")) {
                                    performa = Integer.parseInt(kredit) * 1.0;
                                } else {
                                    if (nilaihuruf.equals("E")) {
                                        performa = Integer.parseInt(kredit) * 0.0;
                                    } else {
                                        berhenti = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!berhenti) {
                System.out.println(performa);
            } else {
                System.out.println("");
            }
        }
    }
}
