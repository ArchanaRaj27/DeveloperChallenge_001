/**
 * @author Archana
 *
 */
package com.webscraper;
import java.io.IOException;

import com.webscraper.extractor.Extractor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

        private static final Logger LOG = LoggerFactory.getLogger(App.class);


        /**
         *
         */
        public App() {

        }

        /**
         * @param args
         */
        public static void main(String[] args) {
            try{
                Extractor extractor = new Extractor();
                extractor.scrap();
            } catch (IOException e) {
                LOG.error(e.getMessage());

            }
        }
}
