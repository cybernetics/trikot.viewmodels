package com.trikot.viewmodels.sample.viewmodels

import com.mirego.trikot.viewmodels.mutable.MutableLabelViewModel
import com.mirego.trikot.viewmodels.mutable.MutableViewModel
import com.mirego.trikot.streams.reactive.just

class MutableHeaderListItemViewModel(text: String, override var comparableId: String = "") : HeaderListItemViewModel, MutableViewModel() {
    override val text = MutableLabelViewModel().also {
        it.text = text.just()
    }
}
