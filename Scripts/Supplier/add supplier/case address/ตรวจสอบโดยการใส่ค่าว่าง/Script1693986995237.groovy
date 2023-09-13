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

WebUI.navigateToUrl('https://pos-frontend-toey-gumbjqoyzq-as.a.run.app/api/auth/signin?callbackUrl=%2Fsupplier')

WebUI.click(findTestObject('Object Repository/Page_Sign In/input_Username_username'))

WebUI.click(findTestObject('Object Repository/Page_Sign In/input_Username_username'))

WebUI.click(findTestObject('Object Repository/Page_Sign In/input_Username_username'))

WebUI.click(findTestObject('Object Repository/Page_Sign In/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Sign In/button_Sign in with Credentials'))

WebUI.click(findTestObject('Object Repository/Page_Create Next App/button_Add Supplier'))

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    'bbbb')

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    '1234566666')

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    'dddddd')

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    '7')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Next App/select_Select Group SupplierchathaiKFC01Dar_dd1465'), 
    'Select Group Supplier', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Next App/select_Select Group SupplierchathaiKFC01Dar_dd1465'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    '55555')

