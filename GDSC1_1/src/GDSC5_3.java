import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class GDSC5_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            str[i]=sc.next();
            int cnt=0;
            int rc=0;
            for (int j=0;j<str[i].length();j++){
                if(str[i].charAt(j)=='O'){
                    cnt++;
                    rc=rc+cnt;

                }
                else {

                    cnt=0;
                }
            }
            arr[i]=rc;
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
