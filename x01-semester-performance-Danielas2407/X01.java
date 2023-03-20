// 12S20031 - Daniel Andres Simangunsong
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iPK, nilaiAngka, kredit, nilaiHuruf, iPS;
        double performa, totalPerforma, jumlahKredit;
        int totalKredit;
        boolean berhenti;
        
        performa = 0;
        totalPerforma = 0;
        berhenti = false;
        totalKredit = 0;
        while (!berhenti) {
            kredit = input.nextLine();
            nilaiHuruf = input.nextLine();
            if (nilaiHuruf.equals("A")) {
                performa = Integer.parseInt(kredit) * 4.0;
            } else {
                if (nilaiHuruf.equals("AB")) {
                    performa = Integer.parseInt(kredit) * 3.5;
                } else {
                    if (nilaiHuruf.equals("B")) {
                        performa = Integer.parseInt(kredit) * 3.0;
                    } else {
                        if (nilaiHuruf.equals("BC")) {
                            performa = Integer.parseInt(kredit) * 2.5;
                        } else {
                            if (nilaiHuruf.equals("C")) {
                                performa = Integer.parseInt(kredit) * 2.0;
                            } else {
                                if (nilaiHuruf.equals("D")) {
                                    performa = Integer.parseInt(kredit) * 1.0;
                                } else {
                                    if (nilaiHuruf.equals("E")) {
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
            if (berhenti) {
            } else {
                totalKredit = totalKredit + Integer.parseInt(kredit);
                totalPerforma = totalPerforma + performa;
                iPS = toFixed(totalPerforma / totalKredit,2);
                System.out.println(performa);
            }
        }
        if (totalPerforma > 0) {
            System.out.println(iPS);
            System.out.println(totalKredit);
        } else {
            System.out.println("");
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
