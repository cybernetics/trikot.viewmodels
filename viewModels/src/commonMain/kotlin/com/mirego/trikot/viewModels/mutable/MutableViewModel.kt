package com.mirego.trikot.viewmodels.mutable

import com.mirego.trikot.viewmodels.ViewModel
import com.mirego.trikot.viewmodels.factory.PropertyFactory
import com.mirego.trikot.viewmodels.properties.Color
import com.mirego.trikot.viewmodels.properties.StateSelector
import com.mirego.trikot.viewmodels.properties.ViewModelAction

open class MutableViewModel : ViewModel {
    override var alpha = PropertyFactory.create(1.0f)

    override var backgroundColor = PropertyFactory.create(StateSelector<Color>())

    override var hidden = PropertyFactory.create(false)

    override var action = PropertyFactory.create(ViewModelAction.None)
}
