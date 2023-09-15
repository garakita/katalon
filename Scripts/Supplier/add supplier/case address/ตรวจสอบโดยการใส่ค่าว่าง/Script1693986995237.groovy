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

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Sign In/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Sign In/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Sign In/button_Sign in with Credentials'))

WebUI.click(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/button_Add Supplier'))

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/input__border-gray-300 placeholder-gray-500_a6dfe9'), 
    'tytyt')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/input_Tax ID_border-gray-300 placeholder-gr_2bee8d'), 
    '1234658795')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/input__border-gray-300 placeholder-gray-500_a6dfe9_1'), 
    'NY')

WebUI.setText(findTestObject('supplier/Page_Create Next App/Page_Create Next App/input_Vat_border-gray-300 placeholder-gray-_922480'), 
    '7')

WebUI.selectOptionByValue(findTestObject('supplier/Page_Create Next App/Page_Create Next App/select_Select Group SupplierchathaiKFC01Dar_dd1465'), 
    'Select Group Supplier', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/select_Select Group SupplierchathaiKFC01Dar_dd1465'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/input_Credit Term_border-gray-300 placehold_bdb423'), 
    '10')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/input_Name_border-gray-300 placeholder-gray_578443'), 
    '2222')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/input_Tel_border-gray-300 placeholder-gray-_89000e'), 
    '0930432076')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/input_Email_border-gray-300 placeholder-gra_bcbdf2'), 
    'ning.nattha6@gmail.com')

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/input_Address_border-gray-300 placeholder-g_3bbc5a'), 
    '')

WebUI.click(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/input_Address_border-gray-300 placeholder-g_3bbc5a'))

WebUI.setText(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/input_Noted_border-gray-300 placeholder-gra_cc0178'), 
    '0000')

WebUI.click(findTestObject('Object Repository/supplier/Page_Create Next App/Page_Create Next App/button_Add'))

