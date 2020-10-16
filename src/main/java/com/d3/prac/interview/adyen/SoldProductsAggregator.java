package com.d3.prac.interview.adyen;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SoldProductsAggregator {

    private final EURExchangeService exchangeService;

    SoldProductsAggregator(EURExchangeService EURExchangeService) {
        this.exchangeService = EURExchangeService;
    }


    SoldProductsAggregate aggregate(Stream<SoldProduct> products) {

        /*if (products == null) {
            Stream<String> emptyStream = Stream.empty();
        }

        ArrayList<SoldProduct> list = (ArrayList<SoldProduct>) products.collect(Collectors.toList());
        List<SimpleSoldProduct> simpleSoldProducts = new ArrayList<>();
        BigDecimal totalPrice = BigDecimal.ZERO;


        for (SoldProduct soldProduct : list) {
            SimpleSoldProduct simpleSoldProduct = new SimpleSoldProduct();

            simpleSoldProduct.name = soldProduct.name;
            simpleSoldProduct.price = soldProduct.price;

            BigDecimal eurPrice = soldProduct.price.multiply(exchangeService.rate(soldProduct.currency).get());

            totalPrice.add(eurPrice);

            simpleSoldProducts.add(simpleSoldProduct);
        }

        SoldProductsAggregate soldProductsAggregate = new SoldProductsAggregate();
        soldProductsAggregate.products = simpleSoldProducts;
        soldProductsAggregate.total = totalPrice;

        return soldProductsAggregate;*/

        return null;
    }
}

@Value
class SoldProduct {
    String name;
    BigDecimal price;
    String currency;
}

@Value
@AllArgsConstructor
class SoldProductsAggregate {
    List<SimpleSoldProduct> products;
    BigDecimal total;
}

@Value
class SimpleSoldProduct {
    String name;
    BigDecimal price;
}

interface ExchangeService {
    Optional<BigDecimal> rate(String currency);
}

class EURExchangeService implements ExchangeService {

    @Override
    public Optional<BigDecimal> rate(String currency) {
        return Optional.empty();
    }
}