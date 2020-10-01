import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CirArrayNodeMostVisited {
	// Function to return the minimum distance 
		static int min_distance(int n, List<Integer> endNode) 
		{ 
			List<Integer> endNode1 = new  ArrayList<>();

			int min_dist = 0; 
			for (int i = 0; i < endNode.size(); i++) { 
				
				//int a = endNode1.get(i);
				//int ind = endNode1.indexOf(endNode);
				System.out.println(endNode);
				//a= endNode1.get(n+i);
				//a= endNode.get(i);
			} 

			return min_dist; 
		} 

		 
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = new int[] { 1,5,10, 5 }; 
		List<Integer> endNode = new  ArrayList<>();
		endNode.add(1);
		endNode.add(5);
		endNode.add(10);
		endNode.add(5);
		
		//int n = arr.length; 
		int n=10;
		System.out.println("size"+endNode.size()); 
		min_distance(n, endNode);
		//System.out.println(min_distance(n, endNode)); 

	}

}
