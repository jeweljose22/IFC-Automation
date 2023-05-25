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

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/a_Forwardingdropdown'))

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/a_Booking Management'))

WebUI.setText(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/input_Bookings_search-input input-text'), 
    GlobalVariable.POId)

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/span_Active BPs'))

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/span_Ready for Booking'))

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/a_M145-BB234_view-nav grid-icon icon-nav'))

WebUI.verifyElementClickable(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/span_Next'))

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/span_Next'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_IFC Global Logistics/span_Next_ss2'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/span_Next_ss2'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/span_Add Details'))

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/span_Add Details'))

WebUI.setText(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/input__bookingRefNum'), 'BN234')

WebUI.setText(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/input__soNumber'), 'SO123')

WebUI.setText(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/input__originCartageCompany'), 
    'SY22')

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/span_Save'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_IFC Global Logistics/h6_Billing Numbers_scroll'), 0)

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/button_AddAdd Details'))

WebUI.setText(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/input__masterBillNumber'), 
    'MA101')

WebUI.setText(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/input__houseBillNumber_10003'), 
    'HN202')

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/button_Save'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_IFC Global Logistics/span_Next_ad3'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/span_Next_ad3'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_IFC Global Logistics/a_Next_container4'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/a_Next_container4'))

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__origin_certificate'),filePath )

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__commercial_invoice'),filePath )

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__hazardous_certificate'),filePath )

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__lading_bill'), filePath)

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__manufacturer_declaration'), filePath)

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__packaging_declaration'), filePath)

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__packing_list'), filePath)

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/span_Ready for Shipment'))

//WebUI.setText(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/input_Bookings_search-input input-text'), 
//    GlobalVariable.POId)

WebUI.delay(7)

WebUI.closeBrowser()

