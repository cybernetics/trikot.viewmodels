package com.mirego.trikot.viewmodels

import com.mirego.trikot.foundation.CommonJSExport
import com.mirego.trikot.viewmodels.properties.Color
import com.mirego.trikot.viewmodels.properties.InputTextType
import org.reactivestreams.Publisher

@CommonJSExport
interface InputTextViewModel : ViewModel {
    /**
     * Text input by the user
     */
    val userInput: Publisher<String>
    /**
     * Type of data being placed in an EditText
     */
    val inputType: Publisher<InputTextType>
    /**
     * Text to display when the text is empty.
     */
    val placeholderText: Publisher<String>
    /**
     * Input text color
     */
    val textColor: Publisher<Color>
    /**
     * Set the text entered by the platform InputText.
     */
    fun setUserInput(value: String)
}
