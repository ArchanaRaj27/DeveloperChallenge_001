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
        Elements links = doc.select("div.productList").select("p").select("a[href]");
        for (Element elementHeader : links) {
            LOG.info("\n" + elementHeader.absUrl("href"));
            Document productDocument = Jsoup.connect(elementHeader.absUrl("href")).get();
            Product product = new Product(productDocument.select("span.productItemCode").text(),
                    productDocument.select("p.productDescription1").text(),
                    productDocument.select("span.productDescription2").text() + productDocument.select("span.productDescription3").text(),
                    productDocument.select("span.productUnitPrice").text(),
                    productDocument.select("span.productWeightPerKg").text());
            productList.add(product);
            LOG.info(productDocument.title());
            LOG.info(productDocument.select("p.productDescription1").text());
            LOG.info(productDocument.select("span.productUnitPrice").text());
            LOG.info(productDocument.select("span.productWeightPerKg").text());
            LOG.info(productDocument.select("span.productItemCode").text());
            LOG.info(productDocument.select("span.productDescription2").text() + productDocument.select("span.productDescription3").text());
        }

        return productList;
    }

    public Document scrap(String url) throws IOException{
        return Jsoup.connect(url).get();
    }

}
