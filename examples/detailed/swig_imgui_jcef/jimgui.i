
%module jimgui
 
%{
#include "imgui/imgui.h"
#include "CefBrowser_N.h"
#include "GLFW/lala.h"
#include <GLFW/glfw3.h>
#include "lolo.h"
#include <jawt.h>
#include <jawt_md.h>
#include <stdio.h>
#include <stdexcept>
#include <string.h>
#include "jni.h"

jobject rectangle;
jobject browser;
sub_window_info* browser_infomy;//结构体真好玩!

using namespace std;
extern JavaVM cached_jvm;
int hwndInt;
JNIEnv * JNU_GetEnv() {
	JNIEnv *env;
	jint rc = cached_jvm.GetEnv((void **)&env, JNI_VERSION_1_2);
	if (rc == JNI_EDETACHED)
	throw std::runtime_error("current thread not attached");
	if (rc == JNI_EVERSION)
	throw std::runtime_error("jni version not supported");
	return env;
}


int onSizeChangedmy(int x, int y) {
	//printf("\n%d,  %d",x,y);  printf被阻塞..
	//jawt_Rectangle refreshRegion;
	//refreshRegion.width = x;
	//refreshRegion.height = y;
	if(!hwndInt) return 0;

	Java_org_cef_browser_CefBrowser_1N_N_1UpdateUImy(NULL,NULL,hwndInt,getBrowser_info().x*x, getBrowser_info().y*y,
																		x-getBrowser_info().x*x, y-getBrowser_info().y*y);
						   
	//FILE *fp = fopen("F:\\llloooogggg.text", "a+");
	//fprintf(fp, "\n%d,  %d",x,y);
	//fflush(fp);
	//fclose(fp);
	return 0;
}
void SetBrowserInfo_(float x,
				float y,
				int margin_right,
				int margin_bottom){
	SetBrowserInfo(x,
					y,
					margin_right,
					margin_bottom);
}
sub_window_info getBrowser_info_(){
	return getBrowser_info();
}
int(*onSizeChanged)(int x, int y) = &onSizeChangedmy;//指针真好玩!
int GLFWwindow_xpos      ;
int GLFWwindow_ypos      ;
int GLFWwindow_fullWidth ;
int GLFWwindow_fullHeight;

extern int integer;
//extern int add(int a, int b);
//extern char* getString();
//extern void printLine(const char* str);
extern void printLine2(const char* str);
float myVal;
GLFWwindow* window;
extern int glfwWindowShouldClose(GLFWwindow* window);
ImVec4* clear_color;
extern void initGLFWindow(const char* title){
extern void initNewFrame();
extern void render();
extern void clear();
extern void doNothing();
static char buf[100] = "";

int* glfwGetFramebufferSize_(){
	int* size = (int*)malloc(sizeof(int)*2);
	glfwGetFramebufferSize(window,size, size+1);
	return size;
}
int* glfwGetWindowSizePos(){
	int* size = (int*)malloc(sizeof(int)*4);
	glfwGetWindowSize(window,size, size+1);
	glfwGetWindowPos(window,size+2,size+3);
	return size;
}
void glfwSetWindowSizePos(int x, int y, int width, int height){
	glfwSetWindowSize(window, width, height);
	glfwSetWindowPos(window, x, y);
}
void setHwnd(jobject browser){
	JNIEnv* env = JNU_GetEnv();
	while(!hwndInt)
		hwndInt = Java_org_cef_browser_CefBrowser_1N_N_1GetBrowserHWND_w(env,browser);
}

char * getSearchTerm(){
	return buf;
}

void putSearchBar(){
	ImGui::InputText("", buf, IM_ARRAYSIZE(buf));
}
	
	
void happyMonday(){
	//ShowWindow(*(HWND *)((char *)window + 832), SW_MAXIMIZE);
	//Java_org_cef_browser_CefBrowser_1N_N_1UpdateUI(NULL,NULL,NULL,NULL);
	//printf("happyMonday happyMonday happyMonday");
	//static char buf[32] = u8"NIHONGO"; // <- this is how you would write it with C++11, using real kanjis
	static char buf[100] = "";
	ImGui::InputText("", buf, IM_ARRAYSIZE(buf));
}

%}
///////////////////////////////////////////////////////SWIG  翻译时间/////////////////////////////////////////////////////////////////////////
%include "imgui/imgui.h"
%include "lolo.h"
extern void printLine2(const char* str);
float myVal;
GLFWwindow* window;
extern int glfwWindowShouldClose(GLFWwindow* window);
ImVec4* clear_color;
int GLFWwindow_xpos      ;
int GLFWwindow_ypos      ;
int GLFWwindow_fullWidth ;
int GLFWwindow_fullHeight;
extern void initGLFWindow(const char* title){
extern void initNewFrame();
extern void render();
extern void clear();
extern void doNothing();

int* glfwGetFramebufferSize_();
int* glfwGetWindowSizePos();
void glfwSetWindowSizePos(int x, int y, int width, int height);

jobject rectangle;
jobject browser;
void setHwnd(jobject browser);

//结构体可以这样写两遍,也可以像现在这写在外部 jcef/.h 中,然后包含 lolo.h
//struct sub_window_info{
//	float x;
//	float y;
//	int margin_right;
//	int margin_bottom;
//}browser_info;
void SetBrowserInfo_(float x,
				float y,
				int margin_right,
				int margin_bottom);
sub_window_info getBrowser_info_();

char * getSearchTerm();

void putSearchBar();

void happyMonday();