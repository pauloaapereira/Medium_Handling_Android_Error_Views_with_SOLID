package com.pp.soliderrorhandling.error.types

import com.pp.soliderrorhandling.R
import com.pp.soliderrorhandling.databinding.FragmentErrorBinding
import com.pp.soliderrorhandling.error.contracts.ErrorView
import kotlinx.parcelize.Parcelize

@Parcelize
class NotFoundError : ErrorView {

    override fun setupView(binding: FragmentErrorBinding) {
        binding.apply {
            errorTitle.setText(R.string.key_error)
            errorDescription.setText(R.string.key_not_found_error)
            errorImage.setImageResource(R.drawable.ic_not_found)
        }
    }

}