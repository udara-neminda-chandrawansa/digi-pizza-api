package com.digipizza.digipizzaapi.controller;

import com.digipizza.digipizzaapi.dto.PizzaDto;
import com.digipizza.digipizzaapi.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/pizza")
@CrossOrigin
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/getPizzas")
    public List<PizzaDto> getPizza(){
        return pizzaService.getAllPizzas();
    }

    @GetMapping("/getPizza/{id}")
    public PizzaDto getPizzaById(@PathVariable int id){
        return pizzaService.getPizza(id);
    }

    @PostMapping("/savePizza")
    public PizzaDto savePizza(@RequestBody PizzaDto pizzaDto){
        return pizzaService.savePizza(pizzaDto);
    }

    @PutMapping("/updatePizza")
    public PizzaDto updatePizza(@RequestBody PizzaDto pizzaDto){
        return pizzaService.updatePizza(pizzaDto);
    }

    @DeleteMapping("/deletePizza/{id}")
    public boolean deletePizza(@PathVariable int id) {
        return pizzaService.deletePizzaById(id);
    }
//
//    @GetMapping("/findByEmail/{email}")
//    public PizzaDto findByEmail(@PathVariable String email) {
//        return pizzaService.findByEmail(email);
//    }
//
//    @PostMapping("/addNumbers")
//    public int addNumbers(@RequestBody NumbersDTO numbers) {
//        return numbers.getFnum() + numbers.getSnum();
//    }
}