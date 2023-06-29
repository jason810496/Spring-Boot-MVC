package com.glsoft.demo.controllers;
import org.springframework.stereotype.Controller;
import com.glsoft.demo.models.OrderModel;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(path = "/order")
public class OrderController {


    // view order form
    @GetMapping(path = "")
    public String viewOrderForm(Model model) {
        // model.addAttribute("order", new OrderModel());
        return "order/form";
    }

    // create order
    @PostMapping(path = "")
    public String createOrder(HttpServletRequest request, Model model) {
        
        var id = request.getParameter("id");
        var product = request.getParameter("product");
        var count = request.getParameter("count");
        var price = request.getParameter("price");
        // log the order
        System.out.println("Order: " + id + " " + product + " " + count + " " + price);
        var order = new OrderModel();
        order.setId(id);
        order.setProduct(product);
        order.setCount(count);
        order.setPrice(price);
        
        model.addAttribute("order", order);
        model.addAttribute("customer", "Jason");
        model.addAttribute("timestamp", java.time.LocalDateTime.now());
        return "order/detail";
    }

}
