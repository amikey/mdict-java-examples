// Copyright (c) 2014 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package Main;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

import org.cef.CefApp;
import org.cef.CefApp.CefAppState;
import org.cef.CefClient;
import org.cef.CefSettings;
import org.cef.CefSettings.LogSeverity;
import org.cef.ColorType;
import org.cef.OS;
import org.cef.browser.CefBrowser;
import org.cef.browser.CefBrowserWr;
import org.cef.handler.CefAppHandlerAdapter;

import com.knziha.jimgui.ImFontAtlas;
import com.knziha.jimgui.ImFontConfig;
import com.knziha.jimgui.ImGuiCol_;
import com.knziha.jimgui.ImGuiIO;
import com.knziha.jimgui.ImGuiListClipper;
import com.knziha.jimgui.ImGuiStyleVar_;
import com.knziha.jimgui.ImGuiWindowFlags_;
import com.knziha.jimgui.ImVec2;
import com.knziha.jimgui.ImVec4;
import com.knziha.jimgui.SWIGTYPE_p_int;
import com.knziha.jimgui.cpputils;
import com.knziha.jimgui.jimgui;
import com.knziha.plod.dictionary.mdict;
import com.knziha.plod.dictionary.mdict.findAllDoneListener;
import com.knziha.rbtree.RBTree_additive;
import com.knziha.rbtree.additiveMyCpr1;



//must add run args for jcef dlls directory:
//-Djava.library.path=E:\eclispe_wrkst3\PLOD2\mdict-java-examples\examples\detailed\jdef_src\build\native\debug
	
public class MainFrame  {
    private static  JTextField address_;
    private static  CefApp cefApp_;
    private static  CefClient client_;
    private static  CefBrowser browser_;

    static {
	   /*useless
		//System.setProperty("java.library.path", );
		//String jcefDllPath = "E:\\eclispe_wrkst3\\PLOD2\\mdict-java-examples\\examples\\detailed\\jdef_src\\build\\native\\debug\\";
		//addLibraryDir(jcefDllPath);
	   */
		 
		System.loadLibrary("glew32");//required F:\\NVPACK\\glew-2.1.0\\lib\\glew32.dll
		
		 
		if (OS.isWindows()) {//load cef dlls
		    //System.loadLibrary("jawt");
		    System.loadLibrary("chrome_elf");
		    System.loadLibrary("libcef");
		} else if (OS.isLinux()) {
		    System.loadLibrary("cef");
		}
		System.loadLibrary("jcef");
		
		//E:\C\swig_imgui_jcef\libExample.so
		System.loadLibrary("Example");//then load .so, witch requires jcef.dll, and is renamed to Example.dll
   }

    static long stst;
    static int adapter_idx;
	private static String lastSearchTerm = "";
    static boolean isCombinedSearching = false;
    static int fuzzy_task_count;
    static ArrayList<additiveMyCpr1> fuzzy_search_result;
    
    static RBTree_additive combining_search_tree = new RBTree_additive();
    static ArrayList<additiveMyCpr1> combining_search_result = null;
    
    static ArrayList<mdict> md = new ArrayList<>();
    
