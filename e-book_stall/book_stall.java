
import java.util.*;
class book_stall{
	private String book_name;
	private String book_author;
	private int book_count;
	//For taking inputs...
    int n,count;
	String name,auth,id,add;
		
	Scanner s=new Scanner(System.in);
		
	
    public void read(book_stall b[]){
		
        for(int i=0;i<n;i++){
			System.out.println("Enter book_name: ");
			name=s.next();
			s.nextLine();
			System.out.println("Enter book_author: ");
			auth=s.nextLine();
			
			System.out.println("Enter book_count: ");
			count=s.nextInt();
			
			
			//s.nextLine();
			
			
			b[i]=new book_stall(name,auth,count);
		}
    }
	public void setBook_name(String n){
		book_name=n;
	}
	public String getBook_name(){
		return book_name;
	}
	public void setBook_author(String a){
		book_author=a;
	}
	public String getBook_author(){
		return book_author;
	}
	public void setBook_count(int n){
		book_count=n;
	}
	public int getBook_count(){
		return book_count;
	}
	public book_stall(String name,String auth,int c){
		setBook_name(name);
		setBook_author(auth);
		setBook_count(c);	
	}
	public book_stall(){}
	public void display(book_stall b[]){
		System.out.println("\nBooks Details: ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Book_Name\tBook_Author\tBook_Count");
		System.out.println("-------------------------------------------------------------------");
		for(int i=0;i<n;i++){
			System.out.println(b[i].book_name+"\t"+"\t"+b[i].book_author+"\t"+"\t"+b[i].book_count);
		}
		System.out.println("-------------------------------------------------------------------");
	}
	public void search(String rbook,int num,book_stall b[]){
		int i;
		for(i=0;i<n;i++){
			if(b[i].book_name.equalsIgnoreCase(rbook)){
				if(b[i].book_count>=num){
					b[i].book_count=b[i].book_count-num;
					break;
				}
				else{
					System.out.println("Available books are less");
					break;
				}
			}
		}
		if(i==n){
			System.out.println("Book not available");
		}
	}
	
 
}