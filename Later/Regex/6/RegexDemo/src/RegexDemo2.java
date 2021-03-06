import java.util.regex.Pattern;

/**
 * 
 * [a-z&&[^bc]] = a through z, except for b and c
 *
 */
public class RegexDemo2
{
	public static void main(String[] args)
	{
		System.out.println("[a-z&&[^bc]] matches h = " +   Pattern.matches("[a-z&&[^bc]]", "h"));
		System.out.println("[a-z&&[^bc]] matches c = " +   Pattern.matches("[a-z&&[^bc]]", "c"));
		System.out.println("[a-z&&[^bc]] matches hh = " +   Pattern.matches("[a-z&&[^bc]]", "hh"));
	}

}