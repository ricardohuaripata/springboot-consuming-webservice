package com.project.tiendacliente;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;

import com.project.tiendacliente.objects.Product;


// PROBANDO CONEXION CON LA API
public class Main {
    public static void main(String[] args) throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8085/api/productos");
        CloseableHttpResponse response = httpClient.execute(httpGet);

        int statusCode = response.getStatusLine().getStatusCode();

        if (statusCode == 200) {
            String responseBody = EntityUtils.toString(response.getEntity());
            ObjectMapper objectMapper = new ObjectMapper();
            ArrayList<Product> products = objectMapper.readValue(responseBody, new TypeReference<ArrayList<Product>>() {
            });

            System.out.println("\nAPI CONECTADA CON EXITO :)");

            System.out.println("//////////////////// HAY " + products.size() + " PRODUCTOS ////////////////////");
            for (Product producto: products) {
                System.out.println(producto.toString());
            }

        } else {
            System.out.println("NO SE HA PODIDO CONECTAR CON LA API :(");
        }

    }

}
