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

Date date = new Date()

currentDate = date.format('dd')

String filePath = 'C:\\Users\\rithika.jr\\Downloads\\oops.pdf'

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/input_Username_Username'), 
    GlobalVariable.USERNAME_AGENT)

WebUI.verifyElementClickable(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Next'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/input_Forgot password_Password'), 
    GlobalVariable.PASSWORD_AGENT)

WebUI.verifyElementClickable(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Sign In'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Sign In'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/a_Forwardingdropdown'))

WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/a_International PO'))

WebUI.setText(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/input_Purchase Orders_search-input input-text'), 
    GlobalVariable.POId)



WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/button_Status Active POs338Expand row'))

WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/a_Awaiting Enrichment85'))

//WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/button_filterheader menu'))
//
//WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/div_check mark'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/a_sarathbabu_view-nav grid-icon icon-nav'))

WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/a_sarathbabu_view-nav grid-icon icon-nav'))

WebUI.setText(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/input_concat(9699 O, , Conner Circle, Water_b99838'), 
    '34')

WebUI.scrollToElement(findTestObject('Object Repository/Page_IFC Global Logistics/div_DESTINATION'),
	3)

WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/input_concat(9699 O, , Conner Circle, Water_0429e9'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_'+(Integer.parseInt(currentDate)+3)))

WebUI.verifyElementClickable(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/button_Save'))

WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/button_Save'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/span_Confirm Products for Booking Proposal'))

WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/span_Confirm Products for Booking Proposal'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/button_Yes'))

WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/button_Yes'))

//WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/a_Forwardingdropdown'))
//
//WebUI.click(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/a_International PO'))
//
//WebUI.setText(findTestObject('Object Repository/SeaTriangleEnrichment/Page_IFC Global Logistics/input_Purchase Orders_search-input input-text'), 
//    GlobalVariable.POId)

WebUI.delay(7)

WebUI.closeBrowser()

