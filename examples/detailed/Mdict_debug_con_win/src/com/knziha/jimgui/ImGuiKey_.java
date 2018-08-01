/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public final class ImGuiKey_ {
  public final static ImGuiKey_ ImGuiKey_Tab = new ImGuiKey_("ImGuiKey_Tab");
  public final static ImGuiKey_ ImGuiKey_LeftArrow = new ImGuiKey_("ImGuiKey_LeftArrow");
  public final static ImGuiKey_ ImGuiKey_RightArrow = new ImGuiKey_("ImGuiKey_RightArrow");
  public final static ImGuiKey_ ImGuiKey_UpArrow = new ImGuiKey_("ImGuiKey_UpArrow");
  public final static ImGuiKey_ ImGuiKey_DownArrow = new ImGuiKey_("ImGuiKey_DownArrow");
  public final static ImGuiKey_ ImGuiKey_PageUp = new ImGuiKey_("ImGuiKey_PageUp");
  public final static ImGuiKey_ ImGuiKey_PageDown = new ImGuiKey_("ImGuiKey_PageDown");
  public final static ImGuiKey_ ImGuiKey_Home = new ImGuiKey_("ImGuiKey_Home");
  public final static ImGuiKey_ ImGuiKey_End = new ImGuiKey_("ImGuiKey_End");
  public final static ImGuiKey_ ImGuiKey_Insert = new ImGuiKey_("ImGuiKey_Insert");
  public final static ImGuiKey_ ImGuiKey_Delete = new ImGuiKey_("ImGuiKey_Delete");
  public final static ImGuiKey_ ImGuiKey_Backspace = new ImGuiKey_("ImGuiKey_Backspace");
  public final static ImGuiKey_ ImGuiKey_Space = new ImGuiKey_("ImGuiKey_Space");
  public final static ImGuiKey_ ImGuiKey_Enter = new ImGuiKey_("ImGuiKey_Enter");
  public final static ImGuiKey_ ImGuiKey_Escape = new ImGuiKey_("ImGuiKey_Escape");
  public final static ImGuiKey_ ImGuiKey_A = new ImGuiKey_("ImGuiKey_A");
  public final static ImGuiKey_ ImGuiKey_C = new ImGuiKey_("ImGuiKey_C");
  public final static ImGuiKey_ ImGuiKey_V = new ImGuiKey_("ImGuiKey_V");
  public final static ImGuiKey_ ImGuiKey_X = new ImGuiKey_("ImGuiKey_X");
  public final static ImGuiKey_ ImGuiKey_Y = new ImGuiKey_("ImGuiKey_Y");
  public final static ImGuiKey_ ImGuiKey_Z = new ImGuiKey_("ImGuiKey_Z");
  public final static ImGuiKey_ ImGuiKey_COUNT = new ImGuiKey_("ImGuiKey_COUNT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ImGuiKey_ swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ImGuiKey_.class + " with value " + swigValue);
  }

  private ImGuiKey_(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ImGuiKey_(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ImGuiKey_(String swigName, ImGuiKey_ swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ImGuiKey_[] swigValues = { ImGuiKey_Tab, ImGuiKey_LeftArrow, ImGuiKey_RightArrow, ImGuiKey_UpArrow, ImGuiKey_DownArrow, ImGuiKey_PageUp, ImGuiKey_PageDown, ImGuiKey_Home, ImGuiKey_End, ImGuiKey_Insert, ImGuiKey_Delete, ImGuiKey_Backspace, ImGuiKey_Space, ImGuiKey_Enter, ImGuiKey_Escape, ImGuiKey_A, ImGuiKey_C, ImGuiKey_V, ImGuiKey_X, ImGuiKey_Y, ImGuiKey_Z, ImGuiKey_COUNT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
