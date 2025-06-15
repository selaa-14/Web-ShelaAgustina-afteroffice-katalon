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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.scrollToElement(findTestObject('PracticeForm/Input-FirstName'), 7)

WebUI.setText(findTestObject('PracticeForm/Input-FirstName'), 'El')

WebUI.setText(findTestObject('PracticeForm/Input-LastName'), 'Van')

WebUI.setText(findTestObject('PracticeForm/Input-Email'), 'elvan@gmail.com')

WebUI.click(findTestObject('PracticeForm/Gender-Male'))

WebUI.setText(findTestObject('PracticeForm/Input-MobileNumber'), '0812345678')

WebUI.click(findTestObject('PracticeForm/Input-DOB'))

WebUI.sendKeys(findTestObject('PracticeForm/Input-DOB'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('PracticeForm/Input-DOB'), '1999 March 12' + Keys.ENTER)

WebUI.setText(findTestObject('PracticeForm/Input-Subjects'), 'English')

WebUI.sendKeys(findTestObject('PracticeForm/Input-Subjects'), 'English' + Keys.ENTER)

WebUI.setText(findTestObject('PracticeForm/Input-Subjects'), 'Maths')

WebUI.sendKeys(findTestObject('PracticeForm/Input-Subjects'), 'Maths' + Keys.ENTER)

WebUI.setText(findTestObject('PracticeForm/Input-Subjects'), 'History')

WebUI.sendKeys(findTestObject('PracticeForm/Input-Subjects'), 'History' + Keys.ENTER)

WebUI.setText(findTestObject('PracticeForm/Input-Subjects'), 'Art')

WebUI.sendKeys(findTestObject('PracticeForm/Input-Subjects'), 'Art' + Keys.ENTER)

WebUI.click(findTestObject('PracticeForm/Hobbies-Sports'))

WebUI.click(findTestObject('PracticeForm/Hobbies-Reading'))

WebUI.click(findTestObject('PracticeForm/Hobbies-Music'))

WebUI.uploadFile(findTestObject('PracticeForm/Upload-Photo'), 'C:\\Users\\Phincon\\Downloads\\WhatsApp Image 2025-06-11 at 19.51.47.jpeg')

WebUI.setText(findTestObject('PracticeForm/Input-Address'), 'Bandung')

WebUI.scrollToElement(findTestObject('PracticeForm/State/State-Container'), 5)

WebUI.click(findTestObject('PracticeForm/State/State-Container'))

WebUI.click(findTestObject('PracticeForm/State/State-Rajasthan'))

WebUI.click(findTestObject('PracticeForm/City/City-Container'))

WebUI.click(findTestObject('PracticeForm/City/City-Jaipur'))

WebUI.click(findTestObject('PracticeForm/Submit'))

WebUI.verifyElementPresent(findTestObject('PracticeForm/Validate'), 3)

WebUI.closeBrowser()

