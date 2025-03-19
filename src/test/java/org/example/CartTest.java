package org.example;

import org.example.implementations.Cart;
import org.junit.jupiter.api.Test;

import static org.example.Carts.makeCart;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;


public class CartTest {

    Cart cart = makeCart();
    Good car = new Good("car", 3);
    Good house = new Good("house", 10);

    @Test
    public void testMakeCart() {
        assertInstanceOf(Cart.class, cart);
    }

    @Test
    public void testAddGoods() {
        assertEquals(0, cart.getItems().size());
        cart.addItem(car, 1);
        assertEquals(1, cart.getItems().size());
        cart.addItem(house, 2);
        assertEquals(2, cart.getItems().size());
    }

    @Test
    public void testGetCount() {
        assertEquals(0, cart.getCount());

        cart.addItem(car, 0);
        assertEquals(0, cart.getCount());

        cart.addItem(car, 4);
        assertEquals(4, cart.getCount());

        cart.addItem(house, 6);
        assertEquals(10, cart.getCount());
    }

    @Test
    public void testGetCost() {
        assertEquals(0, cart.getCost());
        cart.addItem(car, 1);
        assertEquals(3, cart.getCost());
        cart.addItem(car, 1);
        assertEquals(6, cart.getCost());
        cart.addItem(house, 10);
        assertEquals(106, cart.getCost());
    }
}
