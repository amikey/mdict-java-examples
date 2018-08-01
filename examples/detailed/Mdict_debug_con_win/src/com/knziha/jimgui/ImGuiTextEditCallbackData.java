/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public class ImGuiTextEditCallbackData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ImGuiTextEditCallbackData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImGuiTextEditCallbackData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jimguiJNI.delete_ImGuiTextEditCallbackData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEventFlag(int value) {
    jimguiJNI.ImGuiTextEditCallbackData_EventFlag_set(swigCPtr, this, value);
  }

  public int getEventFlag() {
    return jimguiJNI.ImGuiTextEditCallbackData_EventFlag_get(swigCPtr, this);
  }

  public void setFlags(int value) {
    jimguiJNI.ImGuiTextEditCallbackData_Flags_set(swigCPtr, this, value);
  }

  public int getFlags() {
    return jimguiJNI.ImGuiTextEditCallbackData_Flags_get(swigCPtr, this);
  }

  public void setUserData(SWIGTYPE_p_void value) {
    jimguiJNI.ImGuiTextEditCallbackData_UserData_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getUserData() {
    long cPtr = jimguiJNI.ImGuiTextEditCallbackData_UserData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setReadOnly(boolean value) {
    jimguiJNI.ImGuiTextEditCallbackData_ReadOnly_set(swigCPtr, this, value);
  }

  public boolean getReadOnly() {
    return jimguiJNI.ImGuiTextEditCallbackData_ReadOnly_get(swigCPtr, this);
  }

  public void setEventChar(int value) {
    jimguiJNI.ImGuiTextEditCallbackData_EventChar_set(swigCPtr, this, value);
  }

  public int getEventChar() {
    return jimguiJNI.ImGuiTextEditCallbackData_EventChar_get(swigCPtr, this);
  }

  public void setEventKey(int value) {
    jimguiJNI.ImGuiTextEditCallbackData_EventKey_set(swigCPtr, this, value);
  }

  public int getEventKey() {
    return jimguiJNI.ImGuiTextEditCallbackData_EventKey_get(swigCPtr, this);
  }

  public void setBuf(String value) {
    jimguiJNI.ImGuiTextEditCallbackData_Buf_set(swigCPtr, this, value);
  }

  public String getBuf() {
    return jimguiJNI.ImGuiTextEditCallbackData_Buf_get(swigCPtr, this);
  }

  public void setBufTextLen(int value) {
    jimguiJNI.ImGuiTextEditCallbackData_BufTextLen_set(swigCPtr, this, value);
  }

  public int getBufTextLen() {
    return jimguiJNI.ImGuiTextEditCallbackData_BufTextLen_get(swigCPtr, this);
  }

  public void setBufSize(int value) {
    jimguiJNI.ImGuiTextEditCallbackData_BufSize_set(swigCPtr, this, value);
  }

  public int getBufSize() {
    return jimguiJNI.ImGuiTextEditCallbackData_BufSize_get(swigCPtr, this);
  }

  public void setBufDirty(boolean value) {
    jimguiJNI.ImGuiTextEditCallbackData_BufDirty_set(swigCPtr, this, value);
  }

  public boolean getBufDirty() {
    return jimguiJNI.ImGuiTextEditCallbackData_BufDirty_get(swigCPtr, this);
  }

  public void setCursorPos(int value) {
    jimguiJNI.ImGuiTextEditCallbackData_CursorPos_set(swigCPtr, this, value);
  }

  public int getCursorPos() {
    return jimguiJNI.ImGuiTextEditCallbackData_CursorPos_get(swigCPtr, this);
  }

  public void setSelectionStart(int value) {
    jimguiJNI.ImGuiTextEditCallbackData_SelectionStart_set(swigCPtr, this, value);
  }

  public int getSelectionStart() {
    return jimguiJNI.ImGuiTextEditCallbackData_SelectionStart_get(swigCPtr, this);
  }

  public void setSelectionEnd(int value) {
    jimguiJNI.ImGuiTextEditCallbackData_SelectionEnd_set(swigCPtr, this, value);
  }

  public int getSelectionEnd() {
    return jimguiJNI.ImGuiTextEditCallbackData_SelectionEnd_get(swigCPtr, this);
  }

  public void DeleteChars(int pos, int bytes_count) {
    jimguiJNI.ImGuiTextEditCallbackData_DeleteChars(swigCPtr, this, pos, bytes_count);
  }

  public void InsertChars(int pos, String text, String text_end) {
    jimguiJNI.ImGuiTextEditCallbackData_InsertChars__SWIG_0(swigCPtr, this, pos, text, text_end);
  }

  public void InsertChars(int pos, String text) {
    jimguiJNI.ImGuiTextEditCallbackData_InsertChars__SWIG_1(swigCPtr, this, pos, text);
  }

  public boolean HasSelection() {
    return jimguiJNI.ImGuiTextEditCallbackData_HasSelection(swigCPtr, this);
  }

  public ImGuiTextEditCallbackData() {
    this(jimguiJNI.new_ImGuiTextEditCallbackData(), true);
  }

}