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

WebUI.callTestCase(findTestCase('Login/Verify admin can login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ROCKEN Platforms/div_Ausloggen_mobile__menu'), FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Page_Notifications/i_Ausloggen_icon-home'))

WebUI.click(findTestObject('Page_Notifications/i_Home_fa fa-circle-o'))

WebUI.verifyElementPresent(findTestObject('Page_Notifications/h1_Notifications'), 0)

WebUI.verifyLinksAccessible(['https://rocken-sandbox.cheitgroup.com/notifications?NotificationsSearch[topic]=vacan%D1%81ies_and_publications'
        , 'https://rocken-sandbox.cheitgroup.com/notifications?NotificationsSearch[topic]=applicants', 'https://rocken-sandbox.cheitgroup.com/notifications?NotificationsSearch[topic]=candidates'
        , 'https://rocken-sandbox.cheitgroup.com/notifications?NotificationsSearch[topic]=professional_search', 'https://rocken-sandbox.cheitgroup.com/notifications?NotificationsSearch[topic]=companies'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Notifications/a_Vacancies and Publications'))

css_color = WebUI.getCSSValue(findTestObject('Page_Notifications/a_Vacancies and Publications'), 'background-color')

WebUI.verifyEqual(css_color, 'rgba(0, 0, 0, 1)', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Notifications/a_Applicants 6'))

css_color = WebUI.getCSSValue(findTestObject('Page_Notifications/a_Applicants 6'), 'background-color')

WebUI.verifyEqual(css_color, 'rgba(0, 0, 0, 1)', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Notifications/a_Profiles 1'))

css_color = WebUI.getCSSValue(findTestObject('Page_Notifications/a_Profiles 1'), 'background-color')

WebUI.verifyEqual(css_color, 'rgba(0, 0, 0, 1)', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Notifications/a_Processes'))

css_color = WebUI.getCSSValue(findTestObject('Page_Notifications/a_Processes'), 'background-color')

WebUI.verifyEqual(css_color, 'rgba(0, 0, 0, 1)', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Notifications/a_Companies'))

css_color = WebUI.getCSSValue(findTestObject('Page_Notifications/a_Companies'), 'background-color')

WebUI.verifyEqual(css_color, 'rgba(0, 0, 0, 1)', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.mouseOver(findTestObject('Page_Notifications/button_Aktionen'))

css_color = WebUI.getCSSValue(findTestObject('Page_Notifications/button_Aktionen'), 'background-color')

WebUI.verifyEqual(css_color, 'rgba(215, 218, 224, 1)', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

