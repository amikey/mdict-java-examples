/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public final class ImGuiTreeNodeFlags_ {
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_None = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_None", jimguiJNI.ImGuiTreeNodeFlags_None_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_Selected = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_Selected", jimguiJNI.ImGuiTreeNodeFlags_Selected_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_Framed = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_Framed", jimguiJNI.ImGuiTreeNodeFlags_Framed_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_AllowItemOverlap = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_AllowItemOverlap", jimguiJNI.ImGuiTreeNodeFlags_AllowItemOverlap_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_NoTreePushOnOpen = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_NoTreePushOnOpen", jimguiJNI.ImGuiTreeNodeFlags_NoTreePushOnOpen_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_NoAutoOpenOnLog = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_NoAutoOpenOnLog", jimguiJNI.ImGuiTreeNodeFlags_NoAutoOpenOnLog_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_DefaultOpen = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_DefaultOpen", jimguiJNI.ImGuiTreeNodeFlags_DefaultOpen_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_OpenOnDoubleClick = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_OpenOnDoubleClick", jimguiJNI.ImGuiTreeNodeFlags_OpenOnDoubleClick_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_OpenOnArrow = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_OpenOnArrow", jimguiJNI.ImGuiTreeNodeFlags_OpenOnArrow_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_Leaf = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_Leaf", jimguiJNI.ImGuiTreeNodeFlags_Leaf_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_Bullet = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_Bullet", jimguiJNI.ImGuiTreeNodeFlags_Bullet_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_FramePadding = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_FramePadding", jimguiJNI.ImGuiTreeNodeFlags_FramePadding_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_NavLeftJumpsBackHere = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_NavLeftJumpsBackHere", jimguiJNI.ImGuiTreeNodeFlags_NavLeftJumpsBackHere_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_CollapsingHeader = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_CollapsingHeader", jimguiJNI.ImGuiTreeNodeFlags_CollapsingHeader_get());
  public final static ImGuiTreeNodeFlags_ ImGuiTreeNodeFlags_AllowOverlapMode = new ImGuiTreeNodeFlags_("ImGuiTreeNodeFlags_AllowOverlapMode", jimguiJNI.ImGuiTreeNodeFlags_AllowOverlapMode_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ImGuiTreeNodeFlags_ swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ImGuiTreeNodeFlags_.class + " with value " + swigValue);
  }

  private ImGuiTreeNodeFlags_(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ImGuiTreeNodeFlags_(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ImGuiTreeNodeFlags_(String swigName, ImGuiTreeNodeFlags_ swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ImGuiTreeNodeFlags_[] swigValues = { ImGuiTreeNodeFlags_None, ImGuiTreeNodeFlags_Selected, ImGuiTreeNodeFlags_Framed, ImGuiTreeNodeFlags_AllowItemOverlap, ImGuiTreeNodeFlags_NoTreePushOnOpen, ImGuiTreeNodeFlags_NoAutoOpenOnLog, ImGuiTreeNodeFlags_DefaultOpen, ImGuiTreeNodeFlags_OpenOnDoubleClick, ImGuiTreeNodeFlags_OpenOnArrow, ImGuiTreeNodeFlags_Leaf, ImGuiTreeNodeFlags_Bullet, ImGuiTreeNodeFlags_FramePadding, ImGuiTreeNodeFlags_NavLeftJumpsBackHere, ImGuiTreeNodeFlags_CollapsingHeader, ImGuiTreeNodeFlags_AllowOverlapMode };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
