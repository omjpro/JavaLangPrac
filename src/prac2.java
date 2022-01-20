import java.util.Arrays;
import java.util.Scanner;

public class prac2 {

    public static void main(String[] args) {

        System.out.println("변환하실 문자열을 입력해주세요(최대 50자)");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String result = new String();
        while (input.length() < 1 || input.length() > 50) {
            System.out.println("글자수 50자를 초과하였습니다, 다시 입력하세요");
            input = scan.nextLine();
            if (input.length() > 1 && input.length() < 50) {
                break;
            }
        }
        result = solution(input);
        System.out.println(result);
    }

    public static String solution(String s) {

        String[] strNum = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int cnt = 0;
        for (String num : strNum) {
            if (s.indexOf(num) != -1) {
                int index = Arrays.asList(strNum).indexOf(num);
                s = s.replaceAll(num, String.valueOf(index));
            } else {
                cnt++;
            }
        }
        if (cnt >= strNum.length) {
            return "변환할 단어가 없습니다";
        } else {
            return s;
        }
    }
}

