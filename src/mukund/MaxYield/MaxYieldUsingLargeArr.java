package mukund.MaxYield;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxYieldUsingLargeArr {
	MaximumYieldNumbers maxYieldNum= new MaximumYieldNumbers();
	int [] strip = {147,206,52,240,300};
	int [] maxYield=maxYieldNum.findMaxYield(strip);
	int [] result ={0, 206, 0, 0, 300};
	
	@Test
	public void TestFindMaxYield() {
		for(int i=0;i<strip.length;i++){
		assertEquals(result[i], maxYield[i]);
		System.out.print("\n@Test Maximum Yield:"+ result[i]+ "=" + maxYield[i]);
		}
	}
}
