package mukund.MaxYield;


import java.util.*;

//Solution for Maximum yield in a mine(no adjacent mines allowed) problem.
public class MaximumYieldNumbers {

	public int[] findMaxYield(int[] strip){
		int inclusive=0,exclusive=0,temp=0;
		int len=strip.length;int tot=0;
		int [] result= new int[len];
		
		for(int res=0;res<len;res++){
			result[res]=0;
			tot=tot+strip[res];
			
			
		}
		if(tot==0){
			System.out.print("Array has all Zeros");
			System.exit(0);
		}
		
		for(int i=0;i<len;i++){
			temp=inclusive;
			if(inclusive < (exclusive+strip[i])){
               inclusive=(exclusive+strip[i]);
               exclusive=temp;
			}else{
				exclusive=inclusive;
			}
			if(inclusive==exclusive){
				result[i-1]=strip[i-1];
			}else{
				result[i]=0;
			}
		}
		if(inclusive < (exclusive+0)){
			inclusive=(exclusive+0);
            exclusive=temp;
		}else{
			exclusive=inclusive;
		}
		
		if(inclusive==exclusive){
			result[len-1]=strip[len-1];
		}else{
			result[len-1]=0;
		}
		System.out.print("Maximum Yield in Units:"+ inclusive);
		System.out.print("\n");
		
		 return result;
		
	}
	
	
	public static void main(String[] args) {
		
		int n;
		int [] strip;
		MaximumYieldNumbers maxYield= new MaximumYieldNumbers();
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the value of strip:");
		n=scan.nextInt();
		
		if(n==0 || n<0){
			System.out.print("None or Negative values not allowed");
			System.exit(0);
		}
		System.out.print("Enter array value:");
		strip= new int[n];
		
		for(int i=0;i<n;i++){
			strip[i]=scan.nextInt();
		if(strip[i]<=0){
			System.out.print("None/Negative value not allowed");
			System.exit(0);
		}
		  
		}
		int[] maxYieldValue=maxYield.findMaxYield(strip);
		System.out.print("[");
		for(int k=0;k<n;k++){
		System.out.print("\t"+maxYieldValue[k]);
		}
		System.out.print("]");
		scan.close();
	}

}
