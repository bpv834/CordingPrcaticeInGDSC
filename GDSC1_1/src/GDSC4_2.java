import java.util.Scanner;

public class GDSC4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int max = 0;
        int cnt = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<9;i++){
            if(arr[i]==max) {

                System.out.println(i + 1);

            }
        }
    }
}
