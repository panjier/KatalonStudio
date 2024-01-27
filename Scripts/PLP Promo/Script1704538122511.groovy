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

WebUI.navigateToUrl(PreProd)

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('SIT PLP/Title'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Description'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Hero image'))

WebUI.click(findTestObject('SIT PLP/Kategori Mobil Baru'))

WebUI.scrollToElement(findTestObject('SIT PLP/List Content'), 0)

WebUI.scrollToElement(findTestObject('SIT PLP/Pagination'), 0)

WebUI.scrollToElement(findTestObject('SIT PLP/Section Information'), 0)

WebUI.verifyElementVisible(findTestObject('SIT PLP/Section Information'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('SIT PLP/Deskripsi Informasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('SIT PLP/FAQ title'))

WebUI.click(findTestObject('SIT PLP/Question FAQ'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Answer FAQ'))

WebUI.click(findTestObject('SIT PLP/Question FAQ'))

WebUI.scrollToElement(findTestObject('SIT PLP/Footer'), 0)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('SIT PLP/Kategori Servis'))

WebUI.scrollToElement(findTestObject('SIT PLP/List Content'), 0)

WebUI.scrollToElement(findTestObject('SIT PLP/Pagination'), 0)

WebUI.scrollToElement(findTestObject('SIT PLP/Section Information'), 0)

WebUI.verifyElementVisible(findTestObject('SIT PLP/Section Information'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('SIT PLP/Deskripsi Informasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('SIT PLP/FAQ title'))

WebUI.click(findTestObject('SIT PLP/Question FAQ'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Answer FAQ'))

WebUI.click(findTestObject('SIT PLP/Question FAQ'))

WebUI.scrollToElement(findTestObject('SIT PLP/Footer'), 0)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('SIT PLP/Kategori Lainnya'))

WebUI.scrollToElement(findTestObject('SIT PLP/List Content'), 0)

WebUI.scrollToElement(findTestObject('SIT PLP/Pagination'), 0)

WebUI.scrollToElement(findTestObject('SIT PLP/Section Information'), 0)

WebUI.verifyElementVisible(findTestObject('SIT PLP/Section Information'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('SIT PLP/Deskripsi Informasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('SIT PLP/FAQ title'))

WebUI.click(findTestObject('SIT PLP/Question FAQ'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Answer FAQ'))

WebUI.click(findTestObject('SIT PLP/Question FAQ'))

WebUI.scrollToElement(findTestObject('SIT PLP/Footer'), 0)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('SIT PLP/Kategori semua'))

WebUI.scrollToElement(findTestObject('SIT PLP/List Content'), 0)

WebUI.scrollToElement(findTestObject('SIT PLP/Pagination'), 0)

WebUI.scrollToElement(findTestObject('SIT PLP/Section Information'), 0)

WebUI.verifyElementVisible(findTestObject('SIT PLP/Section Information'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('SIT PLP/Deskripsi Informasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('SIT PLP/FAQ title'))

WebUI.click(findTestObject('SIT PLP/Question FAQ'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Answer FAQ'))

WebUI.click(findTestObject('SIT PLP/Question FAQ'))

WebUI.scrollToElement(findTestObject('SIT PLP/Footer'), 0)

WebUI.closeBrowser()

