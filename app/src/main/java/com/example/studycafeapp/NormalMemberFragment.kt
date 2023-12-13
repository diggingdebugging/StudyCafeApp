package com.example.studycafeapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.studycafeapp.databinding.FragmentNormalmemberBinding

class NormalMemberFragment : Fragment() {
    private lateinit var binding: FragmentNormalmemberBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNormalmemberBinding.inflate(inflater, container, false)
        return binding.root
    }
}