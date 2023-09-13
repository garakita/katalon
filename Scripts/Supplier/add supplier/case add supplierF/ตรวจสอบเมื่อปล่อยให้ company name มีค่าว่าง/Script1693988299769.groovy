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

WebUI.navigateToUrl('https://pos-frontend-toey-gumbjqoyzq-as.a.run.app/supplier')

WebUI.click(findTestObject('Object Repository/Page_Create Next App/span_Supplier'))

WebUI.click(findTestObject('Object Repository/Page_Create Next App/button_Add Supplier'))

WebUI.click(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'))

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    '0001')

WebUI.click(findTestObject('Object Repository/Page_Create Next App/div_Tax ID'))

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    '123456789')

WebUI.click(findTestObject('Object Repository/Page_Create Next App/label_Company Name'))

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    'ttttt')

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    '7')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Next App/select_Select Group SupplierchathaiKFC01Dar_dd1465'), 
    'Select Group Supplier', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create Next App/select_Select Group SupplierchathaiKFC01Dar_dd1465'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    '29')

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    'nattha sukaum')

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    '0930432076')

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_CategoryName_border-gray-300 placehol_3ea089'), 
    'ning.nattha6@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Create Next App/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Create Next App/div_Add CompleteConfirmNoCancel'))

WebUI.click(findTestObject('Object Repository/Page_Create Next App/td_0001'))

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_Add Category_input-group-1'), 'natt')

