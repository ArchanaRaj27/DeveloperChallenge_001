/**
 * @author Archana
 */

package com.webscraper.extractor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.webscraper.model.Product;
import com.webscraper.util.DataLogger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Extractor {
    private static final Logger LOG = LoggerFactory.getLogger(Extractor.class);
    public static String URL = "http://devtools.truecommerce.net:8080/challenge001/";

    /**
     * @throws IOException
     * return List<Product>
     * Scrap the whole data from URL using JSOUP implementation
     */
    public List<Product> scrape() throws IOException {
        List<Product> productList = new ArrayList<Product>();
        Document doc = Jsoup.connect(URL).get();
        LOG.info(doc.title());
        Elements links = doc.select("div.productList").select("p").select("a[href]");
        for (Element elementHeader : links) {
            // Scraping the data into a list of products
            doInnerScrape(productList, elementHeader);
        }
        return productList;
    }

    public void doInnerScrape(List<Product> productList, Element elementHeader) throws IOException,NumberFormatException{
        LOG.info("\n" + elementHeader.absUrl("href"));
        Document productDocument = Jsoup.connect(elementHeader.absUrl("href")).get();
        // Place the extracted values into the Product constructor
        Product product = new Product(productDocument.select("span.productItemCode").text(),
                productDocument.select("p.productDescription1").text(),
                productDocument.select("span.productWeightPerKg").text(),
                productDocument.select("span.productUnitPrice").text(),
                productDocument.select("span.productDescription2").text());
        productList.add(product);
        // Call the logging functionality
        DataLogger dataLogger = new DataLogger();
        dataLogger.doLog(productDocument);
    }
}
