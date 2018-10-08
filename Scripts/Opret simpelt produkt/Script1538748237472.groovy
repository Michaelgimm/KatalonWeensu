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

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./span_Produkt Behandling'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./a_-- Tilfj Produkt'))

WebUI.setText(findTestObject('Page_Forhandler Dashboard - Weensu./input_Titel_title'), 'Automatisk test produkt 1')

WebUI.setText(findTestObject('Page_Forhandler Dashboard - Weensu./input_Pris (DKK)_regular_price'), '100')

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./button_Tekst'))

WebUI.setText(findTestObject('Page_Forhandler Dashboard - Weensu./textarea_Afsnit_excerpt'), 'Her skriver jeg en kort tekst.')

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./button_Visuel'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./h3_Produkt Billede og Galleri'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./input_Produkt Billede (Primr)_'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./a_Mediebibliotek'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./div_Fravlg_thumbnail'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./button_Vlg billedfil'))

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./h3_Lagerbeholdning'))

WebUI.waitForElementClickable(findTestObject('Page_Forhandler Dashboard - Weensu./h3_Lagerbeholdning'), 5)

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./input_Lagerstyring_manage_stoc'))

WebUI.setText(findTestObject('Page_Forhandler Dashboard - Weensu./input_Antal p lager_stock_qty'), '10')

WebUI.click(findTestObject('Page_Forhandler Dashboard - Weensu./input_Meta beskrivelse_submit-'))

