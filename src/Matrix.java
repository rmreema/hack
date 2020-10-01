
public class Matrix {

		// Function to string into grid form 
		static void gridStr(String str) 
		{ 
			String[] rown =str.split("L:");
			//String[] strcon = str.split(",");
			
			int l = str.length(); 
			int k = 0, row, column; 
			row = (int) Math.floor(Math.sqrt(l)); 
			column = (int) Math.ceil(Math.sqrt(l)); 
			System.out.println("row"+row);
			System.out.println("colum"+column);

			if (row * column < l) 
			{ 
				row = column; 
			} 

			char s[][] = new char[row][column]; 
			
			// convert the string into grid 
			for (int i = 0; i < row; i++) 
			{ 
				for (int j = 0; j < column; j++) 
				{ 
					if(k < str.length()) 
						s[i][j] = str.charAt(k); 
					k++; 
				} 
			} 

			// Printing the grid 
			for (int i = 0; i < row; i++) 
			{ 
				for (int j = 0; j < column; j++) 
				{ 
					if (s[i][j] == 0) 
					{ 
						break; 
					} 
					System.out.print(s[i][j]); 
				} 
				System.out.println(""); 
			} 
		} 

		// Driver code 
		public static void main(String[] args) 
		{ 
			String str = "5.0,100,5.5,150,6.5,200,L:10,5.0,100,5.5,150,6.5,200,L:20,5.0,100,5.5,150,6.5,200"; 
			gridStr(str); 
		} 
	} 


