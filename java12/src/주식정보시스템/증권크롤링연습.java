package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 증권크롤링연습 {
// 크롤링은 인터넷 문서(html)를 다 받아와서,
// html 문서를 분석(parser, 파싱!) 해서 내가 원하는 정보를 추출하는 것.

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/sise/");
		
		Document doc = null; // 로컬변수 초기화! 수동으로!
		
		try {
			doc = con.get();
			Elements list = doc.select("#popularItemList a");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				String text = tag.text();
				System.out.println("인기 검색 종목 " + (i + 1) + " : " + text);
			}
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
