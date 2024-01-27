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

WebUI.click(findTestObject('Object Repository/Inquiry/Page_Promo Toyota Terbaru 2024 di Indonesia_7b2a55/img_aspect-video object-cover object-center mb-4'))

WebUI.setText(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/inputinput-full-name'), 
    'panji')

WebUI.setText(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/inputinput-phone-number'), 
    '895380836366')

WebUI.setText(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/inputdd-provinsi'), '')

WebUI.click(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/inputdd-provinsi'))

WebUI.click(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/li_DKI Jakarta'))

WebUI.click(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/inputdd-city'))

WebUI.click(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/li_Jakarta Pusat'))

WebUI.click(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/inputdd-model-mobil'))

WebUI.click(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/li_New Alphard'))

WebUI.click(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/div_w-17px h-17px border rounded-none bg-in_95bb4d'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/p_Data pribadi Anda aman bersama kami Kebij_913c42'))

WebUI.click(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/p_Saya Tertarik'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/div_Masukkan Kode OTP'))

