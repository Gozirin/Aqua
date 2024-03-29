package com.decagon.aqua.feature.consumer.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decagon.aqua.core.baseClasses.BaseFragment
import com.decagon.aqua.databinding.ConsumerAccountFragmentBinding

class ConsumerAccountFragment : BaseFragment() {

    private lateinit var binding: ConsumerAccountFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ConsumerAccountFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}
