/**
 * @author Archana
 *
 */

package com.webscraper.extractor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.webscraper.model.Product;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Extractor {
    private static final Logger LOG = LoggerFactory.getLogger(Extractor.class);

    /**
     * @throws IOException
     *
     */
    public List<Product> scrap() throws IOException {
        List<Product> productList = new ArrayList<Product>();
        Document doc = Jsoup.connect("http://devtools.truecommerce.net:8080/challenge001/").get();
        LOG.info(doc.title());
        Elements newsHeadlines = doc.select("div.productList").select("p").select("a[href]");
        for (Element headline : newsHeadlines) {
            LOG.info("\n" + headline.absUrl("href"));
            Product product = new Product();
            productList.add(product);








        }

        return productList;
    }
}
