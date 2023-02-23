import java.util.Scanner;

public class BookTest{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Book newRecord = new Book("MTH231", 800, 250);
		
//		System.out.print("Please enter BookId: ");
//		String bookId = input.nextLine();
//		newRecord.setBookId(bookId);
//		
//		System.out.print("\nPlease enter number of pages: ");
//		int pages = input.nextInt();
//		newRecord.setPages(pages);
//		
//		System.out.print("\nPlease enter Price: ");
//		double price = input.nextDouble();
//		newRecord.setPrice(price);
		
		input.close();
		
		System.out.printf("The Book ID of the new Book is: %s%n", newRecord.getBookId());
		System.out.printf("The number of  pages in the new Book are: %s%n", newRecord.getPages());
		System.out.printf("The price of the new Book is: %s%n", newRecord.getPrice());
		
		
	}
}