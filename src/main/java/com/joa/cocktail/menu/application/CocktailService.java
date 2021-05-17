package com.joa.cocktail.menu.application;

import com.joa.cocktail.menu.domain.Cocktail;
import com.joa.cocktail.menu.domain.CocktailRepository;
import com.joa.cocktail.menu.dto.CocktailResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CocktailService {
    private final CocktailRepository cocktailRepository;

    @Transactional(readOnly = true)
    public CocktailResponseDto findById(Long id){
        Cocktail entity = cocktailRepository.findById(id).orElseThrow(()->new IllegalArgumentException("해당 메뉴가 없습니다."));
        return new CocktailResponseDto(entity);
    }

}
