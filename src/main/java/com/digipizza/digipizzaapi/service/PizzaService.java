package com.digipizza.digipizzaapi.service;

import com.digipizza.digipizzaapi.dto.PizzaDto;
import com.digipizza.digipizzaapi.entity.Pizza;
import com.digipizza.digipizzaapi.repo.PizzaRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PizzaService {

    @Autowired
    public PizzaRepo pizzaRepo;

    @Autowired
    private ModelMapper modelMapper;

    public PizzaDto savePizza(PizzaDto pizzaDto) {
        pizzaRepo.save(modelMapper.map(pizzaDto, Pizza.class));
        return pizzaDto;
    }

    public PizzaDto getPizza(int id) {
        Pizza pizza = pizzaRepo.findById(id).orElseThrow(() -> new RuntimeException("Pizza not found"));
        return modelMapper.map(pizza, PizzaDto.class);
    }

    public List<PizzaDto> getAllPizzas(){
        List<Pizza> pizzaList = pizzaRepo.findAll();
        return modelMapper.map(pizzaList, new TypeToken<List<PizzaDto>>(){}.getType());
    }

    public PizzaDto updatePizza(PizzaDto pizzaDto) {
        pizzaRepo.save(modelMapper.map(pizzaDto, Pizza.class));
        return pizzaDto;
    }

    public boolean deletePizzaById(int id) {
        pizzaRepo.deleteById(id);
        return true;
    }

//    public PizzaDto findByEmail(String email) {
//        Pizza user = pizzaRepo.findByEmail(email);
//        return modelMapper.map(user, PizzaDto.class);
//    }

}
