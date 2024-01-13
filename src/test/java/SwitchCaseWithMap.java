import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SwitchCaseWithMap {

	public static void main(String[] args) {
			
		Map<String, String> months = new HashMap<String, String>();
		months.put("march", "Spring");
		months.put("april", "Spring");
		months.put("may", "Spring");
		months.put("june", "Summer");
		months.put("july", "Summer");
		months.put("august", "Summer");
		months.put("september", "Fall/Autumn");
		months.put("october", "Fall/Autumn");
		months.put("november", "Fall/Autumn");
		months.put("december", "Winter");
		months.put("january", "Winter");
		months.put("february", "Winter"); 
		
		System.out.println("Enter a month to find out the season");
		
		Scanner scanner = new Scanner(System.in); 
		String userInput = scanner.next().toLowerCase(Locale.ROOT);
		
		if(months.containsKey(userInput)) {
			String finalOutput = months.get(userInput); 
			System.out.println(finalOutput);
		}else {
			System.out.println("Please Enter a valid month to find out a valid season");
		}
	}

}
