package com.decagon.aqua.core.authentication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.decagon.aqua.R
import com.decagon.aqua.databinding.FragmentPasswordAccountSuccessfulBinding

class PasswordAccountSuccessfulFragment : Fragment() {
    private lateinit var binding: FragmentPasswordAccountSuccessfulBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_password_account_successful, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // initializing view binding
        binding = FragmentPasswordAccountSuccessfulBinding.bind(view)

        // Don't have account signup to page.
        binding.passwordAccountTextView1.setOnClickListener {
            findNavController().navigate(R.id.action_passwordAccountSuccessfulFragment_to_consumer_Referral_Screen_Fragment)
        }

//        // navigate to password account successful
//        binding.createNewButton2.setOnClickListener {
//            findNavController().navigate(R.id.action_consumerCreateNewPasswordFragment2_to_password_AccountSuccessfulFragment)
    }
}
