package com.webscraper.util;

import org.jsoup.nodes.Document;
import org.slf4j.LoggerFactory;


/**
 * Log the data onto the console
 */
public class DataLogger {
    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(DataLogger.class);

    public void doLog(Document productDocument) {
        LOG.info(productDocument.title());
        LOG.info(productDocument.select("p.productDescription1").text());
        LOG.info(productDocument.select("span.productUnitPrice").text());
        LOG.info(productDocument.select("span.productWeightPerKg").text());
        LOG.info(productDocument.select("span.productItemCode").text());
        LOG.info(productDocument.select("span.productDescription2").text() + productDocument.select("span.productDescription3").text());
    }
}
