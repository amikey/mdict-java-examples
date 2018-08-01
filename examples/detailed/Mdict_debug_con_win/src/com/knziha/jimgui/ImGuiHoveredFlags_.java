/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public final class ImGuiHoveredFlags_ {
  public final static ImGuiHoveredFlags_ ImGuiHoveredFlags_None = new ImGuiHoveredFlags_("ImGuiHoveredFlags_None", jimguiJNI.ImGuiHoveredFlags_None_get());
  public final static ImGuiHoveredFlags_ ImGuiHoveredFlags_ChildWindows = new ImGuiHoveredFlags_("ImGuiHoveredFlags_ChildWindows", jimguiJNI.ImGuiHoveredFlags_ChildWindows_get());
  public final static ImGuiHoveredFlags_ ImGuiHoveredFlags_RootWindow = new ImGuiHoveredFlags_("ImGuiHoveredFlags_RootWindow", jimguiJNI.ImGuiHoveredFlags_RootWindow_get());
  public final static ImGuiHoveredFlags_ ImGuiHoveredFlags_AnyWindow = new ImGuiHoveredFlags_("ImGuiHoveredFlags_AnyWindow", jimguiJNI.ImGuiHoveredFlags_AnyWindow_get());
  public final static ImGuiHoveredFlags_ ImGuiHoveredFlags_AllowWhenBlockedByPopup = new ImGuiHoveredFlags_("ImGuiHoveredFlags_AllowWhenBlockedByPopup", jimguiJNI.ImGuiHoveredFlags_AllowWhenBlockedByPopup_get());
  public final static ImGuiHoveredFlags_ ImGuiHoveredFlags_AllowWhenBlockedByActiveItem = new ImGuiHoveredFlags_("ImGuiHoveredFlags_AllowWhenBlockedByActiveItem", jimguiJNI.ImGuiHoveredFlags_AllowWhenBlockedByActiveItem_get());
  public final static ImGuiHoveredFlags_ ImGuiHoveredFlags_AllowWhenOverlapped = new ImGuiHoveredFlags_("ImGuiHoveredFlags_AllowWhenOverlapped", jimguiJNI.ImGuiHoveredFlags_AllowWhenOverlapped_get());
  public final static ImGuiHoveredFlags_ ImGuiHoveredFlags_AllowWhenDisabled = new ImGuiHoveredFlags_("ImGuiHoveredFlags_AllowWhenDisabled", jimguiJNI.ImGuiHoveredFlags_AllowWhenDisabled_get());
  public final static ImGuiHoveredFlags_ ImGuiHoveredFlags_RectOnly = new ImGuiHoveredFlags_("ImGuiHoveredFlags_RectOnly", jimguiJNI.ImGuiHoveredFlags_RectOnly_get());
  public final static ImGuiHoveredFlags_ ImGuiHoveredFlags_RootAndChildWindows = new ImGuiHoveredFlags_("ImGuiHoveredFlags_RootAndChildWindows", jimguiJNI.ImGuiHoveredFlags_RootAndChildWindows_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ImGuiHoveredFlags_ swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ImGuiHoveredFlags_.class + " with value " + swigValue);
  }

  private ImGuiHoveredFlags_(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ImGuiHoveredFlags_(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ImGuiHoveredFlags_(String swigName, ImGuiHoveredFlags_ swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ImGuiHoveredFlags_[] swigValues = { ImGuiHoveredFlags_None, ImGuiHoveredFlags_ChildWindows, ImGuiHoveredFlags_RootWindow, ImGuiHoveredFlags_AnyWindow, ImGuiHoveredFlags_AllowWhenBlockedByPopup, ImGuiHoveredFlags_AllowWhenBlockedByActiveItem, ImGuiHoveredFlags_AllowWhenOverlapped, ImGuiHoveredFlags_AllowWhenDisabled, ImGuiHoveredFlags_RectOnly, ImGuiHoveredFlags_RootAndChildWindows };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
