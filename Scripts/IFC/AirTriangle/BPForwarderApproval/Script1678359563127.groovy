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

WebUI.setText(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/input_Username_Username'),
	GlobalVariable.USERNAME_FORWARDER)

WebUI.click(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/input_Forgot password_Password'),
	GlobalVariable.PASSWORD_FORWARDER)

WebUI.click(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Sign In'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/a_Forwardingdropdown'))

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/a_Booking Management'))

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/a_PO Bookings - Air160'))

WebUI.setText(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/input_Bookings_search-input input-text'),
	GlobalVariable.POId)

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/button_Status Active BPs160Expand row'))

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/span_Awaiting Forwarder Approval'))

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/a_AIR NEW ZEALAND MK011_view-nav grid-icon _1077a4'))

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/span_Next'))

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/span_Add Sell Quote'))

WebUI.setText(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/input__costSellAmount'),
	'50')

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/div_Enter currency to select_react-select___eeabd6'))

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/div_AED'))

WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__quotationFile'),filePath )

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/button_Save'))

WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/span_Submit for Approval'))

//WebUI.delay(3)
//
//WebUI.click(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/a_PO Bookings - Air160'))
//
//WebUI.setText(findTestObject('Object Repository/BPForwaderAirInternational/Page_IFC Global Logistics/input_Bookings_search-input input-text'),
//	GlobalVariable.POId)

WebUI.delay(7)

WebUI.closeBrowser()