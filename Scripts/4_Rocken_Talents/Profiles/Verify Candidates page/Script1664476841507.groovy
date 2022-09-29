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

WebUI.mouseOver(findTestObject('Page_ROCKEN Platforms/li_ROCKEN Talents   Profiles'))

WebUI.click(findTestObject('Page_ROCKEN Platforms/a_Profiles'))

WebUI.click(findTestObject('Page_Kandidaten/a_Neue hinzufgen'))

WebUI.click(findTestObject('Page_Create Candidates/a_CANCEL'))

WebUI.navigateToUrl('https://rocken-sandbox.cheitgroup.com/candidates/view/3697')

WebUI.verifyElementPresent(findTestObject('Page_Wade Weber/h1_Wade Weber'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Wade Weber/td_Wade'), 0)

WebUI.verifyElementVisible(findTestObject('Page_Wade Weber/td_Weber'))

WebUI.click(findTestObject('Page_Wade Weber/a_Profil anzeigen'))

WebUI.verifyElementPresent(findTestObject('Page_Profile Wade Weber/h4_Herr                                                                     Wade Weber'), 
    0)

WebUI.closeBrowser()

