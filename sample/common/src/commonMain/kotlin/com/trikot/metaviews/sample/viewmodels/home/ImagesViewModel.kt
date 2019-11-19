package com.trikot.metaviews.sample.viewmodels.home

import com.mirego.trikot.metaviews.mutable.simpleImageFlowProvider
import com.mirego.trikot.metaviews.properties.Color
import com.mirego.trikot.metaviews.properties.MetaAction
import com.mirego.trikot.metaviews.properties.MetaSelector
import com.mirego.trikot.streams.reactive.just
import com.trikot.metaviews.sample.metaviews.MetaListItem
import com.trikot.metaviews.sample.metaviews.MutableHeaderListItem
import com.trikot.metaviews.sample.metaviews.MutableMetaImageListItem
import com.trikot.metaviews.sample.metaviews.MutableMetaViewListItem
import com.trikot.metaviews.sample.navigation.NavigationDelegate
import com.trikot.metaviews.sample.resource.ImageResources

class ImagesViewModel(navigationDelegate: NavigationDelegate): ListViewModel {
    override val items: List<MetaListItem> = listOf(
        MutableHeaderListItem(".backgroundColor"),
        MutableMetaViewListItem().also {
            it.view.backgroundColor = MetaSelector(Color(143, 143, 143)).just()
        },
        MutableHeaderListItem(".alpha"),
        MutableMetaImageListItem(simpleImageFlowProvider()).also {
            it.image.alpha = 0.5f.just()
        },
        MutableHeaderListItem(".hidden"),
        MutableMetaImageListItem(simpleImageFlowProvider()).also {
            it.image.hidden = true.just()
        },
        MutableHeaderListItem(".onTap"),
        MutableMetaImageListItem(simpleImageFlowProvider()).also {
            it.image.onTap = MetaAction { navigationDelegate.showAlert("Tapped $it") }.just()
        },
        MutableHeaderListItem(".imageResource"),
        MutableMetaImageListItem(simpleImageFlowProvider(imageResource = ImageResources.ICON)),
        MutableHeaderListItem(".imageResource + tintColor"),
        MutableMetaImageListItem(simpleImageFlowProvider(imageResource = ImageResources.ICON, tintColor = Color(255, 0, 0 ))),
        MutableHeaderListItem(".placeholder"),
        MutableMetaImageListItem(simpleImageFlowProvider(placeholderImageResource = ImageResources.ICON)),
        MutableHeaderListItem(".placeholder + .url"),
        MutableMetaImageListItem(simpleImageFlowProvider(url = "https://images5.alphacoders.com/346/thumb-1920-346532.jpg", placeholderImageResource = ImageResources.ICON))
    )
}