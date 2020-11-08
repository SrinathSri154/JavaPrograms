package JavaConcepts;

 public abstract class electronic {
	
	public void start()
	{
		System.out.println("Start automaically");
	}

	public void speed() {
		System.out.println("Speed is :" + 130+ "kmph");
	}
	
	public abstract  void model();
	public void gear() {};
}
