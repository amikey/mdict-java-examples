/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public final class ImGuiFocusedFlags_ {
  public final static ImGuiFocusedFlags_ ImGuiFocusedFlags_None = new ImGuiFocusedFlags_("ImGuiFocusedFlags_None", jimguiJNI.ImGuiFocusedFlags_None_get());
  public final static ImGuiFocusedFlags_ ImGuiFocusedFlags_ChildWindows = new ImGuiFocusedFlags_("ImGuiFocusedFlags_ChildWindows", jimguiJNI.ImGuiFocusedFlags_ChildWindows_get());
  public final static ImGuiFocusedFlags_ ImGuiFocusedFlags_RootWindow = new ImGuiFocusedFlags_("ImGuiFocusedFlags_RootWindow", jimguiJNI.ImGuiFocusedFlags_RootWindow_get());
  public final static ImGuiFocusedFlags_ ImGuiFocusedFlags_AnyWindow = new ImGuiFocusedFlags_("ImGuiFocusedFlags_AnyWindow", jimguiJNI.ImGuiFocusedFlags_AnyWindow_get());
  public final static ImGuiFocusedFlags_ ImGuiFocusedFlags_RootAndChildWindows = new ImGuiFocusedFlags_("ImGuiFocusedFlags_RootAndChildWindows", jimguiJNI.ImGuiFocusedFlags_RootAndChildWindows_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ImGuiFocusedFlags_ swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ImGuiFocusedFlags_.class + " with value " + swigValue);
  }

  private ImGuiFocusedFlags_(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ImGuiFocusedFlags_(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ImGuiFocusedFlags_(String swigName, ImGuiFocusedFlags_ swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ImGuiFocusedFlags_[] swigValues = { ImGuiFocusedFlags_None, ImGuiFocusedFlags_ChildWindows, ImGuiFocusedFlags_RootWindow, ImGuiFocusedFlags_AnyWindow, ImGuiFocusedFlags_RootAndChildWindows };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

