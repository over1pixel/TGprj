package milkyway;

import java.util.ArrayList;
import java.util.List;


public class Flattener {
	
	public static Integer[] flattenArray(Object[] in) {
		return flattenerList(in)
							.stream()
							.map(x -> new Integer(x))
							.toArray(n -> new Integer[n]);
		
	}
	
	private static List<Integer> flattenerList (Object[] in) {
		
		if (in == null)
			return null;

        List<Integer> out = new ArrayList<>();

        for (Object x : in) {
            if (x instanceof Integer) {
                out.add((Integer) x);
            } else {
                out.addAll(flattenerList((Object[]) x));
            }
        }
        
        return out;
        
	}
	
}
