import java.util.*;
class customer{
	String customer_id;
	String customer_name;
	String customer_address;
    int m,count;
	String name,auth,id,add;
		
	Scanner s=new Scanner(System.in);
		
    public void read(customer c[]){
        for(int i=0;i<m;i++){
			System.out.println("Enter cust_name: ");
			name=s.next();
			s.nextLine();
			System.out.println("Enter cust_address: ");
			add=s.nextLine();
			System.out.println("Enter cust_id: ");
			id=s.nextLine();
			c[i]=new customer(id,name,add);
		}
    }
	public void setCustomer_id(String id){
		customer_id=id;
	}
	public void setCustomer_name(String name){
		customer_name=name;
	}
	public void setCustomer_address(String address){
		customer_address=address;
	}
	public customer(String id,String name,String address){
		setCustomer_id(id);
		setCustomer_name(name);
		setCustomer_address(address);
	}
	public customer(){}
	public void display(customer c[]){
	   
		System.out.println("\nCustomers Details: ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Customer_id\tCustomer_name\tCustomer_address");
		System.out.println("-------------------------------------------------------------------");	
		for(int i=0;i<m;i++)
			System.out.println(c[i].customer_id+"\t"+"\t"+c[i].customer_name+"\t"+"\t"+c[i].customer_address);
		System.out.println("-------------------------------------------------------------------");	
		}
		
}