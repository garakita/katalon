import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class NewTestListener { 
	/** 
	* Executes after every test case ends. 
	* @param testCaseContext related information of the executed test case. 
	*/ 
	@AfterTestCase 
	def sampleAfterTestCase(TestCaseContext testCaseContext) { 
		//Get Test Case Key from test case name 
		TestCase testCase = findTestCase(testCaseContext.getTestCaseId()) 
		GlobalVariable.g_ZS_TestCaseKey=testCase.getName().split("_")[0]
		//Set Zephyr Status
		if (testCaseContext.getTestCaseStatus()=="PASSED")
			GlobalVariable.g_ZS_StatusName="Pass"
		else if (testCaseContext.getTestCaseStatus()=="FAILED")
			GlobalVariable.g_ZS_StatusName="Fail"
		else
			GlobalVariable.g_ZS_StatusName="Not Executed"
		//Call API to Push Result to Zephyr by creating Test case execution
		WS.sendRequest(findTestObject('Create Execution'))
	}
}