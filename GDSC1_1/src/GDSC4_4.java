public class GDSC4_4 {
    public static String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (ch == ' ')
                answer = answer + ' ';

            else if (ch  < 'a') {
                if (ch + n <= 'Z')
                    answer = answer + (char) (ch + n);
                else answer = answer + (char) ('A'-1+(ch+n-'Z'));
            } else {
                if (ch + n <= 'z')
                    answer = answer + (char) (ch + n);
                else
                    answer = answer + (char) ('a'-1+(ch+n-'z'));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("YZ yz",25));
    }
}
