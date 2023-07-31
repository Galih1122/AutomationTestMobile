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

Mobile.startApplication('C:\\Users\\galih\\Downloads\\Android-MyDemoAppRN.1.3.0.build-244.apk', true)

Mobile.tap(findTestObject('Object Repository/eCommerceapk/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/eCommerceapk/android.widget.TextView - Log In'), 0)

Mobile.setText(findTestObject('Object Repository/eCommerceapk/android.widget.EditText'), 'bob@example.com', 0)

Mobile.setText(findTestObject('Object Repository/eCommerceapk/android.widget.EditText (1)'), '10203040', 0)

Mobile.tap(findTestObject('Object Repository/eCommerceapk/android.view.ViewGroup'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/eCommerceapk/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/eCommerceapk/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/eCommerceapk/android.widget.TextView - Log Out'), 0)

TestObject element = findTestObject('Object Repository/eCommerceapk/android.widget.TextView - Are you sure you sure you want to logout')

String expectedText = "Are you sure you sure you want to logout?"

Mobile.verifyElementText(element, expectedText)

Mobile.tap(findTestObject('Object Repository/eCommerceapk/android.widget.Button - LOG OUT'), 0)

TestObject elementafterlogout = findTestObject('Object Repository/eCommerceapk/android.widget.TextView - You are successfully logged out')

String expectedText2 = "You are successfully logged out."

Mobile.verifyElementText(elementafterlogout, expectedText2)

Mobile.tap(findTestObject('Object Repository/eCommerceapk/android.widget.Button - OK'), 0)

Mobile.closeApplication()

