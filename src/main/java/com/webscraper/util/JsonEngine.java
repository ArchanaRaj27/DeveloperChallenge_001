/**
 * @author Archana
 */
package com.webscraper.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.webscraper.model.Product;
import com.webscraper.model.Response;

import java.io.IOException;
import java.util.List;
/**
 * @throws JsonProcessingException
 * return String
 * Converts the Java object into JSON string.
 */
public class JsonEngine {

    public String convertJson (Response response) throws JsonProcessingException {

        // Creating an object for ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        // Converting the object to pretty printed json string
        ObjectWriter writer = mapper.writer().withDefaultPrettyPrinter();
        String jsonString = writer.writeValueAsString(response);

        return jsonString;
    }

}
