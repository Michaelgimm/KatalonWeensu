import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.staging1.weensu.dk/')

not_run: WebUI.click(findTestObject('Object Repository/Page_Weensu.dk - Ansvarlig og bredy/a_Accepter'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Weensu.dk - Ansvarlig og bredy/span_Du er nu tilmeldt_et_bloo'))

WebUI.navigateToUrl('https:/www.staging1.weensu.dk/my-account/')

WebUI.setText(findTestObject('Object Repository/Page_Min konto - Weensu.dk/input__username'), 'forhandler1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Min konto - Weensu.dk/input__password'), '33asjqUwwJXb4Ke1guGw3gsSQYRAJJ8N')

WebUI.click(findTestObject('Object Repository/Page_Min konto - Weensu.dk/button_Log ind'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Forhandler Dashboard - Weensu./i_Weensu.dk_wcmp-font ico-down'))

