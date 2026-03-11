package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService{
    @Override
    public String getMenu() {
       return "===== MENU DE VINHOS =====\n"
                + "Cabernet Sauvignon - Vinho tinto encorpado\n"
                + "Merlot - Vinho tinto suave\n"
                + "Pinot Noir - Vinho tinto leve\n"
                + "Chardonnay - Vinho branco seco\n"
                + "Sauvignon Blanc - Vinho branco aromático\n"
                + "Malbec - Vinho tinto intenso\n";


    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido recebido: " + quantity + " garrafas de " + name;
    }
}
