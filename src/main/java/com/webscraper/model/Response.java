package com.webscraper.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Response {
    private List<Product> results;
    private Total total;

}
