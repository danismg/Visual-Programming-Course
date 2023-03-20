// 12S20031 - Daniel Andres Simangunsong
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nIM, fullName, studyProgram, usernameGithub, phoneNumber, nickName, gender;
        int generation;
        String greetings;
        String yourUsernameGithub;
        String phoneNumber1, phoneNumber2, phoneNumber3;
        String optionGender;
        int yearGeneration;
        
        nIM = input.nextLine();
        fullName = input.nextLine();
        studyProgram = input.nextLine();
        yourUsernameGithub = input.nextLine();
        do {
            phoneNumber1 = input.nextLine();
        } while (phoneNumber1.equals("---"));
        phoneNumber2 = input.nextLine();
        if (phoneNumber2.equals("---")) {
            phoneNumber = phoneNumber1;
        } else {
            phoneNumber3 = input.nextLine();
            if (phoneNumber3.equals("---")) {
                phoneNumber = phoneNumber1 + "," + phoneNumber2;
            } else {
                phoneNumber = phoneNumber1 + "," + phoneNumber2 + "," + phoneNumber3;
            }
        }
        nickName = input.nextLine();
        optionGender = input.nextLine();
        yearGeneration = input.nextInt();
        if (yourUsernameGithub.equals("")) {
            usernameGithub = "---";
        } else {
            usernameGithub = yourUsernameGithub;
        }
        if (optionGender.equals("L")) {
            if (yearGeneration < 2020) {
                greetings = "Bang" + " " + nickName;
            } else {
                greetings = nickName;
            }
        } else {
            if (yearGeneration < 2020) {
                greetings = "Kak" + " " + nickName;
            } else {
                greetings = nickName;
            }
        }
        System.out.println(nIM + "#" + fullName + "#" + studyProgram + "#" + usernameGithub + "#" + phoneNumber);
        System.out.println(greetings);
    }
}
