package com.webscraper.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webscraper.model.Product;

import java.util.List;

public class JsonEngine {

    public String convertJson (List<Product> products) throws JsonProcessingException {

        // Creating an object for ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        // Converting the java object to json string
        String jsonString = mapper.writeValueAsString(products);

        return jsonString;
    }

}
