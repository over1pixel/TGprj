package milkyway;

import java.util.Arrays;

public class Starter {

	public static void main(String[] args) {
		Object[] o = new Integer[] {1, 29, 4};
		
		Object[] myarray = new Object[] {
						new Object[] {
								new Integer(1),
								new Integer(2),
								new Integer[]{3}
						},
				new Integer[] {4}
		};
				
		
		System.out.println(Arrays.toString(Flattener.flattenArray(o)));
		System.out.println(Arrays.toString(Flattener.flattenArray(myarray)));

	}

}
