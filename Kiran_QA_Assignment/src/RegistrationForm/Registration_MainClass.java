package RegistrationForm;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
//import org.apache.commons.validator.EmailValidator;
import org.openqa.selenium.WebDriver;
public class Registration_MainClass 
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = null;
		Utility_ReadExcel readExcel=new Utility_ReadExcel();
		
		Browser br=new Browser();
		//String email = "e@e.com";
		//boolean verify = EmailValidator.getInstance().isValid(email);
		//System.out.println(verify);
        try 
        {
        	readExcel.openExcel();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        catch (NullPointerException e) 
        {
        	
        }  
        String url="http://adjiva.com/qa-test/";
        Utility obj =new Utility();
        int r=obj.rownum("testdata");
        
        for (int i=1;i<r;i++)
        {
        	String result="";
        	new Utility_ReadExcel().excelRead("registartion",i);
        	String Error_Message=Utility_ReadExcel.getValue("Error_Message");
        	String Test_Case_ID=Utility_ReadExcel.getValue("Test_Case_ID");
        	new Utility_ReadExcel().excelRead("testdata",i);
        	String brow=Utility_ReadExcel.getValue("Browser(chrome/ie)");
        	String type=Utility_ReadExcel.getValue("TestData_Type");
        	String Module=Utility_ReadExcel.getValue("Module");
        	String FirstName=Utility_ReadExcel.getValue("FirstName");
        	
        	String LastName=Utility_ReadExcel.getValue("LastName");
        	String Department=Utility_ReadExcel.getValue("Department");
        	String UserName=Utility_ReadExcel.getValue("UserName");
        	String Password=Utility_ReadExcel.getValue("Password");
        	String Confirm_Password=Utility_ReadExcel.getValue("Confirm_Password");
        	String Email=Utility_ReadExcel.getValue("Email");
        	String ContactNo=Utility_ReadExcel.getValue("ContactNo");
        	if(i==1)
        	{
        		driver=br.startbrowser(brow, url);
        	}
        	else
        	{
        		driver.navigate().to(url);
        	}
        	POM_generated reg=new POM_generated(driver);
        	obj.waitForElementClickable(driver,reg.txt_Register_FirstName);
        	if(FirstName!=null)
        	{
        		reg.type_txt_Register_FirstName(FirstName);
        	}
        	if(type.equalsIgnoreCase("valid"))
        	{
        		if(!reg.isDisplayed_txt_Register_FirstName_TickIcon())
        		{
        			result=result+"Tick Icon is not displaying for valid Testdata"+"\n";
        		}
        	}
        	if(LastName!=null)
        	{
        		reg.type_txt_Register_LastName(LastName);
        	}
        	if(type.equalsIgnoreCase("valid"))
        	{
        		if(!reg.isDisplayed_txt_Register_LastName_TickIcon())
        		{
        			result=result+"Tick Icon is not displaying for valid Testdata"+"\n";
        		}   		
        	}
        	if(Department!=null)
        	{
        		reg.select_ddl_Register_Department(Department);
        	}
        	if(UserName!=null)
        	{
        		reg.type_txt_Register_UserName(UserName);
        	}
        	if(type.equalsIgnoreCase("valid"))
        	{
        		if(!reg.isDisplayed_txt_Register_UserName_TickIcon())
        		{
        			result=result+"Tick Icon is not displaying for valid Testdata"+"\n";
        		}
        	}
        	if(Password!=null)
        	{
        		reg.type_txt_Register_Password(Password);
        	}
        	if(type.equalsIgnoreCase("valid"))
        	{
        		if(!reg.isDisplayed_txt_Register_Password_TickIcon())
        		{
        			result=result+"Tick Icon is not displaying for valid Testdata"+"\n";
        		}
        	}
        	if(Confirm_Password!=null)
        	{
        		reg.type_txt_Register_Confirm_Password(Confirm_Password);
        	}
        	if(type.equalsIgnoreCase("valid"))
        	{
        		if(!reg.isDisplayed_txt_Register_Confirm_Password_TickIcon())
        		{
        			result=result+"Tick Icon is not displaying for valid Testdata"+"\n";
        		}
        	}
        	if(Email!=null)
        	{
        		reg.type_txt_Register_Email(Email);
        	}
        	if(type.equalsIgnoreCase("valid"))
        	{
        		if(!reg.isDisplayed_txt_Register_Email_TickIcon())
        		{
        			result=result+"Tick Icon is not displaying for valid Testdata"+"\n";
        		}
        	}
        	if(ContactNo!=null)
        	{
        		reg.type_txt_Register_Contact(ContactNo);
        	}
        	if(type.equalsIgnoreCase("valid"))
        	{
        		if(ContactNo!=null)
            	{
        			if(!reg.isDisplayed_txt_Register_Contact_TickIcon())
        			{
        				result=result+"Tick Icon is not displaying for valid Testdata"+"\n";
        			}
            	}
        	}
        	if(reg.isEnabled_click_Register_Submit())
        	{
        		reg.click_click_Register_Submit();
        	}
        	
        	if(type.equalsIgnoreCase("valid"))
        	{
        		try
        		{
        			if(!reg.isDisplayed_txt_Register_Thanks())
        			{
        				result=result+"Thanks page is not displaying for valid data"+"\n";
        			}
        		}
        		catch(NoSuchElementException e)
        		{
        			result=result+"Thanks page is not displaying for valid data"+"\n";
        		}
        	}
        	else if(type.equalsIgnoreCase("empty"))
        	{
        		if(Module.equalsIgnoreCase("FirstName"))
            	{
        			try
        			{
        				if(reg.isDisplayed_txt_Register_FN_Please_Enter_FN())
        				{
        					String test=reg.getText_txt_Register_FN_Please_Enter_FN();       				
        					if(!Error_Message.equalsIgnoreCase(test))
        					{
        						result=result+"Error message mismatched"+"\n";
        					}
        				}
        				else
        				{
        					result=result+"Error message is not displaying"+"\n";
        				}
        				if(!reg.isDisplayed_txt_Register_FN_Please_Enter_FN_Crossicon())
        				{
        					result=result+"Cross icon is not displaying"+"\n";
        				}
        			}
        			catch(NoSuchElementException e)
        			{
        				result = result+"Error message or cross icon is not diaplayed"+"\n";
        			}
        		}
        		else if(Module.equalsIgnoreCase("LastName"))
            	{
        			try
        			{
        				if(reg.isDisplayed_txt_Register_LN_Please_Enter_LN())
        				{
        					String test=reg.getText_txt_Register_LN_Please_Enter_LN();       				
        					if(!Error_Message.equalsIgnoreCase(test))
        					{
        						result=result+"Error message mismatched"+"\n";
        					}
        				}
        				else
        				{
        					result=result+"Error message is not displaying"+"\n";
        				}
        				if(!reg.isDisplayed_txt_Register_LN_Please_Enter_LN_Crossicon())
        				{
        					result=result+"Cross icon is not displaying"+"\n";
        				}
        			}
        			catch(NoSuchElementException e)
        			{
        				result = result+"Error message or cross icon is not diaplayed"+"\n";
        			}
        		}
        		else if(Module.equalsIgnoreCase("UserName"))
            	{
        			try 
        			{
        				if(reg.isDisplayed_txt_Register_UN_Please_Enter_UN())
            			{
            				String test=reg.getText_txt_Register_UN_Please_Enter_UN();       				
            				if(!Error_Message.equalsIgnoreCase(test))
            				{
            					result=result+"Error message mismatched"+"\n";
            				}
            			}
            			else
            			{
            				result=result+"Error message is not displaying"+"\n";
            			}
            			if(!reg.isDisplayed_txt_Register_UN_Please_Enter_UN_Crossicon())
        				{
            				result=result+"Cross icon is not displaying"+"\n";
        				}
        			}
        			catch(NoSuchElementException e)
        			{
        				result = result+"Error message or cross icon is not diaplayed"+"\n";
        			}
        		}
        		else if(Module.equalsIgnoreCase("Password"))
            	{
        			try
        			{
        				if(reg.isDisplayed_txt_Register_PW_Please_Enter_PW())
            			{
            				String test=reg.getText_txt_Register_PW_Please_Enter_PW();       				
            				if(!Error_Message.equalsIgnoreCase(test))
            				{
            					result=result+"Error message mismatched"+"\n";
            				}
            			}
            			else
            			{
            				result=result+"Error message is not displaying"+"\n";
            			}
            			if(!reg.isDisplayed_txt_Register_PW_Please_Enter_PW_Crossicon())
        				{
            				result=result+"Cross icon is not displaying"+"\n";
        				}
        			}
        			catch(NoSuchElementException e)
        			{
        				result = result+"Error message or cross icon is not diaplayed"+"\n";
        			}
        		}
        		else if(Module.equalsIgnoreCase("ConfirmPassword"))
            	{
        			try 
        			{
        				if(reg.isDisplayed_txt_Register_CPW_Please_Enter_CPW())
            			{
            				String test=reg.getText_txt_Register_CPW_Please_Enter_CPW();       				
            				if(!Error_Message.equalsIgnoreCase(test))
            				{
            					result=result+"Error message mismatched"+"\n";
            				}
            			}
            			else
            			{
            				result=result+"Error message is not displaying"+"\n";
            			}
            			if(!reg.isDisplayed_txt_Register_CPW_Please_Enter_CPW_Crossicon())
        				{
            				result=result+"Cross icon is not displaying"+"\n";
        				}
            		}
    				catch(NoSuchElementException e)
    				{
    					result = result+"Error message or cross icon is not diaplayed"+"\n";
    				}
        		}
        		else if(Module.equalsIgnoreCase("Email"))
            	{
        			try
        			{
        				if(reg.isDisplayed_txt_Register_Email_Please_Enter_Email())
            			{
            				String test=reg.getText_txt_Register_Email_Please_Enter_Email();       				
            				if(!Error_Message.equalsIgnoreCase(test))
            				{
            					result=result+"Error message mismatched"+"\n";
            				}
            			}
            			else
            			{
            				result=result+"Error message is not displaying"+"\n";
            			}
            			if(!reg.isDisplayed_txt_Register_Email_Please_Enter_Email_Crossicon())
        				{
            				result=result+"Cross icon is not displaying"+"\n";
        				}
        			}
    				catch(NoSuchElementException e)
    				{
    					result = result+"Error message or cross icon is not diaplayed"+"\n";
    				}
        		}
        		else if(Module.equalsIgnoreCase("Contact"))
            	{
        			try
        			{
        				if(!reg.isDisplayed_txt_Register_Thanks())
        				{
        					result=result+"Thanks page is not displaying for valid data"+"\n";
        				}
        			}
    				catch(NoSuchElementException e)
    				{
    					result = result+"Thanks page is not diaplayed"+"\n";
    				}
        		}
        	}
        	else if(type.equalsIgnoreCase("invalid"))
        	{
        		if(Module.equalsIgnoreCase("FirstName"))
            	{
        			try
        			{
        				if(reg.isDisplayed_txt_Register_FN_This_Is_Not_Valid_FN())
        				{
        					String test=reg.getText_txt_Register_FN_This_Is_Not_Valid_FN();       				
        					if(!Error_Message.equalsIgnoreCase(test))
        					{
        						result=result+"Error message mismatched"+"\n";
        					}
        				}
        				else
        				{
        					result=result+"Error message is not displaying"+"\n";
        				}
        				if(!reg.isDisplayed_txt_Register_This_Is_Not_Valid_FN_Crossicon())
        				{
        					result=result+"Cross icon is not displaying"+"\n";
        				}
        			}
    				catch(NoSuchElementException e)
    				{
    					result = result+"Error message or cross icon is not diaplayed"+"\n";
    				}
        		}
        		else if(Module.equalsIgnoreCase("LastName"))
            	{
        			try
        			{
        				if(reg.isDisplayed_txt_Register_LN_This_Is_Not_Valid_LN())
            			{
            				String test=reg.getText_txt_Register_LN_This_Is_Not_Valid_LN();       				
            				if(!Error_Message.equalsIgnoreCase(test))
            				{
            					result=result+"Error message mismatched"+"\n";
            				}
            			}
            			else
            			{
            				result=result+"Error message is not displaying"+"\n";
            			}
            			if(!reg.isDisplayed_txt_Register_This_Is_Not_Valid_LN_Crossicon())
        				{
            				result=result+"Cross icon is not displaying"+"\n";
        				}
        			}
    				catch(NoSuchElementException e)
    				{
    					result = result+"Error message or cross icon is not diaplayed"+"\n";
    				}
        		}
        		else if(Module.equalsIgnoreCase("UserName"))
            	{
        			try
        			{
        				if(reg.isDisplayed_txt_Register_UN_This_Is_Not_Valid_UN())
        				{
        					String test=reg.getText_txt_Register_UN_This_Is_Not_Valid_UN();       				
        					if(!Error_Message.equalsIgnoreCase(test))
        					{
        						result=result+"Error message mismatched"+"\n";
        					}
        				}
        				else
        				{
        					result=result+"Error message is not displaying"+"\n";
        				}
        				if(!reg.isDisplayed_txt_Register_This_Is_Not_Valid__UN_Crossicon())
        				{
        					result=result+"Cross icon is not displaying"+"\n";
        				}
        			}
        			catch(NoSuchElementException e)
    				{
    					result = result+"Error message or cross icon is not diaplayed"+"\n";
    				}
        		}
        		else if(Module.equalsIgnoreCase("Password"))
            	{
        			try
        			{
        				if(reg.isDisplayed_txt_Register_PW_This_Is_Not_Valid_PW())
            			{
            				String test=reg.getText_txt_Register_PW_This_Is_Not_Valid_PW();       				
            				if(!Error_Message.equalsIgnoreCase(test))
            				{
            					result=result+"Error message mismatched"+"\n";
            				}
            			}
            			else
            			{
            				result=result+"Error message is not displaying"+"\n";
            			}
            			
            			if(!reg.isDisplayed_txt_Register_PW_This_Is_Not_Valid_PW_Crossicon())
        				{
            				result=result+"Cross icon is not displaying"+"\n";
        				}
        			}
        			catch(NoSuchElementException e)
    				{
    					result = result+"Error message or cross icon is not diaplayed"+"\n";
    				}
        		}
        		else if(Module.equalsIgnoreCase("ConfirmPassword"))
            	{
        			try
        			{
        				if(reg.isDisplayed_txt_Register_CPW_This_Is_Not_Valid_CPW())
        				{
        					String test=reg.getText_txt_Register_CPW_This_Is_Not_Valid_CPW();       				
        					if(!Error_Message.equalsIgnoreCase(test))
        					{
        						result=result+"Error message mismatched"+"\n";
        					}
        				
        				}
            			else
            			{
            				result=result+"Error message is not displaying"+"\n";
            			}
            			if(!reg.isDisplayed_txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon())
        				{
            				result=result+"Cross icon is not displaying"+"\n";
        				}
            		}
        			catch(NoSuchElementException e)
    				{
    					result = result+"Error message or cross icon is not diaplayed"+"\n";
    				}
        		}
        		else if(Module.equalsIgnoreCase("Email"))
            	{
        			try
        			{
        				if(reg.isDisplayed_txt_Register_Email_This_Is_Not_Valid_Email())
        				{
        					String test=reg.getText_txt_Register_Email_This_Is_Not_Valid_Email();       				
        					if(!Error_Message.equalsIgnoreCase(test))
        					{
        						result=result+"Error message mismatched"+"\n";
        					}
        				}
        				else
        				{
        					result=result+"Error message is not displaying"+"\n";
        				}
        				if(!reg.isDisplayed_txt_Register_Email_This_Is_Not_Valid_Email_Crossicon())
        				{
        					result=result+"Cross icon is not displaying"+"\n";
        				}
        			}
        			catch(NoSuchElementException e)
    				{
    					result = result+"Error message or cross icon is not diaplayed"+"\n";
    				}
        		}
        		else if(Module.equalsIgnoreCase("Contact"))
            	{
        			try
        			{
        				if(reg.isDisplayed_txt_Register_Contact_This_Is_Not_Valid_Contact())
            			{
            				String test=reg.getText_txt_Register_Contact_This_Is_Not_Valid_Contact();       				
            				if(!Error_Message.equalsIgnoreCase(test))
            				{
            					result=result+"Error message mismatched"+"\n";
            				}
            			}
            			else
            			{
            				result=result+"Error message is not displaying"+"\n";
            			}
            			if(!reg.isDisplayed_txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon())
        				{
            				result=result+"Cross icon is not displaying"+"\n";
        				}
        			}
        			catch(NoSuchElementException e)
    				{
    					result = result+"Error message or cross icon is not diaplayed"+"\n";
    				}
        		}
        	}
        	if(result.isEmpty())
        	{
        		String path=System.getProperty("user.dir")+"\\Screenshots\\PassedScreenshot\\"+Test_Case_ID;
        		obj.Ashot_Screenshot(driver, path);
        		
        		obj.WriteXLSXFile("registartion", "Actual_results", i, "Pass");
        		obj.WriteXLSXFile("registartion", "Status", i, "Pass");
        	}
        	else
        	{
        		String path=System.getProperty("user.dir")+"\\Screenshots\\FailedScreenshot\\"+Test_Case_ID;
        		obj.Ashot_Screenshot(driver, path);
        		obj.WriteXLSXFile("registartion", "Actual_results", i, result);
        		obj.WriteXLSXFile("registartion", "Status", i, "Fail");
        	}
        	
        }  
        driver.close();
	}
}
