import java.util.*;
class dup_check {
    //int n;
    int k;
    void read(int a[]){
        int j;
        Scanner s=new Scanner(System.in);
       // k=s.nextInt();
        for(int i=0;i<5;i++){
            k=s.nextInt();
            if(k>=10 && k<=100){
                for(j=0;j<5;j++){
                    if(a[j]==k){
                        i=i-1;
                        break;
                        
                    }
                }
                if(j==5){
                    a[i]=k;
                }
            }
            else{
                System.out.println("Enter within range");
                i--;
            }
        }
        
    }
    void print(int a[]){
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}
