import com.sun.jdi.Value;

import java.util.Scanner;

public class GDSC3_4 {
    public static void main(String[] args) {
        int cnt=0;

        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int Newn=num;
        while (true) {

            int x = num / 10;
            int y = num % 10;

            int f = x + (y - x);
            int s = (x + y)%10;

            String fir = String.valueOf(f);
            String sec = String.valueOf(s);
            String str = fir + sec;
            num = Integer.parseInt(str);
            cnt++;
            if(num==Newn)
                break;

        }
        System.out.println(cnt);



    }

}
