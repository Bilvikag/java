import java.util.Scanner;
public class strings3 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	String b=s.nextLine();
	System.out.println(a.length()+b.length());
	if(a.compareTo(b)>0)
		System.out.println("yes");
	else
		System.out.println("no");
	System.out.println(Character.toUpperCase(a.charAt(0))+a.substring(1)+" "+Character.toUpperCase(b.charAt(0))+b.substring(1));
	}

}
