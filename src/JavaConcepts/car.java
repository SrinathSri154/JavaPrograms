package JavaConcepts;

public class car implements vehicle{
	
	
	

	public static void main(String[] args) {
		
      vehicle v = new car();
     v.speed();
     v.start();
     v.sound();
	}

	@Override
	public void speed() {

		System.out.println("Speed is :" + 150);
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void power() {
		// TODO Auto-generated method stub
		
	}
	
}
