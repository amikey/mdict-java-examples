/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public class ImGuiOnceUponAFrame {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ImGuiOnceUponAFrame(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImGuiOnceUponAFrame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jimguiJNI.delete_ImGuiOnceUponAFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ImGuiOnceUponAFrame() {
    this(jimguiJNI.new_ImGuiOnceUponAFrame(), true);
  }

  public void setRefFrame(int value) {
    jimguiJNI.ImGuiOnceUponAFrame_RefFrame_set(swigCPtr, this, value);
  }

  public int getRefFrame() {
    return jimguiJNI.ImGuiOnceUponAFrame_RefFrame_get(swigCPtr, this);
  }

}
