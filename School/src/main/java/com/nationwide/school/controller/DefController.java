package com.nationwide.school.controller;
import com.nationwide.school.entity.Users;
import com.nationwide.school.repository.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin

@RestController
class DefController {
    @Autowired
    private SchoolRepo repo;

@CrossOrigin
    @GetMapping("/findAll")
    public ArrayList<Users> findall() {
        return repo.findAll();
    }

    @CrossOrigin
    @PostMapping("/Save")
    public String SaveData(@RequestBody Users u) {
        System.out.println(u.getFirstname());
                repo.save(u);
        return "Item Saved";
    }
//eggs
@DeleteMapping("/Delete/{Id}")
    public String deleteById(@PathVariable int Id){
    repo.deleteById(Id);
    return "deleted";
    }
}