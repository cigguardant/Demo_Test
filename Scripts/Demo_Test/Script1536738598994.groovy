import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Object Repository/Amazon/Page_Amazon.com Online Shopping for/span_Hello. Sign in'))

WebUI.doubleClick(findTestObject('Object Repository/Amazon/Page_Amazon Sign In/input_email'))

WebUI.setText(findTestObject('Object Repository/Amazon/Page_Amazon Sign In/input_email'), '')

WebUI.doubleClick(findTestObject('Object Repository/Amazon/Page_Amazon Sign In/input_email'))

WebUI.setText(findTestObject('Object Repository/Amazon/Page_Amazon Sign In/input_email'), User)

WebUI.click(findTestObject('Object Repository/Amazon/Page_Amazon Sign In/continue_btn'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon/Page_Amazon Sign In/input_password'), password)

WebUI.click(findTestObject('Object Repository/Amazon/Page_Amazon Sign In/input_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Amazon/Page_Amazon.com Online Shopping for/img'))

WebUI.setText(findTestObject('Object Repository/Amazon/Page_Amazon.com Online Shopping for/input_field-keywords'), 'Motorola Mobile')

WebUI.click(findTestObject('Amazon/Page_Amazon.com Online Shopping for/search_btn'))

WebUI.mouseOver(findTestObject('Object Repository/Amazon/Page_Amazon.com Online Shopping for/span_Hello Testing121'))

WebUI.click(findTestObject('Object Repository/Amazon/Page_Amazon.com searzall - Cooking/span_Sign Out'))

WebUI.takeScreenshot()

WebUI.closeBrowser()