import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://backoffice.dev.qashup.co/en')

WebUI.setText(findTestObject('Object Repository/Page_Qashup Account/input_Username_username'), 'admin@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Qashup Account/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Qashup Account/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Qashup Account/div_Back Office'))

WebUI.click(findTestObject('Object Repository/Page_Qashup Backoffice/span_Brand  Branch'))

WebUI.click(findTestObject('Object Repository/Page_Qashup Backoffice/div_Brand'))

WebUI.click(findTestObject('Object Repository/Page_Qashup Backoffice/svg_Add Brand_w-5 h-5'))

WebUI.click(findTestObject('Object Repository/Page_Qashup Backoffice/input_Brand Name_input input-bordered h-42p_d0de7f'))

WebUI.setText(findTestObject('Page_Qashup Backoffice/input_Brand Name_input input-bordered h-42p_d0de7f'), 'qas')

//WebUI.click(findTestObject('Object Repository/Page_Qashup Backoffice/button_Upload Logo'))


WebElement fileInput = DriverFactory.getWebDriver().findElement(By.xpath('//input[@type="file"]'))

// ส่งค่าพาธไฟล์
fileInput.sendKeys('C:\\Users\\NUC\\Downloads\\ChatGPT.png')

WebUI.click(findTestObject('Object Repository/Page_Qashup Backoffice/button_Save'))

