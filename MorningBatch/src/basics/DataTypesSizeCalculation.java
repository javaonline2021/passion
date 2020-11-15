package basics;

public class DataTypesSizeCalculation {

	public static void main(String[] args) {
		
		int BITS = 8;
		
		System.out.println("Integer Sixe : "+Integer.SIZE / BITS + " Bytes");
		System.out.println("Integer Sixe : "+Float.SIZE / BITS + " Bytes");
		System.out.println("Integer Sixe : "+Long.SIZE / BITS + " Bytes");
		System.out.println("Integer Sixe : "+Short.SIZE / BITS + " Bytes");
		System.out.println("Integer Sixe : "+Double.SIZE / BITS + " Bytes");
		System.out.println("Integer Sixe : "+Character.SIZE / BITS + " Bytes");
		//System.out.println("Integer Sixe : "+Boolean.FALSE + " Bytes");

	}

}
