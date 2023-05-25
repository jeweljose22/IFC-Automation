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

String filePath='C:\\Users\\rithika.jr\\Downloads\\oops.pdf'


WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_IFC Global Logistics - Sign In/input_Username_Username'), GlobalVariable.USERNAME_AGENT)

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics - Sign In/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IFC Global Logistics - Sign In/input_Forgot password_Password'),
	GlobalVariable.PASSWORD_AGENT)

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics - Sign In/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/a_Forwardingdropdown'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/a_Booking Management'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/a_PO Bookings - Air197'))

WebUI.setText(findTestObject('Object Repository/Page_IFC Global Logistics/input_Bookings_search-input input-text'), GlobalVariable.POId)

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/span_Active BPs'))

WebUI.click(findTestObject('Object Repository/FinalEnrichmentFCL/Page_IFC Global Logistics/span_Ready for Booking'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/a_carrier-anj-01 f-1_view-nav grid-icon icon-nav'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/a_Next'))


WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/span_Add Details'))

WebUI.setText(findTestObject('Object Repository/Page_IFC Global Logistics/input__soNumber'), '234')

WebUI.setText(findTestObject('Object Repository/Page_IFC Global Logistics/input__originCartageCompany'), 'SY')

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/span_Add Details'))

WebUI.setText(findTestObject('Object Repository/Page_IFC Global Logistics/input__masterBillNumber'), 'MA202')

WebUI.setText(findTestObject('Object Repository/Page_IFC Global Logistics/input__houseBillNumber_10003'), 'HA112')

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/span_Next_booking_details'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/span_Add Details'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/button_Select Packingdropdown'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/a_Loose'))

WebUI.setText(findTestObject('Object Repository/Page_IFC Global Logistics/input__vgm'), '34')

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/input__pickUpDate'))

//WebUI.focus('Object Repository/Page_IFC Global Logistics/div_February 2023')

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/button_Next Month'))

//WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_26'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/input__dropOffDate'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/button_Next Month'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_27'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/button_Save_1'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/a_Next_1'))

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__origin_certificate'),filePath )

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__commercial_invoice'),filePath )

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__hazardous_certificate'),filePath )

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__lading_bill'), filePath)

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__manufacturer_declaration'), filePath)

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__packaging_declaration'), filePath)

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__packing_list'), filePath)


WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/span_Ready for Shipment'))

//WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/a_PO Bookings - Air160'))
//
//WebUI.setText(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/input_Bookings_search-input input-text'),
//	GlobalVariable.POId)

WebUI.delay(7)

WebUI.closeBrowser()
