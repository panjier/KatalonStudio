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

WebUI.navigateToUrl('https://sit.auto2000.co.id/promosi')

WebUI.click(findTestObject('Object Repository/fungsional/Page_Promo Toyota Terbaru 2024 di Indonesia_7b2a55/a_MOBIL BARU'))

WebUI.click(findTestObject('Object Repository/fungsional/Page_Promo Mobil Baru Toyota, Cicilan dan D_2ad4bb/img_aspect-video object-cover object-center mb-4'))

WebUI.click(findTestObject('Object Repository/fungsional/Page_YEFTA _Promo Toyota Alphard  Auto2000/svg_w-6 h-6 lgw-8 lgh-8'))

WebUI.click(findTestObject('Object Repository/fungsional/Page_YEFTA _Promo Toyota Alphard  Auto2000/svg'))

WebUI.click(findTestObject('Object Repository/fungsional/Page_YEFTA _Promo Toyota Alphard  Auto2000/svg_1'))

WebUI.click(findTestObject('Object Repository/fungsional/Page_YEFTA _Promo Toyota Alphard  Auto2000/span_Lihat semua'))

