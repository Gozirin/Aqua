package com.decagon.aqua.core.baseClasses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.decagon.aqua.R

abstract class BaseFragment : Fragment() {

//    @Inject

//    lateinit var sharedPreference: SharedPreference

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.base_fragment, container, false)
    }
}
