package br.com.fiap.winery;

import br.com.fiap.winery.consumer.WineStockService;
import br.com.fiap.winery.consumer.WineWarningService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ApplicationClient2 {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:8085/WineStockService?wsdl");

        System.out.println("URL do WSDL: " + url);

        QName qName = new QName(
                "http://winery.fiap.com.br/",
                "WineStockServiceImplementationService"
        );

        Service service = Service.create(url, qName);

        System.out.println("Serviço criado com sucesso!");

        WineStockService wineStockService =
                service.getPort(WineStockService.class);

        String order = wineStockService.placeOrder("Merlot", 2);

        System.out.println(order);

        URL url2 = new URL(
                "http://localhost:8086/WineWarningService?wsdl"
        );

        QName qName2 = new QName(
                "http://winery.fiap.com.br/",
                "WineWarningServiceImplementationService"
        );

        Service service2 = Service.create(url2, qName2);

        WineWarningService wineWarningService =
                service2.getPort(WineWarningService.class);

        String warn = wineWarningService.sendWarn();

        System.out.println(warn);

    }
}