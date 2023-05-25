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
    GlobalVariable.USERNAME_FORWARDER)

WebUI.click(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/input_Forgot password_Password'), 
    GlobalVariable.PASSWORD_FORWARDER)

WebUI.click(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Sign In'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/a_Forwardingdropdown'))

WebUI.click(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/a_Booking Management'))

WebUI.setText(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/input_Bookings_search-input input-text'), 
    GlobalVariable.POId)

WebUI.click(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/span_Active BPs'))

WebUI.click(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/a_Awaiting Forwarder Approval16'))

WebUI.click(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/a_M145-BB234_view-nav grid-icon icon-nav'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_IFC Global Logistics/span_Next_PO_FCL'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/span_Next_PO_FCL'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_IFC Global Logistics/a_Next_SS_FCL'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/a_Next_SS_FCL'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/button_Add Details'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/button_Select QuotationExpand row'))

WebUI.click(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/a_Q123, V1.0'))

WebUI.setText(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/input__modal-input input-text'), '33')


WebUI.click(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/span_Save'))

WebUI.click(findTestObject('Object Repository/SSSppll/Page_IFC Global Logistics/button_Approve Proposal'))

WebUI.delay(7)

WebUI.closeBrowser()

