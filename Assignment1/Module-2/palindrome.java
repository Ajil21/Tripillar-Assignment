package Asssignment1.Module2;
import java.util.Scanner;
public class palindrome {
    static boolean checker(String n){
    for(int i=0, j=n.length()-1; i<j; i++,j--)
        if(n.charAt(i) != n.charAt(j))
            return false;
    return true;
}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		String a="malayalam";
		System.out.print(checker(a));
        sc.close();
	}
}
