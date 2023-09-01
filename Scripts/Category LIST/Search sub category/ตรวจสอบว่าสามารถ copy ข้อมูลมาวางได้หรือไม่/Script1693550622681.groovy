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

WebUI.navigateToUrl('https://pos-frontend-ton-gumbjqoyzq-as.a.run.app/')

WebUI.click(findTestObject('Object Repository/Page_Create Next App/span_Item'))

WebUI.click(findTestObject('Object Repository/Page_Create Next App/div_Category'))

WebUI.click(findTestObject('Object Repository/Page_Create Next App/button_Sub Category'))

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_Add Category_input-group-1'), 'SubCategories2')

WebUI.sendKeys(findTestObject('Object Repository/Page_Create Next App/input_Add Category_input-group-1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Create Next App/div_CategoryAllWatersTT555Categories2Ben285_7d2483'))

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_Add Category_input-group-1'), 'ทดสอบ add sub Category')

WebUI.sendKeys(findTestObject('Object Repository/Page_Create Next App/input_Add Category_input-group-1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Create Next App/svg_Add SubCategory_absolute top-12 transfo_2e79f2'))

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_Add Category_input-group-1'), '0022555')

WebUI.sendKeys(findTestObject('Object Repository/Page_Create Next App/input_Add Category_input-group-1'), Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('Object Repository/Page_Create Next App/input_Add Category_input-group-1'))

WebUI.setText(findTestObject('Object Repository/Page_Create Next App/input_Add Category_input-group-1'), 'SubRiceCool')

WebUI.sendKeys(findTestObject('Object Repository/Page_Create Next App/input_Add Category_input-group-1'), Keys.chord(Keys.ENTER))

