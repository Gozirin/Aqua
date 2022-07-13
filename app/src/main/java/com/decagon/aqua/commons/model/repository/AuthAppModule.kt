package com.decagon.aqua.commons.model.repository

import com.decagon.aqua.commons.model.updatepassword.UpdatePasswordModel
import com.decagon.aqua.commons.model.updatepassword.UpdatePasswordResponseModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.PATCH

interface AuthAppModule {

    @PATCH("/api/v1/Account/UpdatePassword")
    suspend fun updatepassword(
        @Body updatePasswordModel: UpdatePasswordModel
    ): Response<UpdatePasswordResponseModel>
}
