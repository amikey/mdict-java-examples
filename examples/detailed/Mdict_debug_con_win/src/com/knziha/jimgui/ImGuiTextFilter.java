/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.knziha.jimgui;

public class ImGuiTextFilter {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ImGuiTextFilter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImGuiTextFilter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jimguiJNI.delete_ImGuiTextFilter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class TextRange {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected TextRange(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(TextRange obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          jimguiJNI.delete_ImGuiTextFilter_TextRange(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setB(String value) {
      jimguiJNI.ImGuiTextFilter_TextRange_b_set(swigCPtr, this, value);
    }
  
    public String getB() {
      return jimguiJNI.ImGuiTextFilter_TextRange_b_get(swigCPtr, this);
    }
  
    public void setE(String value) {
      jimguiJNI.ImGuiTextFilter_TextRange_e_set(swigCPtr, this, value);
    }
  
    public String getE() {
      return jimguiJNI.ImGuiTextFilter_TextRange_e_get(swigCPtr, this);
    }
  
    public TextRange() {
      this(jimguiJNI.new_ImGuiTextFilter_TextRange__SWIG_0(), true);
    }
  
    public TextRange(String _b, String _e) {
      this(jimguiJNI.new_ImGuiTextFilter_TextRange__SWIG_1(_b, _e), true);
    }
  
    public String begin() {
      return jimguiJNI.ImGuiTextFilter_TextRange_begin(swigCPtr, this);
    }
  
    public String end() {
      return jimguiJNI.ImGuiTextFilter_TextRange_end(swigCPtr, this);
    }
  
    public boolean empty() {
      return jimguiJNI.ImGuiTextFilter_TextRange_empty(swigCPtr, this);
    }
  
    public char front() {
      return jimguiJNI.ImGuiTextFilter_TextRange_front(swigCPtr, this);
    }
  
    public static boolean is_blank(char c) {
      return jimguiJNI.ImGuiTextFilter_TextRange_is_blank(c);
    }
  
    public void trim_blanks() {
      jimguiJNI.ImGuiTextFilter_TextRange_trim_blanks(swigCPtr, this);
    }
  
    public void split(char separator, SWIGTYPE_p_ImVectorT_ImGuiTextFilter__TextRange_t out) {
      jimguiJNI.ImGuiTextFilter_TextRange_split(swigCPtr, this, separator, SWIGTYPE_p_ImVectorT_ImGuiTextFilter__TextRange_t.getCPtr(out));
    }
  
  }

  public void setInputBuf(String value) {
    jimguiJNI.ImGuiTextFilter_InputBuf_set(swigCPtr, this, value);
  }

  public String getInputBuf() {
    return jimguiJNI.ImGuiTextFilter_InputBuf_get(swigCPtr, this);
  }

  public void setFilters(SWIGTYPE_p_ImVectorT_ImGuiTextFilter__TextRange_t value) {
    jimguiJNI.ImGuiTextFilter_Filters_set(swigCPtr, this, SWIGTYPE_p_ImVectorT_ImGuiTextFilter__TextRange_t.getCPtr(value));
  }

  public SWIGTYPE_p_ImVectorT_ImGuiTextFilter__TextRange_t getFilters() {
    long cPtr = jimguiJNI.ImGuiTextFilter_Filters_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ImVectorT_ImGuiTextFilter__TextRange_t(cPtr, false);
  }

  public void setCountGrep(int value) {
    jimguiJNI.ImGuiTextFilter_CountGrep_set(swigCPtr, this, value);
  }

  public int getCountGrep() {
    return jimguiJNI.ImGuiTextFilter_CountGrep_get(swigCPtr, this);
  }

  public ImGuiTextFilter(String default_filter) {
    this(jimguiJNI.new_ImGuiTextFilter__SWIG_0(default_filter), true);
  }

  public ImGuiTextFilter() {
    this(jimguiJNI.new_ImGuiTextFilter__SWIG_1(), true);
  }

  public boolean Draw(String label, float width) {
    return jimguiJNI.ImGuiTextFilter_Draw__SWIG_0(swigCPtr, this, label, width);
  }

  public boolean Draw(String label) {
    return jimguiJNI.ImGuiTextFilter_Draw__SWIG_1(swigCPtr, this, label);
  }

  public boolean Draw() {
    return jimguiJNI.ImGuiTextFilter_Draw__SWIG_2(swigCPtr, this);
  }

  public boolean PassFilter(String text, String text_end) {
    return jimguiJNI.ImGuiTextFilter_PassFilter__SWIG_0(swigCPtr, this, text, text_end);
  }

  public boolean PassFilter(String text) {
    return jimguiJNI.ImGuiTextFilter_PassFilter__SWIG_1(swigCPtr, this, text);
  }

  public void Build() {
    jimguiJNI.ImGuiTextFilter_Build(swigCPtr, this);
  }

  public void Clear() {
    jimguiJNI.ImGuiTextFilter_Clear(swigCPtr, this);
  }

  public boolean IsActive() {
    return jimguiJNI.ImGuiTextFilter_IsActive(swigCPtr, this);
  }

}