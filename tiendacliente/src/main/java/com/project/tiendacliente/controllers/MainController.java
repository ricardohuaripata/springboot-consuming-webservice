package com.project.tiendacliente.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.project.tiendacliente.objects.Product;


@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView index(HttpSession session, HttpServletRequest request) throws IOException {

        ModelAndView mv = new ModelAndView("index");

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8085/api/productos");
        CloseableHttpResponse response = httpClient.execute(httpGet);

        int statusCode = response.getStatusLine().getStatusCode();

        if (statusCode == 200) {

            String responseBody = EntityUtils.toString(response.getEntity());
            ObjectMapper objectMapper = new ObjectMapper();
            ArrayList<Product> products = objectMapper.readValue(responseBody, new TypeReference<ArrayList<Product>>() {
            });

            mv.addObject("products", products);

        } 

        return mv;
    }

}
