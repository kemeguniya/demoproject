package Page;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import Applicationutility.Applicationutility;
import Baselibrary.Baselibrary;
import Excelutility.Excelutility;
import Propertyutility.Propertyutility;
import Robot.Robot_Class;
import Waitutility.Waitutility;





public class Demo_Project_Page extends Baselibrary
{
	static String path="C:\\Users\\Admin\\eclipse-workspace\\project1\\Data\\Book 3.xlsx";
	ArrayList<String>li=null;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions act = new Actions(driver);
	public  Demo_Project_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@class=\"close\"]")
	private WebElement closebtn;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//*[@data-target='#elements']")
	private WebElement Element;
	
	@FindBy(xpath = "//*[@href='#tab_1']")
	private WebElement text_box;
	@FindBy(xpath = "//*[@id='fullname1']")
	private WebElement fullname1;
	@FindBy(xpath = "//*[@id='fullemail1']")
	private WebElement fullemail1;
	@FindBy(xpath = "//*[@id='fulladdresh1']")
	private WebElement fulladdresh1;
	@FindBy(xpath = "//*[@id='paddresh1']")
	private WebElement paddresh1;
	@FindBy(xpath = "//*[@class='btn btn-success']")
	private WebElement submit_form;
	
	@FindBy(xpath = "//*[@class='col-md-6 mt-5']/label")
	private List<WebElement> verify;
	
	
	@FindBy(xpath = "//*[@href='#tab_2']")
	private WebElement check_box;
	@FindBy(xpath = "//*[@src='Checkbox.html']")
	private WebElement checkboxframe;
	
	@FindBy(xpath = "//*[@id='myCheck']")
	private WebElement Moblie;
	@FindBy(xpath = "//*[@id='mylaptop']")
	private WebElement Laptop;
	@FindBy(xpath = "//*[@id='mydesktop']")
	private WebElement Desktop;
	
	@FindBy(xpath = "//*[@href='#tab_3']")
	private WebElement radio_butons;
	@FindBy(xpath = "//*[@id='no']")
	private WebElement radio_butons_no;
	
	@FindBy(xpath = "//*[@href='#tab_4']")
	private WebElement web_table;
	@FindBy(xpath = "//*[@src='Webtable.html']")
	private WebElement web_table_frame;
	@FindBy(xpath = "(//*[@class='form-control'])[1]")
	private WebElement name1;
	@FindBy(xpath = "(//*[@class='form-control'])[2]")
	private WebElement email1;
	@FindBy(xpath = "//*[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath = "//*[@href='#tab_5']")
	private WebElement buttons;
	@FindBy(xpath = "//*[@ondblclick='doubletext()']")
	private WebElement doubleclick;
	@FindBy(xpath = "//*[@oncontextmenu='righttext()']")
	private WebElement rightclick;
	@FindBy(xpath = "//*[@onclick='clicktext()']")
	private WebElement clickme;
	
	@FindBy(xpath = "//*[@href='#tab_6']")
	private WebElement links;
	@FindBy(xpath = "//*[text()='Demo Page']")
	private WebElement new_window;
	@FindBy(xpath = "//*[@onclick='Created()']")
	private WebElement created;
	@FindBy(xpath = "//*[@onclick='Content()']")
	private WebElement no_content;
	@FindBy(xpath = "//*[@onclick='Moved()']")
	private WebElement moved;
	@FindBy(xpath = "//*[@onclick='Request()']")
	private WebElement bad_request;
	@FindBy(xpath = "//*[@onclick='Unauthorized()']")
	private WebElement unauthorized;
	@FindBy(xpath = "//*[@onclick='Forbidden()']")
	private WebElement forbidden;
	@FindBy(xpath = "//*[@onclick='Found()']")
	private WebElement not_found;
	
	@FindBy(xpath = "//*[@href='#tab_8']")
	private WebElement upload_and_download;
	@FindBy(xpath = "//*[text()='Select a file']")
	private WebElement upload1;
	
	@FindBy(xpath = "//*[@href='#tab_9']")
	private WebElement dynamic_properties;
	@FindBy(xpath = "//*[@id='Enable']")
	private WebElement five_second_enable;
	@FindBy(xpath = "//*[@id='Change']")
	private WebElement change_color;
	@FindBy(xpath = "//*[@id='Visible']")
	private WebElement visible_after_fivesecond;
	
	@FindBy(xpath = "//*[@href='#tab_10']")
	private WebElement broken_image;
	

	@FindBy(xpath = "//*[@data-target='#alerts']")
	private WebElement alert;
	
	
	@FindBy(xpath = "//*[@href='#tab_11']")
	private WebElement browser_window;
	@FindBy(xpath = "(//*[@target='_blank'])[2]")
	private WebElement new_tab;
	@FindBy(xpath = "//*[@title='Search']")
	private WebElement fill_search_bar;
	@FindBy(xpath = "(//*[@value='Google Search'])[1]")
	private WebElement google_search;
	@FindBy(xpath = "//*[text()='Keme Guniya (@keme_guniya) / Twitter']")
	private WebElement twitter_search;
	@FindBy(xpath = "//h3[contains(text(),'Keme Guniya | Facebook')]")
	private WebElement facebook_search;
	
	
	//code forget.......................................!!!!!!!
	@FindBy(xpath = "(//a[contains(text(),'New Window')])[1]")
	private WebElement newwindow;
	
	@FindBy(xpath = "//a[contains(text(),'New Window Message')]")
	private WebElement new_window_message;
	//code forget.......................................!!!!!!!		
	
	@FindBy(xpath = "//*[@href='#tab_12']")
	private WebElement alrts;
	@FindBy(xpath = "//*[@onclick='myalert()']")
	private WebElement seen_alert;
	@FindBy(xpath = "//*[@onclick='aftersec5()']")
	private WebElement aftersec5;
	@FindBy(xpath = "//*[@onclick='myconfirm()']")
	private WebElement confirmbox;
	@FindBy(xpath = "//*[@onclick='myprompt()']")
	private WebElement promptbox;
	
	@FindBy(xpath = "//*[@href='#tab_13']")
	private WebElement frames;
	@FindBy(xpath = "(//*[@title='Iframe Example'])[1]")
	private WebElement iframe1;
	@FindBy(xpath = "(//*[@title='Iframe Example'])[2]")
	private WebElement iframe2;
	
	@FindBy(xpath = "//*[@href='#tab_14']")
	private WebElement nested_frames;
	@FindBy(xpath = "//*[@frameborder='0']")
	private WebElement iiframe1;
	@FindBy(xpath = "//*[@width='500']")
	private WebElement iiframe2;
	@FindBy(xpath = "//*[@width='300']")
	private WebElement iiframe3;
	@FindBy(xpath = "//a[contains(text(),'Click Here')]")
	private WebElement click_here;
	
	@FindBy(xpath = "//*[@href='#tab_15']")
	private WebElement modal_dialogs;
	@FindBy(xpath = "//*[@data-target='#exampleModal1']")
	private WebElement small_model;
	@FindBy(xpath = "(//*[@data-dismiss='modal'])[4]")
	private WebElement small_model_dismiss;
	@FindBy(xpath = "//*[@data-target='#exampleModal2']")
	private WebElement large_model;
	@FindBy(xpath = "(//*[@data-dismiss='modal'])[6]")
	private WebElement large_model_dismiss;
	
	
	@FindBy(xpath = "//*[@data-target='#widget']")
	private WebElement widget;
	
	
	@FindBy(xpath = "//a[contains(text(),'accordion')]")
	private WebElement accordion;
	@FindBy(xpath = "//*[@data-target='#collapse1']")
	private WebElement accordion_pragraph1;
	@FindBy(xpath = "//*[@data-target='#collapse2']")
	private WebElement accordion_pragraph2;
	@FindBy(xpath = "//*[@data-target='#collapse3']")
	private WebElement accordion_pragraph3;
//	!!!!!................................................!!!!!!!!
	
	@FindBy(xpath = "//a[contains(text(),'auto complete')]")
	private WebElement auto_complete;
	@FindBy(xpath = "(//*[@class='embed-responsive-item'])[3]")
	private WebElement iframe_auto_complete;
	@FindBy(xpath = "//*[@placeholder='Country']")
	private WebElement select_country;
	@FindBy(xpath = "//*[@placeholder='Country']")
	private List<WebElement> select_country_list;
//	!!!!!................................................!!!!!!!!
	
	@FindBy(xpath = "//a[contains(text(),'date picker')]")
	private WebElement date_picker;
	@FindBy(xpath = "(//*[@type='date'])[2]")
	private WebElement Select_Date;
	@FindBy(xpath = "//*[@type='datetime-local']")
	private WebElement date_and_time;
	
	@FindBy(xpath = "//a[contains(text(),'slider')]")
	private WebElement slider;
	@FindBy(xpath = "(//*[@type='range'])[2]")
	private WebElement slider_access;
	
	@FindBy(xpath = "//a[contains(text(),'progress bar')]")
	private WebElement progress_bar;
	@FindBy(xpath = "//*[@onclick='move()']")
	private WebElement Start_progress_bar;
	
	@FindBy(xpath = "//a[contains(text(),'tabs')]")
	private WebElement tabs;
	@FindBy(xpath = "//*[@id='home-tab']")
	private WebElement tabs1;
	@FindBy(xpath = "//*[@id='profile-tab']")
	private WebElement tabs2;
	@FindBy(xpath = "//*[@id='contact-tab']")
	private WebElement tabs3;
	
	@FindBy(xpath = "//a[contains(text(),'tool tips')]")
	private WebElement tool_tips;
	
	@FindBy(xpath = "(//a[contains(text(),'menu')])[1]")
	private WebElement menu;
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement home;
	@FindBy(xpath = "//a[contains(text(),'About')]")
	private WebElement about;
	@FindBy(xpath = "//*[@id='navbar']/ul/li[3]")
	private WebElement services;
	@FindBy(xpath = "//*[@id='navbar']/ul/li[4]")
	private WebElement blog;
	@FindBy(xpath = "//a[contains(text(),'Contact')]")
	private WebElement contacts;
	
	@FindBy(xpath = "//a[contains(text(),'select menu')]")
	private WebElement select_menu;
	@FindBy(xpath = "//*[@id=\"tab_24\"]/form/div/div[1]/select")
	private WebElement select_value;
	@FindBy(xpath = "//*[@id=\"tab_24\"]/form/div/div[2]/select")
	private WebElement select_one;
	@FindBy(xpath = "//*[@id=\"tab_24\"]/form/div/div[3]/div/select")
	private WebElement old_style_select_one;
	@FindBy(xpath = "//*[@id=\"tab_24\"]/form/div/div[5]/div/select")
	private WebElement multiselector;
	
	
	@FindBy(xpath = "//*[@data-target='#interations']")
	private WebElement interations;
	
	@FindBy(xpath = "//a[contains(text(),'sortable')]")
	private WebElement sortable;
	@FindBy(xpath = "//*[text()='Sort']")
	private WebElement sort;
	
	@FindBy(xpath = "//a[contains(text(),'selectable')]")
	private WebElement selectable;
	@FindBy(xpath = "//a[contains(text(),'Select List')]")
	private WebElement select_list;
//	!!.................................................!!!
	@FindBy(xpath = "//*[@class='list-group']/li)")
	private List<WebElement> single_click_select_list;
//	!!.................................................!!!	
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Select Grid')]")
	private WebElement select_grid;
	@FindBy(xpath = "//*[@class=\"col-4\"]")
	private WebElement double_click_grid;
	
	
	@FindBy(xpath = "//a[contains(text(),'resizable')]")
	private WebElement resizable;
	@FindBy(xpath = "//*[text()='Resize me']")
	private WebElement resize_me;
	
	@FindBy(xpath = "//a[contains(text(),'droppable')]")
	private WebElement droppable;
	@FindBy(xpath = "(//*[@class='embed-responsive-item'])[4]")
	private WebElement droppableframe;
	
	@FindBy(xpath = "//*[@id='drag1']")
	private WebElement dragimg;
	@FindBy(xpath = "//*[@id='div1']")
	private WebElement rectengle;
	
	@FindBy(xpath = "//a[contains(text(),'draggable')]")
	private WebElement draggable;
	@FindBy(xpath = "(//*[@class='embed-responsive-item'])[5]")
	private WebElement draggableframe;
	@FindBy(xpath = "//*[@id='draggable']")
	private WebElement drag_img;
	
	
	public void gettitle() throws Exception
	{
		String title=driver.getTitle();
		System.out.println(title);	
		closebtn.click();	
	}
	
	public void clickon_Practice() throws Exception
	{
		Applicationutility.clickme(closebtn);	
		Applicationutility.clickme(practice);
	}
	
	public void clickon_Element() throws Exception
	{
		Applicationutility.clickme(Element);
	}
	
	public void clickon_gettext_box() throws Exception
	{
		Applicationutility.clickme(text_box);
		String name= Propertyutility.getdataproperty("Name");
		String email= Propertyutility.getdataproperty("Email");
		String fulladd= Propertyutility.getdataproperty("Fulladd");
		String padd= Propertyutility.getdataproperty("Permanentadd");
		
//		li.add(name);
//		li.add(email);
//		li.add(fulladd);
//		li.add(padd);
//		
		fullname1.sendKeys(name);
		fullemail1.sendKeys(email);
		fulladdresh1.sendKeys(fulladd);
		paddresh1.sendKeys(padd);
		Applicationutility.clickme(submit_form);
	}
	
	public void gettext_verify() throws Exception
	{
		SoftAssert sa= new SoftAssert();
		for (int j=1; j<=7; j++)
		{
			for(String dd:li)
			{
				String Actualdata =text_box.getText();
				sa.assertEquals(Actualdata, dd);
				j++;
				li.remove(dd);	
				break;
			}	
		}
		sa.assertAll();
	}
	
	public void clickon_checkbox() throws Exception
	{
		Applicationutility.clickme(check_box);
		driver.switchTo().frame(checkboxframe);
		Applicationutility.clickme(Moblie);
		Applicationutility.clickme(Laptop);
		Applicationutility.clickme(Desktop);
		driver.switchTo().defaultContent();
	}
	
	public void clickon_radiobutton() throws Exception
	{
		Applicationutility.clickme(radio_butons);
		Applicationutility.clickme(radio_butons_no);
	}
	
	public void clickon_webtable() throws Exception
	{
		Applicationutility.clickme(web_table);
		driver.switchTo().frame(web_table_frame);
		for (int i = 1; i<=4; i++) 
		{
			String Name1 =Excelutility.getdata(path, i, 0);
			String Email1 =Excelutility.getdata(path, i, 1);
			name1.sendKeys(Name1);
			email1.sendKeys(Email1);
			Applicationutility.clickme(save);
		}
		driver.switchTo().defaultContent();
	}
	
	public void clickon_button() throws Exception
	{
		Applicationutility.clickme(buttons);
	}
	
	public void clickon_buttons() throws Exception
	{
		Applicationutility.doubleclik(doubleclick);
		Applicationutility.rightclick(rightclick);
		Applicationutility.clickme(clickme);
	}
	
	public void clickon_links1() throws Exception
	{
		Applicationutility.clickme(links);
		Applicationutility.clickme(new_window);
		Applicationutility.changewindow(1);
		Applicationutility.clickme(closebtn);
		driver.close();
		Applicationutility.changewindow(0);
		Applicationutility.clickme(created);
		Applicationutility.clickme(not_found);
		Applicationutility.clickme(moved);
		Applicationutility.clickme(bad_request);
		Applicationutility.clickme(unauthorized);
		Applicationutility.clickme(forbidden);
		Applicationutility.clickme(not_found);
	}
	
	public void clickon_upload_and_download() throws Exception
	{
		Applicationutility.clickme(upload_and_download);
		Applicationutility.clickme(upload1);
		Robot_Class.setClipboardData("C:\\Users\\Admin\\Desktop\\New folder\\A1.pdf");
	}
	
	public void clickon_dynamicproperties() throws Exception
	{
		Applicationutility.clickme(dynamic_properties);
		Applicationutility.clickme(five_second_enable);
		Applicationutility.clickme(change_color);
		Applicationutility.clickme(visible_after_fivesecond);
	}
	
	public void clickon_broken_image() throws Exception
	{
		Applicationutility.clickme(broken_image);
	}
	
	
	public void clickon_alert() throws Exception
	{
		Applicationutility.clickme(alert);
	}
	
	public void clickon_browser_window() throws Exception
	{
		Applicationutility.clickme(browser_window);
	}
	
	public void clickon_new_tab() throws Exception
	{
		Applicationutility.clickme(new_tab);
		Applicationutility.changewindow(1);
		fill_search_bar.sendKeys("keme_guniya");
		Applicationutility.clickme(google_search);
        js.executeScript("javascript:window.scrollBy(0,350)");
		Applicationutility.clickme(facebook_search);
		driver.close();
		Applicationutility.changewindow(0);

		
		Applicationutility.clickme(newwindow);
		Applicationutility.changewindow(1);
		driver.manage().window().maximize();
		fill_search_bar.sendKeys("keme_guniya");
		Applicationutility.clickme(google_search);
        js.executeScript("javascript:window.scrollBy(0,350)");
		Applicationutility.clickme(facebook_search);
		driver.close();
		Applicationutility.changewindow(0);
		
		
//		Applicationutility.clickme(new_window_message);
//		Applicationutility.changewindow(2);
////		driver.manage().window().maximize();
//		driver.close();
//		Applicationutility.changewindow(0);
	}
	

	public void clickon_alerts() throws Exception
	{
		Applicationutility.clickme(alrts);
		Applicationutility.clickme(seen_alert);
		driver.switchTo().alert().accept();
		Applicationutility.clickme(aftersec5);
		Waitutility.alertpresent(6);
		driver.switchTo().alert().accept();
		Applicationutility.clickme(confirmbox);
		driver.switchTo().alert().dismiss();
		Applicationutility.clickme(promptbox);
		driver.switchTo().alert().sendKeys("Jesika Singh");
		driver.switchTo().alert().accept();
	}
	
//	public void clickon_frames() throws Exception
//	{
//		Applicationutility.clickme(frames);
//		driver.switchTo().frame(iframe1);
//		String data1=iframe1.getText();
//		System.out.println(data1);
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().frame(iframe2);
//		String data2=iframe2.getText();
//		System.out.println(data2);
//		driver.switchTo().defaultContent();
//	}
	
	public void clickon_nested_frames() throws Exception
	{
		Applicationutility.clickme(nested_frames);
		try 
		{
			driver.switchTo().frame(iiframe1).switchTo()
			.frame(iiframe2).switchTo().frame(iiframe3);
		} 
		catch (Exception e) 
		{
			System.out.println("hello"+e);
		}
		Applicationutility.clickme(click_here);
		driver.switchTo().defaultContent();
	}
	
	public void clickon_model_dialog() throws Exception
	{
		Applicationutility.clickme(modal_dialogs);
		Applicationutility.clickme(small_model);
		Applicationutility.clickme(small_model_dismiss);
		Applicationutility.clickme(large_model);
		Applicationutility.clickme(large_model_dismiss);
	}
	
	public void clickon_widget() throws Exception
	{
		Applicationutility.clickme(widget);
	}
	
	public void clickon_accordion() throws Exception
	{
		Applicationutility.clickme(accordion);
		Applicationutility.clickme(accordion_pragraph1);
		Applicationutility.clickme(accordion_pragraph2);
		Applicationutility.clickme(accordion_pragraph3);
	}
	
//	!!!!!................................................!!!!!!!!
	public void clickone_auto_complete() throws Exception
	{
		Applicationutility.clickme(auto_complete);
		driver.switchTo().frame(iframe_auto_complete);
		select_country.sendKeys("india",Keys.ARROW_DOWN,Keys.ENTER);
		driver.switchTo().defaultContent();	
	}
//	!!!!!................................................!!!!!!!!
	
	public void clickon_date_picker() throws Exception
	{
		Applicationutility.clickme(date_picker);
		Select_Date.sendKeys("03/25/2022");
		date_and_time.sendKeys("03/27/2022:04-57-PM");
	}
	
//	public void clickon_slider() 
//	{
//		Applicationutility.clickme(slider);
//		Applicationutility.mouseover(slider_access);
//	}
	
	public void clickon_progress_bar() throws Exception
	{
		Applicationutility.clickme(progress_bar);
		Applicationutility.clickme(Start_progress_bar);
	}
	
	public void clickon_tabs() throws Exception
	{
		Applicationutility.clickme(tabs);
		Applicationutility.clickme(tabs1);
		Applicationutility.clickme(tabs2);
		Applicationutility.clickme(tabs3);
	}
	
	public void clickon_tooltips() throws Exception
	{
		Applicationutility.clickme(tool_tips);
	}
	
	
	public void clickon_menu() throws Exception
	{
		Applicationutility.clickme(menu);
		Applicationutility.clickme(home);
		Applicationutility.clickme(about);
		Applicationutility.mouseover(services);
		System.out.println("Done Mouse hover on 'SEO' from Menu");
		Applicationutility.mouseover(blog);
		System.out.println("Done Mouse hover on 'CSS' from Menu");
		Applicationutility.clickme(contacts);
	}
	
	public void clickon_select_menu() throws Exception
	{
		Applicationutility.clickme(select_menu);
		Applicationutility.clickme(select_value);
		Select select= new Select(select_value);
		select.selectByVisibleText("Group 1, Option 2");
		
		Thread.sleep(1000);
		Applicationutility.clickme(select_one);
		Select select1= new Select(select_one);
		select1.selectByVisibleText("CSS");
		
		Thread.sleep(1000);
		Applicationutility.clickme(old_style_select_one);
		Select select2= new Select(old_style_select_one);
		select2.selectByVisibleText("PHP");
		
		Thread.sleep(1000);
		Select select3= new Select(multiselector);
		select3.selectByIndex(0);
		select3.selectByVisibleText("PHP");
		select3.selectByVisibleText("HTML");
		select3.selectByVisibleText("CSS");
		select3.selectByVisibleText("javascript");
	}
	
	public void clickon_interations() throws Exception
	{
		Applicationutility.clickme(interations);
//		 js.executeScript("javascript:window.scrollBy(1000)");
	}
	
	public void clickon_sortable() throws Exception
	{
		Applicationutility.clickme(sortable);
		Applicationutility.clickme(sort);
	}
	//!!!!!....................................................!!!!
	public void clickon_selectable() throws Exception
	{
		Applicationutility.clickme(selectable);
		
		int k = single_click_select_list.size();

		for(int i=0;i<k;i++)
		{
			
		}	
//		Applicationutility.clickme(select_grid);
//			
	}
	//!!!!!....................................................!!!!
	
	public void clickon_resizable() throws Exception
	{
		Applicationutility.clickme(resizable);
		
	}
	
	public void clickon_dropable() throws Exception
	{
		
		Applicationutility.clickme(droppable);
//		driver.switchTo().frame(droppableframe);
//		act.dragAndDrop(dragimg, rectengle).perform();
//		act.clickAndHold(dragimg)
//		.pause(Duration.ofSeconds(2))
//		.moveToElement(rectengle)
//		.pause(Duration.ofSeconds(2))
//		.release()
//		.build()
//		.perform();
	}
	
	public void clickon_draggable() throws Exception
	{
		Applicationutility.clickme(draggable);
		driver.switchTo().frame(draggableframe);
		act.dragAndDropBy(drag_img, 286, 130);
		driver.switchTo().defaultContent();
	}
	
	
	
	
}

