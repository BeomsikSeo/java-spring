package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {
// 크롤링은 인터넷 문서(html)를 다 받아와서,
// html 문서를 분석(parser, 파싱!) 해서 내가 원하는 정보를 추출하는 것.

	public void naver (String code2) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code2);
		
		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements codelist = doc.select(".code");
			Element tag = codelist.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);
			
			// <span class="blind">
			Elements list = doc.select("span.blind");
			Element tag2 = list.get(12);
			String today = tag2.text();
			System.out.println("현재가 " + today);
			
			Element tag3 = list.get(16);
			String high = tag3.text();
			System.out.println("고가 " + high);
			
			Element tag4 = list.get(20);
			String low = tag4.text();
			System.out.println("저가 " + low);
			
			FileWriter file = new FileWriter(code2 + ".txt");
			file.write(code2 + "\n");
			file.write(today + "\n");
			file.write(low + "\n");
			file.write(high + "\n");
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
