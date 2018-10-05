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

WebUI.callTestCase(findTestCase('Log in on staging1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./i_Produkt Behandling_wcmp-font'))

WebUI.waitForElementClickable(findTestObject(null), 0)

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./a_-- Tilfj Produkt'))

WebUI.setText(findTestObject('Page_Forhandler Dashboard - Weensu./input_Varenavn_post_title'), 'Automatisk test produkt')

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./html_.mce-content-body div.mce'))

WebUI.setText(findTestObject('Page_Forhandler Dashboard - Weensu./body_Tekst i tekstfeltet. Her '), '<p style="">Tekst i tekstfeltet. Her skriver jeg en lang tekst omkring mit testprodukt.</p><div id="katalon" style="top: 160px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./p_Click to upload Image'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./a_Mediebibliotek'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./div_Fravlg_thumbnail'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./button_Indst varebillede'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./span_Beholdning'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./span_Generel'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./div_Tilbudspris (DKK)         '))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./html_.mce-content-body div.mce'))

WebUI.setText(findTestObject('Page_Forhandler Dashboard - Weensu./body_gfhdghdfhfgdhgfdhgfdh'), '<p style="">gfhdghdfhfgdhgfdhgfdh</p><div id="katalon" style="top: 160px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./input_Sson_tax_inputproduct_ca'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./input_Hasle_submit-data'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./i_Weensu.dk_wcmp-font ico-down'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./span_Log ud'))

