package com.pp.soliderrorhandling.error.types

import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.pp.soliderrorhandling.R
import com.pp.soliderrorhandling.databinding.FragmentErrorBinding
import com.pp.soliderrorhandling.error.contracts.ErrorViewWithWarning
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
class InternetError(private val showWarning: Boolean) : ErrorViewWithWarning {

    @IgnoredOnParcel
    override var warning: Snackbar? = null

    override fun setupView(binding: FragmentErrorBinding) {
        binding.apply {
            errorTitle.setText(R.string.key_error)
            errorDescription.setText(R.string.key_internet_error)
            errorImage.setImageResource(R.drawable.ic_internet)
        }

        if (showWarning) {
            showWarning(binding.root)
        }
    }

    override fun showWarning(root: View) {
        warning = Snackbar.make(root, "Internet error!", Snackbar.LENGTH_SHORT)
        warning?.show()
    }

    override fun dismissWarning() {
        warning?.dismiss()
        warning = null
    }
}