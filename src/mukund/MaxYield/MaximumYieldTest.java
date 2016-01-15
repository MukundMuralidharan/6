package mukund.MaxYield;

import static org.junit.Assert.*;


import org.junit.Test;

public class MaximumYieldTest {

	MaximumYieldNumbers maxYieldNum= new MaximumYieldNumbers();
	int [] strip = {206, 140, 300,52,107};
	int [] maxYield=maxYieldNum.findMaxYield(strip);
	int [] result ={206, 0, 300, 0, 107};
	
	@Test
	public void TestFindMaxYield() {
		for(int i=0;i<strip.length;i++){
		assertEquals(result[i], maxYield[i]);
		System.out.print("\n@Test Maximum Yield:"+ result[i]+ "=" + maxYield[i]);
		}
	}

}
