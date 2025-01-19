package ru.rush.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import ru.rush.entities.Fruit;
import ru.rush.services.FruitService;

import java.util.List;

@Service
public class InitiateUtils implements CommandLineRunner {

    private final FruitService fruitService;

    public InitiateUtils(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("run App ZZ");

        Fruit fruit1 = new Fruit();
        fruit1.setProviderCode(1);
        fruit1.setFruitName("клюква");

        Fruit fruit2 = new Fruit();
        fruit2.setProviderCode(2);
        fruit2.setFruitName("арбуз");

        Fruit fruit3 = new Fruit();
        fruit3.setProviderCode(3);
        fruit3.setFruitName("малина");

        fruitService.save(List.of(fruit1, fruit2, fruit3));

        List<Fruit> list =fruitService.getAllFruits();
        list.forEach(System.out::println);
    }
}
