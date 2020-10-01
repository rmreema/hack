
public class FizzBuzz {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n = 15;
			fizzBuzz(n);
	}

	
public static void fizzBuzz(int n) {
    // Write your code here
    for(int i=1; i<n; i++){
        if(i%3==0){
            if(i%5==0){
            System.out.println("FizzBuzz");
            }
        System.out.println("Fizz");
        }
        else if(i%5==0){
          System.out.println("Buzz"); 
        }
        else
        System.out.println(i);
    }

}
}
