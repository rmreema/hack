
public class CandlesBurntCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 6;
		int costOfCandles = 2;
		int noOfResidueCandles = 2;
		int result = getTotalCandlesBurnt(amount,costOfCandles,noOfResidueCandles);
		System.out.println(result);
		

	}
	
	static int getTotalCandlesBurnt(int amount, int costOfCandles, int noOfResidueCandles) {
		
	int candlesBurntWORes = amount/costOfCandles;
	int resCadles = candlesBurntWORes/noOfResidueCandles;
	int totalCandles = 0;
	int modCan = candlesBurntWORes%noOfResidueCandles;
	if(modCan !=0) {
		int residue = modCan+noOfResidueCandles;
		int total = getTotalCandlesBurnt(amount, costOfCandles, residue);
		totalCandles = total + modCan;
	}
	
	else {
		
		totalCandles =candlesBurntWORes+resCadles;
		}
	return totalCandles;
		
	}

}
