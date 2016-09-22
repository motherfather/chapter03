package chapter03;

public class ObjectTest {

	public static void main(String[] args) {
		Point p = new Point();

		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());		// reference value X
																			// address X
																			// address 기반으로 만든 해싱값(int)
		System.out.println(System.identityHashCode(p));
		
		System.out.println(p.toString());
		System.out.println(p);

//		 public String toString() {
//		        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//		    }
	}

}
