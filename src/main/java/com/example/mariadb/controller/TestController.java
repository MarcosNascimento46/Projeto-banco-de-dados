package com.example.mariadb.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mariadb.service.TestService;

@RestController
public class TestController {
    
    @Autowired
    private TestService service;

    @GetMapping("/CountProduto")
    public void countProduto(){
        service.countProduto();
    }
    @GetMapping("/getAllProducts")
	public List<Map<String, Object>> getAllProducts() {
		return service.getAllProducts();
	}

	@GetMapping("/getAllClients")
	public List<Map<String, Object>> getAllClients() {
		return service.getAllClients();
	}

	// 1. Consulta para retornar produtos de fornecedores do Japão
    @GetMapping("/getProductsFromJapan")
	public List<Map<String, Object>> getProductsFromJapan() {
		return service.getProductsFromJapan();
	}

	// 4. Método para retornar dados de armazéns e estoques com soma de quantidade >= 200
    @GetMapping("/getWarehouseStockSummary") 
	public List<Map<String, Object>> getWarehouseStockSummary() {
		return service.getWarehouseStockSummary();
	}

	//3. nome e endereço dos armazéns com pelo menos 200 estoques de produtos eletrodomésticos e < 1000 total
	@GetMapping("/getWarehouseWithElectrodomestics")
	public List<Map<String,Object>> getWarehouseWithEletrodomestics(){
		return service.getWarehouseWithElectrodomestics();
	}

	//2.
	@GetMapping("/getAmericanClientsWithCriteria")
	public List<Map<String, Object>> getAmericanClientsWithCriteria() {
		return service.getAmericanClientsWithCriteria();
	}

	//7.
	@GetMapping("/produtos-armazens")
	public List<Map<String, Object>> getProductsWithPriceDifferenceAndWarehouseCount() {
    return service.getProductsWithPriceDifferenceAndWarehouseCount();
	}
	
	//8.
	@GetMapping("/getMinValueSoldIn2023And2024")
	public List<Map<String, Object>> getMinValueSoldIn2023And2024(){
		return service.getMinValueSoldIn2023And2024();
	}

}
