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



String randomNumber = 'PO-TEST-'+(int)(Math.random() * 4500)
GlobalVariable.POId=randomNumber
println(GlobalVariable.POId)

Date date= new Date()
currentDate=date.format('dd')
println(currentDate)
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics - Sign In/input_Username_Username'),
	GlobalVariable.USERNAME_FORWARDER)

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics - Sign In/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics - Sign In/input_Forgot password_Password'),
	GlobalVariable.PASSWORD_FORWARDER)

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics - Sign In/button_Sign In'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/a_Forwardingdropdown'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/a_International PO'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/span_Add New PO'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/a_Air Freight'))



WebUI.setText(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/input_PO Number_poNumber'),
	randomNumber)

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/div_Enter Client Name to select_react-selec_dfc0a4'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_'+clientName))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/div_Enter Vendor Name to select_react-selec_b2e85c'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_'+vendorName))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/button_Submit'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/button_Add Details'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/div_Enter Origin to select_css-ackcql'))

WebUI.setText(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/input__react-select-4-input'),
	'AUMEL')

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_AUSTRALIAN CUSTOMS CLEARANCE FEES(AUCCF)'))

//WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/label_Destination'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/div_Enter Destination to select_css-ackcql'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/input__react-select-5-input'),
	'IRSRY')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/div_Sary(IRSRY)'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/div_Select Destination Address_react-select_3cafa5'))

WebUI.click(findTestObject('Object Repository/IFCSeaTrianglePOCreation/Page_IFC Global Logistics/div_9699 OConner Circle, Waters Ports, Hunt_dd8b07'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/div_Select agent_react-select__input-contai_9eaf56'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/div_GROCERY CORPORATION'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/button_Save'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/span_Next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_IFC Global Logistics/div_check mark'), 0)

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/span_Add Dates'))

WebUI.click(findTestObject('Object Repository/POCreationForwarder/Page_IFC Global Logistics/input_Order Date_orderDate'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/button_Next Month_pocreation_calender'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_1'))

WebUI.click(findTestObject('Object Repository/POCreationForwarder/Page_IFC Global Logistics/input_Start Shipping Window_startShipWindowDate'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/button_Next Month_pocreation_calender'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_2'))

WebUI.click(findTestObject('Object Repository/POCreationForwarder/Page_IFC Global Logistics/input_End Shipping Window_endShipWindowDate'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/button_Next Month_pocreation_calender'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_3'))

WebUI.click(findTestObject('Object Repository/POCreationForwarder/Page_IFC Global Logistics/input_Goods Ready Date_goodsReadyDate'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/button_Next Month_pocreation_calender'))

WebUI.click(findTestObject('Object Repository/Page_IFC Global Logistics/div_1'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/span_Save'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/a_Next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_IFC Global Logistics/div_check mark_date'), 0)

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirHeaderOnly/Page_IFC Global Logistics/span_Skip PO Line Addition'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirHeaderOnly/Page_IFC Global Logistics/button_Yes'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/a_Next_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_IFC Global Logistics/checkmark_product'), 0)

WebUI.click(findTestObject('Object Repository/POCreationForwarderAirTriangle/Page_IFC Global Logistics/span_Confirm and Submit PO'))

//WebUI.setText(findTestObject('Object Repository/POCreationForwarder/Page_IFC Global Logistics/input_Purchase Orders_search-input input-text'),
//	randomNumber)

WebUI.delay(5)

WebUI.closeBrowser()