/**
 * @author Archana
 *
 */
package com.webscraper;
import java.io.IOException;
import java.util.List;

import com.webscraper.extractor.Extractor;
import com.webscraper.model.Product;
import com.webscraper.util.JsonEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

        private static final Logger LOG = LoggerFactory.getLogger(App.class);


        /**
         * @param args
         */
        public static void main(String[] args) {
            try{
                Extractor extractor = new Extractor();
                List<Product> products = extractor.scrap();

                JsonEngine jsonEngine = new JsonEngine();
                String output = jsonEngine.convertJson(products);

                LOG.info(output);


            } catch (IOException e) {
                LOG.error(e.getMessage());

            }
        }
}
