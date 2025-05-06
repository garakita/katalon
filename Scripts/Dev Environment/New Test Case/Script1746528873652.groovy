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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://backoffice.dev.qashup.co/en')

WebUI.setText(findTestObject('Page_Qashup Account/input_Username_username'), 'admin@test.com')

WebUI.setEncryptedText(findTestObject('Page_Qashup Account/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Qashup Account/button_Login'))

WebUI.click(findTestObject('Page_Qashup Account/div_Back Office'))

WebUI.click(findTestObject('Page_Qashup Backoffice/span_Brand  Branch'))

WebUI.click(findTestObject('Page_Qashup Backoffice/div_Brand'))

WebUI.click(findTestObject('Object Repository/Page_Qashup Backoffice/a_QA Merchant'))

WebUI.click(findTestObject('Page_Qashup Backoffice/svg_Brand  Branch_iconDropdownSubMenu'))

WebUI.click(findTestObject('Page_Qashup Backoffice/div_Brand'))

WebUI.click(findTestObject('Page_Qashup Backoffice/button_Add Brand'))

WebUI.click(findTestObject('Page_Qashup Backoffice/input_Brand Name_input input-bordered h-42p_d0de7f'))

WebUI.setText(findTestObject('Page_Qashup Backoffice/input_Brand Name_input input-bordered h-42p_d0de7f_1'), 'q')

WebUI.setText(findTestObject('Page_Qashup Backoffice/input_Brand Name_input input-bordered h-42p_d0de7f_1_2'), 'qa')

WebUI.click(findTestObject('Object Repository/Page_Qashup Backoffice/div_Brand Logo_flex aspect-video h-full w-f_28cf44'))

WebUI.click(findTestObject('Page_Qashup Backoffice/img_Brand Logo_max-h-full max-w-full rounded-xl'))

WebUI.click(findTestObject('Page_Qashup Backoffice/button_Save'))

