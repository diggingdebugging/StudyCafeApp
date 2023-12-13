package com.example.studycafeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.studycafeapp.databinding.FragmentRegularmemberBinding
class RegularMemberFragment : Fragment() {
    private lateinit var binding: FragmentRegularmemberBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegularmemberBinding.inflate(inflater, container, false)
        return binding.root
    }
}