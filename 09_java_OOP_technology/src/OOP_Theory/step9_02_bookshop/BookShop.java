package OOP_Theory.step9_02_bookshop;

import java.util.Date;

public class BookShop {

	public static void main(String[] args) {
		
		BookList bookList = new BookList(); //새로운 BookList 객체 생성
		
		BookVO book1 = new BookVO("자바1", "홍길동", "코리아출판사", new Date(), 18000); //bookVO book1를 새로운 BookVO객체에 생성
		BookVO book2 = new BookVO("자바2", "홍길자", "코리아출판사", new Date(), 17000); //bookVO book2를
		BookVO book3 = new BookVO("자바3", "홍길숙", "코리아출판사", new Date(), 21000); //bookVO book3를
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(new BookVO("자바4", "홍길희", "코리아출판사", new Date(), 35000));
		bookList.addBook(new BookVO("자바5", "홍길영", "코리아출판사", new Date(), 12000));
		bookList.addBook(new BookVO("자바6", "홍길도", "코리아출판사", new Date(), 15000));
		
		System.out.println(bookList);
		
	}
	
}








