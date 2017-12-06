package com.example.aldrichmascarenhas.rxexample.api

import com.example.aldrichmascarenhas.rxexample.model.CatFactsResponse
import io.reactivex.Single
import retrofit2.http.GET

/**
 * Created by aldrichmascarenhas on 05/12/2017.
 */
interface CatAPI {

    @GET("facts?limit=10")
    fun getCatFacts() : Single<CatFactsResponse>


}