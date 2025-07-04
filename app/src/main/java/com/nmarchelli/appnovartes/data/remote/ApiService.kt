package com.nmarchelli.appnovartes.data.remote

import com.nmarchelli.appnovartes.domain.models.Articulo
import com.nmarchelli.appnovartes.domain.models.Configuracion
import com.nmarchelli.appnovartes.domain.models.InformePedido
import com.nmarchelli.appnovartes.domain.models.PedidoCab
import com.nmarchelli.appnovartes.domain.models.PedidoDet
import com.nmarchelli.appnovartes.domain.models.Rubro
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    @GET("api/articulos.php")
    suspend fun getArticulos(): Response<List<Articulo>>

    @GET("api/rubros.php")
    suspend fun getRubros(): Response<List<Rubro>>

    @POST("api/login.php")
    @Headers("Content-Type: application/json")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>

    @GET("api/configuraciones.php")
    suspend fun getConfiguraciones(): Response<List<Configuracion>>

    @GET("api/lastpedidoscab.php")
    suspend fun getLastPedidosCab(): Response<PedidoCab>

    @GET("api/lastinformepedido.php")
    suspend fun getLastInformePedido(): Response<InformePedido>

    @GET("api/pedidosdet.php")
    suspend fun getPedidosDet(): Response<List<PedidoDet>>
}