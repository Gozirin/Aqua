package com.decagon.aqua.commons.model.repository

import com.decagon.aqua.commons.model.updatepassword.UpdatePasswordModel
import com.decagon.aqua.commons.model.updatepassword.UpdatePasswordResponseModel
import retrofit2.Response

interface AuthRepositoryInterface {
    suspend fun updatepassword(updatePasswordModel: UpdatePasswordModel): Response<UpdatePasswordResponseModel>
}
