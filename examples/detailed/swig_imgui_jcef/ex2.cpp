#include <GL/glew.h>
#include "imgui.h"
#include "imgui_impl_glfw.h"
#include "imgui_impl_opengl2.h"
#include <GLFW/glfw3.h>
#include <stdio.h>

extern GLFWwindow* window;
extern ImVec4* clear_color;

extern int GLFWwindow_xpos      ;
extern int GLFWwindow_ypos      ;
extern int GLFWwindow_fullWidth ;
extern int GLFWwindow_fullHeight;

extern float myVal;

int lastTime = 0;

void printLine2(const char* str){

		if (!glfwInit()){
			printf("glfwInit failed");
			return;
		}
		
	    GLFWwindow* window = glfwCreateWindow(1280, 720, "ImGui GLFW+OpenGL2 example", NULL, NULL);
		
		if (!window)
		{
			printf("window creation failed");
			glfwTerminate();
			return;
		}
		
		/* 设置当前的窗口上下文 */
		glfwMakeContextCurrent(window);
		glfwSwapInterval(1); // Enable vsync
		
		
		
		IMGUI_CHECKVERSION();
		ImGui::CreateContext();
		//ImGuiIO& io = ImGui::GetIO(); (void)io;
		
		ImGui_ImplGlfw_InitForOpenGL(window, true);
		ImGui_ImplOpenGL2_Init();
		
		if(!clear_color) clear_color = new ImVec4(0.45f, 0.55f, 0.60f, 1.00f);

		int count=0;
		/* Main Looop */
		while (!glfwWindowShouldClose(window))
		{
			ImGui_ImplOpenGL2_NewFrame();
			ImGui_ImplGlfw_NewFrame();
			ImGui::NewFrame();
			
			

			int display_w, display_h;
			glfwGetFramebufferSize(window, &display_w, &display_h);
			glViewport(display_h, 0, display_w, display_h);
			glClearColor(clear_color->x, clear_color->y, clear_color->z, clear_color->w);
			glClear(GL_COLOR_BUFFER_BIT);
						/* Draw a triangle */

									glBegin(GL_TRIANGLES);

			glColor3f(myVal+1.0, 0.0, 0.0);    // Red
			glVertex3f(myVal+0.0, 1.0, 0.0);

			glColor3f(myVal+0.0, 1.0, 0.0);    // Green
			glVertex3f(myVal-1.0, -1.0, 0.0);

			glColor3f(myVal+0.0, 0.0, 1.0);    // Blue
			glVertex3f(myVal+1.0, -1.0, 0.0);

			glEnd();
			
			ImGui::Text("haha%d",count++);
			ImGui::DragFloat("asd",&myVal,0.001f);
			// Rendering
			ImGui::Render();
			ImGui_ImplOpenGL2_RenderDrawData(ImGui::GetDrawData());

			/* 交换缓冲区，即在window上更新内容 */
			glfwSwapBuffers(window);
			/* 轮询事件 */
			glfwPollEvents();
		}

		// Cleanup
		ImGui_ImplOpenGL2_Shutdown();
		ImGui_ImplGlfw_Shutdown();
		ImGui::DestroyContext();

		glfwDestroyWindow(window);
		glfwTerminate();
        printf("22%s\n", str);
}

//xxx
void initGLFWindow(const char* title){
	//forward to glfw/win32_window.c->CreateWindowExW
	//GLFWwindow_xpos       = 0;
	//GLFWwindow_ypos       = 0;
	//GLFWwindow_fullWidth  = 1024;
	//GLFWwindow_fullHeight = 768;
	
	if (!glfwInit()){
		printf("glfwInit failed");
		return;
	}
	
	window = glfwCreateWindow(1280, 720, "ImGui GLFW+OpenGL2 example", NULL, NULL);
	
	if (!window)
	{
		printf("window creation failed");
		glfwTerminate();
		return;
	}
	
	/* 设置当前的窗口上下文 */
	glfwMakeContextCurrent(window);
	glfwSwapInterval(1); // Enable vsync
	
	
	
	IMGUI_CHECKVERSION();
	ImGui::CreateContext();
	//ImGuiIO& io = ImGui::GetIO(); (void)io;
	
	ImGui_ImplGlfw_InitForOpenGL(window, true);
	ImGui_ImplOpenGL2_Init();
		
}

void initNewFrame(){
	ImGui_ImplOpenGL2_NewFrame();
	ImGui_ImplGlfw_NewFrame();
	ImGui::NewFrame();
}

void doNothing(){
	glfwPollEvents();
}

void render(){
	if(!clear_color) clear_color = new ImVec4(0.45f, 0.55f, 0.60f, 1.00f);
	// Rendering
	ImGui::Render();
	int display_w, display_h;
	glfwGetFramebufferSize(window, &display_w, &display_h);
	glViewport(0, 0, display_w, display_h);
	glClearColor(clear_color->x, clear_color->y, clear_color->z, clear_color->w);
	glClear(GL_COLOR_BUFFER_BIT);
	
	ImGui_ImplOpenGL2_RenderDrawData(ImGui::GetDrawData());
	
	
	/* 交换缓冲区，即在window上更新内容 */
	glfwSwapBuffers(window);
	/* 轮询事件 */
	glfwPollEvents();
}

void clear(){
	ImGui_ImplOpenGL2_Shutdown();
    ImGui_ImplGlfw_Shutdown();
    ImGui::DestroyContext();

    glfwDestroyWindow(window);
    glfwTerminate();
}


