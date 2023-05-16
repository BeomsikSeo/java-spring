package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버웹툰크롤링 {
// 크롤링은 인터넷 문서(html)를 다 받아와서,
// html 문서를 분석(parser, 파싱!) 해서 내가 원하는 정보를 추출하는 것.

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://comic.naver.com/index");
		
		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get(); // html 코드를 다 가지고 와서 doc 변수에 넣어놨음.
			Elements list = doc.select(".menu span");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				System.out.println(tag.text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
