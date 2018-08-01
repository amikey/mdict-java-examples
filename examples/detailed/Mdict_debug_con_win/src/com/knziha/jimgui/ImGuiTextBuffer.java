/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public class ImGuiTextBuffer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ImGuiTextBuffer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImGuiTextBuffer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jimguiJNI.delete_ImGuiTextBuffer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBuf(SWIGTYPE_p_ImVectorT_char_t value) {
    jimguiJNI.ImGuiTextBuffer_Buf_set(swigCPtr, this, SWIGTYPE_p_ImVectorT_char_t.getCPtr(value));
  }

  public SWIGTYPE_p_ImVectorT_char_t getBuf() {
    long cPtr = jimguiJNI.ImGuiTextBuffer_Buf_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ImVectorT_char_t(cPtr, false);
  }

  public ImGuiTextBuffer() {
    this(jimguiJNI.new_ImGuiTextBuffer(), true);
  }

  public String begin() {
    return jimguiJNI.ImGuiTextBuffer_begin(swigCPtr, this);
  }

  public String end() {
    return jimguiJNI.ImGuiTextBuffer_end(swigCPtr, this);
  }

  public int size() {
    return jimguiJNI.ImGuiTextBuffer_size(swigCPtr, this);
  }

  public boolean empty() {
    return jimguiJNI.ImGuiTextBuffer_empty(swigCPtr, this);
  }

  public void clear() {
    jimguiJNI.ImGuiTextBuffer_clear(swigCPtr, this);
  }

  public void reserve(int capacity) {
    jimguiJNI.ImGuiTextBuffer_reserve(swigCPtr, this, capacity);
  }

  public String c_str() {
    return jimguiJNI.ImGuiTextBuffer_c_str(swigCPtr, this);
  }

  public void appendf(String fmt) {
    jimguiJNI.ImGuiTextBuffer_appendf(swigCPtr, this, fmt);
  }

  public void appendfv(String fmt, SWIGTYPE_p_va_list args) {
    jimguiJNI.ImGuiTextBuffer_appendfv(swigCPtr, this, fmt, SWIGTYPE_p_va_list.getCPtr(args));
  }

}
