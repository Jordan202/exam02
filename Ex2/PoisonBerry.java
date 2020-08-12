package Ex2;

public class PoisonBerry implements Fruit   {

	@Override
	public void Sweet() {// TODO Auto-generated method stub
		System.out.println("Sweet");
	}

	@Override
	public void Poisonous() {
	System.out.println("Poisonous");
		
	}



public static  void main(String []args) {
	
	
	PoisonBerry ob=new PoisonBerry();
	
	
	ob.Sweet();
	ob.Poisonous();
	
	
}
}

