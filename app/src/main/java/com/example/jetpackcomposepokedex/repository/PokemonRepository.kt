package com.example.jetpackcomposepokedex.repository

import com.example.jetpackcomposepokedex.model.Pokemon
import com.example.jetpackcomposepokedex.model.PokemonList
import com.example.jetpackcomposepokedex.remote.PokeApi
import com.example.jetpackcomposepokedex.utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {

    suspend fun getPokemonList(limit: Int, offSet: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offSet)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occur")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(name: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(name)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occur")
        }
        return Resource.Success(response)
    }
}