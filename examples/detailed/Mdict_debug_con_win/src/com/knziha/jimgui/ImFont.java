/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public class ImFont {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ImFont(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImFont obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jimguiJNI.delete_ImFont(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFontSize(float value) {
    jimguiJNI.ImFont_FontSize_set(swigCPtr, this, value);
  }

  public float getFontSize() {
    return jimguiJNI.ImFont_FontSize_get(swigCPtr, this);
  }

  public void setScale(float value) {
    jimguiJNI.ImFont_Scale_set(swigCPtr, this, value);
  }

  public float getScale() {
    return jimguiJNI.ImFont_Scale_get(swigCPtr, this);
  }

  public void setDisplayOffset(ImVec2 value) {
    jimguiJNI.ImFont_DisplayOffset_set(swigCPtr, this, ImVec2.getCPtr(value), value);
  }

  public ImVec2 getDisplayOffset() {
    long cPtr = jimguiJNI.ImFont_DisplayOffset_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImVec2(cPtr, false);
  }

  public void setGlyphs(SWIGTYPE_p_ImVectorT_ImFontGlyph_t value) {
    jimguiJNI.ImFont_Glyphs_set(swigCPtr, this, SWIGTYPE_p_ImVectorT_ImFontGlyph_t.getCPtr(value));
  }

  public SWIGTYPE_p_ImVectorT_ImFontGlyph_t getGlyphs() {
    long cPtr = jimguiJNI.ImFont_Glyphs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ImVectorT_ImFontGlyph_t(cPtr, false);
  }

  public void setIndexAdvanceX(SWIGTYPE_p_ImVectorT_float_t value) {
    jimguiJNI.ImFont_IndexAdvanceX_set(swigCPtr, this, SWIGTYPE_p_ImVectorT_float_t.getCPtr(value));
  }

  public SWIGTYPE_p_ImVectorT_float_t getIndexAdvanceX() {
    long cPtr = jimguiJNI.ImFont_IndexAdvanceX_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ImVectorT_float_t(cPtr, false);
  }

  public void setIndexLookup(SWIGTYPE_p_ImVectorT_unsigned_short_t value) {
    jimguiJNI.ImFont_IndexLookup_set(swigCPtr, this, SWIGTYPE_p_ImVectorT_unsigned_short_t.getCPtr(value));
  }

  public SWIGTYPE_p_ImVectorT_unsigned_short_t getIndexLookup() {
    long cPtr = jimguiJNI.ImFont_IndexLookup_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ImVectorT_unsigned_short_t(cPtr, false);
  }

  public void setFallbackGlyph(ImFontGlyph value) {
    jimguiJNI.ImFont_FallbackGlyph_set(swigCPtr, this, ImFontGlyph.getCPtr(value), value);
  }

  public ImFontGlyph getFallbackGlyph() {
    long cPtr = jimguiJNI.ImFont_FallbackGlyph_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImFontGlyph(cPtr, false);
  }

  public void setFallbackAdvanceX(float value) {
    jimguiJNI.ImFont_FallbackAdvanceX_set(swigCPtr, this, value);
  }

  public float getFallbackAdvanceX() {
    return jimguiJNI.ImFont_FallbackAdvanceX_get(swigCPtr, this);
  }

  public void setFallbackChar(int value) {
    jimguiJNI.ImFont_FallbackChar_set(swigCPtr, this, value);
  }

  public int getFallbackChar() {
    return jimguiJNI.ImFont_FallbackChar_get(swigCPtr, this);
  }

  public void setConfigDataCount(short value) {
    jimguiJNI.ImFont_ConfigDataCount_set(swigCPtr, this, value);
  }

  public short getConfigDataCount() {
    return jimguiJNI.ImFont_ConfigDataCount_get(swigCPtr, this);
  }

  public void setConfigData(ImFontConfig value) {
    jimguiJNI.ImFont_ConfigData_set(swigCPtr, this, ImFontConfig.getCPtr(value), value);
  }

  public ImFontConfig getConfigData() {
    long cPtr = jimguiJNI.ImFont_ConfigData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImFontConfig(cPtr, false);
  }

  public void setContainerAtlas(ImFontAtlas value) {
    jimguiJNI.ImFont_ContainerAtlas_set(swigCPtr, this, ImFontAtlas.getCPtr(value), value);
  }

  public ImFontAtlas getContainerAtlas() {
    long cPtr = jimguiJNI.ImFont_ContainerAtlas_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImFontAtlas(cPtr, false);
  }

  public void setAscent(float value) {
    jimguiJNI.ImFont_Ascent_set(swigCPtr, this, value);
  }

  public float getAscent() {
    return jimguiJNI.ImFont_Ascent_get(swigCPtr, this);
  }

  public void setDescent(float value) {
    jimguiJNI.ImFont_Descent_set(swigCPtr, this, value);
  }

  public float getDescent() {
    return jimguiJNI.ImFont_Descent_get(swigCPtr, this);
  }

  public void setDirtyLookupTables(boolean value) {
    jimguiJNI.ImFont_DirtyLookupTables_set(swigCPtr, this, value);
  }

  public boolean getDirtyLookupTables() {
    return jimguiJNI.ImFont_DirtyLookupTables_get(swigCPtr, this);
  }

  public void setMetricsTotalSurface(int value) {
    jimguiJNI.ImFont_MetricsTotalSurface_set(swigCPtr, this, value);
  }

  public int getMetricsTotalSurface() {
    return jimguiJNI.ImFont_MetricsTotalSurface_get(swigCPtr, this);
  }

  public ImFont() {
    this(jimguiJNI.new_ImFont(), true);
  }

  public void ClearOutputData() {
    jimguiJNI.ImFont_ClearOutputData(swigCPtr, this);
  }

  public void BuildLookupTable() {
    jimguiJNI.ImFont_BuildLookupTable(swigCPtr, this);
  }

  public ImFontGlyph FindGlyph(int c) {
    long cPtr = jimguiJNI.ImFont_FindGlyph(swigCPtr, this, c);
    return (cPtr == 0) ? null : new ImFontGlyph(cPtr, false);
  }

  public ImFontGlyph FindGlyphNoFallback(int c) {
    long cPtr = jimguiJNI.ImFont_FindGlyphNoFallback(swigCPtr, this, c);
    return (cPtr == 0) ? null : new ImFontGlyph(cPtr, false);
  }

  public void SetFallbackChar(int c) {
    jimguiJNI.ImFont_SetFallbackChar(swigCPtr, this, c);
  }

  public float GetCharAdvance(int c) {
    return jimguiJNI.ImFont_GetCharAdvance(swigCPtr, this, c);
  }

  public boolean IsLoaded() {
    return jimguiJNI.ImFont_IsLoaded(swigCPtr, this);
  }

  public String GetDebugName() {
    return jimguiJNI.ImFont_GetDebugName(swigCPtr, this);
  }

  public ImVec2 CalcTextSizeA(float size, float max_width, float wrap_width, String text_begin, String text_end, SWIGTYPE_p_p_char remaining) {
    return new ImVec2(jimguiJNI.ImFont_CalcTextSizeA__SWIG_0(swigCPtr, this, size, max_width, wrap_width, text_begin, text_end, SWIGTYPE_p_p_char.getCPtr(remaining)), true);
  }

  public ImVec2 CalcTextSizeA(float size, float max_width, float wrap_width, String text_begin, String text_end) {
    return new ImVec2(jimguiJNI.ImFont_CalcTextSizeA__SWIG_1(swigCPtr, this, size, max_width, wrap_width, text_begin, text_end), true);
  }

  public ImVec2 CalcTextSizeA(float size, float max_width, float wrap_width, String text_begin) {
    return new ImVec2(jimguiJNI.ImFont_CalcTextSizeA__SWIG_2(swigCPtr, this, size, max_width, wrap_width, text_begin), true);
  }

  public String CalcWordWrapPositionA(float scale, String text, String text_end, float wrap_width) {
    return jimguiJNI.ImFont_CalcWordWrapPositionA(swigCPtr, this, scale, text, text_end, wrap_width);
  }

  public void RenderChar(ImDrawList draw_list, float size, ImVec2 pos, long col, int c) {
    jimguiJNI.ImFont_RenderChar(swigCPtr, this, ImDrawList.getCPtr(draw_list), draw_list, size, ImVec2.getCPtr(pos), pos, col, c);
  }

  public void RenderText(ImDrawList draw_list, float size, ImVec2 pos, long col, ImVec4 clip_rect, String text_begin, String text_end, float wrap_width, boolean cpu_fine_clip) {
    jimguiJNI.ImFont_RenderText__SWIG_0(swigCPtr, this, ImDrawList.getCPtr(draw_list), draw_list, size, ImVec2.getCPtr(pos), pos, col, ImVec4.getCPtr(clip_rect), clip_rect, text_begin, text_end, wrap_width, cpu_fine_clip);
  }

  public void RenderText(ImDrawList draw_list, float size, ImVec2 pos, long col, ImVec4 clip_rect, String text_begin, String text_end, float wrap_width) {
    jimguiJNI.ImFont_RenderText__SWIG_1(swigCPtr, this, ImDrawList.getCPtr(draw_list), draw_list, size, ImVec2.getCPtr(pos), pos, col, ImVec4.getCPtr(clip_rect), clip_rect, text_begin, text_end, wrap_width);
  }

  public void RenderText(ImDrawList draw_list, float size, ImVec2 pos, long col, ImVec4 clip_rect, String text_begin, String text_end) {
    jimguiJNI.ImFont_RenderText__SWIG_2(swigCPtr, this, ImDrawList.getCPtr(draw_list), draw_list, size, ImVec2.getCPtr(pos), pos, col, ImVec4.getCPtr(clip_rect), clip_rect, text_begin, text_end);
  }

  public void GrowIndex(int new_size) {
    jimguiJNI.ImFont_GrowIndex(swigCPtr, this, new_size);
  }

  public void AddGlyph(int c, float x0, float y0, float x1, float y1, float u0, float v0, float u1, float v1, float advance_x) {
    jimguiJNI.ImFont_AddGlyph(swigCPtr, this, c, x0, y0, x1, y1, u0, v0, u1, v1, advance_x);
  }

  public void AddRemapChar(int dst, int src, boolean overwrite_dst) {
    jimguiJNI.ImFont_AddRemapChar__SWIG_0(swigCPtr, this, dst, src, overwrite_dst);
  }

  public void AddRemapChar(int dst, int src) {
    jimguiJNI.ImFont_AddRemapChar__SWIG_1(swigCPtr, this, dst, src);
  }

}
