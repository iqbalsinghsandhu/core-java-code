package generics;
import java.util.*;

public class SelfTest1 {

	public static void main(String[] args) {
		// INSERT DECLARATION HERE
		List<Integer> table = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
		List<Integer> row = new ArrayList<Integer>();
		for (int j = 0; j <= 10; j++)
		row.add(i * j);
		table.addAll(row);
		}
		for (Integer row : table)
		System.out.println(row);
		}	
	
}
