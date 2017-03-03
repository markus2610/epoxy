package com.airbnb.epoxy;

import android.support.annotation.LayoutRes;

import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

/**
 * Generated file. Do not modify!
 */
public class GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_
    extends GenerateDefaultLayoutMethodNextParentLayout.StillNoLayout
    implements GeneratedModel<Object> {

  private OnModelBoundListener<GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_, Object>
      onModelBoundListener_epoxyGeneratedModel;
  private OnModelUnboundListener<GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_, Object>
      onModelUnboundListener_epoxyGeneratedModel;

  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_() {
    super();
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final Object object) {
  }

  @Override
  public void handlePostBind(final EpoxyViewHolder holder, final Object object) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object);
    }
  }

  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ onBind(
      OnModelBoundListener<GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_, Object>
          listener) {
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(Object object) {
    super.unbind(object);

    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ onUnbind(
      OnModelUnboundListener<GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_, Object>
          listener) {
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ id(CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ id(CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ layout(@LayoutRes int arg0) {
    super.layout(arg0);
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ show() {
    super.show();
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    return 1;
  }

  @Override
  public GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;

    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_ that =
        (GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_) o;
    if ((onModelBoundListener_epoxyGeneratedModel == null) != (
        that.onModelBoundListener_epoxyGeneratedModel == null)) {
      return false;
    }
    if ((onModelUnboundListener_epoxyGeneratedModel == null) != (
        that.onModelUnboundListener_epoxyGeneratedModel == null)) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);

    return result;
  }

  @Override
  public String toString() {
    return "GenerateDefaultLayoutMethodNextParentLayout$StillNoLayout_{" +
        "}" + super.toString();
  }
}