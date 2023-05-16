package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링1 {
// 크롤링은 인터넷 문서(html)를 다 받아와서,
// html 문서를 분석(parser, 파싱!) 해서 내가 원하는 정보를 추출하는 것.

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		
		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements codelist = doc.select(".code");
			System.out.println(codelist.size());
			Element tag = codelist.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);
			
			// sptxt sp_txt9 ==> [tag, tag, tag, ...]
			// select("a") : tag <a>
			// select(".code") : <a class = "code">
			// select("#userId") : <a id="userId">
			Elements textlist = doc.select(".sptxt.sp_txt9");
			System.out.println(textlist.size());
			
			Element tag1 = textlist.get(0);
			String text1 = tag1.text();
			System.out.println("text1 " + text1);
			
			// sptxt sp_txt10
			Elements textlist2 = doc.select(".sptxt.sp_txt10");
			System.out.println(textlist2.size());
			
			Element tag2 = textlist2.get(0);
			String text2 = tag2.text();
			System.out.println("text2 " + text2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
