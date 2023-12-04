package com.fajar.jetheroes.data

import com.fajar.jetheroes.model.Hero
import com.fajar.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}