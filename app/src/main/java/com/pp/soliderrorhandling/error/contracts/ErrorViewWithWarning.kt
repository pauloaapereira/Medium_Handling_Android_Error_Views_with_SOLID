package com.pp.soliderrorhandling.error.contracts

import android.view.View
import com.google.android.material.snackbar.Snackbar

interface ErrorViewWithWarning : ErrorView {
    var warning: Snackbar?
    fun showWarning(root: View)
    fun dismissWarning()
}