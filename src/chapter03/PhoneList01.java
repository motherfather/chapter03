package chapter03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			File file = new File("phone.txt");
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다");
				return;
			}

			System.out.println("*************** 파일 정보 ***************");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "Bytes");
			// Date date = new Date(file.lastModified());
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a
			// hh:mm:ss");
			// System.out.println(sdf.format(date));
			System.out.println(new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss").format(new Date(file.lastModified())));

			System.out.println("*************** 전화번호 리스트 ***************");

			// 기반스트림(byte기반)
			FileInputStream fis = new FileInputStream("phone.txt");
			// 보조스트림(byte -> char)
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			// 보조스트림(라인단위 입력)
			br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t "); // 탭으로도 스페이스로도 구분가능함!!
				// String tokens[] = line.split("\t");
				int index = 0;
				while (st.hasMoreTokens()) {
					String token = st.nextToken();
					if (index == 0) { // 이름
						System.out.print(token + ":");
					} else if (index == 3) { // 마지막 뒷자리 번호
						System.out.print(token + "\n");
					} else { // 번호
						System.out.print(token + "-");
					}
					index++;
				}
			}
		} catch (IOException ex) {
			System.out.println("error:" + ex);
		}	finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException ex) {
				System.out.println("error:" + ex);
			}
		}

	}

}