    public static void main(String[] args) throws InterruptedException, IOException {
    	//md.add(new mdict("E:\\assets\\mdicts\\牛津高阶英汉双解词典.mdx"         ));
    	//md.add(new mdict("E:\\assets\\mdicts\\新日漢大辭典.mdx"                 ));
    	//md.add(new mdict("E:\\assets\\mdicts\\NameOfPlants.mdx"                 ));
    	//md.add(new mdict("E:\\assets\\mdicts\\ode2_raw.mdx"                     ));
    	//md.add(new mdict("E:\\assets\\mdicts\\Irish-En.mdx"));
    	//md.add(new mdict("E:\\assets\\mdicts\\俄汉汉俄辞典.mdx"             ));
    	
    	
    	mdict.fod = new findAllDoneListener() {
			@Override
			public void cancelBefore(long Time) {
			}
			int fuzzy_task_count = -10086;
			@Override
			public void harvest(long Time) {
				if(fuzzy_task_count==-10086){
					if(isCombinedSearching){
						fuzzy_task_count = md.size();
					}else{
						fuzzy_task_count = 1;
					}
				}
				fuzzy_task_count--;
				if(fuzzy_task_count<=0){
					
					fuzzy_search_result = new ArrayList<additiveMyCpr1>();
					if(isCombinedSearching){
						for(int i=0;i<md.size();i++){
	            			mdict mdtmp = md.get(i);
	            			//if(mdtmp.combining_search_tree2!=null)
	                		for(int ti=0;ti<mdtmp.split_keys_thread_number;ti++){
	                			fuzzy_search_result.addAll(mdtmp.combining_search_tree2[ti]);
	                			mdtmp.combining_search_tree2[ti].clear();
	                		}
	                		mdtmp.combining_search_tree2 = null;
						}
					}else{//单独搜索
						mdict mdtmp;
							mdtmp = md.get(adapter_idx);
	                		for(int ti=0;ti<mdtmp.split_keys_thread_number;ti++){
	                			fuzzy_search_result.addAll(mdtmp.combining_search_tree2[ti]);
	                			mdtmp.combining_search_tree2[ti].clear();
	                		}
						mdtmp.combining_search_tree2 = null;
					}
            		show("模糊搜索完成! 耗时"+(System.currentTimeMillis()-stst)+"ms,共搜索到 "+fuzzy_search_result.size()+"个词条！");
            		
					fuzzy_task_count=-10086;
				}
			}};
			
    	//md.printDictInfo();
    	int myListDesiredPos = -1;
	    int myListStyle = ImGuiWindowFlags_.ImGuiWindowFlags_NoMove.swigValue()
	    		|ImGuiWindowFlags_.ImGuiWindowFlags_NoTitleBar.swigValue()
	    		|ImGuiWindowFlags_.ImGuiWindowFlags_NoResize.swigValue()
	    		|ImGuiWindowFlags_.ImGuiWindowFlags_MenuBar.swigValue();
	    
    	//scanInSettings...
    	String iniName = "imguiConfig.ini";
    	new File(iniName).createNewFile();
    	Properties properties =new Properties();
		FileInputStream fis = new FileInputStream(iniName);
		properties.load(fis);
		
		isCombinedSearching = valueOf(properties.getProperty("joint"),false);

		jimgui.setGLFWwindow_xpos(valueOf(properties.getProperty("x"),250));
		jimgui.setGLFWwindow_ypos(valueOf(properties.getProperty("y"),250));
		jimgui.setGLFWwindow_fullWidth(valueOf(properties.getProperty("fullWidth"),1024));
		jimgui.setGLFWwindow_fullHeight(valueOf(properties.getProperty("fullHeight"),768));
        jimgui.initGLFWindow("Mdict-Java Debug Center  (powered by ImGui+GLFW+OpenGL2 and JCEF)");
        jimgui.glfwSetWindowSizePos(jimgui.getGLFWwindow_xpos(), jimgui.getGLFWwindow_ypos(),
        				jimgui.getGLFWwindow_fullWidth(), jimgui.getGLFWwindow_fullHeight());
        jimgui.SetBrowserInfo_(0.2f, 0.1f, 0, 0);

		String mainDictPath = properties.getProperty("mDPath");
        
        
    	CefApp.addAppHandler(new CefAppHandlerAdapter(null) {
            @Override
            public void stateHasChanged(org.cef.CefApp.CefAppState state) {
                // Shutdown the app if the native CEF part is terminated
                if (state == CefAppState.TERMINATED) System.exit(0);
            }
        });
        
        CefSettings settings = new CefSettings();
        settings.windowless_rendering_enabled = false;
        settings.background_color = new ColorType();
        settings.background_color.color_value = 0xFFFFFFFF;
        settings.cache_path = new File(".").getCanonicalPath()+"//"+"chromeCache";
        settings.command_line_args_disabled = true;
        settings.uncaught_exception_stack_size = 0;
        settings.log_severity = LogSeverity.LOGSEVERITY_DISABLE;
        cefApp_ = CefApp.getInstance(settings);//load cef dlls

        client_ = cefApp_.createClient();
        
        //incorporate jcef win32_window into the win32_window created by glfw;
        browser_ = client_.createBrowser(cpputils.getGLHWND_w(jimgui.getWindow()),"about:blank", OS.isLinux(), false);
        address_ = new JTextField("about:blank", 100);
        address_.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                browser_.loadURL(address_.getText());
            }
        });
        
        
        new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				    ((CefBrowserWr)browser_).createUIIfRequired();
			        jimgui.setHwnd(browser_);//set sub-window's hwnd integer
			        //奇怪??..这里doUpdate 之后 之后doUpdate就无效了..
		            //((CefBrowserWr)browser_).doUpdate(new Rectangle(0,0,1000,1000));
			        //browser_.loadString(, "file:///");

			}}).start();
        


        

        
        ImFontConfig cfg = new ImFontConfig();
        cfg.setOversampleH(1);
        cfg.setOversampleV(1);
        ImFontAtlas fonts = jimgui.GetIO().getFonts();
		fonts.AddFontFromFileTTF("sarasa-gothic-sc-regular.ttf", 22,cfg,fonts.GetGlyphRangesChineseFull());
		
        
    	ImGuiIO io = jimgui.GetIO();
    	boolean needRePosW1=true;
    	
    	int LIMIT=3;
    	while(jimgui.glfwWindowShouldClose(jimgui.getWindow())==0) {
    		long deltaTime = (long) (io.getDeltaTime() * 1000);
			Thread.sleep(LIMIT - deltaTime < 0 ? 0 : (LIMIT - deltaTime));
    		SWIGTYPE_p_int size = jimgui.glfwGetFramebufferSize_();
    		int SizeX = cpputils.intArray_getitem(size, 0);
    		int SizeY = cpputils.intArray_getitem(size, 1);
    		if(lastSizeX!=SizeX || lastSizeY!=SizeY) {
    			lastSizeX=SizeX;
    			lastSizeY=SizeY;
    			int leftMarX = (int) (jimgui.getBrowser_info_().getX()*lastSizeX);
    			int leftMarY = (int) (jimgui.getBrowser_info_().getY()*lastSizeY);
                ((CefBrowserWr)browser_).doUpdate(new Rectangle(leftMarX,leftMarY,lastSizeX-leftMarX,lastSizeY-leftMarY));

    		}
    		jimgui.initNewFrame();
			
    		if(needRePosW1) {
    			jimgui.SetNextWindowPos(new ImVec2(jimgui.getBrowser_info_().getX()*SizeX,0));
    			needRePosW1=false;
    		}
    		jimgui.Begin("w1",null,ImGuiWindowFlags_.ImGuiWindowFlags_AlwaysAutoResize.swigValue());
    		{	
    			jimgui.Text(lastSizeX+"::"+lastSizeY+" @"+mainDictPath);
    			if(jimgui.Button("Set Main Dir")) {//词典主目录
    				try {
    					JFileChooser jfc=new JFileChooser();
        				if(mainDictPath!=null && new File(mainDictPath).exists())
        					jfc.setCurrentDirectory(new File(mainDictPath));
        				else
        					jfc.setCurrentDirectory(new File("C:\\"));
        				jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        				int res = jfc.showDialog(new JLabel(), "Pick Main Dir");
        				File files=jfc.getSelectedFile();
        				if(res==JFileChooser.APPROVE_OPTION && files!=null)
        					mainDictPath = files.getAbsolutePath();
    				}catch(Exception e) {
    					e.printStackTrace();
    				}
    				
    			}
    			for(int i=0;i<md.size();i++) {
    				if(adapter_idx==i) {
    					jimgui.PushStyleColor(ImGuiCol_.ImGuiCol_Text.swigValue(),new ImVec4(255,0,0,255));
	    				jimgui.Button(md.get(i)._Dictionary_fName, new ImVec2(-1,0));
	    				jimgui.PopStyleColor();
    				}else 
    					jimgui.Button(md.get(i)._Dictionary_fName, new ImVec2(-1,0));
    				if(jimgui.IsItemClicked()) {
    					adapter_idx=i;
    					myListDesiredPos=0;
    					if(!isCombinedSearching)
    						lastSearchTerm="";
    				}
    			}

    		}jimgui.End();
			
			jimgui.SetNextWindowPos(new ImVec2(0,0));
			jimgui.SetNextWindowSize(new ImVec2(jimgui.getBrowser_info_().getX()*SizeX,SizeY));
    		
			jimgui.Begin("list",null,myListStyle);
			
			jimgui.PushItemWidth(-1);
	    		jimgui.putSearchBar();
	    		if(jimgui.IsItemActive()) ((CefBrowserWr)browser_).setFocus(false);
    		jimgui.PopItemWidth();

    		
    		
    		jimgui.PushStyleVar(ImGuiStyleVar_.ImGuiStyleVar_ItemSpacing.swigValue(), new ImVec2(10,0));
    		{	
    			if(jimgui.Button("查")){
	    			
	    		}jimgui.SameLine();
	    		
	    		
	    		if(isCombinedSearching)
	    			jimgui.Button("联");//联:conjuction mode
				else
					jimgui.Button("单");//单:single dict mode 
	    		if(jimgui.IsItemClicked()) {
	    			isCombinedSearching=!isCombinedSearching;
	    			lastSearchTerm="";
	    		}jimgui.SameLine();
	    		
	    		if(jimgui.Button("模糊")) {//fuzzy search
	    			stst=System.currentTimeMillis();
	        		if(isCombinedSearching){
	            		for(int i=0;i<md.size();i++){
								try {
									md.get(i).findAllKeys(lastSearchTerm,i,30);
								} catch (UnsupportedEncodingException e) {
									e.printStackTrace();
								}
						}
	        		}else{//单独搜索
						try {
							md.get(adapter_idx).findAllKeys(lastSearchTerm+"",adapter_idx,30);
						} catch (Exception e) 
						{e.printStackTrace();}
					}
	    		}jimgui.SameLine();
	    		jimgui.Button("全文");
	    		jimgui.SameLine();
    			if(jimgui.Button("+")) {//add dicts
    				JFileChooser jfc=new JFileChooser();
    				if(mainDictPath!=null)
    					jfc.setCurrentDirectory(new File(mainDictPath));
    				else
    					jfc.setCurrentDirectory(new File("C:\\"));
    				jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
    				jfc.setMultiSelectionEnabled(true);
    				int res = jfc.showDialog(new JLabel(), "Add In .mdx Dicts...");
    				File[] files=jfc.getSelectedFiles();
    				if(res==JFileChooser.APPROVE_OPTION && files!=null) {
	    				for(File f:files) {
	    					md.add(new mdict(f.getAbsolutePath()));
	    					//show();
	    				}
						adapter_idx = md.size()-files.length;
    				}
    			}
    		}
    		jimgui.PopStyleVar();
    		
    		

    		
    		
    		

    		jimgui.BeginChild(111);
    		//ontextc
    		if(!lastSearchTerm.equals(jimgui.getSearchTerm())) {
    			fuzzy_search_result=null;
    			combining_search_result = null;
    			lastSearchTerm = jimgui.getSearchTerm();
    			if(isCombinedSearching) {
    				combining_search_tree.clear();
    				for(int i=0;i<md.size();i++){
						try {
							md.get(i).size_confined_lookUp(lastSearchTerm,combining_search_tree,i,30);
						} catch (UnsupportedEncodingException e) {
							e.printStackTrace();
						}
					}
    				myListDesiredPos=0;
    				combining_search_result = combining_search_tree.flatten();
    			}else
    			myListDesiredPos = md.get(adapter_idx).lookUp(lastSearchTerm);
    		}
			ImGuiListClipper clipper = new ImGuiListClipper();
			int ItemSize = 18;
			if(myListDesiredPos>=0) {
				jimgui.SetScrollY(myListDesiredPos*ItemSize);
				myListDesiredPos=-1;
			}
			boolean isCombinedSearchingVal=false;
			boolean isfuzzySearchingVal=false;
			if(fuzzy_search_result!=null && fuzzy_search_result.size()>0) {
				clipper.Begin(fuzzy_search_result.size(),ItemSize);
				isfuzzySearchingVal=true;
			}else if(isCombinedSearching && combining_search_result!=null) {
				clipper.Begin(combining_search_result.size(),ItemSize);
				isCombinedSearchingVal=true;
			}else if(md.size()>0)
				clipper.Begin((int) md.get(adapter_idx).getNumberEntries(),ItemSize);
			//clipper.setStepNo(100);
	        for (int i = clipper.getDisplayStart(); i < clipper.getDisplayEnd(); i++)
	        {
	            jimgui.PushID(i);
	            jimgui.Selectable("##selectable", false, 0, new ImVec2(0, ItemSize));
	            String lexical_entry;
	            if(isfuzzySearchingVal)
	            	lexical_entry = fuzzy_search_result.get(i).key;
	            else if(isCombinedSearchingVal)
	            	lexical_entry = combining_search_result.get(i).key;
	            else
	            	lexical_entry = md.get(adapter_idx).getEntryAt(i);
	            if(jimgui.IsItemClicked()) {//rendering contents...
	            	if(isfuzzySearchingVal) {
	            		browser_.loadString(md.get(fuzzy_search_result.get(i).value.get(0)).getRecordAt(fuzzy_search_result.get(i).value.get(1)).trim(),"file:///");
	            	}else if(isCombinedSearchingVal) {
	            		StringBuilder contents = new StringBuilder();
	            		ArrayList<Integer> vals = combining_search_result.get(i).value;
	            		for(int i1=0;i1<vals.size();i1++){
							int tmpidx = vals.get(i1);
	            			contents.append("<p align=\"center\" style=\"margin:0;width:100%;background:yellow;\">{").append(md.get(tmpidx)._Dictionary_fName).append("}</p>").append("<hr style=\"margin-Top:0;\"/>")
								.append(md.get(tmpidx).getRecordAt(vals.get(++i1)).trim())
								.append("<BR>");
						}
	            		browser_.loadString(contents.toString(),"file:///");
	            	}else
	            		browser_.loadString(md.get(adapter_idx).getRecordAt(i).trim(),"file:///");

	            	jimgui.SameLine();
		            jimgui.Text(lexical_entry+".....");//+" !!!POS=="+(clipper.getDisplayStart())
	            }else {
	            	jimgui.SameLine();
		            jimgui.Text(lexical_entry);//+" !!!POS=="+(clipper.getDisplayStart())
	            }
	            
	            jimgui.PopID();
	        }
	        clipper.End();
	        jimgui.EndChild();
    		jimgui.End();
    		jimgui.render();
    		
    		Thread.sleep(10);
    	}
    	
    	//dumpSettings...
    	SWIGTYPE_p_int size = jimgui.glfwGetWindowSizePos();
    	properties.setProperty("joint",""+isCombinedSearching);
		properties.setProperty("x", String.valueOf(cpputils.intArray_getitem(size, 2)));
		properties.setProperty("y", String.valueOf(cpputils.intArray_getitem(size, 3)));
		properties.setProperty("fullWidth", String.valueOf(cpputils.intArray_getitem(size, 0)));
		properties.setProperty("fullHeight", String.valueOf(cpputils.intArray_getitem(size, 1)));
		
		if(mainDictPath!=null) properties.setProperty("mDPath", mainDictPath);

		FileOutputStream fos = new FileOutputStream(iniName);
		properties.store(fos,null);
		

    	jimgui.clear();

    	//client_.doClose(browser_);
    	//browser_.doClose();
    	client_.dispose();
    	//cefApp_.dispose();

    	//System.exit(0);
    }
    
    protected static void show(String string) {
    	System.out.println(string);
	}

	private static int valueOf(String property, int defVal) {
    	if(property!=null)
    		try {
    		return Integer.valueOf(property);
    		}catch(Exception e) {
    			
    		}
    	return defVal;
	}
	private static boolean valueOf(String property, boolean defVal) {
    	if(property!=null)
    		try {
    		return Boolean.valueOf(property);
    		}catch(Exception e) {
    			
    		}
    	return defVal;
	}
	static int lastSizeX=0;
    static int lastSizeY=0;
    
    
    public static void addLibraryDir(String libraryPath) throws IOException {//useless
		try {
			Field field = ClassLoader.class.getDeclaredField("usr_paths");
			field.setAccessible(true);
			field.set(null, new String[] {libraryPath});
		} catch (IllegalAccessException e) {
			throw new IOException(
					"Failedto get permissions to set library path");
		} catch (NoSuchFieldException e) {
			throw new IOException(
					"Failedto get field handle to set library path");
		}
	}

    
}
