import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mamikos.com/')

WebUI.click(findTestObject('Object Repository/Test Negative/Page_Mamikos - Cari Kost Apartemen Loker Gampang  Akurat/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Test Negative/Page_Mamikos - Cari Kost Apartemen Loker Gampang  Akurat/a_Sebagai Pemilik'))

WebUI.setText(findTestObject('Object Repository/Test Negative/Page_Login Pemilik Iklan - Mamikos/input_No Handphone_inputLog'), 
    '0877535356935')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Negative/Page_Login Pemilik Iklan - Mamikos/input_Password_insertPassword'), 
    't1jbfTwciceSSti9Y/ps8A==')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Test Negative/Page_Login Pemilik Iklan - Mamikos/button_LOGIN'))

AlertMsg = WebUI.getAlertText()

WebUI.verifyMatch(AlertMsg, 'Username atau password anda salah', false)

WebUI.closeBrowser()

