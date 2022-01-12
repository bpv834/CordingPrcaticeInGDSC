import java.util.HashMap;
import java.util.Scanner;

public class Java_Exam extends Object_1 {
    public Java_Exam(int Price, int Unit_price, int Remains, String EngName, String Code) {
        super(Price, Unit_price, Remains, EngName, Code);
    }
    public static void main(String[] args) {
// 학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
        HashMap<String, Object_1> map = new HashMap<String, Object_1>();
// 3 명의 학생 저장
        map.put("과자", new Object_1(1000, 500,10, "Snack","aaaa"));
        map.put("껌", new Object_1(500, 300,5,"Gum","bbbb"));
        map.put("사탕", new Object_1(200, 100,20,"Candy","cccc"));
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("검색할 이름?");
            String name = scanner.nextLine(); // 사용자로부터 이름 입력
            if(name.equals("exit"))
                break; // while 문을 벗어나 프로그램 종료
            Object_1 student = map.get(name); // 이름에 해당하는 Student 객체 검색
            if(student == null)
                System.out.println(name + "은 없는 사람입니다.");
            else
                System.out.println("단가:" + student.getD() + ", 재고:" + student.getJ()+", 판매가"+ student.Unit_price*student.getJ()+", 영문이름"+ student.getN()+", 상품코드"+student.Code);
        }
        scanner.close();
    }
}
