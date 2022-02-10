import java.util.Scanner;

public class GDSC5_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            int cnt=1;
            if(str.charAt(0)==' ')
                cnt--;
            for (int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    cnt++;
                }
            }
            if(str.charAt(str.length()-1)==' ')
                cnt--;

        System.out.println(cnt);

    }
}
