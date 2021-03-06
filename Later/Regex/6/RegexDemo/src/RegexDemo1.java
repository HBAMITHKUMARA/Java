import java.util.regex.Pattern;

/**
 * 
 * [a-z&&[def]] = d, e, or f (intersection)
 *
 */
public class RegexDemo1
{
	public static void main(String[] args)
	{
		System.out.println("[a-z&&[def]] matches d = " +   Pattern.matches("[a-z&&[def]]", "d"));
		System.out.println("[a-z&&[def]] matches e = " +   Pattern.matches("[a-z&&[def]]", "e"));
		System.out.println("[a-z&&[def]] matches f = " +   Pattern.matches("[a-z&&[def]]", "f"));
		System.out.println("[a-z&&[def]] matches z = " +   Pattern.matches("[a-z&&[def]]", "z"));
		System.out.println("[a-z&&[def]] matches def = " +   Pattern.matches("[a-z&&[def]]", "def"));
	}

}