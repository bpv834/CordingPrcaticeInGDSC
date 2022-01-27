import java.util.Scanner;

public class GDSC4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        String str=sc.next();
        int arr[]=new int[n];
        for(int i=0;i<str.length();i++){
          arr[i]=(str.charAt(i)-48);
            System.out.println(arr[i]);
          sum+=arr[i];
        }
        System.out.println(sum);
    }
}
