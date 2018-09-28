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

WebUI.navigateToUrl(darwinurl)

WebUI.setText(findTestObject('ClockIn/Page_Sign in to your account/input_loginfmt'), darwinId)

WebUI.click(findTestObject('Object Repository/ClockIn/Page_Sign in to your account/nextBtn'))

WebUI.setEncryptedText(findTestObject('ClockIn/Page_Sign in to your account/input_passwd'), 'QzJv1f0M6FWdXY7cP3ryzg==')

WebUI.click(findTestObject('ClockIn/Page_Sign in to your account/input_idSIButton9'))

WebUI.click(findTestObject('ClockIn/Page_Sign in to your account/input_idSIButton9'))

WebUI.click(findTestObject('ClockIn/Page_Cigniti Technologies India Ltd/div_clearfix'))

WebUI.delay(2)

WebUI.closeBrowser()

