import java.util.Scanner;

public class Human {
    public String name;
    public String id;

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("이름을 입력하세요 ");
        name = in.next();
        System.out.print("번호를 입력하세요 ");
        id = in.next();
    }
}
