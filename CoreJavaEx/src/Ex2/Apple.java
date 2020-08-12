package Ex2;

public class Apple implements Fruit {

	@Override
	public void Sweet() {
		System.out.println(" Apple is Sweet");
	
	}

	@Override
	public void Poisonous() {
		System.out.println("Apple is Poisonous");
		
	}
		public static  void main(String []args) {
			Apple ob =new Apple();
			
			ob.Sweet();
			ob.Poisonous();
		}

}
