import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int s=sc.nextInt();
        int count=0;
        for(int i=2;i<s;i++){
            if(s%i==0){
                count++;
            }
        }
        if(s>1 && count==0){
            System.out.println(s+" is a Prime Number");
        }
        else{
            System.out.println(s+" is not a Prime");
        }
        
    }
}