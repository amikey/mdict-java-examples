%module cpputils
%include "arrays_java.i";
%{
#include <GLFW/glfw3.h>
#include <jawt.h>
#include <jawt_md.h>
#include <stdexcept>
#include <string>
#include "jni.h"
using namespace std;
/**
* A stash area embedded in each allocation to hold java handles
*/
struct Jalloc {
jbyteArray jba;
jobject ref;
};
JavaVM cached_jvm;
JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *jvm, void *reserved) {
cached_jvm = *jvm;
return JNI_VERSION_1_2;
}
static JNIEnv * JNU_GetEnv() {
JNIEnv *env;
jint rc = cached_jvm.GetEnv((void **)&env, JNI_VERSION_1_2);
if (rc == JNI_EDETACHED)
throw std::runtime_error("current thread not attached");
if (rc == JNI_EVERSION)
throw std::runtime_error("jni version not supported");
return env;
}



int setCanvasHwnd_w(jobject canvas,GLFWwindow* window){
  JNIEnv* env = JNU_GetEnv();
  printf("env==NULL%d  \n", env==NULL);
  JAWT *awt = (JAWT *)malloc(sizeof(JAWT));
  JAWT_DrawingSurface* ds;
  JAWT_DrawingSurfaceInfo* dsi;
  JAWT_Win32DrawingSurfaceInfo* dsi_win;
  jboolean bGetAwt;
  jint lock;

  // Get the AWT.
  awt->version = JAWT_VERSION_1_4;
  bGetAwt = JAWT_GetAWT(env, awt);
  //assert(bGetAwt != JNI_FALSE);
  printf("bGetAwt != JNI_FALSE%d  \n", bGetAwt != false);

  // Get the drawing surface.//到这儿就执行不下去,窗口显示才可
  ds = awt->GetDrawingSurface(env, canvas);
  //assert(ds != NULL);
  printf("ds != NULL%d  \n", ds != NULL);
  
  // Lock the drawing surface.
  // May fail during shutdown.
  lock = ds->Lock(ds);
  if (lock & JAWT_LOCK_ERROR) {
    return 0;
  }

  // Get the drawing surface info.
  dsi = ds->GetDrawingSurfaceInfo(ds);
  if (dsi == NULL) {
    return 0;
  }

  HWND p_hwnd = *(HWND *)((char *)window + 832);//see GLFW/src/win32_window.c
  ShowWindow(p_hwnd, SW_MAXIMIZE);
  
  // Get the platform-specific drawing info.
  dsi_win = (JAWT_Win32DrawingSurfaceInfo*)dsi->platformInfo;
  //dsi_win->hwnd = (HWND)window;
  HWND before = dsi_win->hwnd;
  dsi_win->hwnd = p_hwnd;//没有用.
  
  //dsi_win->hwnd = glfwGetWin32Window(window);

  
  
  
  

  if(dsi_win->hwnd==before)
	return 111;
  return 110;


}

