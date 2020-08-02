package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;
import com.company.model.Hat;
import com.company.model.Shirt;

public class Main {

    public static void main(String[] args) {

        var shirt = new Shirt(ClothingSize.L, 3, 19.99);
        calculateDisplayItems(shirt);

        var hat = new Hat(ClothingSize.M, 3, 29.99);
        calculateDisplayItems(hat);

    }

    private static void calculateDisplayItems(ClothingItem item) {
        double cost = item.getQuantity() * item.getPrice();
        String output = "Your order of %s %s will cost $%s";
        System.out.println(String.format(output, item.getSize(), item.getType(), cost));
    }

}
