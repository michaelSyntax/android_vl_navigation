package com.example.android_vl_navigation_02

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android_vl_navigation_02.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var vb: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        vb = FragmentHomeBinding.inflate(inflater, container, false)
        return vb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vb.btGoToDetail.setOnClickListener {
            //findNavController().navigate(R.id.detailFragment)

            findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToDetailFragment("Hello Detail View")
            )
        }
    }
}