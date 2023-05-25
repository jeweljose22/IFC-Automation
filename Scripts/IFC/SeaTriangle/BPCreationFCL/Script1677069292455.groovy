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

WebUI.setText(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/input_Username_Username'), 
    GlobalVariable.USERNAME_AGENT)

WebUI.verifyElementClickable(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Next'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/input_Forgot password_Password'), 
    GlobalVariable.PASSWORD_AGENT)

WebUI.verifyElementClickable(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Sign In'))

WebUI.click(findTestObject('Object Repository/POCreationForwarderSeaInternational/Page_IFC Global Logistics - Sign In/button_Sign In'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/a_Forwardingdropdown'))

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/a_Booking Management'))



WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/span_Add New Booking'))

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/a_PO Booking - FCL'))

WebUI.navigateToUrl('https://test.cschub.net/booking_list/POSelection')

WebUI.delay(2)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/button_Add to Booking Proposal'), 0)

WebUI.check(findTestObject('Object Repository/Page_IFC Global Logistics/check mark'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/button_Add to Booking Proposal'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/a_Next'), 0)

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/button_Add to Booking Proposal'))

WebUI.delay(5)

WebUI.verifyElementClickable(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/a_Next'))

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/a_Next'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/button_Close'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Object Repository/smpl1/Page_IFC Global Logistics/a_Next'))

WebUI.check(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/check_mark_route'))

WebUI.verifyElementClickable(findTestObject('Object Repository/smpl1/Page_IFC Global Logistics/a_Next'))

WebUI.click(findTestObject('Object Repository/smpl1/Page_IFC Global Logistics/a_Next'))

WebUI.click(findTestObject('Object Repository/smpl1/Page_IFC Global Logistics/a_Next'))


//WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/span_Next'))

//WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/a_Next'))

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/span_Add Container'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_IFC Global Logistics/div_Enter container type_field'), 0)

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/div_Enter container type_react-select__inpu_f9a3b2'))

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/div_Twenty foot non-operating reefer (20NOR)'))

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/div_Enter delivery mode_react-select__input_cc3e88'))

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/div_CYCY'))

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/div_Enter container mode_react-select__inpu_0754ba'))

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/div_FAK'))

WebUI.setText(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/input_FAK_quantity'), '50')

WebUI.scrollToElement(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/Page_IFC Global Logistics/div_ACTIONS_fcl'), 0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/span_Submit for Approval'), 0)

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/button_FAK_view-nav grid-icon icon-nav'))

WebUI.verifyElementClickable(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/span_Submit for Approval'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/span_Submit for Approval'))

WebUI.delay(2)

//WebUI.setText(findTestObject('Object Repository/SeaTriangleBP/Page_IFC Global Logistics/input_Bookings_search-input input-text'), 
//    GlobalVariable.POId)
WebUI.delay(7)

WebUI.closeBrowser()
