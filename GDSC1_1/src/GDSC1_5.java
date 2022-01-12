import java.util.Arrays;
import java.util.Scanner;

public class GDSC1_5 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i =0; i< lost.length; i++){
            for(int j =0; j< reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = reserve[j] = -100;
                    break;
                }
            }
        }
        for(int i =0; i< lost.length; i++){
            for(int j =0; j< reserve.length; j++){
                if(Math.abs(lost[i]-reserve[j]) == 1){
                    answer++;
                    lost[i] =   reserve[j] = -100;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int s[]=new int[]{1,3,7,21,27};
        int x[]=new int[]{1,4,9};

        System.out.println(solution(30,s,x));
    }
}
