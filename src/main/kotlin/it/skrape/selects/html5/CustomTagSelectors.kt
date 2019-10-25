package it.skrape.selects.html5

import it.skrape.SkrapeItDslMarker
import it.skrape.core.Doc
import it.skrape.core.CssSelector
import it.skrape.selects.selection

/**
 * Will define a html5 custom tags css query selector.
 * By default it will just be the specific tag-name.
 * It is possible to define a more concrete selector by using the provided fields of the CssSelector object or
 * by passing a raw css query selector as parameter.
 * If a selector is passed as parameter as well as be defined via CssSelector fields, they will be merged.
 * @see it.skrape.core.CssSelector
 * @param cssSelector
 * @return T
 */
@SkrapeItDslMarker
fun <T> Doc.customTag(tag: String, cssSelector: String = "", init: CssSelector.() -> T) =
        selection("$tag$cssSelector", init)
