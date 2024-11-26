package com.lara.cosette.ejercicio01

import retrofit2.Response
import retrofit2.http.GET

/*
 * https://private-effe28-tecsup1.apiary-mock.com/list/teacher
 */
interface TeacherApi {

    @GET("list/teacher")
    suspend fun getTeachers(): Response<TeacherListResponse>
}
