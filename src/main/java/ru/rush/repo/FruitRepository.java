package ru.rush.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rush.entities.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}