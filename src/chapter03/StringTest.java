package chapter03;

public class StringTest {

	public static void main(String[] args) {
		String s = "c:\\temp";		//		\\ => 역슬래쉬를 출력하기 위한 이스케이프
		System.out.println(s);
		// \t => tab
		// \n => new line (개행)
		// \r => carriage return
		
		String s1 = "\"hello\"";		//		\" => "(큰따옴표)출력하기 위한 이스케이프
		System.out.println(s1);
		
		System.out.print("hello\tworld\r\n");
		System.out.print("=========");
	}

}
