/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public final class ImGuiBackendFlags_ {
  public final static ImGuiBackendFlags_ ImGuiBackendFlags_HasGamepad = new ImGuiBackendFlags_("ImGuiBackendFlags_HasGamepad", jimguiJNI.ImGuiBackendFlags_HasGamepad_get());
  public final static ImGuiBackendFlags_ ImGuiBackendFlags_HasMouseCursors = new ImGuiBackendFlags_("ImGuiBackendFlags_HasMouseCursors", jimguiJNI.ImGuiBackendFlags_HasMouseCursors_get());
  public final static ImGuiBackendFlags_ ImGuiBackendFlags_HasSetMousePos = new ImGuiBackendFlags_("ImGuiBackendFlags_HasSetMousePos", jimguiJNI.ImGuiBackendFlags_HasSetMousePos_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ImGuiBackendFlags_ swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ImGuiBackendFlags_.class + " with value " + swigValue);
  }

  private ImGuiBackendFlags_(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ImGuiBackendFlags_(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ImGuiBackendFlags_(String swigName, ImGuiBackendFlags_ swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ImGuiBackendFlags_[] swigValues = { ImGuiBackendFlags_HasGamepad, ImGuiBackendFlags_HasMouseCursors, ImGuiBackendFlags_HasSetMousePos };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
