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

WebUI.click(findTestObject('Object Repository/mamikos_1/Page_Mamikos - Cari Kost Apartemen Loker Gampang  Akurat/span_Cari Iklan_caret  --show'))

WebUI.click(findTestObject('Object Repository/mamikos_1/Page_Mamikos - Cari Kost Apartemen Loker Gampang  Akurat/a_Cari kost'))

WebUI.click(findTestObject('Object Repository/mamikos_1/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/button_Saya Mengerti'))

WebUI.selectOptionByValue(findTestObject('Object Repository/mamikos_1/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/select_Semua Khusus Putri Khusus Putra Putri atau Putra Putri dan Campur Putra dan Campur Campur'), 
    '2', true)
for(int i=0; i<2; i++) {
WebUI.click(findTestObject('Object Repository/mamikos_1/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/a_Lihat lebih banyak lagi'))}

