package stringT;
import java.util.Scanner;
public class stringtoggle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the string to be toggled:");
		String str=s1.nextLine();
		StringBuffer an=new StringBuffer(str);
		int str_length=an.length();
		for(int i=0;i<str_length;i++)
		{
			char ch=an.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				int temp=ch-'A';
				ch=(char)('a'+temp);
			}
			else if(ch>='a'&&ch<='z')
			{
				int temp=ch-'a';
				ch=(char)('A'+temp);
			}
			an.setCharAt(i, ch);
		}
		System.out.println(an);
	}

}
