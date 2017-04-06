import org.junit.Assert;
import org.junit.Test;

import milkyway.Flattener;

public class FlattenerTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void flattenArrayTest() {
		/*
		 * testing the flattening of arbitrary depth nested Integer array
		 */
		
		Object[] input1 = 
				new Object[] {
						new Object[] {
								new Integer(1),
								new Integer(2),
								new Integer[]{3}
						},
				new Integer[] {4}
		};
		
		Integer[] output1 = new Integer[]{1, 2, 3, 4};
		
		Object[] input2 = new Object[] {
		   		new Object[] { new Integer[] {1, 29}, 
	                           new Integer[] {3, 4}
		   		},
	       new Integer[] {54, 279} 
		};
		
		Integer[] output2 = new Integer[]{1, 29, 3, 4, 54, 279};
		
		Integer[] input3 = new Integer[]{666, 777, 888, 999};
		Integer[] output3 = new Integer[]{666, 777, 888, 999};
		
				
		Assert.assertEquals(output1, Flattener.flattenArray(input1));
		Assert.assertEquals(output2, Flattener.flattenArray(input2));
		Assert.assertEquals(output3, Flattener.flattenArray(input3));
		
	}
}
