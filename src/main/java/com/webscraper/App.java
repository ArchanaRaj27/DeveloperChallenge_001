/**
 * @author Archana
 */
package com.webscraper;
import java.io.IOException;
import java.util.List;

import com.webscraper.extractor.Extractor;
import com.webscraper.model.Product;
import com.webscraper.model.Response;
import com.webscraper.util.Calculation;
import com.webscraper.util.JsonEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

        private static final Logger LOG = LoggerFactory.getLogger(App.class);
        /**
         * @param args
         */
        public static void main(String[] args) throws IOException {
            // Extract the data into a list of products
            Extractor extractor = new Extractor();
            List<Product> products = extractor.scrape();
            Response response = new Response();
            response.setResults(products);
            Calculation cal = new Calculation();
            response.setTotal(cal.doCalculate(products));


            // Convert the List of products (Java objects) to Json string
            JsonEngine jsonEngine = new JsonEngine();
            String output = jsonEngine.convertJson(response);

            LOG.info(output);
        }
}
