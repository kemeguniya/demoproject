package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baselibrary.Baselibrary;
import Page.Demo_Project_Page;
import Propertyutility.Propertyutility;


public class Demo_Project_Test extends Baselibrary
{
	Demo_Project_Page ob;
	
	@BeforeTest
	public void shipgig() throws Exception
	{
		String url = Propertyutility.getdataproperty("url");
		getlaunch(url);
		ob=new Demo_Project_Page();
	}
	
	@Test(priority = 0)
	public void gettitle()throws Exception
	{
		ob.gettitle();
	}
	
	@Test(priority = 1)
	public void Practice_test() throws Exception 
	{
		ob.clickon_Practice();
	}

	@Test(priority = 2)
	public void Element_test() throws Exception 
	{
		ob.clickon_Element();
	}

	@Test(priority = 3)
	public void gettext_box_test() throws Exception 
	{
		ob.clickon_gettext_box();
	}
	
//	@Test(priority = 4)
//	public void gettext_verify_test() throws Exception 
//	{
//		ob.gettext_verify();
//	}
	
	@Test(priority = 4)
	public void checkbox_test() throws Exception 
	{
		ob.clickon_checkbox();
	}
	
	@Test(priority = 5)
	public void radiobutton_test() throws Exception 
	{
		ob.clickon_radiobutton();
	}
	
	@Test(priority = 6)
	public void webtable_test() throws Exception 
	{
		ob.clickon_webtable();
	}
	
	@Test(priority = 7)
	public void button1_test() throws Exception
	{
		ob.clickon_button();
	}
	
	@Test(priority = 8)
	public void buttons2_test() throws Exception
	{
		ob.clickon_buttons();
	}
	
	@Test(priority = 9)
	public void link_test() throws Exception
	{
		ob.clickon_links1();
	}
	
	@Test(priority = 10)
	public void link_new_windows_test() throws Exception
	{
		ob.clickon_upload_and_download();
	}
	
	@Test(priority = 11)
	public void dynamicproperties_test() throws Exception
	{
		ob.clickon_dynamicproperties();
	}
	
	@Test(priority = 12)
	public void broken_image_test() throws Exception
	{
		ob.clickon_broken_image();
	}
	
	@Test(priority = 13)
	public void alert_test() throws Exception
	{
		ob.clickon_alert();
	}
	
	@Test(priority = 14)
	public void browser_window_test() throws Exception
	{
		ob.clickon_browser_window();
	}
	
	@Test(priority = 15)
	public void new_tab_test() throws Exception
	{
		ob.clickon_new_tab();
	}
	
	@Test(priority = 16)
	public void alerts_test() throws Exception
	{
		ob.clickon_alerts();
	}
	
//	@Test(priority = 16)
//	public void frames_test() throws Exception
//	{
//		ob.clickon_frames();
//	}

	@Test(priority = 17)
	public void nested_frames_test() throws Exception
	{
		ob.clickon_nested_frames();
	}
	
	@Test(priority = 18)
	public void model_dialog_test() throws Exception
	{
		ob.clickon_model_dialog();
	}
	
	@Test(priority = 19)
	public void widget_test() throws Exception
	{
		ob.clickon_widget();
	}
	
	@Test(priority = 20)
	public void accordion_test() throws Exception
	{
		ob.clickon_accordion();
	}
	
	@Test(priority =21)
	public void auto_complete_test() throws Exception
	{
		ob.clickone_auto_complete();
	}
	
//	@Test(priority = 21)
//	public void date_picker_test() throws Exception
//	{
//		ob.clickon_date_picker();
//	}
	
//	@Test(priority = 22)
//	public void slider_test() throws Exception
//	{
//		ob.clickon_slider();
//	}
	
	@Test(priority = 22)
	public void progress_bar_test() throws Exception
	{
		ob.clickon_progress_bar();
	}
	
	@Test(priority = 23)
	public void tabs_test() throws Exception
	{
		ob.clickon_tabs();
	}
	
	@Test(priority = 24)
	public void tool_tips_test() throws Exception
	{
		ob.clickon_tooltips();
	}
	
	@Test(priority = 25)
	public void menu_test() throws Exception
	{
		ob.clickon_menu();
	}
	
	@Test(priority = 26)
	public void select_menu_test() throws Exception
	{
		ob.clickon_select_menu();
	}
	
	@Test(priority = 27)
	public void interations_test() throws Exception
	{
		ob.clickon_interations();
	}
	
	@Test(priority = 28)
	public void sortable_test() throws Exception
	{
		ob.clickon_sortable();
	}
	
	@Test(priority = 29)
	public void selectable_test() throws Exception
	{
		ob.clickon_selectable();
	}
	
	
	@Test(priority = 30)
	public void resizable_test() throws Exception
	{
		ob.clickon_resizable();
	}
	
	@Test(priority = 31)
	public void dropable_test() throws Exception
	{
		ob.clickon_dropable();
	}
	
	@Test(priority = 32)
	public void draggable_test() throws Exception
	{
		ob.clickon_draggable();
	}
	
	
	
	
}

