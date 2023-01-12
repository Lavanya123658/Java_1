import java.util.*;
class main_5{
	public static void main(String args[]){
		
		
		Scanner s=new Scanner(System.in);

        book_stall bs=new book_stall();
        System.out.println("Enter num of books: ");
		bs.n=s.nextInt();
		book_stall b[]=new book_stall[bs.n];
        bs.read(b);

        customer cs=new customer();
        System.out.println("Enter num of customers: ");
		cs.m=s.nextInt();
		customer c[]=new customer[cs.m];
		cs.read(c);
		
		
		bs.display(b);
		cs.display(c);


		System.out.println("Enter required book: ");
		String rbook=s.next();
		System.out.println("Enter no.of required books: ");
		int num=s.nextInt();


		bs.search(rbook,num,b);
		System.out.print("\n Available ");
	 	bs.display(b);
		
	}
}