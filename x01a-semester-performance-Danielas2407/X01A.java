// 12S20031 - Daniel Andres Simangunsong
import java.util.*;
import java.lang.Math;

public class X01A {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String matakuliah, sks, nilaihurup, data1, data2;
        String lecturename1, credits1, lettergrade1;
        double grade, deviation, deviationgrade, deviationgrade1;
        
        deviationgrade = 0.0;
        lecturename1 = "";
        credits1 = "";
        lettergrade1 = "";
        data1 = "";
        do {
            matakuliah = input.nextLine();
            sks = input.nextLine();
            nilaihurup = input.nextLine();
            if (nilaihurup.equals("A")) {
                grade = Double.parseDouble(sks) * 4.0;
                deviation = 4.0 * Double.parseDouble(sks);
                deviationgrade1 = deviation - grade;
                data2 = lecturename + "#" + credits + "#" + lettergrade + "#" + deviationgrade1;
                if (deviationgrade1 > deviationgrade) {
                    deviationgrade = deviationgrade1;
                    data1 = data2;
                    lecturename1 = lecturename;
                    credits1 = credits;
                    lettergrade1 = lettergrade;
                } else {
                    deviationgrade = deviationgrade;
                    data1 = data1;
                    lecturename1 = lecturename1;
                    credits1 = credits1;
                    lettergrade1 = lettergrade1;
                }
            } else {
                if (nilaihurup.equals("AB")) {
                    grade = Double.parseDouble(sks) * 3.5;
                    deviation = 4.0 * Double.parseDouble(sks);
                    deviationgrade1 = deviation - grade;
                    data2 = lecturename + "#" + credits + "#" + lettergrade + "#" + deviationgrade1;
                    if (deviationgrade1 > deviationgrade) {
                        deviationgrade = deviationgrade1;
                        data1 = data2;
                        lecturename1 = lecturename;
                        credits1 = credits;
                        lettergrade1 = lettergrade;
                    } else {
                        deviationgrade = deviationgrade;
                        data1 = data1;
                        lecturename1 = lecturename1;
                        credits1 = credits1;
                        lettergrade1 = lettergrade1;
                    }
                } else {
                    if (nilaihurup.equals("B")) {
                        grade = Double.parseDouble(sks) * 3.0;
                        deviation = 4.0 * Double.parseDouble(sks);
                        deviationgrade1 = deviation - grade;
                        data2 = lecturename + "#" + credits + "#" + lettergrade + "#" + deviationgrade1;
                        if (deviationgrade1 > deviationgrade) {
                            deviationgrade = deviationgrade1;
                            data1 = data2;
                            lecturename1 = lecturename;
                            credits1 = credits;
                            lettergrade1 = lettergrade;
                        } else {
                            deviationgrade = deviationgrade;
                            data1 = data1;
                            lecturename1 = lecturename1;
                            credits1 = credits1;
                            lettergrade1 = lettergrade1;
                        }
                    } else {
                        if (nilaihurup.equals("BC")) {
                            grade = Double.parseDouble(sks) * 2.5;
                            deviation = 4.0 * Double.parseDouble(sks);
                            deviationgrade1 = deviation - grade;
                            data2 = lecturename + "#" + credits + "#" + lettergrade + "#" + deviationgrade1;
                            if (deviationgrade1 > deviationgrade) {
                                deviationgrade = deviationgrade1;
                                data1 = data2;
                                lecturename1 = lecturename;
                                credits1 = credits;
                                lettergrade1 = lettergrade;
                            } else {
                                deviationgrade = deviationgrade;
                                data1 = data1;
                                lecturename1 = lecturename1;
                                credits1 = credits1;
                                lettergrade1 = lettergrade1;
                            }
                        } else {
                            if (nilaihurup.equals("C")) {
                                grade = Double.parseDouble(sks) * 2.0;
                                deviation = 4.0 * Double.parseDouble(sks);
                                deviationgrade1 = deviation - grade;
                                data2 = lecturename + "#" + credits + "#" + lettergrade + "#" + deviationgrade1;
                                if (deviationgrade1 > deviationgrade) {
                                    deviationgrade = deviationgrade1;
                                    data1 = data2;
                                    lecturename1 = lecturename;
                                    credits1 = credits;
                                    lettergrade1 = lettergrade;
                                } else {
                                    deviationgrade = deviationgrade;
                                    data1 = data1;
                                    lecturename1 = lecturename1;
                                    credits1 = credits1;
                                    lettergrade1 = lettergrade1;
                                }
                            } else {
                                if (nilaihurup.equals("D")) {
                                    grade = Double.parseDouble(sks) * 1.0;
                                    deviation = 4.0 * Double.parseDouble(sks);
                                    performa = deviation - grade;
                                    data2 = lecturename + "#" + credits + "#" + lettergrade + "#" + deviationgrade1;
                                    if (deviationgrade1 > deviationgrade) {
                                        deviationgrade = deviationgrade1;
                                        data1 = data2;
                                        lecturename1 = lecturename;
                                        credits1 = credits;
                                        lettergrade1 = lettergrade;
                                    } else {
                                        deviationgrade = deviationgrade;
                                        data1 = data1;
                                        lecturename1 = lecturename1;
                                        credits1 = credits1;
                                        lettergrade1 = lettergrade1;
                                    }
                                } else {
                                    if (nilaihurup.equals("E")) {
                                        grade = Double.parseDouble(sks) * 0.0;
                                        deviation = 4.0 * Double.parseDouble(sks);
                                        performa = deviation - grade;
                                        data2 = lecturename + "#" + credits + "#" + lettergrade + "#" + deviationgrade1;
                                        if (deviationgrade1 > deviationgrade) {
                                            deviationgrade = deviationgrade1;
                                            data1 = data2;
                                            lecturename1 = lecturename;
                                            credits1 = credits;
                                            lettergrade1 = lettergrade;
                                        } else {
                                            deviationgrade = deviationgrade;
                                            data1 = data1;
                                            lecturename1 = lecturename1;
                                            credits1 = credits1;
                                            lettergrade1 = lettergrade1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } while (lettergrade != "---");
        if (data1.equals("")) {
            System.out.println("---" + "#" + "---" + "#" + "---" + "#" + "---");
        } else {
            System.out.println(lecturename1 + "#" + credits1 + "#" + lettergrade1 + "#" + toFixed(deviationgrade,1));
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
