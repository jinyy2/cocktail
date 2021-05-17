package com.joa.cocktail.menu.presentation;

import com.joa.cocktail.menu.application.CocktailService;
import com.joa.cocktail.menu.dto.CocktailResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
//@RequestMapping("/api/v1")
//@CrossOrigin({"http://localhost:8081","http://localhost:3000"})
public class CocktailCRUDController {
    private final CocktailService cocktailService;

    @GetMapping("/menu/{id}")
    public CocktailResponseDto findById(@PathVariable Long id){
        return cocktailService.findById(id);
    }
}
