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

//WebUI.setViewPortSize(360, 887)
WebUI.verifyElementVisible(findTestObject('SIT PLP/Hero image'))

WebUI.scrollToElement(findTestObject('SIT PLP/List Content'), 0)

WebUI.click(findTestObject('SIT PDP/Card Product'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Title content'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Button Share'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Title periode'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Periode Promo'))

WebUI.scrollToElement(findTestObject('SIT PDP/Detail Content'), 0)

WebUI.verifyElementVisible(findTestObject('SIT PDP/Detail Content'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Promo Lainnya'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/List Content Lainnya'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Button share sosmed'))

WebUI.scrollToElement(findTestObject('SIT PDP/Footer'), 0)

WebUI.delay(3)

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('SIT PDP/Breadcrumbs'))

WebUI.click(findTestObject('SIT PDP/Kat Servis'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Title'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Description'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Hero image'))

WebUI.scrollToElement(findTestObject('SIT PLP/List Content'), 0)

WebUI.click(findTestObject('SIT PDP/Card Product'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Title content'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Button Share'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Title periode'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Periode Promo'))

WebUI.scrollToElement(findTestObject('SIT PDP/Detail Content'), 0)

WebUI.verifyElementVisible(findTestObject('SIT PDP/Detail Content'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Promo Lainnya'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/List Content Lainnya'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Button share sosmed'))

WebUI.scrollToElement(findTestObject('SIT PDP/Footer'), 0)

WebUI.delay(3)

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('SIT PDP/Breadcrumbs'))

WebUI.click(findTestObject('SIT PDP/Kat Lainnya'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Title'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Description'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Hero image'))

WebUI.scrollToElement(findTestObject('SIT PLP/List Content'), 0)

WebUI.click(findTestObject('SIT PDP/Card Product'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Title content'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Button Share'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Title periode'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Periode Promo'))

WebUI.scrollToElement(findTestObject('SIT PDP/Detail Content'), 0)

WebUI.verifyElementVisible(findTestObject('SIT PDP/Detail Content'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Promo Lainnya'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/List Content Lainnya'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Button share sosmed'))

WebUI.scrollToElement(findTestObject('SIT PDP/Footer'), 0)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('SIT PDP/Breadcrumbs'))

WebUI.click(findTestObject('SIT PDP/Kat Mobil Baru'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Title'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Description'))

WebUI.verifyElementVisible(findTestObject('SIT PLP/Hero image'))

WebUI.scrollToElement(findTestObject('SIT PLP/List Content'), 0)

WebUI.click(findTestObject('SIT PDP/Card Product'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Title content'))

WebUI.click(findTestObject('SIT PDP/Button Share'))

WebUI.delay(2)

WebUI.click(findTestObject('fungsional/Page_YEFTA _Promo Toyota Alphard  Auto2000/svg'))

WebUI.click(findTestObject('SIT PDP/X'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Title periode'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Periode Promo'))

WebUI.scrollToElement(findTestObject('SIT PDP/Detail Content'), 0)

WebUI.verifyElementVisible(findTestObject('SIT PDP/Detail Content'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Promo Lainnya'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/List Content Lainnya'))

WebUI.verifyElementVisible(findTestObject('SIT PDP/Button share sosmed'))

WebUI.scrollToElement(findTestObject('SIT PDP/Footer'), 0)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.verifyElementVisible(findTestObject('SIT PDP/Inquiry Form'))

WebUI.setText(findTestObject('Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/inputinput-full-name'), 'markus horison')

WebUI.setText(findTestObject('Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/inputinput-phone-number'), '89673761949')

WebUI.click(findTestObject('SIT PDP/Provinsi'))

WebUI.click(findTestObject('SIT PDP/List Provinsi/Jakarta'))

WebUI.click(findTestObject('SIT PDP/Kota'))

WebUI.click(findTestObject('SIT PDP/CIty/jakarta pusat'))

WebUI.click(findTestObject('SIT PDP/Model Mobil'))

WebUI.click(findTestObject('SIT PDP/Agya'))

WebUI.click(findTestObject('Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/div_w-17px h-17px border rounded-none bg-in_95bb4d'))

WebUI.verifyElementVisible(findTestObject('Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/p_Saya telah membaca dan menyetujui Syarat _5d777f'))

WebUI.verifyElementVisible(findTestObject('Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/p_Data pribadi Anda aman bersama kami Kebij_913c42'))

WebUI.click(findTestObject('SIT PDP News/submit'))

WebUI.verifyElementVisible(findTestObject('Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/div_Masukkan Kode OTP'))

WebUI.click(findTestObject('SIT PDP/X OTP'))

WebUI.scrollToElement(findTestObject('SIT PDP/List Content Lainnya'), 0)

WebUI.scrollToPosition(0, 1213)

WebUI.click(findTestObject('SIT PDP/Lihat Semua'))

WebUI.delay(3)

WebUI.closeBrowser()

