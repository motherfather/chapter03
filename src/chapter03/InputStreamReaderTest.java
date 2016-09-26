package chapter03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr = null;
		try {
			// 기반스트림(byte단위 기반스트림)
			FileInputStream fis = new FileInputStream("ms949.txt");

			// 보조스트림(ms949 -> utf-8)
			isr = new InputStreamReader(fis, "MS949");

			// BufferedReader br = new BufferedReader(isr);
			int data = -1;
			while ((data = isr.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException ex) {
			System.out.println("error:" + ex);
		} finally {
			try {
				if (isr != null) {
					isr.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
