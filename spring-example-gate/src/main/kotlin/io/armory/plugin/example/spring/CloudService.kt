package io.armory.plugin.example.spring

import retrofit.http.Body
import retrofit.http.POST
import retrofit.http.Path

interface CloudService {

    @POST("/identity/registration/verify/{instanceId}")
    fun verifyRegistration(@Path("instanceId") instanceId: String, @Body request: VerificationRequest) : VerificationResponse

}