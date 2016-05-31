import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/** 
 * Classe principal para extração de dados usando jsoup
 * @author thiagoadelino
 *
 */
public class Main {
	
	/**
	 * Método principal
	 * @param args
	 */
	public static void main (String[] args){
		
		String url = "https://try.jsoup.org";
		
		try {

			Document doc = Jsoup.connect(url).get();
			
			Elements elementosTag = doc.select("b");
			
			System.out.println("Elementos com a tag <b>:");
			
			for(Element el: elementosTag)
				System.out.println(el.text());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
