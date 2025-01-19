package ru.rush.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rush.entities.Fruit;
import ru.rush.repo.FruitRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FruitService {
    private final FruitRepository fruitRepository;

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    public void save(Fruit fruit) {
        fruitRepository.save(fruit);
    }

    public void save(List<Fruit> fruits) {
        fruitRepository.saveAll(fruits);
    }

}
