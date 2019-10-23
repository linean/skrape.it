package it.skrape.selects.html5

import it.skrape.SkrapeItDslMarker
import it.skrape.core.Doc
import it.skrape.core.DomSelector
import it.skrape.selects.selection

/**
 * Will define a <html>-tags css query selector.
 * By default it will just be the specific tag-name.
 * It is possible to define a more concrete selector by using the provided fields of the DomSelector object or
 * by passing a raw css query selector as parameter.
 * If a selector is passed as parameter as well as be defined via DomSelector fields, they will be merged.
 * @see it.skrape.core.DomSelector
 * @param cssSelector
 * @return T
 */
@SkrapeItDslMarker
fun <T> Doc.html(cssSelector: String = "", init: DomSelector.() -> T) = selection("html$cssSelector", init)