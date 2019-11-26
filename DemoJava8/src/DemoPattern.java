import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoPattern {

	public static void main(String[] args) {

		/*	
[abc]: It would match with text if the text is having either one of them(a,b or c) and only once.
[^abc]:  Any single character except a, b, or c (^ denote negation)
[a-zA-Z]:  a through z, or A through Z, inclusive (range)
[a-d[m-p]]:  a through d, or m through p: [a-dm-p] (union)
[a-z&&[def]]:  Any one of them (d, e, or f)
[a-z&&[^bc]]: a through z, except for b and c: [ad-z] (subtraction)
[a-z&&[^m-p]]:  a through z, and not m through p: [a-lq-z] (subtraction)

		 *  
		 *  Charcter classes
		 *  
		 *  \s space charachter
		 *  \S except space any char
		 *  \d any digit [0-9]
		 *  \D except digit any char
		 *  \w any word char [a-zA-Z0-9]
		 *  \W except word char ie special char
		 *  . dot Any char
		 *  
		 *  Quantifier
		 *  a+ Atleast one a
		 *  a* Any number of a including zero
		 *  a? Atmost one a
		 *  */
		
		
		System.out.println("*** For Using regular exp ****");
		
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("Hai Hello Bye See you");
		int count = 0;
		while (m.find()) {
			count++;

			System.out.println("Occurance : "+m.start()+"  "+m.end()+" "+m.group());
		}
		System.out.println("Count :"+count);

		/*** For tokenize the String */
		
		System.out.println("*** For tokenize the String ****");
		
		String str="Hai Hello Bye See you";
		Pattern p1 = Pattern.compile("\\s");
        String str1[] = p1.split(str);
		for (String str2 : str1) {
			System.out.println("Tokens : "+str2);
		}
	

		Pattern monNumPattern = Pattern.compile("(0/91)[7-9][0-9]{9}");
		Pattern emailNumPattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+");
		
		System.out.println(Pattern.matches("[7-9][0-9]{9}", "9999819025"));
		System.out.println(Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+[.]com", "batra.muks@gmail.com"));
	}

	

}
