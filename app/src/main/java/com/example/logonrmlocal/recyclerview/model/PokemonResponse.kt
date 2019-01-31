package com.example.logonrmlocal.recyclerview.model

import com.google.gson.annotations.SerializedName

data class PokemonResponse(
        @SerializedName("content") val pokemons: List<Pokemon>
)

data class Pokemon(
        @SerializedName("number") val numero: String,
        @SerializedName("name") val name: String,
        @SerializedName("imageURL") val imagem: String
)