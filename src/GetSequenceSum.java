
public class GetSequenceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long result = getSequenceSum(0,5,-1);
		System.out.println( "sum :" +result);
	}
	
	static long getSequenceSum(int i, int j, int k) {
	      int sum =0;
	      for( int a=i; a<j; a++){
	          sum = sum +a;
	          if(a==j){
	        	  System.out.println("sum in if(a==j)"+ sum);
	             for (int b=j; b<k;b--){
	                 sum=sum+j;
	                 if(j==k)
	                	 System.out.println("sum in if(j==k)"+ sum);
	                 break;
	             }
	             //break;
	          }
	          //break;
	      }
	      System.out.println("sum finally"+ sum);
	      return sum;

	    }

}
