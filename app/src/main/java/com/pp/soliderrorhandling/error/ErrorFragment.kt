package com.pp.soliderrorhandling.error

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.pp.soliderrorhandling.databinding.FragmentErrorBinding

class ErrorFragment : Fragment() {

    private var _binding: FragmentErrorBinding? = null
    private val binding get() = _binding!!

    /*
    companion object {
        private const val ERROR_KEY = "errorKey"

        fun newError(error: ErrorView): ErrorFragment {
            return ErrorFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ERROR_KEY, error)
                }
            }
        }
    }

    private val error: ErrorView? by lazy { arguments?.getParcelable(ERROR_KEY) }
    */

    private val args: ErrorFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentErrorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        args.error.setupView(binding)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}