package com.example.jetpackcomposepokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.jetpackcomposepokedex.model.Pokemon
import com.example.jetpackcomposepokedex.repository.PokemonRepository
import com.example.jetpackcomposepokedex.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
        return repository.getPokemonInfo(pokemonName)
    }
}