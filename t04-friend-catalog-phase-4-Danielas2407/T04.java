// 12S20031 - Daniel Andres Simangunsong
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int size;
        
        size = 5;
        String[] nim = new String[size], name = new String[size], phone = new String[size];
        int end;
        
        end = size - 1;
        for (size = 0; size <= end; size++) {
            String studyprogram, nickname, githubusername, gender, greetings, contact, generationyear;
            
            nim[size] = input.nextLine();
            if (nim[size].equals("---")) {
                size = end;
            } else {
                name[size] = input.nextLine();
                studyprogram = input.nextLine();
                githubusername = input.nextLine();
                int phonecounter;
                int phonesize;
                
                phonesize = 3;
                String allphone;
                
                allphone = "";
                for (phonecounter = 1; phonecounter <= phonesize; phonecounter++) {
                    phone[size] = input.nextLine();
                    if (phone[size].equals("---")) {
                        phone[size] = "";
                        phonesize = 2;
                    } else {
                        if (phonecounter > 1) {
                            allphone = allphone + ",";
                        }
                    }
                    allphone = allphone + phone[size];
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
                System.out.println(nim[size] + "#" + name[size] + "#" + studyprogram + "#" + githubusername + "#" + allphone);
                System.out.println(greetings);
            }
        }
    }
}
