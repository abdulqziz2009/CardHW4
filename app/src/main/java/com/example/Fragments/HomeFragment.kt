package com.myself223.card.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.myself223.card.App
import com.myself223.card.R
import com.myself223.card.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private var navController: NavController? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root



    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (!App.prefs.isShow()){
            findNavController().navigate(R.id.onBoard)
            App.prefs.changeShow(true)

        }




    }

    private fun Intent(homeFragment: HomeFragment, java: Class<CategoryFragment>) {

        fun (){
            val i = Intent(this, CategoryFragment::class.java)
            startActivity(i)

        }
    }

    private fun startActivity(i: Unit) {

    }


}
