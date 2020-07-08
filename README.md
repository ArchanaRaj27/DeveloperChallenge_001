Developer challenge 1 - Web Scrapper (Maven project)
****************************************************
src/main/java/com.wescraper/controller/App - Contains main() that runs the entire scrape process, Calculation and Json conversion.
org.jsoup - Html parsing
com.fasterxml.jackson.core - json conversion and functions
org.projectlombok - lombok implementation


Packages: 
controller - Contains main process 
extracter - Contains the scrape functionality 
model - Contains getters and setters of Products, Total and Response (combination of Results and Total) 
util - Contains the method to calculate Net/Gross/VAT and the Json converter.