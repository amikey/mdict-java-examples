%module cpputils
%include "arrays_java.i";

%inline %{

int array[4];
void populate(int x[]) {
    int i;
    for (i=0; i<4; i++)
        x[i] = 100 + i;
}
int booleanArray_getitem(boolean *x, int index){
	return x[index];
}
/*java:
int[] array = new int[4];
example.populate(array);

System.out.print("array: ");
for (int i=0; i<array.length; i++)
	System.out.print(array[i] + " ");
*/
%}





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
			/* Draw a triangle */
			glBegin(GL_TRIANGLES);

			glColor3f(1.0, 0.0, 0.0);    // Red
			glVertex3f(0.0, 1.0, 0.0);

			glColor3f(0.0, 1.0, 0.0);    // Green
			glVertex3f(-1.0, -1.0, 0.0);

			glColor3f(0.0, 0.0, 1.0);    // Blue
			glVertex3f(1.0, -1.0, 0.0);

			glEnd();
			
			ImGui_ImplOpenGL2_NewFrame();
			ImGui_ImplGlfw_NewFrame();
			ImGui::NewFrame();
			
			
			ImGui::Text("haha%d",count++);
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

		// Cleanup
		ImGui_ImplOpenGL2_Shutdown();
		ImGui_ImplGlfw_Shutdown();
		ImGui::DestroyContext();

		glfwDestroyWindow(window);
		glfwTerminate();
        printf("22%s\n", str);
