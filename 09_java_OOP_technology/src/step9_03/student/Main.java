package step9_03.student;
import java.util.Scanner;

public class Main { //메인에서 입력
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();	
			
		while (true) {
			
			System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {//아이디추가
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				System.out.print("번호를 입력하세요 : ");
				int num = scan.nextInt();
				
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				
				StudentInsert stInsert = controller.getInsert();
				//controller는 9번줄에  new controller생성
				//새로운 객체생성getinsert
				
				stInsert.insert(new StudentVO(id , num , name));
				
				//stInsert안에 studentVO라는 묶음에id, num,name을 담는다.
				//stInsert는 StudentInsert에서 만들어졌다.
			}
			else if (selectMenu == 2) {
				/*
				 *  # 구현해 보시오.
				 *  
				 *  - 아이디를 입력받아서 해당되는 아이디가 있으면
				 *    이름과 번호를 변경할 수 있는 기능
				 * 
				 * */
			}
			else if (selectMenu == 3) {
				/*
				 *  # 구현해 보시오.
				 *  
				 *  - 아이디를 입력받아서 해당되는 아이디가 있으면 삭제
				 * 
				 * */
			}
			else if (selectMenu == 4) { //계정 출력시스템
				
				System.out.print("아이디를 입력하세요 : ");
				String id = scan.next();
				
				StudentSelect stSelect = controller.getSelect();
				//stSelect에서 컨트롤러에서 불러온getSelect객체 생성
				StudentVO st = stSelect.select(id);
				//계정 생성에서 만들었던 StudentVO에서 select(id)를 set빼낸다.
				if (st != null) st.printOneInfo();
				//만일 st학생이 null과 같지않다면 printOneInfo객체 생성
				//printOneInfo는 StudentSelectAll
			}
			else if (selectMenu == 5) {//전체조회
				
				StudentSelectAll stAll = controller.getSelectAll();
				//컨트롤러의 getselectAll객체를 생성하여 컨트롤러로 보낸다.->>>
				stAll.printAll();
				
			}
			else if (selectMenu == 6) {
				
				System.out.println("종료");
				scan.close();
				break;
			
			}
			
		}
		
	}

}
