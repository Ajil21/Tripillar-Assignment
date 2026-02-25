import java.util.*;
class positivenegative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Positive Number!");
            }
        else if(n==0){
            System.out.println("Zero!");
        }
        else{
            System.out.println("Negative Number!");
        }
    }
}
