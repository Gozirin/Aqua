package com.decagon.aqua.commons.model.repository

import com.decagon.aqua.commons.model.updatepassword.UpdatePasswordModel
import com.decagon.aqua.commons.model.updatepassword.UpdatePasswordResponseModel
import retrofit2.Response
import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val authModuleApiInterface: AuthAppModule
) : AuthRepositoryInterface {

    override suspend fun updatepassword(updatePasswordModel: UpdatePasswordModel): Response<UpdatePasswordResponseModel> {
        return authModuleApiInterface.updatepassword(updatePasswordModel)
    }
}