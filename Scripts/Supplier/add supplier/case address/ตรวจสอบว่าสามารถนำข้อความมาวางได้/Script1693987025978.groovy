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

WebUI.navigateToUrl('https://pos-frontend-toey-gumbjqoyzq-as.a.run.app/api/auth/signin?callbackUrl=%2F')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Sign In/input_Username_username (3)'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/supplier/Page_Sign In/input_Password_password (3)'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/supplier/Page_Sign In/button_Sign in with Credentials (3)'))

WebUI.navigateToUrl('https://pos-frontend-toey-gumbjqoyzq-as.a.run.app/supplier')

WebUI.click(findTestObject('Object Repository/supplier/Page_Create Next App/span_Supplier (1)'))

WebUI.click(findTestObject('Object Repository/supplier/Page_Create Next App/button_Add Supplier (1)'))

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/input__border-gray-300 placeholder-gray-500_a6dfe9 (1)'), 
    'testtt')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/input_Tax ID_border-gray-300 placeholder-gr_2bee8d (1)'), 
    '1669800272677')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/input__border-gray-300 placeholder-gray-500_a6dfe9_1 (1)'), 
    'companyname')

WebUI.selectOptionByLabel(findTestObject('Object Repository/supplier/Page_Create Next App/select_Select Group SupplierchathaiKFC01Dar_dd1465 (1)'), 
    'chester', true)

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/input_Credit Term_border-gray-300 placehold_bdb423 (1)'), 
    '30')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/input_Name_border-gray-300 placeholder-gray_578443 (1)'), 
    'NAttha')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/input_Tel_border-gray-300 placeholder-gray-_89000e (1)'), 
    '0930432076')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/input_Email_border-gray-300 placeholder-gra_bcbdf2 (1)'), 
    'ning.nattha6@gmail.com')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/input_Noted_border-gray-300 placeholder-gra_cc0178 (1)'), 
    'note')

WebUI.click(findTestObject('Object Repository/supplier/Page_Create Next App/button_Add (1)'))

