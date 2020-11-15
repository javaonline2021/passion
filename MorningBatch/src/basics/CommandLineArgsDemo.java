package basics;

public class CommandLineArgsDemo {

	public static void main(String[] args) {
		
		/*System.out.println("First arg :"+args[0]);
		System.out.println("First arg :"+args[1]);
		System.out.println("First arg :"+args[2]);
		System.out.println("First arg :"+args[3]);
		System.out.println("First arg :"+args[4]);
		*/
		
		for(int i=0; i<=args.length;i++) {
			System.out.println(args[i]);
		}

	}

}
