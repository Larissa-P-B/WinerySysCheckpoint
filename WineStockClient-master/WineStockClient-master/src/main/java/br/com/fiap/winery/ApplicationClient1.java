package br.com.fiap.winery;

import br.com.fiap.winery.consumer.WineStockService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ApplicationClient1 {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:8085/WineStockService?wsdl");

        System.out.println("URL do WSDL carregada: " + url);

        QName qName = new QName(
                "http://winery.fiap.com.br/",
                "WineStockServiceImplementationService"
        );

        System.out.println("URL: " + url);
        System.out.println("QName criado: " + qName);

        Service service = Service.create(url, qName);

        WineStockService wineStockService =
                service.getPort(WineStockService.class);

        String menu = wineStockService.getMenu();

        System.out.println(menu);

        System.out.println("Cliente conectado ao Web Service!");
    }
}
