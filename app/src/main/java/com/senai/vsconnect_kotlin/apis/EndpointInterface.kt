package com.senai.vsconnect_kotlin.apis

import com.google.gson.JsonObject
import com.senai.vsconnect_kotlin.models.Login
import com.senai.vsconnect_kotlin.models.Servico
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import java.util.UUID

interface EndpointInterface {
    @GET("servicos")
    fun listarServicos() : Call<List<Servico>>

    @POST("login")
    fun login(@Body usuario: Login) : Call<JsonObject>

    @GET("usuarios/{idUusario}")
    fun buscarUsuarioPorId(@Path(value = "idUsuario", encoded = true) idUsuario : UUID) : Call<JsonObject>
}