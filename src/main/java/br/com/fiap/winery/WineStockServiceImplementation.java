package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.WineStockService")
public class WineStockServiceImplementation implements WineStockService{
    @Override
    public String getMenu() {
        return "";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "";
    }
}
