package com.furkanekiz.kotlinnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fr_second.*


class FRSecond : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fr_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val userName = FRSecondArgs.fromBundle(it).username
            tvFragment2.text = userName
        }

        btnBack.setOnClickListener{
            val action = FRSecondDirections.actionFrSecondToFrFirst()
            Navigation.findNavController(it).navigate(action)
        }
    }
}