/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public class ImGuiIO {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ImGuiIO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImGuiIO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jimguiJNI.delete_ImGuiIO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setConfigFlags(int value) {
    jimguiJNI.ImGuiIO_ConfigFlags_set(swigCPtr, this, value);
  }

  public int getConfigFlags() {
    return jimguiJNI.ImGuiIO_ConfigFlags_get(swigCPtr, this);
  }

  public void setBackendFlags(int value) {
    jimguiJNI.ImGuiIO_BackendFlags_set(swigCPtr, this, value);
  }

  public int getBackendFlags() {
    return jimguiJNI.ImGuiIO_BackendFlags_get(swigCPtr, this);
  }

  public void setDisplaySize(ImVec2 value) {
    jimguiJNI.ImGuiIO_DisplaySize_set(swigCPtr, this, ImVec2.getCPtr(value), value);
  }

  public ImVec2 getDisplaySize() {
    long cPtr = jimguiJNI.ImGuiIO_DisplaySize_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImVec2(cPtr, false);
  }

  public void setDeltaTime(float value) {
    jimguiJNI.ImGuiIO_DeltaTime_set(swigCPtr, this, value);
  }

  public float getDeltaTime() {
    return jimguiJNI.ImGuiIO_DeltaTime_get(swigCPtr, this);
  }

  public void setIniSavingRate(float value) {
    jimguiJNI.ImGuiIO_IniSavingRate_set(swigCPtr, this, value);
  }

  public float getIniSavingRate() {
    return jimguiJNI.ImGuiIO_IniSavingRate_get(swigCPtr, this);
  }

  public void setIniFilename(String value) {
    jimguiJNI.ImGuiIO_IniFilename_set(swigCPtr, this, value);
  }

  public String getIniFilename() {
    return jimguiJNI.ImGuiIO_IniFilename_get(swigCPtr, this);
  }

  public void setLogFilename(String value) {
    jimguiJNI.ImGuiIO_LogFilename_set(swigCPtr, this, value);
  }

  public String getLogFilename() {
    return jimguiJNI.ImGuiIO_LogFilename_get(swigCPtr, this);
  }

  public void setMouseDoubleClickTime(float value) {
    jimguiJNI.ImGuiIO_MouseDoubleClickTime_set(swigCPtr, this, value);
  }

  public float getMouseDoubleClickTime() {
    return jimguiJNI.ImGuiIO_MouseDoubleClickTime_get(swigCPtr, this);
  }

  public void setMouseDoubleClickMaxDist(float value) {
    jimguiJNI.ImGuiIO_MouseDoubleClickMaxDist_set(swigCPtr, this, value);
  }

  public float getMouseDoubleClickMaxDist() {
    return jimguiJNI.ImGuiIO_MouseDoubleClickMaxDist_get(swigCPtr, this);
  }

  public void setMouseDragThreshold(float value) {
    jimguiJNI.ImGuiIO_MouseDragThreshold_set(swigCPtr, this, value);
  }

  public float getMouseDragThreshold() {
    return jimguiJNI.ImGuiIO_MouseDragThreshold_get(swigCPtr, this);
  }

  public void setKeyMap(SWIGTYPE_p_int value) {
    jimguiJNI.ImGuiIO_KeyMap_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getKeyMap() {
    long cPtr = jimguiJNI.ImGuiIO_KeyMap_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void setKeyRepeatDelay(float value) {
    jimguiJNI.ImGuiIO_KeyRepeatDelay_set(swigCPtr, this, value);
  }

  public float getKeyRepeatDelay() {
    return jimguiJNI.ImGuiIO_KeyRepeatDelay_get(swigCPtr, this);
  }

  public void setKeyRepeatRate(float value) {
    jimguiJNI.ImGuiIO_KeyRepeatRate_set(swigCPtr, this, value);
  }

  public float getKeyRepeatRate() {
    return jimguiJNI.ImGuiIO_KeyRepeatRate_get(swigCPtr, this);
  }

  public void setUserData(SWIGTYPE_p_void value) {
    jimguiJNI.ImGuiIO_UserData_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getUserData() {
    long cPtr = jimguiJNI.ImGuiIO_UserData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setFonts(ImFontAtlas value) {
    jimguiJNI.ImGuiIO_Fonts_set(swigCPtr, this, ImFontAtlas.getCPtr(value), value);
  }

  public ImFontAtlas getFonts() {
    long cPtr = jimguiJNI.ImGuiIO_Fonts_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImFontAtlas(cPtr, false);
  }

  public void setFontGlobalScale(float value) {
    jimguiJNI.ImGuiIO_FontGlobalScale_set(swigCPtr, this, value);
  }

  public float getFontGlobalScale() {
    return jimguiJNI.ImGuiIO_FontGlobalScale_get(swigCPtr, this);
  }

  public void setFontAllowUserScaling(boolean value) {
    jimguiJNI.ImGuiIO_FontAllowUserScaling_set(swigCPtr, this, value);
  }

  public boolean getFontAllowUserScaling() {
    return jimguiJNI.ImGuiIO_FontAllowUserScaling_get(swigCPtr, this);
  }

  public void setFontDefault(ImFont value) {
    jimguiJNI.ImGuiIO_FontDefault_set(swigCPtr, this, ImFont.getCPtr(value), value);
  }

  public ImFont getFontDefault() {
    long cPtr = jimguiJNI.ImGuiIO_FontDefault_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImFont(cPtr, false);
  }

  public void setDisplayFramebufferScale(ImVec2 value) {
    jimguiJNI.ImGuiIO_DisplayFramebufferScale_set(swigCPtr, this, ImVec2.getCPtr(value), value);
  }

  public ImVec2 getDisplayFramebufferScale() {
    long cPtr = jimguiJNI.ImGuiIO_DisplayFramebufferScale_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImVec2(cPtr, false);
  }

  public void setDisplayVisibleMin(ImVec2 value) {
    jimguiJNI.ImGuiIO_DisplayVisibleMin_set(swigCPtr, this, ImVec2.getCPtr(value), value);
  }

  public ImVec2 getDisplayVisibleMin() {
    long cPtr = jimguiJNI.ImGuiIO_DisplayVisibleMin_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImVec2(cPtr, false);
  }

  public void setDisplayVisibleMax(ImVec2 value) {
    jimguiJNI.ImGuiIO_DisplayVisibleMax_set(swigCPtr, this, ImVec2.getCPtr(value), value);
  }

  public ImVec2 getDisplayVisibleMax() {
    long cPtr = jimguiJNI.ImGuiIO_DisplayVisibleMax_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImVec2(cPtr, false);
  }

  public void setOptMacOSXBehaviors(boolean value) {
    jimguiJNI.ImGuiIO_OptMacOSXBehaviors_set(swigCPtr, this, value);
  }

  public boolean getOptMacOSXBehaviors() {
    return jimguiJNI.ImGuiIO_OptMacOSXBehaviors_get(swigCPtr, this);
  }

  public void setOptCursorBlink(boolean value) {
    jimguiJNI.ImGuiIO_OptCursorBlink_set(swigCPtr, this, value);
  }

  public boolean getOptCursorBlink() {
    return jimguiJNI.ImGuiIO_OptCursorBlink_get(swigCPtr, this);
  }

  public void setOptResizeWindowsFromEdges(boolean value) {
    jimguiJNI.ImGuiIO_OptResizeWindowsFromEdges_set(swigCPtr, this, value);
  }

  public boolean getOptResizeWindowsFromEdges() {
    return jimguiJNI.ImGuiIO_OptResizeWindowsFromEdges_get(swigCPtr, this);
  }

  public void setGetClipboardTextFn(SWIGTYPE_p_f_p_void__p_char value) {
    jimguiJNI.ImGuiIO_GetClipboardTextFn_set(swigCPtr, this, SWIGTYPE_p_f_p_void__p_char.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void__p_char getGetClipboardTextFn() {
    long cPtr = jimguiJNI.ImGuiIO_GetClipboardTextFn_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void__p_char(cPtr, false);
  }

  public void setSetClipboardTextFn(SWIGTYPE_p_f_p_void_p_q_const__char__void value) {
    jimguiJNI.ImGuiIO_SetClipboardTextFn_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_q_const__char__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_q_const__char__void getSetClipboardTextFn() {
    long cPtr = jimguiJNI.ImGuiIO_SetClipboardTextFn_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_q_const__char__void(cPtr, false);
  }

  public void setClipboardUserData(SWIGTYPE_p_void value) {
    jimguiJNI.ImGuiIO_ClipboardUserData_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getClipboardUserData() {
    long cPtr = jimguiJNI.ImGuiIO_ClipboardUserData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setImeSetInputScreenPosFn(SWIGTYPE_p_f_int_int__void value) {
    jimguiJNI.ImGuiIO_ImeSetInputScreenPosFn_set(swigCPtr, this, SWIGTYPE_p_f_int_int__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_int_int__void getImeSetInputScreenPosFn() {
    long cPtr = jimguiJNI.ImGuiIO_ImeSetInputScreenPosFn_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_int_int__void(cPtr, false);
  }

  public void setImeWindowHandle(SWIGTYPE_p_void value) {
    jimguiJNI.ImGuiIO_ImeWindowHandle_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getImeWindowHandle() {
    long cPtr = jimguiJNI.ImGuiIO_ImeWindowHandle_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setRenderDrawListsFn(SWIGTYPE_p_f_p_ImDrawData__void value) {
    jimguiJNI.ImGuiIO_RenderDrawListsFn_set(swigCPtr, this, SWIGTYPE_p_f_p_ImDrawData__void.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_ImDrawData__void getRenderDrawListsFn() {
    long cPtr = jimguiJNI.ImGuiIO_RenderDrawListsFn_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_ImDrawData__void(cPtr, false);
  }

  public void setMousePos(ImVec2 value) {
    jimguiJNI.ImGuiIO_MousePos_set(swigCPtr, this, ImVec2.getCPtr(value), value);
  }

  public ImVec2 getMousePos() {
    long cPtr = jimguiJNI.ImGuiIO_MousePos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImVec2(cPtr, false);
  }

  public void setMouseDown(SWIGTYPE_p_bool value) {
    jimguiJNI.ImGuiIO_MouseDown_set(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(value));
  }

  public SWIGTYPE_p_bool getMouseDown() {
    long cPtr = jimguiJNI.ImGuiIO_MouseDown_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool(cPtr, false);
  }

  public void setMouseWheel(float value) {
    jimguiJNI.ImGuiIO_MouseWheel_set(swigCPtr, this, value);
  }

  public float getMouseWheel() {
    return jimguiJNI.ImGuiIO_MouseWheel_get(swigCPtr, this);
  }

  public void setMouseWheelH(float value) {
    jimguiJNI.ImGuiIO_MouseWheelH_set(swigCPtr, this, value);
  }

  public float getMouseWheelH() {
    return jimguiJNI.ImGuiIO_MouseWheelH_get(swigCPtr, this);
  }

  public void setMouseDrawCursor(boolean value) {
    jimguiJNI.ImGuiIO_MouseDrawCursor_set(swigCPtr, this, value);
  }

  public boolean getMouseDrawCursor() {
    return jimguiJNI.ImGuiIO_MouseDrawCursor_get(swigCPtr, this);
  }

  public void setKeyCtrl(boolean value) {
    jimguiJNI.ImGuiIO_KeyCtrl_set(swigCPtr, this, value);
  }

  public boolean getKeyCtrl() {
    return jimguiJNI.ImGuiIO_KeyCtrl_get(swigCPtr, this);
  }

  public void setKeyShift(boolean value) {
    jimguiJNI.ImGuiIO_KeyShift_set(swigCPtr, this, value);
  }

  public boolean getKeyShift() {
    return jimguiJNI.ImGuiIO_KeyShift_get(swigCPtr, this);
  }

  public void setKeyAlt(boolean value) {
    jimguiJNI.ImGuiIO_KeyAlt_set(swigCPtr, this, value);
  }

  public boolean getKeyAlt() {
    return jimguiJNI.ImGuiIO_KeyAlt_get(swigCPtr, this);
  }

  public void setKeySuper(boolean value) {
    jimguiJNI.ImGuiIO_KeySuper_set(swigCPtr, this, value);
  }

  public boolean getKeySuper() {
    return jimguiJNI.ImGuiIO_KeySuper_get(swigCPtr, this);
  }

  public void setKeysDown(SWIGTYPE_p_bool value) {
    jimguiJNI.ImGuiIO_KeysDown_set(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(value));
  }

  public SWIGTYPE_p_bool getKeysDown() {
    long cPtr = jimguiJNI.ImGuiIO_KeysDown_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool(cPtr, false);
  }

  public void setInputCharacters(SWIGTYPE_p_unsigned_short value) {
    jimguiJNI.ImGuiIO_InputCharacters_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_short getInputCharacters() {
    long cPtr = jimguiJNI.ImGuiIO_InputCharacters_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
  }

  public void setNavInputs(SWIGTYPE_p_float value) {
    jimguiJNI.ImGuiIO_NavInputs_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getNavInputs() {
    long cPtr = jimguiJNI.ImGuiIO_NavInputs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void AddInputCharacter(int c) {
    jimguiJNI.ImGuiIO_AddInputCharacter(swigCPtr, this, c);
  }

  public void AddInputCharactersUTF8(String utf8_chars) {
    jimguiJNI.ImGuiIO_AddInputCharactersUTF8(swigCPtr, this, utf8_chars);
  }

  public void ClearInputCharacters() {
    jimguiJNI.ImGuiIO_ClearInputCharacters(swigCPtr, this);
  }

  public void setWantCaptureMouse(boolean value) {
    jimguiJNI.ImGuiIO_WantCaptureMouse_set(swigCPtr, this, value);
  }

  public boolean getWantCaptureMouse() {
    return jimguiJNI.ImGuiIO_WantCaptureMouse_get(swigCPtr, this);
  }

  public void setWantCaptureKeyboard(boolean value) {
    jimguiJNI.ImGuiIO_WantCaptureKeyboard_set(swigCPtr, this, value);
  }

  public boolean getWantCaptureKeyboard() {
    return jimguiJNI.ImGuiIO_WantCaptureKeyboard_get(swigCPtr, this);
  }

  public void setWantTextInput(boolean value) {
    jimguiJNI.ImGuiIO_WantTextInput_set(swigCPtr, this, value);
  }

  public boolean getWantTextInput() {
    return jimguiJNI.ImGuiIO_WantTextInput_get(swigCPtr, this);
  }

  public void setWantSetMousePos(boolean value) {
    jimguiJNI.ImGuiIO_WantSetMousePos_set(swigCPtr, this, value);
  }

  public boolean getWantSetMousePos() {
    return jimguiJNI.ImGuiIO_WantSetMousePos_get(swigCPtr, this);
  }

  public void setWantSaveIniSettings(boolean value) {
    jimguiJNI.ImGuiIO_WantSaveIniSettings_set(swigCPtr, this, value);
  }

  public boolean getWantSaveIniSettings() {
    return jimguiJNI.ImGuiIO_WantSaveIniSettings_get(swigCPtr, this);
  }

  public void setNavActive(boolean value) {
    jimguiJNI.ImGuiIO_NavActive_set(swigCPtr, this, value);
  }

  public boolean getNavActive() {
    return jimguiJNI.ImGuiIO_NavActive_get(swigCPtr, this);
  }

  public void setNavVisible(boolean value) {
    jimguiJNI.ImGuiIO_NavVisible_set(swigCPtr, this, value);
  }

  public boolean getNavVisible() {
    return jimguiJNI.ImGuiIO_NavVisible_get(swigCPtr, this);
  }

  public void setFramerate(float value) {
    jimguiJNI.ImGuiIO_Framerate_set(swigCPtr, this, value);
  }

  public float getFramerate() {
    return jimguiJNI.ImGuiIO_Framerate_get(swigCPtr, this);
  }

  public void setMetricsRenderVertices(int value) {
    jimguiJNI.ImGuiIO_MetricsRenderVertices_set(swigCPtr, this, value);
  }

  public int getMetricsRenderVertices() {
    return jimguiJNI.ImGuiIO_MetricsRenderVertices_get(swigCPtr, this);
  }

  public void setMetricsRenderIndices(int value) {
    jimguiJNI.ImGuiIO_MetricsRenderIndices_set(swigCPtr, this, value);
  }

  public int getMetricsRenderIndices() {
    return jimguiJNI.ImGuiIO_MetricsRenderIndices_get(swigCPtr, this);
  }

  public void setMetricsActiveWindows(int value) {
    jimguiJNI.ImGuiIO_MetricsActiveWindows_set(swigCPtr, this, value);
  }

  public int getMetricsActiveWindows() {
    return jimguiJNI.ImGuiIO_MetricsActiveWindows_get(swigCPtr, this);
  }

  public void setMouseDelta(ImVec2 value) {
    jimguiJNI.ImGuiIO_MouseDelta_set(swigCPtr, this, ImVec2.getCPtr(value), value);
  }

  public ImVec2 getMouseDelta() {
    long cPtr = jimguiJNI.ImGuiIO_MouseDelta_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImVec2(cPtr, false);
  }

  public void setMousePosPrev(ImVec2 value) {
    jimguiJNI.ImGuiIO_MousePosPrev_set(swigCPtr, this, ImVec2.getCPtr(value), value);
  }

  public ImVec2 getMousePosPrev() {
    long cPtr = jimguiJNI.ImGuiIO_MousePosPrev_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImVec2(cPtr, false);
  }

  public void setMouseClickedPos(ImVec2 value) {
    jimguiJNI.ImGuiIO_MouseClickedPos_set(swigCPtr, this, ImVec2.getCPtr(value), value);
  }

  public ImVec2 getMouseClickedPos() {
    long cPtr = jimguiJNI.ImGuiIO_MouseClickedPos_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImVec2(cPtr, false);
  }

  public void setMouseClickedTime(SWIGTYPE_p_float value) {
    jimguiJNI.ImGuiIO_MouseClickedTime_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getMouseClickedTime() {
    long cPtr = jimguiJNI.ImGuiIO_MouseClickedTime_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setMouseClicked(SWIGTYPE_p_bool value) {
    jimguiJNI.ImGuiIO_MouseClicked_set(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(value));
  }

  public SWIGTYPE_p_bool getMouseClicked() {
    long cPtr = jimguiJNI.ImGuiIO_MouseClicked_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool(cPtr, false);
  }

  public void setMouseDoubleClicked(SWIGTYPE_p_bool value) {
    jimguiJNI.ImGuiIO_MouseDoubleClicked_set(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(value));
  }

  public SWIGTYPE_p_bool getMouseDoubleClicked() {
    long cPtr = jimguiJNI.ImGuiIO_MouseDoubleClicked_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool(cPtr, false);
  }

  public void setMouseReleased(SWIGTYPE_p_bool value) {
    jimguiJNI.ImGuiIO_MouseReleased_set(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(value));
  }

  public SWIGTYPE_p_bool getMouseReleased() {
    long cPtr = jimguiJNI.ImGuiIO_MouseReleased_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool(cPtr, false);
  }

  public void setMouseDownOwned(SWIGTYPE_p_bool value) {
    jimguiJNI.ImGuiIO_MouseDownOwned_set(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(value));
  }

  public SWIGTYPE_p_bool getMouseDownOwned() {
    long cPtr = jimguiJNI.ImGuiIO_MouseDownOwned_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool(cPtr, false);
  }

  public void setMouseDownDuration(SWIGTYPE_p_float value) {
    jimguiJNI.ImGuiIO_MouseDownDuration_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getMouseDownDuration() {
    long cPtr = jimguiJNI.ImGuiIO_MouseDownDuration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setMouseDownDurationPrev(SWIGTYPE_p_float value) {
    jimguiJNI.ImGuiIO_MouseDownDurationPrev_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getMouseDownDurationPrev() {
    long cPtr = jimguiJNI.ImGuiIO_MouseDownDurationPrev_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setMouseDragMaxDistanceAbs(ImVec2 value) {
    jimguiJNI.ImGuiIO_MouseDragMaxDistanceAbs_set(swigCPtr, this, ImVec2.getCPtr(value), value);
  }

  public ImVec2 getMouseDragMaxDistanceAbs() {
    long cPtr = jimguiJNI.ImGuiIO_MouseDragMaxDistanceAbs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImVec2(cPtr, false);
  }

  public void setMouseDragMaxDistanceSqr(SWIGTYPE_p_float value) {
    jimguiJNI.ImGuiIO_MouseDragMaxDistanceSqr_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getMouseDragMaxDistanceSqr() {
    long cPtr = jimguiJNI.ImGuiIO_MouseDragMaxDistanceSqr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setKeysDownDuration(SWIGTYPE_p_float value) {
    jimguiJNI.ImGuiIO_KeysDownDuration_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getKeysDownDuration() {
    long cPtr = jimguiJNI.ImGuiIO_KeysDownDuration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setKeysDownDurationPrev(SWIGTYPE_p_float value) {
    jimguiJNI.ImGuiIO_KeysDownDurationPrev_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getKeysDownDurationPrev() {
    long cPtr = jimguiJNI.ImGuiIO_KeysDownDurationPrev_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setNavInputsDownDuration(SWIGTYPE_p_float value) {
    jimguiJNI.ImGuiIO_NavInputsDownDuration_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getNavInputsDownDuration() {
    long cPtr = jimguiJNI.ImGuiIO_NavInputsDownDuration_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setNavInputsDownDurationPrev(SWIGTYPE_p_float value) {
    jimguiJNI.ImGuiIO_NavInputsDownDurationPrev_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getNavInputsDownDurationPrev() {
    long cPtr = jimguiJNI.ImGuiIO_NavInputsDownDurationPrev_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public ImGuiIO() {
    this(jimguiJNI.new_ImGuiIO(), true);
  }

}
