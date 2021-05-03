package OOP_Theory.step9_02_bookshop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//책 한권의 정보를 기억
public class BookVOpractice {
	
	private String title;		//도서명
	private String auther;		//저자
	private String publisher;	//출판사
	private Date date;			//출판일
	private int price;			//가격
	
	public BookVOpractice(){
		
	}
	public BookVOpractice(String title, String auther, String publisher, Date date, int price) {
		this.title 		= title;
		this.auther 	= auther;
		this.publisher 	= publisher;
		this.date 		= date;
		this.price 		= price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		DecimalFormat sdf1 = new DecimalFormat("#,###원");
		return "BookVO[title ="+title+", auther="+auther+", publisher="+publisher+
				", date="+sdf.format(date)+", price="+sdf1.format(price)+"]";
		//return String.format("%s %s %s %s %s", title, author, publisher, sdf.format(date), df.format(price));
	}

}
