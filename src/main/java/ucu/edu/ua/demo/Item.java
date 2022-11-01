package ucu.edu.ua.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ucu.edu.ua.demo.flower.Flower;

@Getter@Setter@AllArgsConstructor
public class Item {
    private double price;
    private String characteristics;

    public void fromFlower(Flower flower) {
        this.price = flower.getPrice();
        this.characteristics = flower.detDescription();
    }
}
