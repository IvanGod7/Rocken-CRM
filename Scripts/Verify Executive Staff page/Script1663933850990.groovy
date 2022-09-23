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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://rocken-sandbox.cheitgroup.com/site/login')

WebUI.setText(findTestObject('Page_Sign In/input_Remember Me_LoginFormemail'), 'ivan.godonuk@cheitgroup.com')

WebUI.setEncryptedText(findTestObject('Page_Sign In/input_Remember Me_LoginFormpassword'), 'KmAzg1R57vKcWS3ykeqMApVaT46dEUf5')

WebUI.click(findTestObject('Object Repository/Page_Sign In/button_Sign in'))

WebUI.click(findTestObject('Page_ROCKEN Platforms/div_Ausloggen_mobile__menu'), FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Page_Companies/i_Notifications_icon-crm-icon-1'))

WebUI.click(findTestObject('Page_Executive Staff/i_Companies_fa fa-circle-o'))

WebUI.click(findTestObject('Page_Executive Staff/a_Neue hinzufgen'))

WebUI.click(findTestObject('Page_Create Staff/a_Abbrechen'))

WebUI.navigateToUrl('https://rocken-sandbox.cheitgroup.com/executive-staff/view/1839')

WebUI.verifyElementPresent(findTestObject('Page_Hedley Meadows/h1_Hedley Meadows'), 0)

WebUI.closeBrowser()

