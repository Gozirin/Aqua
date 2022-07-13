package com.decagon.aqua.commons.model.updatepassword

import android.util.JsonToken

class UpdatePasswordModel(
    val token: String,
    val emailAddress: String,
    val newPassword: String,
    val confirmPassword: String
)