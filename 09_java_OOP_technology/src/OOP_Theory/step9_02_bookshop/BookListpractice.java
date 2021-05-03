package OOP_Theory.step9_02_bookshop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class BookListpractice {

	ArrayList<BookVO> bookList = new ArrayList<>();
	
	public String toString() {
		String str = "";
		
		str += "===================================================";
		str += "도서명 	저자 출판사 출판일 가격 \n";
		str += "===================================================";
		
		int total = 0;
		for (int i = 0; i < bookList.size(); i++) {
			str+= bookList.get(i) + "\n";
			total += bookList.get(i).getPrice();
		}
		//for(bookVO book : bookList) {
		//	str+= book + "\n";
		// 	total +=book.getPrice();	
		//		}
		
			
		str += "===================================================";
		DecimalFormat sdf = new DecimalFormat("#,###원");
		str += "					합계금액:" +sdf.format(total)+"\n";
		str += "===================================================";
		
		return str;
			}
		public void addBook(BookVO vo) {
			bookList.add(vo);	
		
		}
	}


