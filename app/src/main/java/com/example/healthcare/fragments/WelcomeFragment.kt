package com.example.healthcare.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.healthcare.R
import com.example.healthcare.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private var _binding:FragmentWelcomeBinding ?= null
    private val binding = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        _binding = FragmentWelcomeBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       binding.buttonGetStarted.setOnClickListener {
           findNavController().navigate(R.id.action_welcomeFragment_to_signUpFragment)
       }
    }
}
