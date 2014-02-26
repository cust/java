package br.com.loteria.main;

import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TesteParser {

	public static void main(String[] args) {
		try {
			File input = new File("/tmp/D_LOTFAC.HTM");
			Document doc = Jsoup.parse(input, "UTF-8", "http://example.com/");

			Element content = doc.getElementById("content");
			Elements links = content.getElementsByTag("table");
			for (Element link : links) {
				String linkHref = link.attr("td");
				String linkText = link.text();
				System.out.println(linkText);
			}

		} catch (Exception e) {
		}

	}

}
