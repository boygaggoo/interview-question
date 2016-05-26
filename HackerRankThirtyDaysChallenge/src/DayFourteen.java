
import java.util.Scanner;


public class DayFourteen {
	public static void main(String []args)
	   {
	      Scanner sc=new Scanner(System.in);
	      String title=sc.nextLine();
	      String author=sc.nextLine();
	      int price=sc.nextInt();
	      Book new_novel=new MyBook(title,author,price);
	      new_novel.display();
	      
	   }

}
class MyBook extends Book{
   private int price;
	

	public MyBook(String title, String author, int price) {
		super(title,author);
		this.price=price;
	}

	@Override
	void display() {
		
		System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);
	}
	
}
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}
