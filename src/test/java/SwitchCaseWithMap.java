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
		String userStringInput = scanner.next().toLowerCase(Locale.ROOT);
		
		if(months.containsKey(userStringInput)) {
			String finalOutput = months.get(userStringInput); 
			System.out.println(finalOutput);
		}else {
			System.out.println("Please Enter a valid month to find out a valid season");
		}
		System.out.println("Would you like to enter another month? Please enter Y/N.");
		char userCharInput = scanner.next().toUpperCase(Locale.ROOT).charAt(0); 
		
		if(userCharInput == 'y' || userCharInput == 'Y') {
			//head back to loop (while? or do-while? or something else?)
		}else {
			System.out.println("Thank you for using our program. See you soon.");
		}
	}

}
