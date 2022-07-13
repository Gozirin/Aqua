package com.decagon.aqua.core.authentication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.decagon.aqua.R
import com.decagon.aqua.databinding.FragmentConsumerChangePasswordScreenBinding

class ConsumerChangePasswordScreenFragment : Fragment() {

    private lateinit var binding: FragmentConsumerChangePasswordScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val binding = inflater.inflate(R.layout.fragment_consumer_change_password_screen, container, false)
        return binding.rootView
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // initializing view binding
        binding = FragmentConsumerChangePasswordScreenBinding.bind(view)

        // Back button to return to Notification page
        binding.changePasswordScreenButton.setOnClickListener {
            findNavController().navigate(R.id.action_consumer_Change_Password_Screen_Fragment_to_consumerNotificationScreenFragment)
        }

        // Validate Password Text

        binding.changePasswordScreenTextInputLayout1.setOnFocusChangeListener { _, focused ->
            if (!focused) {
                binding.changePasswordScreenTextInputLayout1.helperText = validCurrentPassword()
            }
            binding.textInputLayout2.setOnFocusChangeListener { _, focused ->
                if (!focused) {
                    binding.textInputLayout2.helperText = validNewPassword()
                }
                binding.textInputLayout4.setOnFocusChangeListener { _, focused ->
                    if (!focused) {
                        binding.textInputLayout4.helperText = validConfirmPassword()
                    }
                }
            }
        }
    }

    // validate current password text

    private fun validCurrentPassword(): String? {
        val passwordText = binding.changePasswordScreenTextInputLayout1.helperText.toString()
        if (passwordText.length < 8) {
            return "Minimum 8 Character Password"
        }
        if (!passwordText.matches(".*[A-Z].*".toRegex())) {
            return "Must Contain 1 upper-case Character"
        }
        if (!passwordText.matches(".*[a-z].*".toRegex())) {
            return "Must Contain 1 lower-case Character"
        }
        if (!passwordText.matches(".*[@#\$%^&+=].*".toRegex())) {
            return "Must Contain 1 Special Character (@#\$%^&+=)"
        }
        return null
    }

    // validate new password text

    private fun validNewPassword(): String? {
        val passwordText = binding.textInputLayout2.helperText.toString()
        if (passwordText.length < 8) {
            return "Minimum 8 Character Password"
        }
        if (!passwordText.matches(".*[A-Z].*".toRegex())) {
            return "Must Contain 1 upper-case Character"
        }
        if (!passwordText.matches(".*[a-z].*".toRegex())) {
            return "Must Contain 1 lower-case Character"
        }
        if (!passwordText.matches(".*[@#\$%^&+=].*".toRegex())) {
            return "Must Contain 1 Special Character (@#\$%^&+=)"
        }
        return null
    }

    // validate confirm password text

    private fun validConfirmPassword(): String? {
        val passwordText = binding.textInputLayout2.helperText.toString()
        if (passwordText.length < 8) {
            return "Minimum 8 Character Password"
        }
        if (!passwordText.matches(".*[A-Z].*".toRegex())) {
            return "Must Contain 1 upper-case Character"
        }
        if (!passwordText.matches(".*[a-z].*".toRegex())) {
            return "Must Contain 1 lower-case Character"
        }
        if (!passwordText.matches(".*[@#\$%^&+=].*".toRegex())) {
            return "Must Contain 1 Special Character (@#\$%^&+=)"
        }
        return null
    }
}
