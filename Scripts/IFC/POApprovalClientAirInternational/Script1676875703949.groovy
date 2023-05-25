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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics - Sign In/input_Username_Username'), 
    GlobalVariable.USERNAME_CLIENT)

WebUI.click(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics - Sign In/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics - Sign In/input_Forgot password_Password'), 
    GlobalVariable.PASSWORD_CLIENT)

WebUI.click(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics - Sign In/button_Sign In'))

WebUI.click(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics/a_Forwardingdropdown'))

WebUI.click(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics/a_Booking Management'))

WebUI.click(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics/a_PO Bookings - Air20'))

WebUI.setText(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics/input_Bookings_search-input input-text'), 
    GlobalVariable.POId)


WebUI.click(findTestObject('Object Repository/smpl/Page_IFC Global Logistics/span_Active BPs'))

WebUI.click(findTestObject('Object Repository/smpl/Page_IFC Global Logistics/span_Awaiting Client Approval'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics/a_carrier-anj-01 f-1_view-nav grid-icon icon-nav'))

WebUI.click(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics/a_Next'))

WebUI.click(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics/div_check mark'))

WebUI.click(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics/span_Approve Proposal'))

//WebUI.setText(findTestObject('Object Repository/POApprovalClientAirInternational/Page_IFC Global Logistics/input_Bookings_search-input input-text'), 
//    GlobalVariable.POId)

WebUI.delay(5)

WebUI.closeBrowser()

