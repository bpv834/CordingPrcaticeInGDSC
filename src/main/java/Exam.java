import java.util.HashMap;
import java.util.Scanner;


public class Exam extends OObj {
    public Exam(int Panmae, int Danga, int Jago, String EN, String Code) {
        super(Panmae, Danga, Jago, EN, Code);


    }

    public static void main(String[] args) {
// 학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
        HashMap<String, OObj> map = new HashMap<String, OObj>();
// 3 명의 학생 저장
        map.put("연필", new OObj(500, 300,5, "pnecil","a1234"));
        map.put("지우개", new OObj(1000, 800,10,"earaser","b4567"));
        map.put("자", new OObj(2000, 1000,15,"rulrer","c8910"));
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("검색할 이름?");
            String name = scanner.nextLine(); // 사용자로부터 이름 입력
            if(name.equals("exit"))
                break; // while 문을 벗어나 프로그램 종료
            OObj student = map.get(name); // 이름에 해당하는 Student 객체 검색
            if(student == null)
                System.out.println(name + "은 없는 사람입니다.");
            else
                System.out.println("단가:" + student.getD() + ", 재고:" + student.getJ()+", 판매가"+ student.Danga*student.getJ()+", 영문이름"+ student.getN()+", 상품코드"+student.Code);
        }
        scanner.close();
    }


}
