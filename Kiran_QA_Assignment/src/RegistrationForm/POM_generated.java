//******************************
package  RegistrationForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class POM_generated 
{ 
	WebDriver driver;
	public POM_generated (WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Associated Label : Register_FirstName
	@FindBy(name = "first_name")
	public WebElement txt_Register_FirstName;
	
	// Associated Label : Register_FN_Please_Enter_FN
	@FindBy(xpath = "//small[@data-bv-validator='notEmpty' and @data-bv-validator-for='first_name']")
	public WebElement txt_Register_FN_Please_Enter_FN;
	
	// Associated Label : Register_FN_Please_Enter_FN_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon-remove glyphicon' and @data-bv-icon-for='first_name' ]")
	public WebElement txt_Register_FN_Please_Enter_FN_Crossicon;
	
	// Associated Label : Register_FN_This_Is_Not_Valid_FN
	@FindBy(xpath = "//small[@data-bv-validator='stringLength' and @data-bv-validator-for='first_name']")
	public WebElement txt_Register_FN_This_Is_Not_Valid_FN;
	
	// Associated Label : Register_This_Is_Not_Valid_FN_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-remove' and @data-bv-icon-for='first_name' ]")
	public WebElement txt_Register_This_Is_Not_Valid_FN_Crossicon;
	
	// Associated Label : Register_FirstName_TickIcon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-ok' and @data-bv-icon-for='first_name' ]")
	public WebElement txt_Register_FirstName_TickIcon;
	
	// Associated Label : Register_LastName
	@FindBy(name = "last_name")
	public WebElement txt_Register_LastName;
	
	// Associated Label : Register_LN_Please_Enter_LN
	@FindBy(xpath = "//small[@data-bv-validator='notEmpty' and @data-bv-validator-for='last_name']")
	public WebElement txt_Register_LN_Please_Enter_LN;
	
	// Associated Label : Register_LN_Please_Enter_LN_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon-remove glyphicon' and @data-bv-icon-for='last_name' ]")
	public WebElement txt_Register_LN_Please_Enter_LN_Crossicon;
	
	// Associated Label : Register_LN_This_Is_Not_Valid_LN
	@FindBy(xpath = "//small[@data-bv-validator='stringLength' and @data-bv-validator-for='last_name']")
	public WebElement txt_Register_LN_This_Is_Not_Valid_LN;
	
	// Associated Label : Register_This_Is_Not_Valid_LN_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-remove' and @data-bv-icon-for='last_name' ]")
	public WebElement txt_Register_This_Is_Not_Valid_LN_Crossicon;
	
	// Associated Label : Register_LastName_TickIcon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-ok' and @data-bv-icon-for='last_name' ]")
	public WebElement txt_Register_LastName_TickIcon;
	
	// Associated Label : Register_Department
	@FindBy(name = "department")
	public WebElement ddl_Register_Department;
	
	// Associated Label : Register_UserName
	@FindBy(name = "user_name")
	public WebElement txt_Register_UserName;
	
	// Associated Label : Register_UN_Please_Enter_UN
	@FindBy(xpath = "//small[@data-bv-validator='notEmpty' and @data-bv-validator-for='user_name']")
	public WebElement txt_Register_UN_Please_Enter_UN;
	
	// Associated Label : Register_UN_Please_Enter_UN_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon-remove glyphicon' and @data-bv-icon-for='user_name' ]")
	public WebElement txt_Register_UN_Please_Enter_UN_Crossicon;
	
	// Associated Label : Register_UN_This_Is_Not_Valid_UN
	@FindBy(xpath = "//small[@data-bv-validator='stringLength' and @data-bv-validator-for='user_name']")
	public WebElement txt_Register_UN_This_Is_Not_Valid_UN;
	
	// Associated Label : Register_This_Is_Not_Valid__UN_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-remove' and @data-bv-icon-for='user_name' ]")
	public WebElement txt_Register_This_Is_Not_Valid__UN_Crossicon;
	
	// Associated Label : Register_UserName_TickIcon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-ok' and @data-bv-icon-for='user_name' ]")
	public WebElement txt_Register_UserName_TickIcon;
	
	// Associated Label : Register_Password
	@FindBy(name = "user_password")
	public WebElement txt_Register_Password;
	
	// Associated Label : Register_PW_Please_Enter_PW
	@FindBy(xpath = "//small[@data-bv-validator='notEmpty' and @data-bv-validator-for='user_password']")
	public WebElement txt_Register_PW_Please_Enter_PW;
	
	// Associated Label : Register_PW_Please_Enter_PW_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon-remove glyphicon' and @data-bv-icon-for='user_password' ]")
	public WebElement txt_Register_PW_Please_Enter_PW_Crossicon;
	
	// Associated Label : Register_PW_This_Is_Not_Valid_PW
	@FindBy(xpath = "//small[@data-bv-validator='stringLength' and @data-bv-validator-for='user_password']")
	public WebElement txt_Register_PW_This_Is_Not_Valid_PW;
	
	// Associated Label : Register_PW_This_Is_Not_Valid_PW_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-remove' and @data-bv-icon-for='user_password' ]")
	public WebElement txt_Register_PW_This_Is_Not_Valid_PW_Crossicon;
	
	// Associated Label : Register_Password_TickIcon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-ok' and @data-bv-icon-for='user_password' ]")
	public WebElement txt_Register_Password_TickIcon;
	
	// Associated Label : Register_Confirm_Password
	@FindBy(name = "confirm_password")
	public WebElement txt_Register_Confirm_Password;
	
	// Associated Label : Register_CPW_Please_Enter_CPW
	@FindBy(xpath = "//small[@data-bv-validator='notEmpty' and @data-bv-validator-for='confirm_password']")
	public WebElement txt_Register_CPW_Please_Enter_CPW;
	
	// Associated Label : Register_CPW_Please_Enter_CPW_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon-remove glyphicon' and @data-bv-icon-for='confirm_password' ]")
	public WebElement txt_Register_CPW_Please_Enter_CPW_Crossicon;
	
	// Associated Label : Register_CPW_This_Is_Not_Valid_CPW
	@FindBy(xpath = "//small[@data-bv-validator='stringLength' and @data-bv-validator-for='confirm_password']")
	public WebElement txt_Register_CPW_This_Is_Not_Valid_CPW;
	
	// Associated Label : Register_CPW_This_Is_Not_Valid_CPW_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-remove' and @data-bv-icon-for='confirm_password' ]")
	public WebElement txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon;
	
	// Associated Label : Register_Confirm_Password_TickIcon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-ok' and @data-bv-icon-for='confirm_password' ]")
	public WebElement txt_Register_Confirm_Password_TickIcon;
	
	// Associated Label : Register_Email
	@FindBy(name = "email")
	public WebElement txt_Register_Email;
			
	// Associated Label : Register_Email_Please_Enter_Email
	@FindBy(xpath = "//small[@data-bv-validator='notEmpty' and @data-bv-validator-for='email']")
	public WebElement txt_Register_Email_Please_Enter_Email;
	
	// Associated Label : Register_Email_Please_Enter_Email_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-remove' and @data-bv-icon-for='email' ]")
	public WebElement txt_Register_Email_Please_Enter_Email_Crossicon;
	
	// Associated Label : Register_Email_This_Is_Not_Valid_Email
	@FindBy(xpath = "//small[@data-bv-validator='stringLength' and @data-bv-validator-for='email']")
	public WebElement txt_Register_Email_This_Is_Not_Valid_Email;
	
	// Associated Label : Register_Email_This_Is_Not_Valid_Email_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon-remove glyphicon' and @data-bv-icon-for='email' ]")
	public WebElement txt_Register_Email_This_Is_Not_Valid_Email_Crossicon;
	
	// Associated Label : Register_Email_TickIcon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-ok' and @data-bv-icon-for='email' ]")
	public WebElement txt_Register_Email_TickIcon;
	
	// Associated Label : Register_Contact
	@FindBy(name = "contact_no")
	public WebElement txt_Register_Contact;
	
	// Associated Label : Register_Contact_Please_Enter_Contact
	@FindBy(xpath = "//small[@data-bv-validator='notEmpty' and @data-bv-validator-for='contact_no']")
	public WebElement txt_Register_Contact_Please_Enter_Contact;
	
	// Associated Label : Register_Contact_Please_Enter_Contact_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon-remove glyphicon' and @data-bv-icon-for='contact_no' ]")
	public WebElement txt_Register_Contact_Please_Enter_Contact_Crossicon;
	
	// Associated Label : Register_Contact_This_Is_Not_Valid_Contact
	@FindBy(xpath = "//small[@data-bv-validator='stringLength' and @data-bv-validator-for='contact_no']")
	public WebElement txt_Register_Contact_This_Is_Not_Valid_Contact;
	
	// Associated Label : Register_Contact_This_Is_Not_Valid_Contact_Crossicon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-remove' and @data-bv-icon-for='contact_no' ]")
	public WebElement txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon;
	
	// Associated Label : Register_Contact_TickIcon
	@FindBy(xpath = "//i[@class='form-control-feedback glyphicon glyphicon-ok' and @data-bv-icon-for='contact_no' ]")
	public WebElement txt_Register_Contact_TickIcon;
	
	// Associated Label : Register_Submit
	@FindBy(xpath = "//button[@type='submit' or @class='btn btn-warning']")
	public WebElement click_Register_Submit;
	
	// Associated Label : Register_Thanks
	@FindBy(xpath = "//b[text()='Thanks']")
	public WebElement txt_Register_Thanks;
	
	// Type:  Register_FirstName
	public void type_txt_Register_FirstName(String value) {
		txt_Register_FirstName.clear();
		txt_Register_FirstName.sendKeys(value);
	}

	//click:  Register_FirstName
	public void click_txt_Register_FirstName(){
		txt_Register_FirstName.click();
	}

	// Hover:  Register_FirstName
	public void hover_txt_Register_FirstName(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_FirstName).build().perform();
	}

	// visible or Not :  Register_FirstName
	public boolean isDisplayed_txt_Register_FirstName(){
		if(txt_Register_FirstName.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_FirstName
	public boolean isEnabled_txt_Register_FirstName(){
		if(txt_Register_FirstName.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_FirstName
	public String getCssValue_txt_Register_FirstName(String attribute) {
		return txt_Register_FirstName.getCssValue(attribute);
	}

	//Get the text :  Register_FirstName
	public String getText_txt_Register_FirstName(){
		return txt_Register_FirstName.getText();
	}

	//Get the value :  Register_FirstName
	public String getValue_txt_Register_FirstName(){
		return txt_Register_FirstName.getAttribute("value");
	}
	// selected or Not :  Register_FirstName
	public boolean isSelected_txt_Register_FirstName(){
		if(txt_Register_FirstName.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_FN_Please_Enter_FN
	public void type_txt_Register_FN_Please_Enter_FN(String value) {
		txt_Register_FN_Please_Enter_FN.clear();
		txt_Register_FN_Please_Enter_FN.sendKeys(value);
	}

	//click:  Register_FN_Please_Enter_FN
	public void click_txt_Register_FN_Please_Enter_FN(){
		txt_Register_FN_Please_Enter_FN.click();
	}

	// Hover:  Register_FN_Please_Enter_FN
	public void hover_txt_Register_FN_Please_Enter_FN(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_FN_Please_Enter_FN).build().perform();
	}

	// visible or Not :  Register_FN_Please_Enter_FN
	public boolean isDisplayed_txt_Register_FN_Please_Enter_FN(){
		if(txt_Register_FN_Please_Enter_FN.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_FN_Please_Enter_FN
	public boolean isEnabled_txt_Register_FN_Please_Enter_FN(){
		if(txt_Register_FN_Please_Enter_FN.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_FN_Please_Enter_FN
	public String getCssValue_txt_Register_FN_Please_Enter_FN(String attribute) {
		return txt_Register_FN_Please_Enter_FN.getCssValue(attribute);
	}

	//Get the text :  Register_FN_Please_Enter_FN
	public String getText_txt_Register_FN_Please_Enter_FN(){
		return txt_Register_FN_Please_Enter_FN.getText();
	}

	//Get the value :  Register_FN_Please_Enter_FN
	public String getValue_txt_Register_FN_Please_Enter_FN(){
		return txt_Register_FN_Please_Enter_FN.getAttribute("value");
	}
	// selected or Not :  Register_FN_Please_Enter_FN
	public boolean isSelected_txt_Register_FN_Please_Enter_FN(){
		if(txt_Register_FN_Please_Enter_FN.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_FN_Please_Enter_FN_Crossicon
	public void type_txt_Register_FN_Please_Enter_FN_Crossicon(String value) {
		txt_Register_FN_Please_Enter_FN_Crossicon.clear();
		txt_Register_FN_Please_Enter_FN_Crossicon.sendKeys(value);
	}

	//click:  Register_FN_Please_Enter_FN_Crossicon
	public void click_txt_Register_FN_Please_Enter_FN_Crossicon(){
		txt_Register_FN_Please_Enter_FN_Crossicon.click();
	}

	// Hover:  Register_FN_Please_Enter_FN_Crossicon
	public void hover_txt_Register_FN_Please_Enter_FN_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_FN_Please_Enter_FN_Crossicon).build().perform();
	}

	// visible or Not :  Register_FN_Please_Enter_FN_Crossicon
	public boolean isDisplayed_txt_Register_FN_Please_Enter_FN_Crossicon(){
		if(txt_Register_FN_Please_Enter_FN_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_FN_Please_Enter_FN_Crossicon
	public boolean isEnabled_txt_Register_FN_Please_Enter_FN_Crossicon(){
		if(txt_Register_FN_Please_Enter_FN_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_FN_Please_Enter_FN_Crossicon
	public String getCssValue_txt_Register_FN_Please_Enter_FN_Crossicon(String attribute) {
		return txt_Register_FN_Please_Enter_FN_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_FN_Please_Enter_FN_Crossicon
	public String getText_txt_Register_FN_Please_Enter_FN_Crossicon(){
		return txt_Register_FN_Please_Enter_FN_Crossicon.getText();
	}

	//Get the value :  Register_FN_Please_Enter_FN_Crossicon
	public String getValue_txt_Register_FN_Please_Enter_FN_Crossicon(){
		return txt_Register_FN_Please_Enter_FN_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_FN_Please_Enter_FN_Crossicon
	public boolean isSelected_txt_Register_FN_Please_Enter_FN_Crossicon(){
		if(txt_Register_FN_Please_Enter_FN_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_FN_This_Is_Not_Valid_FN
	public void type_txt_Register_FN_This_Is_Not_Valid_FN(String value) {
		txt_Register_FN_This_Is_Not_Valid_FN.clear();
		txt_Register_FN_This_Is_Not_Valid_FN.sendKeys(value);
	}

	//click:  Register_FN_This_Is_Not_Valid_FN
	public void click_txt_Register_FN_This_Is_Not_Valid_FN(){
		txt_Register_FN_This_Is_Not_Valid_FN.click();
	}

	// Hover:  Register_FN_This_Is_Not_Valid_FN
	public void hover_txt_Register_FN_This_Is_Not_Valid_FN(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_FN_This_Is_Not_Valid_FN).build().perform();
	}

	// visible or Not :  Register_FN_This_Is_Not_Valid_FN
	public boolean isDisplayed_txt_Register_FN_This_Is_Not_Valid_FN(){
		if(txt_Register_FN_This_Is_Not_Valid_FN.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_FN_This_Is_Not_Valid_FN
	public boolean isEnabled_txt_Register_FN_This_Is_Not_Valid_FN(){
		if(txt_Register_FN_This_Is_Not_Valid_FN.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_FN_This_Is_Not_Valid_FN
	public String getCssValue_txt_Register_FN_This_Is_Not_Valid_FN(String attribute) {
		return txt_Register_FN_This_Is_Not_Valid_FN.getCssValue(attribute);
	}

	//Get the text :  Register_FN_This_Is_Not_Valid_FN
	public String getText_txt_Register_FN_This_Is_Not_Valid_FN(){
		return txt_Register_FN_This_Is_Not_Valid_FN.getText();
	}

	//Get the value :  Register_FN_This_Is_Not_Valid_FN
	public String getValue_txt_Register_FN_This_Is_Not_Valid_FN(){
		return txt_Register_FN_This_Is_Not_Valid_FN.getAttribute("value");
	}
	// selected or Not :  Register_FN_This_Is_Not_Valid_FN
	public boolean isSelected_txt_Register_FN_This_Is_Not_Valid_FN(){
		if(txt_Register_FN_This_Is_Not_Valid_FN.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_This_Is_Not_Valid_FN_Crossicon
	public void type_txt_Register_This_Is_Not_Valid_FN_Crossicon(String value) {
		txt_Register_This_Is_Not_Valid_FN_Crossicon.clear();
		txt_Register_This_Is_Not_Valid_FN_Crossicon.sendKeys(value);
	}

	//click:  Register_This_Is_Not_Valid_FN_Crossicon
	public void click_txt_Register_This_Is_Not_Valid_FN_Crossicon(){
		txt_Register_This_Is_Not_Valid_FN_Crossicon.click();
	}

	// Hover:  Register_This_Is_Not_Valid_FN_Crossicon
	public void hover_txt_Register_This_Is_Not_Valid_FN_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_This_Is_Not_Valid_FN_Crossicon).build().perform();
	}

	// visible or Not :  Register_This_Is_Not_Valid_FN_Crossicon
	public boolean isDisplayed_txt_Register_This_Is_Not_Valid_FN_Crossicon(){
		if(txt_Register_This_Is_Not_Valid_FN_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_This_Is_Not_Valid_FN_Crossicon
	public boolean isEnabled_txt_Register_This_Is_Not_Valid_FN_Crossicon(){
		if(txt_Register_This_Is_Not_Valid_FN_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_This_Is_Not_Valid_FN_Crossicon
	public String getCssValue_txt_Register_This_Is_Not_Valid_FN_Crossicon(String attribute) {
		return txt_Register_This_Is_Not_Valid_FN_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_This_Is_Not_Valid_FN_Crossicon
	public String getText_txt_Register_This_Is_Not_Valid_FN_Crossicon(){
		return txt_Register_This_Is_Not_Valid_FN_Crossicon.getText();
	}

	//Get the value :  Register_This_Is_Not_Valid_FN_Crossicon
	public String getValue_txt_Register_This_Is_Not_Valid_FN_Crossicon(){
		return txt_Register_This_Is_Not_Valid_FN_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_This_Is_Not_Valid_FN_Crossicon
	public boolean isSelected_txt_Register_This_Is_Not_Valid_FN_Crossicon(){
		if(txt_Register_This_Is_Not_Valid_FN_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_FirstName_TickIcon
	public void type_txt_Register_FirstName_TickIcon(String value) {
		txt_Register_FirstName_TickIcon.clear();
		txt_Register_FirstName_TickIcon.sendKeys(value);
	}

	//click:  Register_FirstName_TickIcon
	public void click_txt_Register_FirstName_TickIcon(){
		txt_Register_FirstName_TickIcon.click();
	}

	// Hover:  Register_FirstName_TickIcon
	public void hover_txt_Register_FirstName_TickIcon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_FirstName_TickIcon).build().perform();
	}

	// visible or Not :  Register_FirstName_TickIcon
	public boolean isDisplayed_txt_Register_FirstName_TickIcon(){
		if(txt_Register_FirstName_TickIcon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_FirstName_TickIcon
	public boolean isEnabled_txt_Register_FirstName_TickIcon(){
		if(txt_Register_FirstName_TickIcon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_FirstName_TickIcon
	public String getCssValue_txt_Register_FirstName_TickIcon(String attribute) {
		return txt_Register_FirstName_TickIcon.getCssValue(attribute);
	}

	//Get the text :  Register_FirstName_TickIcon
	public String getText_txt_Register_FirstName_TickIcon(){
		return txt_Register_FirstName_TickIcon.getText();
	}

	//Get the value :  Register_FirstName_TickIcon
	public String getValue_txt_Register_FirstName_TickIcon(){
		return txt_Register_FirstName_TickIcon.getAttribute("value");
	}
	// selected or Not :  Register_FirstName_TickIcon
	public boolean isSelected_txt_Register_FirstName_TickIcon(){
		if(txt_Register_FirstName_TickIcon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_LastName
	public void type_txt_Register_LastName(String value) {
		txt_Register_LastName.clear();
		txt_Register_LastName.sendKeys(value);
	}

	//click:  Register_LastName
	public void click_txt_Register_LastName(){
		txt_Register_LastName.click();
	}

	// Hover:  Register_LastName
	public void hover_txt_Register_LastName(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_LastName).build().perform();
	}

	// visible or Not :  Register_LastName
	public boolean isDisplayed_txt_Register_LastName(){
		if(txt_Register_LastName.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_LastName
	public boolean isEnabled_txt_Register_LastName(){
		if(txt_Register_LastName.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_LastName
	public String getCssValue_txt_Register_LastName(String attribute) {
		return txt_Register_LastName.getCssValue(attribute);
	}

	//Get the text :  Register_LastName
	public String getText_txt_Register_LastName(){
		return txt_Register_LastName.getText();
	}

	//Get the value :  Register_LastName
	public String getValue_txt_Register_LastName(){
		return txt_Register_LastName.getAttribute("value");
	}
	// selected or Not :  Register_LastName
	public boolean isSelected_txt_Register_LastName(){
		if(txt_Register_LastName.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_LN_Please_Enter_LN
	public void type_txt_Register_LN_Please_Enter_LN(String value) {
		txt_Register_LN_Please_Enter_LN.clear();
		txt_Register_LN_Please_Enter_LN.sendKeys(value);
	}

	//click:  Register_LN_Please_Enter_LN
	public void click_txt_Register_LN_Please_Enter_LN(){
		txt_Register_LN_Please_Enter_LN.click();
	}

	// Hover:  Register_LN_Please_Enter_LN
	public void hover_txt_Register_LN_Please_Enter_LN(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_LN_Please_Enter_LN).build().perform();
	}

	// visible or Not :  Register_LN_Please_Enter_LN
	public boolean isDisplayed_txt_Register_LN_Please_Enter_LN(){
		if(txt_Register_LN_Please_Enter_LN.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_LN_Please_Enter_LN
	public boolean isEnabled_txt_Register_LN_Please_Enter_LN(){
		if(txt_Register_LN_Please_Enter_LN.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_LN_Please_Enter_LN
	public String getCssValue_txt_Register_LN_Please_Enter_LN(String attribute) {
		return txt_Register_LN_Please_Enter_LN.getCssValue(attribute);
	}

	//Get the text :  Register_LN_Please_Enter_LN
	public String getText_txt_Register_LN_Please_Enter_LN(){
		return txt_Register_LN_Please_Enter_LN.getText();
	}

	//Get the value :  Register_LN_Please_Enter_LN
	public String getValue_txt_Register_LN_Please_Enter_LN(){
		return txt_Register_LN_Please_Enter_LN.getAttribute("value");
	}
	// selected or Not :  Register_LN_Please_Enter_LN
	public boolean isSelected_txt_Register_LN_Please_Enter_LN(){
		if(txt_Register_LN_Please_Enter_LN.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_LN_Please_Enter_LN_Crossicon
	public void type_txt_Register_LN_Please_Enter_LN_Crossicon(String value) {
		txt_Register_LN_Please_Enter_LN_Crossicon.clear();
		txt_Register_LN_Please_Enter_LN_Crossicon.sendKeys(value);
	}

	//click:  Register_LN_Please_Enter_LN_Crossicon
	public void click_txt_Register_LN_Please_Enter_LN_Crossicon(){
		txt_Register_LN_Please_Enter_LN_Crossicon.click();
	}

	// Hover:  Register_LN_Please_Enter_LN_Crossicon
	public void hover_txt_Register_LN_Please_Enter_LN_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_LN_Please_Enter_LN_Crossicon).build().perform();
	}

	// visible or Not :  Register_LN_Please_Enter_LN_Crossicon
	public boolean isDisplayed_txt_Register_LN_Please_Enter_LN_Crossicon(){
		if(txt_Register_LN_Please_Enter_LN_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_LN_Please_Enter_LN_Crossicon
	public boolean isEnabled_txt_Register_LN_Please_Enter_LN_Crossicon(){
		if(txt_Register_LN_Please_Enter_LN_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_LN_Please_Enter_LN_Crossicon
	public String getCssValue_txt_Register_LN_Please_Enter_LN_Crossicon(String attribute) {
		return txt_Register_LN_Please_Enter_LN_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_LN_Please_Enter_LN_Crossicon
	public String getText_txt_Register_LN_Please_Enter_LN_Crossicon(){
		return txt_Register_LN_Please_Enter_LN_Crossicon.getText();
	}

	//Get the value :  Register_LN_Please_Enter_LN_Crossicon
	public String getValue_txt_Register_LN_Please_Enter_LN_Crossicon(){
		return txt_Register_LN_Please_Enter_LN_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_LN_Please_Enter_LN_Crossicon
	public boolean isSelected_txt_Register_LN_Please_Enter_LN_Crossicon(){
		if(txt_Register_LN_Please_Enter_LN_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_LN_This_Is_Not_Valid_LN
	public void type_txt_Register_LN_This_Is_Not_Valid_LN(String value) {
		txt_Register_LN_This_Is_Not_Valid_LN.clear();
		txt_Register_LN_This_Is_Not_Valid_LN.sendKeys(value);
	}

	//click:  Register_LN_This_Is_Not_Valid_LN
	public void click_txt_Register_LN_This_Is_Not_Valid_LN(){
		txt_Register_LN_This_Is_Not_Valid_LN.click();
	}

	// Hover:  Register_LN_This_Is_Not_Valid_LN
	public void hover_txt_Register_LN_This_Is_Not_Valid_LN(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_LN_This_Is_Not_Valid_LN).build().perform();
	}

	// visible or Not :  Register_LN_This_Is_Not_Valid_LN
	public boolean isDisplayed_txt_Register_LN_This_Is_Not_Valid_LN(){
		if(txt_Register_LN_This_Is_Not_Valid_LN.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_LN_This_Is_Not_Valid_LN
	public boolean isEnabled_txt_Register_LN_This_Is_Not_Valid_LN(){
		if(txt_Register_LN_This_Is_Not_Valid_LN.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_LN_This_Is_Not_Valid_LN
	public String getCssValue_txt_Register_LN_This_Is_Not_Valid_LN(String attribute) {
		return txt_Register_LN_This_Is_Not_Valid_LN.getCssValue(attribute);
	}

	//Get the text :  Register_LN_This_Is_Not_Valid_LN
	public String getText_txt_Register_LN_This_Is_Not_Valid_LN(){
		return txt_Register_LN_This_Is_Not_Valid_LN.getText();
	}

	//Get the value :  Register_LN_This_Is_Not_Valid_LN
	public String getValue_txt_Register_LN_This_Is_Not_Valid_LN(){
		return txt_Register_LN_This_Is_Not_Valid_LN.getAttribute("value");
	}
	// selected or Not :  Register_LN_This_Is_Not_Valid_LN
	public boolean isSelected_txt_Register_LN_This_Is_Not_Valid_LN(){
		if(txt_Register_LN_This_Is_Not_Valid_LN.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_This_Is_Not_Valid_LN_Crossicon
	public void type_txt_Register_This_Is_Not_Valid_LN_Crossicon(String value) {
		txt_Register_This_Is_Not_Valid_LN_Crossicon.clear();
		txt_Register_This_Is_Not_Valid_LN_Crossicon.sendKeys(value);
	}

	//click:  Register_This_Is_Not_Valid_LN_Crossicon
	public void click_txt_Register_This_Is_Not_Valid_LN_Crossicon(){
		txt_Register_This_Is_Not_Valid_LN_Crossicon.click();
	}

	// Hover:  Register_This_Is_Not_Valid_LN_Crossicon
	public void hover_txt_Register_This_Is_Not_Valid_LN_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_This_Is_Not_Valid_LN_Crossicon).build().perform();
	}

	// visible or Not :  Register_This_Is_Not_Valid_LN_Crossicon
	public boolean isDisplayed_txt_Register_This_Is_Not_Valid_LN_Crossicon(){
		if(txt_Register_This_Is_Not_Valid_LN_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_This_Is_Not_Valid_LN_Crossicon
	public boolean isEnabled_txt_Register_This_Is_Not_Valid_LN_Crossicon(){
		if(txt_Register_This_Is_Not_Valid_LN_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_This_Is_Not_Valid_LN_Crossicon
	public String getCssValue_txt_Register_This_Is_Not_Valid_LN_Crossicon(String attribute) {
		return txt_Register_This_Is_Not_Valid_LN_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_This_Is_Not_Valid_LN_Crossicon
	public String getText_txt_Register_This_Is_Not_Valid_LN_Crossicon(){
		return txt_Register_This_Is_Not_Valid_LN_Crossicon.getText();
	}

	//Get the value :  Register_This_Is_Not_Valid_LN_Crossicon
	public String getValue_txt_Register_This_Is_Not_Valid_LN_Crossicon(){
		return txt_Register_This_Is_Not_Valid_LN_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_This_Is_Not_Valid_LN_Crossicon
	public boolean isSelected_txt_Register_This_Is_Not_Valid_LN_Crossicon(){
		if(txt_Register_This_Is_Not_Valid_LN_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_LastName_TickIcon
	public void type_txt_Register_LastName_TickIcon(String value) {
		txt_Register_LastName_TickIcon.clear();
		txt_Register_LastName_TickIcon.sendKeys(value);
	}

	//click:  Register_LastName_TickIcon
	public void click_txt_Register_LastName_TickIcon(){
		txt_Register_LastName_TickIcon.click();
	}

	// Hover:  Register_LastName_TickIcon
	public void hover_txt_Register_LastName_TickIcon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_LastName_TickIcon).build().perform();
	}

	// visible or Not :  Register_LastName_TickIcon
	public boolean isDisplayed_txt_Register_LastName_TickIcon(){
		if(txt_Register_LastName_TickIcon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_LastName_TickIcon
	public boolean isEnabled_txt_Register_LastName_TickIcon(){
		if(txt_Register_LastName_TickIcon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_LastName_TickIcon
	public String getCssValue_txt_Register_LastName_TickIcon(String attribute) {
		return txt_Register_LastName_TickIcon.getCssValue(attribute);
	}

	//Get the text :  Register_LastName_TickIcon
	public String getText_txt_Register_LastName_TickIcon(){
		return txt_Register_LastName_TickIcon.getText();
	}

	//Get the value :  Register_LastName_TickIcon
	public String getValue_txt_Register_LastName_TickIcon(){
		return txt_Register_LastName_TickIcon.getAttribute("value");
	}
	// selected or Not :  Register_LastName_TickIcon
	public boolean isSelected_txt_Register_LastName_TickIcon(){
		if(txt_Register_LastName_TickIcon.isSelected()) { return true; } else { return false;} 
	}

// Method to select a value from dropDown :Register_Department
	public void select_ddl_Register_Department(String value){
		Select Select=new Select(ddl_Register_Department);
	Select.selectByVisibleText(value);
	}

	 // Method to retrieve selected value from drop Down :Register_Department
	public String get_first_Selected_value_ddl_Register_Department(){
		Select Select=new Select(ddl_Register_Department);
		return Select.getFirstSelectedOption().getText();
	}

	//click:  Register_Department
	public void click_ddl_Register_Department(){
		ddl_Register_Department.click();
	}

	// Hover:  Register_Department
	public void hover_ddl_Register_Department(){
		Actions action=new Actions(driver); 
		action.moveToElement(ddl_Register_Department).build().perform();
	}

	// visible or Not :  Register_Department
	public boolean isDisplayed_ddl_Register_Department(){
		if(ddl_Register_Department.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Department
	public boolean isEnabled_ddl_Register_Department(){
		if(ddl_Register_Department.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Department
	public String getCssValue_ddl_Register_Department(String attribute) {
		return ddl_Register_Department.getCssValue(attribute);
	}

	//Get the text :  Register_Department
	public String getText_ddl_Register_Department(){
		return ddl_Register_Department.getText();
	}

	//Get the value :  Register_Department
	public String getValue_ddl_Register_Department(){
		return ddl_Register_Department.getAttribute("value");
	}
	// selected or Not :  Register_Department
	public boolean isSelected_ddl_Register_Department(){
		if(ddl_Register_Department.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_UserName
	public void type_txt_Register_UserName(String value) {
		txt_Register_UserName.clear();
		txt_Register_UserName.sendKeys(value);
	}

	//click:  Register_UserName
	public void click_txt_Register_UserName(){
		txt_Register_UserName.click();
	}

	// Hover:  Register_UserName
	public void hover_txt_Register_UserName(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_UserName).build().perform();
	}

	// visible or Not :  Register_UserName
	public boolean isDisplayed_txt_Register_UserName(){
		if(txt_Register_UserName.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_UserName
	public boolean isEnabled_txt_Register_UserName(){
		if(txt_Register_UserName.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_UserName
	public String getCssValue_txt_Register_UserName(String attribute) {
		return txt_Register_UserName.getCssValue(attribute);
	}

	//Get the text :  Register_UserName
	public String getText_txt_Register_UserName(){
		return txt_Register_UserName.getText();
	}

	//Get the value :  Register_UserName
	public String getValue_txt_Register_UserName(){
		return txt_Register_UserName.getAttribute("value");
	}
	// selected or Not :  Register_UserName
	public boolean isSelected_txt_Register_UserName(){
		if(txt_Register_UserName.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_UN_Please_Enter_UN
	public void type_txt_Register_UN_Please_Enter_UN(String value) {
		txt_Register_UN_Please_Enter_UN.clear();
		txt_Register_UN_Please_Enter_UN.sendKeys(value);
	}

	//click:  Register_UN_Please_Enter_UN
	public void click_txt_Register_UN_Please_Enter_UN(){
		txt_Register_UN_Please_Enter_UN.click();
	}

	// Hover:  Register_UN_Please_Enter_UN
	public void hover_txt_Register_UN_Please_Enter_UN(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_UN_Please_Enter_UN).build().perform();
	}

	// visible or Not :  Register_UN_Please_Enter_UN
	public boolean isDisplayed_txt_Register_UN_Please_Enter_UN(){
		if(txt_Register_UN_Please_Enter_UN.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_UN_Please_Enter_UN
	public boolean isEnabled_txt_Register_UN_Please_Enter_UN(){
		if(txt_Register_UN_Please_Enter_UN.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_UN_Please_Enter_UN
	public String getCssValue_txt_Register_UN_Please_Enter_UN(String attribute) {
		return txt_Register_UN_Please_Enter_UN.getCssValue(attribute);
	}

	//Get the text :  Register_UN_Please_Enter_UN
	public String getText_txt_Register_UN_Please_Enter_UN(){
		return txt_Register_UN_Please_Enter_UN.getText();
	}

	//Get the value :  Register_UN_Please_Enter_UN
	public String getValue_txt_Register_UN_Please_Enter_UN(){
		return txt_Register_UN_Please_Enter_UN.getAttribute("value");
	}
	// selected or Not :  Register_UN_Please_Enter_UN
	public boolean isSelected_txt_Register_UN_Please_Enter_UN(){
		if(txt_Register_UN_Please_Enter_UN.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_UN_Please_Enter_UN_Crossicon
	public void type_txt_Register_UN_Please_Enter_UN_Crossicon(String value) {
		txt_Register_UN_Please_Enter_UN_Crossicon.clear();
		txt_Register_UN_Please_Enter_UN_Crossicon.sendKeys(value);
	}

	//click:  Register_UN_Please_Enter_UN_Crossicon
	public void click_txt_Register_UN_Please_Enter_UN_Crossicon(){
		txt_Register_UN_Please_Enter_UN_Crossicon.click();
	}

	// Hover:  Register_UN_Please_Enter_UN_Crossicon
	public void hover_txt_Register_UN_Please_Enter_UN_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_UN_Please_Enter_UN_Crossicon).build().perform();
	}

	// visible or Not :  Register_UN_Please_Enter_UN_Crossicon
	public boolean isDisplayed_txt_Register_UN_Please_Enter_UN_Crossicon(){
		if(txt_Register_UN_Please_Enter_UN_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_UN_Please_Enter_UN_Crossicon
	public boolean isEnabled_txt_Register_UN_Please_Enter_UN_Crossicon(){
		if(txt_Register_UN_Please_Enter_UN_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_UN_Please_Enter_UN_Crossicon
	public String getCssValue_txt_Register_UN_Please_Enter_UN_Crossicon(String attribute) {
		return txt_Register_UN_Please_Enter_UN_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_UN_Please_Enter_UN_Crossicon
	public String getText_txt_Register_UN_Please_Enter_UN_Crossicon(){
		return txt_Register_UN_Please_Enter_UN_Crossicon.getText();
	}

	//Get the value :  Register_UN_Please_Enter_UN_Crossicon
	public String getValue_txt_Register_UN_Please_Enter_UN_Crossicon(){
		return txt_Register_UN_Please_Enter_UN_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_UN_Please_Enter_UN_Crossicon
	public boolean isSelected_txt_Register_UN_Please_Enter_UN_Crossicon(){
		if(txt_Register_UN_Please_Enter_UN_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_UN_This_Is_Not_Valid_UN
	public void type_txt_Register_UN_This_Is_Not_Valid_UN(String value) {
		txt_Register_UN_This_Is_Not_Valid_UN.clear();
		txt_Register_UN_This_Is_Not_Valid_UN.sendKeys(value);
	}

	//click:  Register_UN_This_Is_Not_Valid_UN
	public void click_txt_Register_UN_This_Is_Not_Valid_UN(){
		txt_Register_UN_This_Is_Not_Valid_UN.click();
	}

	// Hover:  Register_UN_This_Is_Not_Valid_UN
	public void hover_txt_Register_UN_This_Is_Not_Valid_UN(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_UN_This_Is_Not_Valid_UN).build().perform();
	}

	// visible or Not :  Register_UN_This_Is_Not_Valid_UN
	public boolean isDisplayed_txt_Register_UN_This_Is_Not_Valid_UN(){
		if(txt_Register_UN_This_Is_Not_Valid_UN.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_UN_This_Is_Not_Valid_UN
	public boolean isEnabled_txt_Register_UN_This_Is_Not_Valid_UN(){
		if(txt_Register_UN_This_Is_Not_Valid_UN.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_UN_This_Is_Not_Valid_UN
	public String getCssValue_txt_Register_UN_This_Is_Not_Valid_UN(String attribute) {
		return txt_Register_UN_This_Is_Not_Valid_UN.getCssValue(attribute);
	}

	//Get the text :  Register_UN_This_Is_Not_Valid_UN
	public String getText_txt_Register_UN_This_Is_Not_Valid_UN(){
		return txt_Register_UN_This_Is_Not_Valid_UN.getText();
	}

	//Get the value :  Register_UN_This_Is_Not_Valid_UN
	public String getValue_txt_Register_UN_This_Is_Not_Valid_UN(){
		return txt_Register_UN_This_Is_Not_Valid_UN.getAttribute("value");
	}
	// selected or Not :  Register_UN_This_Is_Not_Valid_UN
	public boolean isSelected_txt_Register_UN_This_Is_Not_Valid_UN(){
		if(txt_Register_UN_This_Is_Not_Valid_UN.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_This_Is_Not_Valid__UN_Crossicon
	public void type_txt_Register_This_Is_Not_Valid__UN_Crossicon(String value) {
		txt_Register_This_Is_Not_Valid__UN_Crossicon.clear();
		txt_Register_This_Is_Not_Valid__UN_Crossicon.sendKeys(value);
	}

	//click:  Register_This_Is_Not_Valid__UN_Crossicon
	public void click_txt_Register_This_Is_Not_Valid__UN_Crossicon(){
		txt_Register_This_Is_Not_Valid__UN_Crossicon.click();
	}

	// Hover:  Register_This_Is_Not_Valid__UN_Crossicon
	public void hover_txt_Register_This_Is_Not_Valid__UN_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_This_Is_Not_Valid__UN_Crossicon).build().perform();
	}

	// visible or Not :  Register_This_Is_Not_Valid__UN_Crossicon
	public boolean isDisplayed_txt_Register_This_Is_Not_Valid__UN_Crossicon(){
		if(txt_Register_This_Is_Not_Valid__UN_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_This_Is_Not_Valid__UN_Crossicon
	public boolean isEnabled_txt_Register_This_Is_Not_Valid__UN_Crossicon(){
		if(txt_Register_This_Is_Not_Valid__UN_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_This_Is_Not_Valid__UN_Crossicon
	public String getCssValue_txt_Register_This_Is_Not_Valid__UN_Crossicon(String attribute) {
		return txt_Register_This_Is_Not_Valid__UN_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_This_Is_Not_Valid__UN_Crossicon
	public String getText_txt_Register_This_Is_Not_Valid__UN_Crossicon(){
		return txt_Register_This_Is_Not_Valid__UN_Crossicon.getText();
	}

	//Get the value :  Register_This_Is_Not_Valid__UN_Crossicon
	public String getValue_txt_Register_This_Is_Not_Valid__UN_Crossicon(){
		return txt_Register_This_Is_Not_Valid__UN_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_This_Is_Not_Valid__UN_Crossicon
	public boolean isSelected_txt_Register_This_Is_Not_Valid__UN_Crossicon(){
		if(txt_Register_This_Is_Not_Valid__UN_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_UserName_TickIcon
	public void type_txt_Register_UserName_TickIcon(String value) {
		txt_Register_UserName_TickIcon.clear();
		txt_Register_UserName_TickIcon.sendKeys(value);
	}

	//click:  Register_UserName_TickIcon
	public void click_txt_Register_UserName_TickIcon(){
		txt_Register_UserName_TickIcon.click();
	}

	// Hover:  Register_UserName_TickIcon
	public void hover_txt_Register_UserName_TickIcon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_UserName_TickIcon).build().perform();
	}

	// visible or Not :  Register_UserName_TickIcon
	public boolean isDisplayed_txt_Register_UserName_TickIcon(){
		if(txt_Register_UserName_TickIcon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_UserName_TickIcon
	public boolean isEnabled_txt_Register_UserName_TickIcon(){
		if(txt_Register_UserName_TickIcon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_UserName_TickIcon
	public String getCssValue_txt_Register_UserName_TickIcon(String attribute) {
		return txt_Register_UserName_TickIcon.getCssValue(attribute);
	}

	//Get the text :  Register_UserName_TickIcon
	public String getText_txt_Register_UserName_TickIcon(){
		return txt_Register_UserName_TickIcon.getText();
	}

	//Get the value :  Register_UserName_TickIcon
	public String getValue_txt_Register_UserName_TickIcon(){
		return txt_Register_UserName_TickIcon.getAttribute("value");
	}
	// selected or Not :  Register_UserName_TickIcon
	public boolean isSelected_txt_Register_UserName_TickIcon(){
		if(txt_Register_UserName_TickIcon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Password
	public void type_txt_Register_Password(String value) {
		txt_Register_Password.clear();
		txt_Register_Password.sendKeys(value);
	}

	//click:  Register_Password
	public void click_txt_Register_Password(){
		txt_Register_Password.click();
	}

	// Hover:  Register_Password
	public void hover_txt_Register_Password(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Password).build().perform();
	}

	// visible or Not :  Register_Password
	public boolean isDisplayed_txt_Register_Password(){
		if(txt_Register_Password.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Password
	public boolean isEnabled_txt_Register_Password(){
		if(txt_Register_Password.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Password
	public String getCssValue_txt_Register_Password(String attribute) {
		return txt_Register_Password.getCssValue(attribute);
	}

	//Get the text :  Register_Password
	public String getText_txt_Register_Password(){
		return txt_Register_Password.getText();
	}

	//Get the value :  Register_Password
	public String getValue_txt_Register_Password(){
		return txt_Register_Password.getAttribute("value");
	}
	// selected or Not :  Register_Password
	public boolean isSelected_txt_Register_Password(){
		if(txt_Register_Password.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_PW_Please_Enter_PW
	public void type_txt_Register_PW_Please_Enter_PW(String value) {
		txt_Register_PW_Please_Enter_PW.clear();
		txt_Register_PW_Please_Enter_PW.sendKeys(value);
	}

	//click:  Register_PW_Please_Enter_PW
	public void click_txt_Register_PW_Please_Enter_PW(){
		txt_Register_PW_Please_Enter_PW.click();
	}

	// Hover:  Register_PW_Please_Enter_PW
	public void hover_txt_Register_PW_Please_Enter_PW(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_PW_Please_Enter_PW).build().perform();
	}

	// visible or Not :  Register_PW_Please_Enter_PW
	public boolean isDisplayed_txt_Register_PW_Please_Enter_PW(){
		if(txt_Register_PW_Please_Enter_PW.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_PW_Please_Enter_PW
	public boolean isEnabled_txt_Register_PW_Please_Enter_PW(){
		if(txt_Register_PW_Please_Enter_PW.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_PW_Please_Enter_PW
	public String getCssValue_txt_Register_PW_Please_Enter_PW(String attribute) {
		return txt_Register_PW_Please_Enter_PW.getCssValue(attribute);
	}

	//Get the text :  Register_PW_Please_Enter_PW
	public String getText_txt_Register_PW_Please_Enter_PW(){
		return txt_Register_PW_Please_Enter_PW.getText();
	}

	//Get the value :  Register_PW_Please_Enter_PW
	public String getValue_txt_Register_PW_Please_Enter_PW(){
		return txt_Register_PW_Please_Enter_PW.getAttribute("value");
	}
	// selected or Not :  Register_PW_Please_Enter_PW
	public boolean isSelected_txt_Register_PW_Please_Enter_PW(){
		if(txt_Register_PW_Please_Enter_PW.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_PW_Please_Enter_PW_Crossicon
	public void type_txt_Register_PW_Please_Enter_PW_Crossicon(String value) {
		txt_Register_PW_Please_Enter_PW_Crossicon.clear();
		txt_Register_PW_Please_Enter_PW_Crossicon.sendKeys(value);
	}

	//click:  Register_PW_Please_Enter_PW_Crossicon
	public void click_txt_Register_PW_Please_Enter_PW_Crossicon(){
		txt_Register_PW_Please_Enter_PW_Crossicon.click();
	}

	// Hover:  Register_PW_Please_Enter_PW_Crossicon
	public void hover_txt_Register_PW_Please_Enter_PW_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_PW_Please_Enter_PW_Crossicon).build().perform();
	}

	// visible or Not :  Register_PW_Please_Enter_PW_Crossicon
	public boolean isDisplayed_txt_Register_PW_Please_Enter_PW_Crossicon(){
		if(txt_Register_PW_Please_Enter_PW_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_PW_Please_Enter_PW_Crossicon
	public boolean isEnabled_txt_Register_PW_Please_Enter_PW_Crossicon(){
		if(txt_Register_PW_Please_Enter_PW_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_PW_Please_Enter_PW_Crossicon
	public String getCssValue_txt_Register_PW_Please_Enter_PW_Crossicon(String attribute) {
		return txt_Register_PW_Please_Enter_PW_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_PW_Please_Enter_PW_Crossicon
	public String getText_txt_Register_PW_Please_Enter_PW_Crossicon(){
		return txt_Register_PW_Please_Enter_PW_Crossicon.getText();
	}

	//Get the value :  Register_PW_Please_Enter_PW_Crossicon
	public String getValue_txt_Register_PW_Please_Enter_PW_Crossicon(){
		return txt_Register_PW_Please_Enter_PW_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_PW_Please_Enter_PW_Crossicon
	public boolean isSelected_txt_Register_PW_Please_Enter_PW_Crossicon(){
		if(txt_Register_PW_Please_Enter_PW_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_PW_This_Is_Not_Valid_PW
	public void type_txt_Register_PW_This_Is_Not_Valid_PW(String value) {
		txt_Register_PW_This_Is_Not_Valid_PW.clear();
		txt_Register_PW_This_Is_Not_Valid_PW.sendKeys(value);
	}

	//click:  Register_PW_This_Is_Not_Valid_PW
	public void click_txt_Register_PW_This_Is_Not_Valid_PW(){
		txt_Register_PW_This_Is_Not_Valid_PW.click();
	}

	// Hover:  Register_PW_This_Is_Not_Valid_PW
	public void hover_txt_Register_PW_This_Is_Not_Valid_PW(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_PW_This_Is_Not_Valid_PW).build().perform();
	}

	// visible or Not :  Register_PW_This_Is_Not_Valid_PW
	public boolean isDisplayed_txt_Register_PW_This_Is_Not_Valid_PW(){
		if(txt_Register_PW_This_Is_Not_Valid_PW.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_PW_This_Is_Not_Valid_PW
	public boolean isEnabled_txt_Register_PW_This_Is_Not_Valid_PW(){
		if(txt_Register_PW_This_Is_Not_Valid_PW.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_PW_This_Is_Not_Valid_PW
	public String getCssValue_txt_Register_PW_This_Is_Not_Valid_PW(String attribute) {
		return txt_Register_PW_This_Is_Not_Valid_PW.getCssValue(attribute);
	}

	//Get the text :  Register_PW_This_Is_Not_Valid_PW
	public String getText_txt_Register_PW_This_Is_Not_Valid_PW(){
		return txt_Register_PW_This_Is_Not_Valid_PW.getText();
	}

	//Get the value :  Register_PW_This_Is_Not_Valid_PW
	public String getValue_txt_Register_PW_This_Is_Not_Valid_PW(){
		return txt_Register_PW_This_Is_Not_Valid_PW.getAttribute("value");
	}
	// selected or Not :  Register_PW_This_Is_Not_Valid_PW
	public boolean isSelected_txt_Register_PW_This_Is_Not_Valid_PW(){
		if(txt_Register_PW_This_Is_Not_Valid_PW.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_PW_This_Is_Not_Valid_PW_Crossicon
	public void type_txt_Register_PW_This_Is_Not_Valid_PW_Crossicon(String value) {
		txt_Register_PW_This_Is_Not_Valid_PW_Crossicon.clear();
		txt_Register_PW_This_Is_Not_Valid_PW_Crossicon.sendKeys(value);
	}

	//click:  Register_PW_This_Is_Not_Valid_PW_Crossicon
	public void click_txt_Register_PW_This_Is_Not_Valid_PW_Crossicon(){
		txt_Register_PW_This_Is_Not_Valid_PW_Crossicon.click();
	}

	// Hover:  Register_PW_This_Is_Not_Valid_PW_Crossicon
	public void hover_txt_Register_PW_This_Is_Not_Valid_PW_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_PW_This_Is_Not_Valid_PW_Crossicon).build().perform();
	}

	// visible or Not :  Register_PW_This_Is_Not_Valid_PW_Crossicon
	public boolean isDisplayed_txt_Register_PW_This_Is_Not_Valid_PW_Crossicon(){
		if(txt_Register_PW_This_Is_Not_Valid_PW_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_PW_This_Is_Not_Valid_PW_Crossicon
	public boolean isEnabled_txt_Register_PW_This_Is_Not_Valid_PW_Crossicon(){
		if(txt_Register_PW_This_Is_Not_Valid_PW_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_PW_This_Is_Not_Valid_PW_Crossicon
	public String getCssValue_txt_Register_PW_This_Is_Not_Valid_PW_Crossicon(String attribute) {
		return txt_Register_PW_This_Is_Not_Valid_PW_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_PW_This_Is_Not_Valid_PW_Crossicon
	public String getText_txt_Register_PW_This_Is_Not_Valid_PW_Crossicon(){
		return txt_Register_PW_This_Is_Not_Valid_PW_Crossicon.getText();
	}

	//Get the value :  Register_PW_This_Is_Not_Valid_PW_Crossicon
	public String getValue_txt_Register_PW_This_Is_Not_Valid_PW_Crossicon(){
		return txt_Register_PW_This_Is_Not_Valid_PW_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_PW_This_Is_Not_Valid_PW_Crossicon
	public boolean isSelected_txt_Register_PW_This_Is_Not_Valid_PW_Crossicon(){
		if(txt_Register_PW_This_Is_Not_Valid_PW_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Password_TickIcon
	public void type_txt_Register_Password_TickIcon(String value) {
		txt_Register_Password_TickIcon.clear();
		txt_Register_Password_TickIcon.sendKeys(value);
	}

	//click:  Register_Password_TickIcon
	public void click_txt_Register_Password_TickIcon(){
		txt_Register_Password_TickIcon.click();
	}

	// Hover:  Register_Password_TickIcon
	public void hover_txt_Register_Password_TickIcon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Password_TickIcon).build().perform();
	}

	// visible or Not :  Register_Password_TickIcon
	public boolean isDisplayed_txt_Register_Password_TickIcon(){
		if(txt_Register_Password_TickIcon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Password_TickIcon
	public boolean isEnabled_txt_Register_Password_TickIcon(){
		if(txt_Register_Password_TickIcon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Password_TickIcon
	public String getCssValue_txt_Register_Password_TickIcon(String attribute) {
		return txt_Register_Password_TickIcon.getCssValue(attribute);
	}

	//Get the text :  Register_Password_TickIcon
	public String getText_txt_Register_Password_TickIcon(){
		return txt_Register_Password_TickIcon.getText();
	}

	//Get the value :  Register_Password_TickIcon
	public String getValue_txt_Register_Password_TickIcon(){
		return txt_Register_Password_TickIcon.getAttribute("value");
	}
	// selected or Not :  Register_Password_TickIcon
	public boolean isSelected_txt_Register_Password_TickIcon(){
		if(txt_Register_Password_TickIcon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Confirm_Password
	public void type_txt_Register_Confirm_Password(String value) {
		txt_Register_Confirm_Password.clear();
		txt_Register_Confirm_Password.sendKeys(value);
	}

	//click:  Register_Confirm_Password
	public void click_txt_Register_Confirm_Password(){
		txt_Register_Confirm_Password.click();
	}

	// Hover:  Register_Confirm_Password
	public void hover_txt_Register_Confirm_Password(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Confirm_Password).build().perform();
	}

	// visible or Not :  Register_Confirm_Password
	public boolean isDisplayed_txt_Register_Confirm_Password(){
		if(txt_Register_Confirm_Password.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Confirm_Password
	public boolean isEnabled_txt_Register_Confirm_Password(){
		if(txt_Register_Confirm_Password.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Confirm_Password
	public String getCssValue_txt_Register_Confirm_Password(String attribute) {
		return txt_Register_Confirm_Password.getCssValue(attribute);
	}

	//Get the text :  Register_Confirm_Password
	public String getText_txt_Register_Confirm_Password(){
		return txt_Register_Confirm_Password.getText();
	}

	//Get the value :  Register_Confirm_Password
	public String getValue_txt_Register_Confirm_Password(){
		return txt_Register_Confirm_Password.getAttribute("value");
	}
	// selected or Not :  Register_Confirm_Password
	public boolean isSelected_txt_Register_Confirm_Password(){
		if(txt_Register_Confirm_Password.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_CPW_Please_Enter_CPW
	public void type_txt_Register_CPW_Please_Enter_CPW(String value) {
		txt_Register_CPW_Please_Enter_CPW.clear();
		txt_Register_CPW_Please_Enter_CPW.sendKeys(value);
	}

	//click:  Register_CPW_Please_Enter_CPW
	public void click_txt_Register_CPW_Please_Enter_CPW(){
		txt_Register_CPW_Please_Enter_CPW.click();
	}

	// Hover:  Register_CPW_Please_Enter_CPW
	public void hover_txt_Register_CPW_Please_Enter_CPW(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_CPW_Please_Enter_CPW).build().perform();
	}

	// visible or Not :  Register_CPW_Please_Enter_CPW
	public boolean isDisplayed_txt_Register_CPW_Please_Enter_CPW(){
		if(txt_Register_CPW_Please_Enter_CPW.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_CPW_Please_Enter_CPW
	public boolean isEnabled_txt_Register_CPW_Please_Enter_CPW(){
		if(txt_Register_CPW_Please_Enter_CPW.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_CPW_Please_Enter_CPW
	public String getCssValue_txt_Register_CPW_Please_Enter_CPW(String attribute) {
		return txt_Register_CPW_Please_Enter_CPW.getCssValue(attribute);
	}

	//Get the text :  Register_CPW_Please_Enter_CPW
	public String getText_txt_Register_CPW_Please_Enter_CPW(){
		return txt_Register_CPW_Please_Enter_CPW.getText();
	}

	//Get the value :  Register_CPW_Please_Enter_CPW
	public String getValue_txt_Register_CPW_Please_Enter_CPW(){
		return txt_Register_CPW_Please_Enter_CPW.getAttribute("value");
	}
	// selected or Not :  Register_CPW_Please_Enter_CPW
	public boolean isSelected_txt_Register_CPW_Please_Enter_CPW(){
		if(txt_Register_CPW_Please_Enter_CPW.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_CPW_Please_Enter_CPW_Crossicon
	public void type_txt_Register_CPW_Please_Enter_CPW_Crossicon(String value) {
		txt_Register_CPW_Please_Enter_CPW_Crossicon.clear();
		txt_Register_CPW_Please_Enter_CPW_Crossicon.sendKeys(value);
	}

	//click:  Register_CPW_Please_Enter_CPW_Crossicon
	public void click_txt_Register_CPW_Please_Enter_CPW_Crossicon(){
		txt_Register_CPW_Please_Enter_CPW_Crossicon.click();
	}

	// Hover:  Register_CPW_Please_Enter_CPW_Crossicon
	public void hover_txt_Register_CPW_Please_Enter_CPW_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_CPW_Please_Enter_CPW_Crossicon).build().perform();
	}

	// visible or Not :  Register_CPW_Please_Enter_CPW_Crossicon
	public boolean isDisplayed_txt_Register_CPW_Please_Enter_CPW_Crossicon(){
		if(txt_Register_CPW_Please_Enter_CPW_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_CPW_Please_Enter_CPW_Crossicon
	public boolean isEnabled_txt_Register_CPW_Please_Enter_CPW_Crossicon(){
		if(txt_Register_CPW_Please_Enter_CPW_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_CPW_Please_Enter_CPW_Crossicon
	public String getCssValue_txt_Register_CPW_Please_Enter_CPW_Crossicon(String attribute) {
		return txt_Register_CPW_Please_Enter_CPW_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_CPW_Please_Enter_CPW_Crossicon
	public String getText_txt_Register_CPW_Please_Enter_CPW_Crossicon(){
		return txt_Register_CPW_Please_Enter_CPW_Crossicon.getText();
	}

	//Get the value :  Register_CPW_Please_Enter_CPW_Crossicon
	public String getValue_txt_Register_CPW_Please_Enter_CPW_Crossicon(){
		return txt_Register_CPW_Please_Enter_CPW_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_CPW_Please_Enter_CPW_Crossicon
	public boolean isSelected_txt_Register_CPW_Please_Enter_CPW_Crossicon(){
		if(txt_Register_CPW_Please_Enter_CPW_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_CPW_This_Is_Not_Valid_CPW
	public void type_txt_Register_CPW_This_Is_Not_Valid_CPW(String value) {
		txt_Register_CPW_This_Is_Not_Valid_CPW.clear();
		txt_Register_CPW_This_Is_Not_Valid_CPW.sendKeys(value);
	}

	//click:  Register_CPW_This_Is_Not_Valid_CPW
	public void click_txt_Register_CPW_This_Is_Not_Valid_CPW(){
		txt_Register_CPW_This_Is_Not_Valid_CPW.click();
	}

	// Hover:  Register_CPW_This_Is_Not_Valid_CPW
	public void hover_txt_Register_CPW_This_Is_Not_Valid_CPW(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_CPW_This_Is_Not_Valid_CPW).build().perform();
	}

	// visible or Not :  Register_CPW_This_Is_Not_Valid_CPW
	public boolean isDisplayed_txt_Register_CPW_This_Is_Not_Valid_CPW(){
		if(txt_Register_CPW_This_Is_Not_Valid_CPW.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_CPW_This_Is_Not_Valid_CPW
	public boolean isEnabled_txt_Register_CPW_This_Is_Not_Valid_CPW(){
		if(txt_Register_CPW_This_Is_Not_Valid_CPW.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_CPW_This_Is_Not_Valid_CPW
	public String getCssValue_txt_Register_CPW_This_Is_Not_Valid_CPW(String attribute) {
		return txt_Register_CPW_This_Is_Not_Valid_CPW.getCssValue(attribute);
	}

	//Get the text :  Register_CPW_This_Is_Not_Valid_CPW
	public String getText_txt_Register_CPW_This_Is_Not_Valid_CPW(){
		return txt_Register_CPW_This_Is_Not_Valid_CPW.getText();
	}

	//Get the value :  Register_CPW_This_Is_Not_Valid_CPW
	public String getValue_txt_Register_CPW_This_Is_Not_Valid_CPW(){
		return txt_Register_CPW_This_Is_Not_Valid_CPW.getAttribute("value");
	}
	// selected or Not :  Register_CPW_This_Is_Not_Valid_CPW
	public boolean isSelected_txt_Register_CPW_This_Is_Not_Valid_CPW(){
		if(txt_Register_CPW_This_Is_Not_Valid_CPW.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_CPW_This_Is_Not_Valid_CPW_Crossicon
	public void type_txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon(String value) {
		txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon.clear();
		txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon.sendKeys(value);
	}

	//click:  Register_CPW_This_Is_Not_Valid_CPW_Crossicon
	public void click_txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon(){
		txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon.click();
	}

	// Hover:  Register_CPW_This_Is_Not_Valid_CPW_Crossicon
	public void hover_txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon).build().perform();
	}

	// visible or Not :  Register_CPW_This_Is_Not_Valid_CPW_Crossicon
	public boolean isDisplayed_txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon(){
		if(txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_CPW_This_Is_Not_Valid_CPW_Crossicon
	public boolean isEnabled_txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon(){
		if(txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_CPW_This_Is_Not_Valid_CPW_Crossicon
	public String getCssValue_txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon(String attribute) {
		return txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_CPW_This_Is_Not_Valid_CPW_Crossicon
	public String getText_txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon(){
		return txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon.getText();
	}

	//Get the value :  Register_CPW_This_Is_Not_Valid_CPW_Crossicon
	public String getValue_txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon(){
		return txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_CPW_This_Is_Not_Valid_CPW_Crossicon
	public boolean isSelected_txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon(){
		if(txt_Register_CPW_This_Is_Not_Valid_CPW_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Confirm_Password_TickIcon
	public void type_txt_Register_Confirm_Password_TickIcon(String value) {
		txt_Register_Confirm_Password_TickIcon.clear();
		txt_Register_Confirm_Password_TickIcon.sendKeys(value);
	}

	//click:  Register_Confirm_Password_TickIcon
	public void click_txt_Register_Confirm_Password_TickIcon(){
		txt_Register_Confirm_Password_TickIcon.click();
	}

	// Hover:  Register_Confirm_Password_TickIcon
	public void hover_txt_Register_Confirm_Password_TickIcon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Confirm_Password_TickIcon).build().perform();
	}

	// visible or Not :  Register_Confirm_Password_TickIcon
	public boolean isDisplayed_txt_Register_Confirm_Password_TickIcon(){
		if(txt_Register_Confirm_Password_TickIcon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Confirm_Password_TickIcon
	public boolean isEnabled_txt_Register_Confirm_Password_TickIcon(){
		if(txt_Register_Confirm_Password_TickIcon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Confirm_Password_TickIcon
	public String getCssValue_txt_Register_Confirm_Password_TickIcon(String attribute) {
		return txt_Register_Confirm_Password_TickIcon.getCssValue(attribute);
	}

	//Get the text :  Register_Confirm_Password_TickIcon
	public String getText_txt_Register_Confirm_Password_TickIcon(){
		return txt_Register_Confirm_Password_TickIcon.getText();
	}

	//Get the value :  Register_Confirm_Password_TickIcon
	public String getValue_txt_Register_Confirm_Password_TickIcon(){
		return txt_Register_Confirm_Password_TickIcon.getAttribute("value");
	}
	// selected or Not :  Register_Confirm_Password_TickIcon
	public boolean isSelected_txt_Register_Confirm_Password_TickIcon(){
		if(txt_Register_Confirm_Password_TickIcon.isSelected()) { return true; } else { return false;} 
	}


	// Type:  Register_Email
	public void type_txt_Register_Email(String value) {
		txt_Register_Email.clear();
		txt_Register_Email.sendKeys(value);
	}

	//click:  Register_Email
	public void click_txt_Register_Email(){
		txt_Register_Email.click();
	}

	// Hover:  Register_Email
	public void hover_txt_Register_Email(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Email).build().perform();
	}

	// visible or Not :  Register_Email
	public boolean isDisplayed_txt_Register_Email(){
		if(txt_Register_Email.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Email
	public boolean isEnabled_txt_Register_Email(){
		if(txt_Register_Email.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Email
	public String getCssValue_txt_Register_Email(String attribute) {
		return txt_Register_Email.getCssValue(attribute);
	}

	//Get the text :  Register_Email
	public String getText_txt_Register_Email(){
		return txt_Register_Email.getText();
	}

	//Get the value :  Register_Email
	public String getValue_txt_Register_Email(){
		return txt_Register_Email.getAttribute("value");
	}
	// selected or Not :  Register_Email
	public boolean isSelected_txt_Register_Email(){
		if(txt_Register_Email.isSelected()) { return true; } else { return false;} 
	}
	
	// Type:  Register_Email_Please_Enter_Email
	public void type_txt_Register_Email_Please_Enter_Email(String value) {
		txt_Register_Email_Please_Enter_Email.clear();
		txt_Register_Email_Please_Enter_Email.sendKeys(value);
	}

	//click:  Register_Email_Please_Enter_Email
	public void click_txt_Register_Email_Please_Enter_Email(){
		txt_Register_Email_Please_Enter_Email.click();
	}

	// Hover:  Register_Email_Please_Enter_Email
	public void hover_txt_Register_Email_Please_Enter_Email(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Email_Please_Enter_Email).build().perform();
	}

	// visible or Not :  Register_Email_Please_Enter_Email
	public boolean isDisplayed_txt_Register_Email_Please_Enter_Email(){
		if(txt_Register_Email_Please_Enter_Email.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Email_Please_Enter_Email
	public boolean isEnabled_txt_Register_Email_Please_Enter_Email(){
		if(txt_Register_Email_Please_Enter_Email.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Email_Please_Enter_Email
	public String getCssValue_txt_Register_Email_Please_Enter_Email(String attribute) {
		return txt_Register_Email_Please_Enter_Email.getCssValue(attribute);
	}

	//Get the text :  Register_Email_Please_Enter_Email
	public String getText_txt_Register_Email_Please_Enter_Email(){
		return txt_Register_Email_Please_Enter_Email.getText();
	}

	//Get the value :  Register_Email_Please_Enter_Email
	public String getValue_txt_Register_Email_Please_Enter_Email(){
		return txt_Register_Email_Please_Enter_Email.getAttribute("value");
	}
	// selected or Not :  Register_Email_Please_Enter_Email
	public boolean isSelected_txt_Register_Email_Please_Enter_Email(){
		if(txt_Register_Email_Please_Enter_Email.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Email_Please_Enter_Email_Crossicon
	public void type_txt_Register_Email_Please_Enter_Email_Crossicon(String value) {
		txt_Register_Email_Please_Enter_Email_Crossicon.clear();
		txt_Register_Email_Please_Enter_Email_Crossicon.sendKeys(value);
	}

	//click:  Register_Email_Please_Enter_Email_Crossicon
	public void click_txt_Register_Email_Please_Enter_Email_Crossicon(){
		txt_Register_Email_Please_Enter_Email_Crossicon.click();
	}

	// Hover:  Register_Email_Please_Enter_Email_Crossicon
	public void hover_txt_Register_Email_Please_Enter_Email_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Email_Please_Enter_Email_Crossicon).build().perform();
	}

	// visible or Not :  Register_Email_Please_Enter_Email_Crossicon
	public boolean isDisplayed_txt_Register_Email_Please_Enter_Email_Crossicon(){
		if(txt_Register_Email_Please_Enter_Email_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Email_Please_Enter_Email_Crossicon
	public boolean isEnabled_txt_Register_Email_Please_Enter_Email_Crossicon(){
		if(txt_Register_Email_Please_Enter_Email_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Email_Please_Enter_Email_Crossicon
	public String getCssValue_txt_Register_Email_Please_Enter_Email_Crossicon(String attribute) {
		return txt_Register_Email_Please_Enter_Email_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_Email_Please_Enter_Email_Crossicon
	public String getText_txt_Register_Email_Please_Enter_Email_Crossicon(){
		return txt_Register_Email_Please_Enter_Email_Crossicon.getText();
	}

	//Get the value :  Register_Email_Please_Enter_Email_Crossicon
	public String getValue_txt_Register_Email_Please_Enter_Email_Crossicon(){
		return txt_Register_Email_Please_Enter_Email_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_Email_Please_Enter_Email_Crossicon
	public boolean isSelected_txt_Register_Email_Please_Enter_Email_Crossicon(){
		if(txt_Register_Email_Please_Enter_Email_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Email_This_Is_Not_Valid_Email
	public void type_txt_Register_Email_This_Is_Not_Valid_Email(String value) {
		txt_Register_Email_This_Is_Not_Valid_Email.clear();
		txt_Register_Email_This_Is_Not_Valid_Email.sendKeys(value);
	}

	//click:  Register_Email_This_Is_Not_Valid_Email
	public void click_txt_Register_Email_This_Is_Not_Valid_Email(){
		txt_Register_Email_This_Is_Not_Valid_Email.click();
	}

	// Hover:  Register_Email_This_Is_Not_Valid_Email
	public void hover_txt_Register_Email_This_Is_Not_Valid_Email(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Email_This_Is_Not_Valid_Email).build().perform();
	}

	// visible or Not :  Register_Email_This_Is_Not_Valid_Email
	public boolean isDisplayed_txt_Register_Email_This_Is_Not_Valid_Email(){
		if(txt_Register_Email_This_Is_Not_Valid_Email.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Email_This_Is_Not_Valid_Email
	public boolean isEnabled_txt_Register_Email_This_Is_Not_Valid_Email(){
		if(txt_Register_Email_This_Is_Not_Valid_Email.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Email_This_Is_Not_Valid_Email
	public String getCssValue_txt_Register_Email_This_Is_Not_Valid_Email(String attribute) {
		return txt_Register_Email_This_Is_Not_Valid_Email.getCssValue(attribute);
	}

	//Get the text :  Register_Email_This_Is_Not_Valid_Email
	public String getText_txt_Register_Email_This_Is_Not_Valid_Email(){
		return txt_Register_Email_This_Is_Not_Valid_Email.getText();
	}

	//Get the value :  Register_Email_This_Is_Not_Valid_Email
	public String getValue_txt_Register_Email_This_Is_Not_Valid_Email(){
		return txt_Register_Email_This_Is_Not_Valid_Email.getAttribute("value");
	}
	// selected or Not :  Register_Email_This_Is_Not_Valid_Email
	public boolean isSelected_txt_Register_Email_This_Is_Not_Valid_Email(){
		if(txt_Register_Email_This_Is_Not_Valid_Email.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Email_This_Is_Not_Valid_Email_Crossicon
	public void type_txt_Register_Email_This_Is_Not_Valid_Email_Crossicon(String value) {
		txt_Register_Email_This_Is_Not_Valid_Email_Crossicon.clear();
		txt_Register_Email_This_Is_Not_Valid_Email_Crossicon.sendKeys(value);
	}

	//click:  Register_Email_This_Is_Not_Valid_Email_Crossicon
	public void click_txt_Register_Email_This_Is_Not_Valid_Email_Crossicon(){
		txt_Register_Email_This_Is_Not_Valid_Email_Crossicon.click();
	}

	// Hover:  Register_Email_This_Is_Not_Valid_Email_Crossicon
	public void hover_txt_Register_Email_This_Is_Not_Valid_Email_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Email_This_Is_Not_Valid_Email_Crossicon).build().perform();
	}

	// visible or Not :  Register_Email_This_Is_Not_Valid_Email_Crossicon
	public boolean isDisplayed_txt_Register_Email_This_Is_Not_Valid_Email_Crossicon(){
		if(txt_Register_Email_This_Is_Not_Valid_Email_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Email_This_Is_Not_Valid_Email_Crossicon
	public boolean isEnabled_txt_Register_Email_This_Is_Not_Valid_Email_Crossicon(){
		if(txt_Register_Email_This_Is_Not_Valid_Email_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Email_This_Is_Not_Valid_Email_Crossicon
	public String getCssValue_txt_Register_Email_This_Is_Not_Valid_Email_Crossicon(String attribute) {
		return txt_Register_Email_This_Is_Not_Valid_Email_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_Email_This_Is_Not_Valid_Email_Crossicon
	public String getText_txt_Register_Email_This_Is_Not_Valid_Email_Crossicon(){
		return txt_Register_Email_This_Is_Not_Valid_Email_Crossicon.getText();
	}

	//Get the value :  Register_Email_This_Is_Not_Valid_Email_Crossicon
	public String getValue_txt_Register_Email_This_Is_Not_Valid_Email_Crossicon(){
		return txt_Register_Email_This_Is_Not_Valid_Email_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_Email_This_Is_Not_Valid_Email_Crossicon
	public boolean isSelected_txt_Register_Email_This_Is_Not_Valid_Email_Crossicon(){
		if(txt_Register_Email_This_Is_Not_Valid_Email_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Email_TickIcon
	public void type_txt_Register_Email_TickIcon(String value) {
		txt_Register_Email_TickIcon.clear();
		txt_Register_Email_TickIcon.sendKeys(value);
	}

	//click:  Register_Email_TickIcon
	public void click_txt_Register_Email_TickIcon(){
		txt_Register_Email_TickIcon.click();
	}

	// Hover:  Register_Email_TickIcon
	public void hover_txt_Register_Email_TickIcon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Email_TickIcon).build().perform();
	}

	// visible or Not :  Register_Email_TickIcon
	public boolean isDisplayed_txt_Register_Email_TickIcon(){
		if(txt_Register_Email_TickIcon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Email_TickIcon
	public boolean isEnabled_txt_Register_Email_TickIcon(){
		if(txt_Register_Email_TickIcon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Email_TickIcon
	public String getCssValue_txt_Register_Email_TickIcon(String attribute) {
		return txt_Register_Email_TickIcon.getCssValue(attribute);
	}

	//Get the text :  Register_Email_TickIcon
	public String getText_txt_Register_Email_TickIcon(){
		return txt_Register_Email_TickIcon.getText();
	}

	//Get the value :  Register_Email_TickIcon
	public String getValue_txt_Register_Email_TickIcon(){
		return txt_Register_Email_TickIcon.getAttribute("value");
	}
	// selected or Not :  Register_Email_TickIcon
	public boolean isSelected_txt_Register_Email_TickIcon(){
		if(txt_Register_Email_TickIcon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Contact
	public void type_txt_Register_Contact(String value) {
		txt_Register_Contact.clear();
		txt_Register_Contact.sendKeys(value);
	}

	//click:  Register_Contact
	public void click_txt_Register_Contact(){
		txt_Register_Contact.click();
	}

	// Hover:  Register_Contact
	public void hover_txt_Register_Contact(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Contact).build().perform();
	}

	// visible or Not :  Register_Contact
	public boolean isDisplayed_txt_Register_Contact(){
		if(txt_Register_Contact.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Contact
	public boolean isEnabled_txt_Register_Contact(){
		if(txt_Register_Contact.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Contact
	public String getCssValue_txt_Register_Contact(String attribute) {
		return txt_Register_Contact.getCssValue(attribute);
	}

	//Get the text :  Register_Contact
	public String getText_txt_Register_Contact(){
		return txt_Register_Contact.getText();
	}

	//Get the value :  Register_Contact
	public String getValue_txt_Register_Contact(){
		return txt_Register_Contact.getAttribute("value");
	}
	// selected or Not :  Register_Contact
	public boolean isSelected_txt_Register_Contact(){
		if(txt_Register_Contact.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Contact_Please_Enter_Contact
	public void type_txt_Register_Contact_Please_Enter_Contact(String value) {
		txt_Register_Contact_Please_Enter_Contact.clear();
		txt_Register_Contact_Please_Enter_Contact.sendKeys(value);
	}

	//click:  Register_Contact_Please_Enter_Contact
	public void click_txt_Register_Contact_Please_Enter_Contact(){
		txt_Register_Contact_Please_Enter_Contact.click();
	}

	// Hover:  Register_Contact_Please_Enter_Contact
	public void hover_txt_Register_Contact_Please_Enter_Contact(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Contact_Please_Enter_Contact).build().perform();
	}

	// visible or Not :  Register_Contact_Please_Enter_Contact
	public boolean isDisplayed_txt_Register_Contact_Please_Enter_Contact(){
		if(txt_Register_Contact_Please_Enter_Contact.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Contact_Please_Enter_Contact
	public boolean isEnabled_txt_Register_Contact_Please_Enter_Contact(){
		if(txt_Register_Contact_Please_Enter_Contact.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Contact_Please_Enter_Contact
	public String getCssValue_txt_Register_Contact_Please_Enter_Contact(String attribute) {
		return txt_Register_Contact_Please_Enter_Contact.getCssValue(attribute);
	}

	//Get the text :  Register_Contact_Please_Enter_Contact
	public String getText_txt_Register_Contact_Please_Enter_Contact(){
		return txt_Register_Contact_Please_Enter_Contact.getText();
	}

	//Get the value :  Register_Contact_Please_Enter_Contact
	public String getValue_txt_Register_Contact_Please_Enter_Contact(){
		return txt_Register_Contact_Please_Enter_Contact.getAttribute("value");
	}
	// selected or Not :  Register_Contact_Please_Enter_Contact
	public boolean isSelected_txt_Register_Contact_Please_Enter_Contact(){
		if(txt_Register_Contact_Please_Enter_Contact.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Contact_Please_Enter_Contact_Crossicon
	public void type_txt_Register_Contact_Please_Enter_Contact_Crossicon(String value) {
		txt_Register_Contact_Please_Enter_Contact_Crossicon.clear();
		txt_Register_Contact_Please_Enter_Contact_Crossicon.sendKeys(value);
	}

	//click:  Register_Contact_Please_Enter_Contact_Crossicon
	public void click_txt_Register_Contact_Please_Enter_Contact_Crossicon(){
		txt_Register_Contact_Please_Enter_Contact_Crossicon.click();
	}

	// Hover:  Register_Contact_Please_Enter_Contact_Crossicon
	public void hover_txt_Register_Contact_Please_Enter_Contact_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Contact_Please_Enter_Contact_Crossicon).build().perform();
	}

	// visible or Not :  Register_Contact_Please_Enter_Contact_Crossicon
	public boolean isDisplayed_txt_Register_Contact_Please_Enter_Contact_Crossicon(){
		if(txt_Register_Contact_Please_Enter_Contact_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Contact_Please_Enter_Contact_Crossicon
	public boolean isEnabled_txt_Register_Contact_Please_Enter_Contact_Crossicon(){
		if(txt_Register_Contact_Please_Enter_Contact_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Contact_Please_Enter_Contact_Crossicon
	public String getCssValue_txt_Register_Contact_Please_Enter_Contact_Crossicon(String attribute) {
		return txt_Register_Contact_Please_Enter_Contact_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_Contact_Please_Enter_Contact_Crossicon
	public String getText_txt_Register_Contact_Please_Enter_Contact_Crossicon(){
		return txt_Register_Contact_Please_Enter_Contact_Crossicon.getText();
	}

	//Get the value :  Register_Contact_Please_Enter_Contact_Crossicon
	public String getValue_txt_Register_Contact_Please_Enter_Contact_Crossicon(){
		return txt_Register_Contact_Please_Enter_Contact_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_Contact_Please_Enter_Contact_Crossicon
	public boolean isSelected_txt_Register_Contact_Please_Enter_Contact_Crossicon(){
		if(txt_Register_Contact_Please_Enter_Contact_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Contact_This_Is_Not_Valid_Contact
	public void type_txt_Register_Contact_This_Is_Not_Valid_Contact(String value) {
		txt_Register_Contact_This_Is_Not_Valid_Contact.clear();
		txt_Register_Contact_This_Is_Not_Valid_Contact.sendKeys(value);
	}

	//click:  Register_Contact_This_Is_Not_Valid_Contact
	public void click_txt_Register_Contact_This_Is_Not_Valid_Contact(){
		txt_Register_Contact_This_Is_Not_Valid_Contact.click();
	}

	// Hover:  Register_Contact_This_Is_Not_Valid_Contact
	public void hover_txt_Register_Contact_This_Is_Not_Valid_Contact(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Contact_This_Is_Not_Valid_Contact).build().perform();
	}

	// visible or Not :  Register_Contact_This_Is_Not_Valid_Contact
	public boolean isDisplayed_txt_Register_Contact_This_Is_Not_Valid_Contact(){
		if(txt_Register_Contact_This_Is_Not_Valid_Contact.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Contact_This_Is_Not_Valid_Contact
	public boolean isEnabled_txt_Register_Contact_This_Is_Not_Valid_Contact(){
		if(txt_Register_Contact_This_Is_Not_Valid_Contact.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Contact_This_Is_Not_Valid_Contact
	public String getCssValue_txt_Register_Contact_This_Is_Not_Valid_Contact(String attribute) {
		return txt_Register_Contact_This_Is_Not_Valid_Contact.getCssValue(attribute);
	}

	//Get the text :  Register_Contact_This_Is_Not_Valid_Contact
	public String getText_txt_Register_Contact_This_Is_Not_Valid_Contact(){
		return txt_Register_Contact_This_Is_Not_Valid_Contact.getText();
	}

	//Get the value :  Register_Contact_This_Is_Not_Valid_Contact
	public String getValue_txt_Register_Contact_This_Is_Not_Valid_Contact(){
		return txt_Register_Contact_This_Is_Not_Valid_Contact.getAttribute("value");
	}
	// selected or Not :  Register_Contact_This_Is_Not_Valid_Contact
	public boolean isSelected_txt_Register_Contact_This_Is_Not_Valid_Contact(){
		if(txt_Register_Contact_This_Is_Not_Valid_Contact.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Contact_This_Is_Not_Valid_Contact_Crossicon
	public void type_txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon(String value) {
		txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon.clear();
		txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon.sendKeys(value);
	}

	//click:  Register_Contact_This_Is_Not_Valid_Contact_Crossicon
	public void click_txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon(){
		txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon.click();
	}

	// Hover:  Register_Contact_This_Is_Not_Valid_Contact_Crossicon
	public void hover_txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon).build().perform();
	}

	// visible or Not :  Register_Contact_This_Is_Not_Valid_Contact_Crossicon
	public boolean isDisplayed_txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon(){
		if(txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Contact_This_Is_Not_Valid_Contact_Crossicon
	public boolean isEnabled_txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon(){
		if(txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Contact_This_Is_Not_Valid_Contact_Crossicon
	public String getCssValue_txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon(String attribute) {
		return txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon.getCssValue(attribute);
	}

	//Get the text :  Register_Contact_This_Is_Not_Valid_Contact_Crossicon
	public String getText_txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon(){
		return txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon.getText();
	}

	//Get the value :  Register_Contact_This_Is_Not_Valid_Contact_Crossicon
	public String getValue_txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon(){
		return txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon.getAttribute("value");
	}
	// selected or Not :  Register_Contact_This_Is_Not_Valid_Contact_Crossicon
	public boolean isSelected_txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon(){
		if(txt_Register_Contact_This_Is_Not_Valid_Contact_Crossicon.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Contact_TickIcon
	public void type_txt_Register_Contact_TickIcon(String value) {
		txt_Register_Contact_TickIcon.clear();
		txt_Register_Contact_TickIcon.sendKeys(value);
	}

	//click:  Register_Contact_TickIcon
	public void click_txt_Register_Contact_TickIcon(){
		txt_Register_Contact_TickIcon.click();
	}

	// Hover:  Register_Contact_TickIcon
	public void hover_txt_Register_Contact_TickIcon(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Contact_TickIcon).build().perform();
	}

	// visible or Not :  Register_Contact_TickIcon
	public boolean isDisplayed_txt_Register_Contact_TickIcon(){
		if(txt_Register_Contact_TickIcon.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Contact_TickIcon
	public boolean isEnabled_txt_Register_Contact_TickIcon(){
		if(txt_Register_Contact_TickIcon.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Contact_TickIcon
	public String getCssValue_txt_Register_Contact_TickIcon(String attribute) {
		return txt_Register_Contact_TickIcon.getCssValue(attribute);
	}

	//Get the text :  Register_Contact_TickIcon
	public String getText_txt_Register_Contact_TickIcon(){
		return txt_Register_Contact_TickIcon.getText();
	}

	//Get the value :  Register_Contact_TickIcon
	public String getValue_txt_Register_Contact_TickIcon(){
		return txt_Register_Contact_TickIcon.getAttribute("value");
	}
	// selected or Not :  Register_Contact_TickIcon
	public boolean isSelected_txt_Register_Contact_TickIcon(){
		if(txt_Register_Contact_TickIcon.isSelected()) { return true; } else { return false;} 
	}

	//click:  Register_Submit
	public void click_click_Register_Submit(){
		click_Register_Submit.click();
	}

	// Hover:  Register_Submit
	public void hover_click_Register_Submit(){
		Actions action=new Actions(driver); 
		action.moveToElement(click_Register_Submit).build().perform();
	}

	// visible or Not :  Register_Submit
	public boolean isDisplayed_click_Register_Submit(){
		if(click_Register_Submit.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Submit
	public boolean isEnabled_click_Register_Submit(){
		if(click_Register_Submit.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Submit
	public String getCssValue_click_Register_Submit(String attribute) {
		return click_Register_Submit.getCssValue(attribute);
	}

	//Get the text :  Register_Submit
	public String getText_click_Register_Submit(){
		return click_Register_Submit.getText();
	}

	//Get the value :  Register_Submit
	public String getValue_click_Register_Submit(){
		return click_Register_Submit.getAttribute("value");
	}
	// selected or Not :  Register_Submit
	public boolean isSelected_click_Register_Submit(){
		if(click_Register_Submit.isSelected()) { return true; } else { return false;} 
	}

	// Type:  Register_Thanks
	public void type_txt_Register_Thanks(String value) {
		txt_Register_Thanks.clear();
		txt_Register_Thanks.sendKeys(value);
	}

	//click:  Register_Thanks
	public void click_txt_Register_Thanks(){
		txt_Register_Thanks.click();
	}

	// Hover:  Register_Thanks
	public void hover_txt_Register_Thanks(){
		Actions action=new Actions(driver); 
		action.moveToElement(txt_Register_Thanks).build().perform();
	}

	// visible or Not :  Register_Thanks
	public boolean isDisplayed_txt_Register_Thanks(){
		if(txt_Register_Thanks.isDisplayed()) { return true; } else { return false;} 
	}

	// Enabled or Not :  Register_Thanks
	public boolean isEnabled_txt_Register_Thanks(){
		if(txt_Register_Thanks.isEnabled()) { return true; } else { return false;} 
	}

	// Get CSS attribute :  Register_Thanks
	public String getCssValue_txt_Register_Thanks(String attribute) {
		return txt_Register_Thanks.getCssValue(attribute);
	}

	//Get the text :  Register_Thanks
	public String getText_txt_Register_Thanks(){
		return txt_Register_Thanks.getText();
	}

	//Get the value :  Register_Thanks
	public String getValue_txt_Register_Thanks(){
		return txt_Register_Thanks.getAttribute("value");
	}
	// selected or Not :  Register_Thanks
	public boolean isSelected_txt_Register_Thanks(){
		if(txt_Register_Thanks.isSelected()) { return true; } else { return false;} 
	}

}

