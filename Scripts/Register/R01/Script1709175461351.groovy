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

Mobile.comment('Story: Verify correct alarm message')

Mobile.comment('Given that user has started an application')

Mobile.startApplication("D:\\Graduation project\\app-release.apk", false)

Mobile.tap(findTestObject('Object Repository/Mobile/letStartBtn'),0)

Mobile.tap(findTestObject('Object Repository/Mobile/SignupText'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile/userNameInput'),"KieuOk", 0)

Mobile.setText(findTestObject('Object Repository/Mobile/emaiInput'),"kieuok@gmail.com", 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Mobile/passwordInput'),"SAvlOJIyqu31S5xyYolhlw==", 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Mobile/confirmPassword'),"SAvlOJIyqu31S5xyYolhlw==", 0)

Mobile.tap(findTestObject('Object Repository/Mobile/signupBtn'), 0)

