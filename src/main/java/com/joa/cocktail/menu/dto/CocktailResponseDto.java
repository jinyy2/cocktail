package com.joa.cocktail.menu.dto;

import com.joa.cocktail.menu.domain.Cocktail;
import lombok.Getter;

import javax.persistence.Column;

@Getter
public class CocktailResponseDto {
    private Long cocktailNo;
    private String cocktailName;
    private String cocktailContent;
    private String cocktailImg;
    private String cocktailComment;

    public CocktailResponseDto(Cocktail entity) {
        this.cocktailNo = entity.getCocktailNo();
        this.cocktailName = entity.getCocktailName();
        this.cocktailContent = entity.getCocktailContent();
        this.cocktailImg = entity.getCocktailImg();
        this.cocktailComment = entity.getCocktailComment();
    }
}

