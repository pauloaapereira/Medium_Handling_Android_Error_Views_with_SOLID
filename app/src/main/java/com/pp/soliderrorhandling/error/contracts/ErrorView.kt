package com.pp.soliderrorhandling.error.contracts

import android.os.Parcelable
import com.pp.soliderrorhandling.databinding.FragmentErrorBinding

interface ErrorView : Parcelable {
    fun setupView(binding: FragmentErrorBinding)
}
