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


Date date= new Date()
currentDate=date.format('dd')

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

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/a_Forwardingdropdown'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/a_International PO'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/input_Purchase Orders_search-input input-text'),
	GlobalVariable.POId)

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/button_Status Awaiting Enrichment79Expand row'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/span_Awaiting Enrichment'))



//WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/button_filterheader menu'))
//
//WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_check mark'))


WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/a_sarathbabu_view-nav grid-icon icon-nav'))

WebUI.setText(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/input_concat(708 O, , Keefe Stravenue, Clet_a1b22d'), 
    '30')

WebUI.scrollToElement(findTestObject('Object Repository/Page_IFC Global Logistics/td_Sydney (AUSYD)'),
	3)

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/input_concat(708 O, , Keefe Stravenue, Clet_affbe3'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_2'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/button_Save'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/span_Confirm Products for Booking Proposal'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/button_Yes'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/a_Forwardingdropdown'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/a_Booking Management'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/span_Add New Booking'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/a_PO Booking - Air'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/div_check mark'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/button_Add to Booking Proposal'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/a_Next'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/div_Add ScheduleAdd 1 or more Flight schedu_2f62a5'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_Use Existing Schedule18'))

//WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/div_check mark'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/button_Select'))

WebUI.setText(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/input__bookingQuoteNumber'), 
    'BQN123')//random number required?

WebUI.setText(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/input__totalCoast'), 
    '35')

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/div_Select currency_react-select__input-con_539a28'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/div_AED'))



WebUI.uploadFile(findTestObject('Object Repository/Page_IFC Global Logistics/input__quotationFile'),filePath )

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/span_Submit'))

//WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/div_Enter Destination Agent to select_react_2f8be6'))
//
//WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/div_Ervin Howell'))
//
//WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/div_Enter Destination Agent to select_react_2f8be6'))
//
//WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/div_Leanne Graham'))

WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/a_Submit for Approval'))

//WebUI.click(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/a_PO Bookings - Air180'))
//
//WebUI.setText(findTestObject('Object Repository/POCreationAgentAirInternational/Page_IFC Global Logistics/input_Bookings_search-input input-text'), 
//    GlobalVariable.POId)

WebUI.delay(5)

WebUI.closeBrowser()


