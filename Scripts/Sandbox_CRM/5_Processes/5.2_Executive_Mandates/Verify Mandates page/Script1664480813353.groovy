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

WebUI.callTestCase(findTestCase('Sandbox_CRM/Login/Verify admin can login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sandbox_CRM/Page_ROCKEN Platforms/div_Ausloggen_mobile__menu'), FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Sandbox_CRM/Page_ROCKEN Platforms/li_Processes   Processes  Executive Mandates'))

WebUI.click(findTestObject('Sandbox_CRM/Page_ROCKEN Platforms/a_Executive Mandates'))

WebUI.click(findTestObject('Sandbox_CRM/Page_Mandates/a_CREATE MANDATE'))

WebUI.verifyElementPresent(findTestObject('Sandbox_CRM/Page_Create Mandates/h1_Create Mandates'), 0)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sandbox_CRM/Page_Mandates/a_Acquired_btn btn-icon btn-default'))

WebUI.verifyElementPresent(findTestObject('Sandbox_CRM/Page_Update Mandate Mandate  26/h1_Update Mandate Mandate  26'), 0)

WebUI.click(findTestObject('Sandbox_CRM/Page_Update Mandate Mandate  26/a_Mandate  26'))

WebUI.verifyElementPresent(findTestObject('Sandbox_CRM/Page_Mandate 26/h1_Mandate 26'), 0)

WebUI.click(findTestObject('Sandbox_CRM/Page_Mandate 26/i_-_icon-plus'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Sandbox_CRM/Page_Mandate 26/strong_Add mandate company'), 0)

WebUI.click(findTestObject('Sandbox_CRM/Page_Mandate 26/button_Abbrechen'))

WebUI.click(findTestObject('Sandbox_CRM/Page_Mandate 26/i_Longlist_icon-plus'))

WebUI.verifyElementPresent(findTestObject('Sandbox_CRM/Page_Mandate 26/h5_Add to Mandate'), 0)

WebUI.click(findTestObject('Sandbox_CRM/Page_ROCKEN Platforms/span_'))

WebUI.closeBrowser()

