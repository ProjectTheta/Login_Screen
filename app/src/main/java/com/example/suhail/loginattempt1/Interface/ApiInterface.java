package com.example.suhail.loginattempt1.Interface;

/**
 * Created by Suhail on 8/7/2017.
 */


import com.example.suhail.loginattempt1.model.LoginResponse;
import com.example.suhail.loginattempt1.model.RegisterStudent;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {

    /**
     *Login Client
     */

    @FormUrlEncoded
    @POST("attempt/LoginActivity")
    Call<LoginResponse> doLogin(@FieldMap(encoded = false) Map<String, String> params);

     /**
      *  to pass every param seprately use this ->
        Call<LoginResponse> doLogin(@Field("contact") String contact,
                                    @Field("password") String password);
      */

    /**
     * ----------------------------------------------------------------------------------------------------------------------
     */

    /**
     *Register Client
     */

    /**
     * Same class for request and response will be changed if there are major changes
     */

    /**
     *Retrofit will send the ResgisterStudent object as request body
     */
    @POST("attempt/register")
    Call<RegisterStudent> createStudent(@Body RegisterStudent registerStudent);

}

