package com.pp.soliderrorhandling.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.pp.soliderrorhandling.databinding.FragmentHomeBinding
import com.pp.soliderrorhandling.error.types.InternetError
import com.pp.soliderrorhandling.error.types.NotFoundError
import com.pp.soliderrorhandling.error.types.ServerError

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUi()
    }

    private fun setupUi() {
        setupInternetErrorButton()
        setupServerErrorButton()
        setupNotFoundErrorButton()
    }

    private fun setupInternetErrorButton() {
        binding.internetError.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.loadError(InternetError(false))
            )
        }
    }

    private fun setupServerErrorButton() {
        binding.serverError.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.loadError(ServerError())
            )
        }
    }

    private fun setupNotFoundErrorButton() {
        binding.notFoundError.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.loadError(NotFoundError())
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}