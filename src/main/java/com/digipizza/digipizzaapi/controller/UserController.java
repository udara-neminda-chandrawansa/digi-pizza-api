package com.digipizza.digipizzaapi.controller;

import com.digipizza.digipizzaapi.dto.UserDto;
import com.digipizza.digipizzaapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDto> getUser(){
        return userService.getAllUsers();
    }

    @GetMapping("/getUser/{id}")
    public UserDto getUserById(@PathVariable int id){
        return userService.getUser(id);
    }

    @PostMapping("/saveUser")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

    @PutMapping("/updateUser")
    public UserDto updateUser(@RequestBody UserDto userDto){
        return userService.updateUser(userDto);
    }

    @DeleteMapping("/deleteUser/{id}")
    public boolean deleteUser(@PathVariable int id) {
        return userService.deleteUserById(id);
    }

    @GetMapping("/findByEmail/{email}")
    public UserDto findByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @PostMapping("/addNumbers")
    public int addNumbers(@RequestBody NumbersDTO numbers) {
        return numbers.getFnum() + numbers.getSnum();
    }
}

class NumbersDTO {
    private int fnum;
    private int snum;

    public int getFnum() {
        return fnum;
    }

    public void setFnum(int fnum) {
        this.fnum = fnum;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }
}