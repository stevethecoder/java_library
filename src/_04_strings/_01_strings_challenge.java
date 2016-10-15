package _04_strings;

public class _01_strings_challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char uniChar = '\u00A5';
		System.out.println(uniChar);
		char newUniChar = '\u0024';
		System.out.println(newUniChar);
		
		char[] charArray = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(charArray);
		
		char[] newcharArray = {'a', 'l', 'm', 'q', 'z'};
		System.out.println(newcharArray);
		
		System.out.println("Hello \"Tough Guy\", How are you?");
		
		System.out.println("James \nPaul");
		
		System.out.println("c:\\desktop\\users\\steven\\.gitconfig");
		
		System.out.println("Steven\rRichards");
		
		System.out.println("Steven Richards");
		
		//\t	Inserts a tab in the text at this point.
		//\b	Inserts a backspace in the text at this point.
		//\n	Inserts a newline in the text at this point.
		//\r	Inserts a carriage return in the text at this point.
		//\f	Inserts a form feed in the text at this point.
		//\'	Inserts a single quote character in the text at this point.
		//\"	Inserts a double quote character in the text at this point.
		//\\	Inserts a backslash character in the text at this point.
		
		
		
		String fullname = "Steven Donald Richards";
		String first = fullname.substring(0, 6);
		String middle = fullname.substring(7, 13);
		String last = fullname.substring(14, 22);
		
		System.out.println(first);
		System.out.println(middle);
		System.out.println(last);
		

		
		

	}

}
