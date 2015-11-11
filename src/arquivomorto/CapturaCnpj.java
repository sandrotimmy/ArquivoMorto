/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivomorto;

/**
 *
 * @author Sandro
 */

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CapturaCnpj{

  public static void main(String[] args) throws URISyntaxException {

	Document doc;
	try {
String url = "http://www.receita.fazenda.gov.br/PessoaJuridica/CNPJ/cnpjreva/Cnpjreva_Solicitacao.asp"; 
URI uri = new URI(url); 

		// need http protocol
		doc = Jsoup.connect("http://www.receita.fazenda.gov.br/PessoaJuridica/CNPJ/cnpjreva/Cnpjreva_Solicitacao.asp").get();

		// get page title
		String title = doc.title();
		System.out.println("title : " + title);

		// get all links
		Elements links = doc.select("a[href]");
		for (Element link : links) {

			// get the value from href attribute
			System.out.println("\nlink : " + link.attr("href"));
			System.out.println("text : " + link.text());

		}

	} catch (IOException e) {
		e.printStackTrace();
	}

  }

}
