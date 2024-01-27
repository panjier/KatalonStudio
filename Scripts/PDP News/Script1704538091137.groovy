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

WebUI.navigateToUrl('https://sit.auto2000.co.id/berita-dan-tips')

WebUI.maximizeWindow()

WebUI.click(findTestObject('SIT PDP News/card content'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/h1_TOYOTA GR SPORT - HARGA, SPESIFIKASI, DA_af37c1'))

WebUI.scrollToPosition(0, 397)

WebUI.delay(2)

WebUI.scrollToPosition(0, 751)

WebUI.delay(2)

WebUI.scrollToPosition(0, 3155)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/p_Promo Terkait'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_Promo TerkaitLihat semuaAgya Generasi T_77c1f2'))

WebUI.scrollToPosition(0, 3541)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/p_Artikel Lainnya'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_Artikel LainnyaLihat semuaMobil dengan _5aa102'))

WebUI.scrollToPosition(0, 3943)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/section_Bagikan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_AUTO2000 DIGIROOMDealer Toyota terbesar_d961b6'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/footer_MOBIL BARUYARIS CROSSYARIS CROSS HYB_f49a2d'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('SIT PDP News/breadcrumbs'))

WebUI.click(findTestObject('SIT PDP News/Kat Berita'))

WebUI.click(findTestObject('SIT PDP News/card content'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/h1_TOYOTA GR SPORT - HARGA, SPESIFIKASI, DA_af37c1'))

WebUI.scrollToPosition(0, 397)

WebUI.delay(2)

WebUI.scrollToPosition(0, 751)

WebUI.delay(2)

WebUI.scrollToPosition(0, 3155)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/p_Promo Terkait'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_Promo TerkaitLihat semuaAgya Generasi T_77c1f2'))

WebUI.scrollToPosition(0, 3541)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/p_Artikel Lainnya'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_Artikel LainnyaLihat semuaMobil dengan _5aa102'))

WebUI.scrollToPosition(0, 3943)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/section_Bagikan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_AUTO2000 DIGIROOMDealer Toyota terbesar_d961b6'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/footer_MOBIL BARUYARIS CROSSYARIS CROSS HYB_f49a2d'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('SIT PDP News/breadcrumbs'))

WebUI.click(findTestObject('SIT PDP News/Kat review'))

WebUI.click(findTestObject('SIT PDP News/card content'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/h1_TOYOTA GR SPORT - HARGA, SPESIFIKASI, DA_af37c1'))

WebUI.scrollToPosition(0, 397)

WebUI.delay(2)

WebUI.scrollToPosition(0, 751)

WebUI.delay(2)

WebUI.scrollToPosition(0, 3155)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/p_Promo Terkait'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_Promo TerkaitLihat semuaAgya Generasi T_77c1f2'))

WebUI.scrollToPosition(0, 3541)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/p_Artikel Lainnya'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_Artikel LainnyaLihat semuaMobil dengan _5aa102'))

WebUI.scrollToPosition(0, 3943)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/section_Bagikan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_AUTO2000 DIGIROOMDealer Toyota terbesar_d961b6'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/footer_MOBIL BARUYARIS CROSSYARIS CROSS HYB_f49a2d'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('SIT PDP News/breadcrumbs'))

WebUI.click(findTestObject('SIT PDP News/Kat Tips'))

WebUI.click(findTestObject('SIT PDP News/card content'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/h1_TOYOTA GR SPORT - HARGA, SPESIFIKASI, DA_af37c1'))

WebUI.scrollToPosition(0, 397)

WebUI.delay(2)

WebUI.scrollToPosition(0, 751)

WebUI.delay(2)

WebUI.scrollToPosition(0, 3155)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/p_Promo Terkait'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_Promo TerkaitLihat semuaAgya Generasi T_77c1f2'))

WebUI.scrollToPosition(0, 3541)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/p_Artikel Lainnya'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_Artikel LainnyaLihat semuaMobil dengan _5aa102'))

WebUI.scrollToPosition(0, 3943)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/section_Bagikan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_AUTO2000 DIGIROOMDealer Toyota terbesar_d961b6'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/footer_MOBIL BARUYARIS CROSSYARIS CROSS HYB_f49a2d'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('SIT PDP News/breadcrumbs'))

WebUI.click(findTestObject('SIT PDP News/Kat Event'))

WebUI.click(findTestObject('SIT PDP News/card content'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/h1_TOYOTA GR SPORT - HARGA, SPESIFIKASI, DA_af37c1'))

WebUI.scrollToPosition(0, 397)

WebUI.delay(2)

WebUI.scrollToPosition(0, 751)

WebUI.delay(2)

WebUI.scrollToPosition(0, 3155)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/p_Promo Terkait'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_Promo TerkaitLihat semuaAgya Generasi T_77c1f2'))

WebUI.scrollToPosition(0, 3541)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/p_Artikel Lainnya'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_Artikel LainnyaLihat semuaMobil dengan _5aa102'))

WebUI.scrollToPosition(0, 3943)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/section_Bagikan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/div_AUTO2000 DIGIROOMDealer Toyota terbesar_d961b6'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, _1e793e/footer_MOBIL BARUYARIS CROSSYARIS CROSS HYB_f49a2d'))

WebUI.scrollToPosition(0, 0)

WebUI.setText(findTestObject('Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/inputinput-full-name'), 'andritany')

WebUI.setText(findTestObject('Inquiry/Page_YEFTA _Promo Toyota Alphard  Auto2000/inputinput-phone-number'), '895416179331')

WebUI.click(findTestObject('SIT PDP/Model Mobil'))

WebUI.click(findTestObject('SIT PDP/Alphard'))

WebUI.click(findTestObject('SIT PDP/Provinsi'))

WebUI.click(findTestObject('SIT PDP/List Provinsi/Jakarta'))

WebUI.click(findTestObject('SIT PDP/Kota'))

WebUI.click(findTestObject('SIT PDP/CIty/jakarta pusat'))

WebUI.click(findTestObject('SIT PDP News/Page_TOYOTA GR SPORT - HARGA, SPESIFIKASI, DAN PROMO TERBARU 2022  Auto2000/checkbox'))

WebUI.verifyElementVisible(findTestObject('SIT PDP News/saya setuju'))

WebUI.verifyElementVisible(findTestObject('SIT PDP News/Data pribadi'))

WebUI.click(findTestObject('SIT PDP News/submit'))

WebUI.verifyElementVisible(findTestObject('SIT PDP News/OTP'))

WebUI.click(findTestObject('SIT PDP News/close pop up OTP'))

WebUI.delay(3)

WebUI.closeBrowser()

