package com.joa.cocktail.menu.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cocktailNo;

    @Column(nullable=false)
    private String cocktailName;
    private String cocktailContent;
    private String cocktailImg;
    private String cocktailComment;

    @Builder
    public Cocktail(Long cocktailNo, String cocktailName, String cocktailContent, String cocktailImg, String cocktailComment){
    this.cocktailNo=cocktailNo;
    this.cocktailName=cocktailName;
    this.cocktailContent=cocktailContent;
    this.cocktailImg=cocktailImg;
    this.cocktailComment=cocktailComment;
    }
}
