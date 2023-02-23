public class Book{
	public String BookId;
	public int Pages;
	public double Price;
	
	// Constructor
//	public Book(int initBookId, int initPages, double initPrice) {
//		setBookId(initBookId);
//		setPages(initPages);
//		setPrice(initPrice);
//	}
	
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