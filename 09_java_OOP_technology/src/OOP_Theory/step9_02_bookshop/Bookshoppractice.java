package OOP_Theory.step9_02_bookshop;

import java.util.Date;

public class Bookshoppractice {

	public static void main(String[] args) {

		BookList bookList = new BookList(); //새로운 booklist 객체 만들기.
		
		BookVO book1 = new BookVO("자바01", "임세민", "코리아출판사", new Date(), 18000);
		BookVO book2 = new BookVO("자바02", "lsm", "코리아출판사", new Date(), 17000);
		BookVO book3 = new BookVO("자바03", "홍길숙", "코리아출판사", new Date(), 21000);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		bookList.addBook(book3);
		bookList.addBook(new BookVO("자바04", "홍길희", "코리아출판사", new Date(), 35000));
		bookList.addBook(new BookVO("자바05", "홍길영", "코리아출판사", new Date(), 12000));
		bookList.addBook(new BookVO("자바06", "홍길도", "코리아출판사", new Date(), 15000));
		
		System.out.println(bookList);
	}

}