int stub_w(jobject canvas,GLFWwindow* window){
  JNIEnv* env = JNU_GetEnv();
  printf("env==NULL%d  \n", env==NULL);
  JAWT *awt = (JAWT *)malloc(sizeof(JAWT));
  JAWT_DrawingSurface* ds;
  JAWT_DrawingSurfaceInfo* dsi;
  JAWT_Win32DrawingSurfaceInfo* dsi_win;
  jboolean bGetAwt;
  jint lock;

  awt->version = JAWT_VERSION_1_4;
  bGetAwt = JAWT_GetAWT(env, awt);
  //assert(bGetAwt != JNI_FALSE);
  printf("bGetAwt != JNI_FALSE%d  \n", bGetAwt != false);

  // Get the drawing surface.//到这儿就执行不下去,窗口显示才可
  ds = awt->GetDrawingSurface(env, canvas);
  //assert(ds != NULL);
  printf("ds != NULL%d  \n", ds != NULL);
  
  lock = ds->Lock(ds);
  if (lock & JAWT_LOCK_ERROR) {
    return 0;
  }

  dsi = ds->GetDrawingSurfaceInfo(ds);
  if (dsi == NULL) {
    return 0;
  }

  // Get the platform-specific drawing info.
  dsi_win = (JAWT_Win32DrawingSurfaceInfo*)dsi->platformInfo;

	float myVal=0;
	wchar_t *buffer;
	wchar_t *buffer2;
	wchar_t *buffer3;
	// 全局变量: 
	HINSTANCE hInst;                                // 当前实例
	//WCHAR* szTitle = TEXT("控制台创建的窗口");                  // 标题栏文本
	//WCHAR* szWindowClass = TEXT("WindowClass");            // 主窗口类名


	ATOM                MyRegisterClass(HINSTANCE hInstance);
	BOOL                InitInstance(HINSTANCE, int);
	LRESULT CALLBACK    WndProc(HWND, UINT, WPARAM, LPARAM);
	
	
	
	string ti = "a1111111111";
	size_t size = 2;
	buffer = new wchar_t[size + 1];
	//MultiByteToWideChar(CP_OEMCP, MB_COMPOSITE, ti.c_str(), size, buffer, size * sizeof(wchar_t));
	MultiByteToWideChar(CP_OEMCP, 0, ti.c_str(), -1/*null terminated*/, buffer, size);
	buffer[size] = 0;  //确保以 '\0' 结尾 

	ti = "knziha";
	size = ti.length();
	buffer2 = new wchar_t[size + 1];
	MultiByteToWideChar(CP_ACP, MB_COMPOSITE, ti.c_str(), size, buffer2, size * sizeof(wchar_t));
	buffer2[size] = 0;  //确保以 '\0' 结尾 

	ti = "xx214234";
	size = ti.length();
	buffer3 = new wchar_t[size + 1];
	MultiByteToWideChar(CP_ACP, MB_COMPOSITE, ti.c_str(), size, buffer3, size * sizeof(wchar_t));
	buffer3[size] = 0;  //确保以 '\0' 结尾 
	
	HINSTANCE hInstance = ::GetModuleHandle(NULL);
	{
		WNDCLASSEXW wcX;

		wcX.cbSize = sizeof(WNDCLASSEX);

		wcX.style = CS_HREDRAW | CS_VREDRAW;
		wcX.lpfnWndProc = WndProc;
		wcX.cbClsExtra = 0;
		wcX.cbWndExtra = 0;
		wcX.hInstance = hInstance;
		wcX.hIcon = LoadIcon(hInstance, NULL);
		wcX.hCursor = LoadCursor(NULL, IDC_ARROW);
		wcX.lpszMenuName = NULL;
		wcX.hbrBackground = (HBRUSH)GetStockObject(WHITE_BRUSH);
		wcX.lpszClassName = buffer2;
		wcX.hIconSm = LoadIcon(wcX.hInstance, NULL);
	
		RegisterClassExW(&wcX);
	}

	WNDCLASSEXW wcX;

	wcX.cbSize = sizeof(WNDCLASSEX);

	wcX.style = CS_HREDRAW | CS_VREDRAW;
	wcX.lpfnWndProc = WndProc;
	wcX.cbClsExtra = 0;
	wcX.cbWndExtra = 0;
	wcX.hInstance = hInstance;
	wcX.hIcon = LoadIcon(hInstance, NULL);
	wcX.hCursor = LoadCursor(NULL, IDC_ARROW);
	wcX.hbrBackground = (HBRUSH)(COLOR_WINDOW + 1);
	wcX.lpszMenuName = NULL;
	wcX.lpszClassName = buffer3;
	wcX.hbrBackground = (HBRUSH)GetStockObject(WHITE_BRUSH);
	wcX.hIconSm = LoadIcon(wcX.hInstance, NULL);

    RegisterClassExW(&wcX);
	
	
	HWND h2 = CreateWindowW(buffer2, NULL, WS_CHILD | WS_BORDER, 2 * 100, 0, 100, 100, dsi_win->hwnd, NULL, hInstance, NULL);
	ShowWindow(h2, SW_NORMAL);
	UpdateWindow(h2);

	
	return 110;
}

int getGLHWND_w(GLFWwindow* window){
	//see GLFW/src/win32_window.c
	//ShowWindow(*(HWND *)((char *)window + 832), SW_MAXIMIZE);
	return (int)*(HWND *)((char *)window + 832);
}




//
//  函数: WndProc(HWND, UINT, WPARAM, LPARAM)
//
//  目的:    处理主窗口的消息。
//
//  WM_COMMAND  - 处理应用程序菜单
//  WM_PAINT    - 绘制主窗口
//  WM_DESTROY  - 发送退出消息并返回
//
//
LRESULT CALLBACK WndProc(HWND hWnd, UINT message, WPARAM wParam, LPARAM lParam)
{
	switch (message)
	{
	case WM_PAINT:
	{
		PAINTSTRUCT ps;
		HDC hdc = BeginPaint(hWnd, &ps);
		// TODO: 在此处添加使用 hdc 的任何绘图代码...
		EndPaint(hWnd, &ps);
	}
	break;
	case WM_DESTROY:
		PostQuitMessage(0);
		break;
	default:
		return DefWindowProc(hWnd, message, wParam, lParam);
	}
	return 0;
}

%}



int setCanvasHwnd_w(jobject canvas,GLFWwindow* window);
int stub_w(jobject canvas,GLFWwindow* window);
int getGLHWND_w(GLFWwindow* window);

%inline %{
int array[4];
void populate(int x[]) {
    int i;
    for (i=0; i<4; i++)
        x[i] = 100 + i;
}

bool booleanArray_getitem(bool *x, int index){
	return x[index];
}
int intArray_getitem(int *x, int index){
	return x[index];
}
%}