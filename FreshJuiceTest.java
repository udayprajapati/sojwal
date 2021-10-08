
 class FreshJuice {
		
		enum FreshJuiceSize{ SMALL, MEDIUM, LARGE}
		FreshJuiceSize size;

	}
	 
	 public class FressJuiceTest {


	public static void main(String[] args) {
		FreshJuice juice= new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
		System.out.println("size: " + juice.size);
		

	}

}
