// 12S20031 - Daniel Andres SImangunsong
import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nIM, fullName, studyProgram, usernameGithub, phoneNumber, nickname, gender;
        int generation;
        String greetings;
        String yourUsernameGithub;
        String optionGender;
        int yearGeneration;
        
        nIM = input.nextLine();
        fullName = input.nextLine();
        studyProgram = input.nextLine();
        yourUsernameGithub = input.nextLine();
        phoneNumber = input.nextLine();
        nickname = input.nextLine();
        optionGender = input.nextLine();
        yearGeneration = input.nextInt();
        if (yourUsernameGithub.equals("")) {
            usernameGithub = "---";
        } else {
            usernameGithub = yourUsernameGithub;
        }
        if (optionGender.equals("L")) {
            if (yearGeneration < 2020) {
                greetings = "Bang" + " " + nickname;
            } else {
                greetings = nickname;
            }
        } else {
            if (yearGeneration < 2020) {
                greetings = "Kak" + " " + nickname;
            } else {
                greetings = nickname;
            }
        }
        System.out.println(nIM + "#" + fullName + "#" + studyProgram + "#" + usernameGithub + "#" + phoneNumber);
        System.out.println(greetings);
    }
}

