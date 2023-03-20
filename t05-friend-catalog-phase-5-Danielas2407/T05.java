// 12S20031 - Daniel Andres Simangunosng
import java.util.*;
import java.lang.Math;

public class T05 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        String kembaran2;
        
        size = 5;
        int end;
        
        end = size - 1;
        String dataku;
        String data, alldata;
        String selectoption;
        
        data = "";
        alldata = "";
        dataku = "";
        do {
            selectoption = input.nextLine();
            if (selectoption.equals("---")) {
            } else {
                if (selectoption.equals("1")) {
                    String datamu;
                    
                    datamu = dataku;
                    int size;
                    
                    size = 5;
                    int end;
                    
                    end = size - 1;
                    for (size = 0; size <= end; size++) {
                        System.out.println(kembaran2);
                    }
                } else {
                    if (selectoption.equals("2")) {
                        kembaran2 = option2(data, alldata, size);
                    } else {
                        if (selectoption.equals("3")) {
                        }
                    }
                }
            }
        } while (!selectoption.equals("---"));
    }
    
    public static void option1(String indataku) {
    }
    
    public static String option2(String indata, String inalldata, int insize) {
        String[] nim = new String[insize], name = new String[insize], phone = new String[insize];
        String studyprogram, nickname, githubusername, gender, greetings, contact, generationyear;
        
        if (insize == 0) {
            indata = "";
            inalldata = "";
        } else {
            insize = insize - 1;
            nim[insize] = input.nextLine();
            if (nim[insize].equals("---")) {
                insize = 0;
            } else {
                name[insize] = input.nextLine();
                studyprogram = input.nextLine();
                githubusername = input.nextLine();
                int phonecounter;
                int phonesize;
                
                phonesize = 3;
                String allphone;
                
                allphone = "";
                for (phonecounter = 1; phonecounter <= phonesize; phonecounter++) {
                    phone[insize] = input.nextLine();
                    if (phone[insize].equals("---")) {
                        phone[insize] = "";
                        phonesize = 2;
                    } else {
                        if (phonecounter > 1) {
                            allphone = allphone + ",";
                        }
                    }
                    allphone = allphone + phone[insize];
                }
                nickname = input.nextLine();
                gender = input.nextLine();
                generationyear = input.nextLine();
                if (gender.equals("L")) {
                    if (Integer.parseInt(generationyear) > 2019) {
                        greetings = nickname;
                    } else {
                        greetings = "Bang" + " " + nickname;
                    }
                } else {
                    if (Integer.parseInt(generationyear) > 2019) {
                        greetings = nickname;
                    } else {
                        greetings = "Kak" + " " + nickname;
                    }
                }
                indata = nim[insize] + "#" + name[insize] + "#" + studyprogram + "#" + githubusername + "#" + allphone;
                inalldata = greetings;
            }
        }
        
        return kembaran2;
    }
}
