package com.digipizza.digipizzaapi.service;

import com.digipizza.digipizzaapi.dto.UserDto;
import com.digipizza.digipizzaapi.entity.User;
import com.digipizza.digipizzaapi.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    public UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserDto saveUser(UserDto userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public UserDto getUser(int id) {
        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return modelMapper.map(user, UserDto.class);
    }

    public List<UserDto> getAllUsers(){
        List<User> userList = userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDto>>(){}.getType());
    }

    public UserDto updateUser(UserDto userDto) {
        userRepo.save(modelMapper.map(userDto, User.class));
        return userDto;
    }

    public boolean deleteUserById(int id) {
        userRepo.deleteById(id);
        return true;
    }

    public UserDto findByEmail(String email) {
        User user = userRepo.findByEmail(email);
        return modelMapper.map(user, UserDto.class);
    }

}
