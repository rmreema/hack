
public class Test {
	
	static Test t;
	
	static int count = 0;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test t1= new Test();
		t1=null;
		System.gc();
		Thread.sleep(1000);
		t=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("finalize method called"+count+"times");
	
	}
	
	@Override
	protected void finalize() {
		count++;
		t=this;
	}

}
