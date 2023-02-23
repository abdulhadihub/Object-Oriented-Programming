public class Book{
	private String BookId;
	private int Pages;
	private double Price;
	
//	 Constructor
	public Book(String initBookId, int initPages, double initPrice) {
//		setBookId(initBookId);
//		setPages(initPages);
//		setPrice(initPrice);
		this.BookId = initBookId;
		this.Pages = initPages;
		this.Price = initPrice;
	}
	
	public String getBookId(){
		return BookId;
	}
	
	public void showBookId(){
		System.out.println(BookId);
	}
	
	public void setBookId(String newBookId){
		BookId = newBookId;
	}
	
	public int getPages(){
		return Pages;
	}
	
	public void showPages(){
		System.out.println(Pages);
	}
	
	public void setPages(int newPages){
		Pages = newPages;
	}
	
	public double getPrice(){
		return Price;
	}
	
	public void showPrice(){
		System.out.println(Price);
	}
	
	public void setPrice(double newPrice){
		Price = newPrice;
	}
	
}