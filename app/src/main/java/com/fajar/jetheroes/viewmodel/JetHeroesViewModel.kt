package com.fajar.jetheroes.viewmodel

import androidx.lifecycle.ViewModel
import com.fajar.jetheroes.data.HeroRepository
import com.fajar.jetheroes.model.Hero
import kotlinx.coroutines.flow.MutableStateFlow

class JetHeroesViewModel(private val repository: HeroRepository) : ViewModel() {
    private val _groupedHeroes = MutableStateFlow(
        repository.getHeroes()
            .sortedBy { it.name }
            .groupBy { it.name[0] }
    )
    val groupedHeroes: StateFlow<Map<Char, List<Hero>>> get() = _groupedHeroes
}