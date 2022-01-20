import java.util.Arrays;
import java.util.Scanner;

public class pact {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String result = String.valueOf(solution(input));
        System.out.println(result);

    }

    public static String solution(String s) {

        String[] strNum = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numNum = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (String num : strNum) {
            if (s.indexOf(num) != -1) {
                int index = Arrays.asList(strNum).indexOf(num);
                s = s.replaceAll(num, numNum[index]);
            } else {
                continue;
            }
        }
        return s;
    }

}
