package com.joa.cocktail.menu.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin({"http://localhost:8081","http://localhost:3000"})
public class MenuCRUDController {

    @GetMapping("/menus")
    public ResponseEntity selectPageMenus(){
        return ResponseEntity.ok()
    }
}
