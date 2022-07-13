package com.decagon.aqua.core.authentication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.decagon.aqua.R
import com.decagon.aqua.databinding.FragmentConsumerNotificationScreenBinding
import com.decagon.aqua.databinding.FragmentConsumerTransactionBinding
import com.decagon.aqua.databinding.FragmentPasswordAccountSuccessfulBinding

class ConsumerNotificationScreenFragment : Fragment() {
    private lateinit var binding: FragmentConsumerNotificationScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_consumer_notification_screen, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // initializing view binding
        binding = FragmentConsumerNotificationScreenBinding.bind(view)

        // Don't have account signup to page.
        binding.consumerNotificationScreenTextView4.setOnClickListener {
            findNavController().navigate(R.id.action_consumerNotificationScreenFragment_to_consumerTransactionFragment2)
        }
    }

}
