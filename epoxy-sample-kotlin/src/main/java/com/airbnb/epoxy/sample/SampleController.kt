package com.airbnb.epoxy.sample

import android.view.View
import com.airbnb.epoxy.AutoModel
import com.airbnb.epoxy.EpoxyModel
import com.airbnb.epoxy.R
import com.airbnb.epoxy.TypedEpoxyController
import com.airbnb.epoxy.sample.models.ButtonModel_
import com.airbnb.epoxy.sample.models.CarouselHolder_
import com.airbnb.epoxy.sample.models.ColorModel_
import com.airbnb.epoxy.sample.models.HeaderModel_

open class SampleController(
     val callbacks: SampleController.AdapterCallbacks) : TypedEpoxyController<List<ColorData>>() {
  interface AdapterCallbacks {
    fun onAddClicked()
    fun onClearClicked()
    fun onShuffleClicked()
    fun onChangeColorsClicked()
  }

  @AutoModel lateinit var header: HeaderModel_
  @AutoModel lateinit var addButton: ButtonModel_
  @AutoModel lateinit var clearButton: ButtonModel_
  @AutoModel lateinit var shuffleButton: ButtonModel_
  @AutoModel lateinit var changeColorsButton: ButtonModel_
  @AutoModel lateinit var carousel: CarouselHolder_

  init {
    setDebugLoggingEnabled(true)
  }

  // TODO: (eli_hart 2/26/17) Carousel with shared view pools, model groups
  // TODO: (eli_hart 2/27/17) Save colors state
  // TODO: (eli_hart 2/27/17) Shuffle color on click square

  override fun buildModels(colors: List<ColorData>) {

    header
        .title(R.string.epoxy)
        .caption(R.string.header_subtitle)
        .addTo(this);


    addButton
        .text(R.string.button_add)
        .clickListener { model, parentView, clickedView, position -> callbacks.onAddClicked() }
        .addTo(this)

    clearButton
        .text(R.string.button_clear)
        .clickListener(View.OnClickListener { callbacks.onClearClicked() })
        .addIf(colors.isNotEmpty(), this)

    shuffleButton
        .text(R.string.button_shuffle)
        .clickListener(View.OnClickListener { callbacks.onShuffleClicked() })
        .addIf(colors.size > 1, this)

    changeColorsButton
        .text(R.string.button_change)
        .clickListener(View.OnClickListener { callbacks.onChangeColorsClicked() })
        .addIf(colors.isNotEmpty(), this)


    val models = ArrayList<EpoxyModel<*>>()
    colors.mapTo(models) { ColorModel_(it) }

    carousel
        .models(models)
        .addIf(!models.isEmpty(), this);
  }
}
