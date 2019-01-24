package com.part.project.projectsettingspart;

import java.io.Serializable;

public class CategoryModel implements Serializable {

    public String word, translate, language, cardTheme;

    public CategoryModel(){
    }

    public CategoryModel(String word, String translate, String language, String cardTheme) {
        this.word = word;
        this.translate = translate;
        this.language = language;
        this.cardTheme = cardTheme;
    }
}