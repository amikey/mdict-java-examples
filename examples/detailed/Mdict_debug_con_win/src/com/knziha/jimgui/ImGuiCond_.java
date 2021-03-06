/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public final class ImGuiCond_ {
  public final static ImGuiCond_ ImGuiCond_Always = new ImGuiCond_("ImGuiCond_Always", jimguiJNI.ImGuiCond_Always_get());
  public final static ImGuiCond_ ImGuiCond_Once = new ImGuiCond_("ImGuiCond_Once", jimguiJNI.ImGuiCond_Once_get());
  public final static ImGuiCond_ ImGuiCond_FirstUseEver = new ImGuiCond_("ImGuiCond_FirstUseEver", jimguiJNI.ImGuiCond_FirstUseEver_get());
  public final static ImGuiCond_ ImGuiCond_Appearing = new ImGuiCond_("ImGuiCond_Appearing", jimguiJNI.ImGuiCond_Appearing_get());
  public final static ImGuiCond_ ImGuiSetCond_Always = new ImGuiCond_("ImGuiSetCond_Always", jimguiJNI.ImGuiSetCond_Always_get());
  public final static ImGuiCond_ ImGuiSetCond_Once = new ImGuiCond_("ImGuiSetCond_Once", jimguiJNI.ImGuiSetCond_Once_get());
  public final static ImGuiCond_ ImGuiSetCond_FirstUseEver = new ImGuiCond_("ImGuiSetCond_FirstUseEver", jimguiJNI.ImGuiSetCond_FirstUseEver_get());
  public final static ImGuiCond_ ImGuiSetCond_Appearing = new ImGuiCond_("ImGuiSetCond_Appearing", jimguiJNI.ImGuiSetCond_Appearing_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ImGuiCond_ swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ImGuiCond_.class + " with value " + swigValue);
  }

  private ImGuiCond_(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ImGuiCond_(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ImGuiCond_(String swigName, ImGuiCond_ swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ImGuiCond_[] swigValues = { ImGuiCond_Always, ImGuiCond_Once, ImGuiCond_FirstUseEver, ImGuiCond_Appearing, ImGuiSetCond_Always, ImGuiSetCond_Once, ImGuiSetCond_FirstUseEver, ImGuiSetCond_Appearing };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

