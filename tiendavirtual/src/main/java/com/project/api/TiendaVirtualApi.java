package com.project.api;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.objects.Product;
import com.project.objects.Pedido;

public class TiendaVirtualApi {

	// OBTENER LISTADO COMPLETO DE PRODUCTOS
	public static ArrayList<Product> obtenerProductos() throws IOException {

		CloseableHttpClient httpClient = HttpClients.createDefault();

		HttpGet httpGet = new HttpGet("http://localhost:8085/api/productos");
		CloseableHttpResponse response = httpClient.execute(httpGet);

		String responseBody = EntityUtils.toString(response.getEntity());

		ObjectMapper objectMapper = new ObjectMapper();
		ArrayList<Product> products = objectMapper.readValue(responseBody, new TypeReference<ArrayList<Product>>() {
		});

		return products;

	}
	// OBTENER LISTADO DE COMPRAS/PEDIDOS DEL CLIENTE
	public static ArrayList<Pedido> obtenerPedidosUsuario(int id) throws IOException {

		CloseableHttpClient httpClient = HttpClients.createDefault();

		HttpGet httpGet = new HttpGet("http://localhost:8085/api/pedidos/usuario/" + id);
		CloseableHttpResponse response = httpClient.execute(httpGet);

		String responseBody = EntityUtils.toString(response.getEntity());

		ObjectMapper objectMapper = new ObjectMapper();
		ArrayList<Pedido> pedidos = objectMapper.readValue(responseBody, new TypeReference<ArrayList<Pedido>>() {
		});

		return pedidos;

	}
	// OBTENER HISTORIAL DE VENTAS PARA EL ADMINISTRADOR
	public static ArrayList<Pedido> obtenerPedidos() throws IOException {

		CloseableHttpClient httpClient = HttpClients.createDefault();

		HttpGet httpGet = new HttpGet("http://localhost:8085/api/pedidos");
		CloseableHttpResponse response = httpClient.execute(httpGet);

		String responseBody = EntityUtils.toString(response.getEntity());

		ObjectMapper objectMapper = new ObjectMapper();
		ArrayList<Pedido> pedidos = objectMapper.readValue(responseBody, new TypeReference<ArrayList<Pedido>>() {
		});

		return pedidos;

	}
	
}
