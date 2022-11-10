package com.example.asjapp.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.asjapp.R
import com.example.asjapp.databinding.FragmentScreen1Binding

private var _binding: FragmentScreen1Binding? = null
private val binding get() = _binding!!

class Screen1 : Fragment() {
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentScreen1Binding.inflate(inflater, container, false)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.OnboardingPager)

        binding.nextButton.setOnClickListener {
            viewPager?.currentItem = 1
        }
        return view
    }

}