
JAVA_HOME = C:\jdk1.8.0_172

CFLAGS = -I'$(JAVA_HOME)/include' -I'$(JAVA_HOME)/include/win32' -IE:\C\src\native 
DEP_LINKSTATIC = -lglfw3 -lopengl32 -lgdi32 -lglu32 -lglew32 -LF:\NVPACK\glew-2.1.0\lib 
DEP_JAVA = -ljawt -L'C:\jdk1.8.0_172\jre\bin'
DEP_LINKDYN = -lglfw3dll


# for invocation of jcef funcs
loloDll = E:\C\src\build\native\Debug\jcef.dll
# for lolo.h
loloInclude =  -IE:\C\src\native\

all:
	swig -c++ $(loloInclude) -java -package com.knziha.jimgui jimgui.i
	g++ -Wall  -fpermissive -c ex.c jimgui_wrap.cxx $(CFLAGS)  -IE:\C\src\native 
	swig -c++ -java -package com.knziha.jimgui cpputils.i
	g++ -Wall -c ex.c cpputils_wrap.cxx $(CFLAGS)  -fpermissive
	
	g++ -Wall -Iimgui -c imgui/imgui.cpp
	g++ -Wall -Iimgui -c imgui/imgui_demo.cpp
	g++ -Wall -Iimgui -c imgui/imgui_draw.cpp
	g++ -Wall -Iimgui -Iimpl -c impl/imgui_impl_glfw.cpp
	g++ -Wall -Iimgui -Iimpl -c impl/imgui_impl_opengl2.cpp
	
	g++ -Wall  -fpermissive -Iimgui/ -Iimpl/  imgui.o   -c ex2.cpp jimgui_wrap.cxx $(CFLAGS) -IF:\NVPACK\glew-2.1.0\include -IE:\C\src\native 

	g++ -shared  -fpermissive -fpic ex.o ex2.o imgui.o imgui_demo.o imgui_draw.o imgui_impl_glfw.o imgui_impl_opengl2.o jimgui_wrap.o cpputils_wrap.o         -o libExample.so $(DEP_LINKSTATIC) $(DEP_JAVA)  $(loloDll) -fpermissive
	
	strip libExample.so
	
	
	
	
	
	
	
	