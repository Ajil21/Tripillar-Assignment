import java.util.*;
class largestof3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int m=sc.nextInt(); int n=sc.nextInt(); int o=sc.nextInt();
        if(m>n){
            if(m>o){
                System.out.println(m+" is the largest numnber");
            }
            else{
                System.out.println(o+" is the largest numnber");
            }
        }
        else{
            if(n>o){
                System.out.println(n+" is the largest numnber");
            }
            else{
                System.out.println(m+" is the largest numnber");
            }
        }
    }
}