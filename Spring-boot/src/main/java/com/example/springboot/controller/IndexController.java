package com.example.springboot.controller;

import com.example.springboot.database.dao.ProductDAO;
import com.example.springboot.database.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
public class IndexController {


  @Autowired
  private ProductDAO productDAO;

  @GetMapping("/")
  public ModelAndView index(@RequestParam (required = false) Integer id) { // putting this required = false here will stop the browser finding the parameters)
    // this function is for the home page of the website which is express as just a plain slash "/"
    // by default, the @RequestParam is required, meaning if it is missing in the URL spring will send you to the error page
    // if the id parameter is not present on the URL then the incoming id will be null
    ModelAndView response = new ModelAndView("index");

    Product product = productDAO.findById(id);
    response.addObject("productKey", product);

    response.addObject("message", "Hello World!");
    // by default the logging level is set to info so the debug message will not be printed in the terminal
//    log.debug("Debug level");
//    log.info("Info level");
//    log.warn("Warn level");
//    log.error("Error level");

    //Never use System.out.println in spring applications and remember this will only print in

    return response;
  }

  @GetMapping("/index/{id}")
  public ModelAndView indexPathVar(@PathVariable (name = "id") Integer productId) {// it will work well without the (name = "id")
    // by using the name attribute in the @PathVariable annotation, you can change the name of the variable
    // so in this case it is mapping the id in the URL to the productId variable
    ModelAndView response = new ModelAndView("index");

    Product product = productDAO.findById(productId);
    response.addObject("productKey", product);

    response.addObject("message", "Hello World!");

    return response;
  }

  @GetMapping("/page-url")
  public ModelAndView canBeAnyFunctionNameYouWant() {
    // this page is for another page of the website which is express as "/page-url"
    ModelAndView response = new ModelAndView("another-page");

    return response;
  }

  @GetMapping("/search")
  public ModelAndView search(@RequestParam (required = false) String search) {
    ModelAndView response = new ModelAndView("search");

    log.debug("This is was the user's input" + search);
    response.addObject("search", search);

    List<Product> products = productDAO.findByName(search);
    response.addObject("products", products);

    return response;
  }

  @GetMapping("/homework")
  public ModelAndView FunctionHomeworkPage() {
    ModelAndView response = new ModelAndView("homework");
    response.addObject("message2", "This is a Homework Page");

    return response;
  }
}