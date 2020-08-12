package AbsEx;

 abstract class Dog {
	 String x;
	public  void pr() {
		System.out.println("Go");
		
	}
public abstract void sound();
	
	

}
 class Chihuahuh extends Dog{

	@Override
	public void sound() {
		System.out.println("Dog sound");
		
	}
 }
	 
 class Test{
		public  void main (String[]args) {
			Chihuahuh c=new Chihuahuh();
			c.sound();
			c.pr();
		    c.x="jp";
			System.out.println(c.x);
			
			
		}
		 
	
	}
	
