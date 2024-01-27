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

WebUI.click(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/h1_Berita  Tips'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/h1_Berita  Tips'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/p_Dapatkan informasi terkini melalui berita_a7ef9d'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 480)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/p_Berita Tips Cover Nasional'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 931)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/ul_Sebelumnya1234521Berikutnya'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 1326)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/h2_Informasi Berita dan Artikel Otomotif Mo_1286d8'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/p_Halaman Berita dan Tips Auto2000 hadir un_c8eb7d'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/h2_FAQ Berita dan Artikel Otomotif Mobil Au_84da8c'))

WebUI.click(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/h3_Bisakah saya melakukan servis tanpa data_476f78'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/div_Anda hanya perlu memilih menu Layanan K_3b81e2'))

WebUI.click(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/summary_Bisakah saya melakukan servis tanpa_3b58ab'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 2234)

WebUI.verifyElementVisible(findTestObject('Object Repository/SIT PLP News/Page_Berita dan Tips  Auto2000/footer_MOBIL BARUYARIS CROSSYARIS CROSS HYB_f49a2d'))

WebUI.delay(3)

WebUI.closeBrowser()

