import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.event.ActionEvent as ActionEvent
import org.openqa.selenium.interactions.Actions as Actions
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

WebUI.navigateToUrl('https://html5demos.com/drag/')

WebUI.maximizeWindow()

Thread.sleep(2000)

//Actions drag_drop = new Actions(WebUI)

CustomKeywords.'test.dragDrop'("findTestObject('Object Repository/Page_HTML5 Demo Drag and drop/a_one')", "findTestObject('Object Repository/Page_HTML5 Demo Drag and drop/div_Drag and drop_bin')")
//test.dragDrop("findTestObject('Object Repository/Page_HTML5 Demo Drag and drop/a_three')", "findTestObject('Object Repository/Page_HTML5 Demo Drag and drop/div_Drag and drop_bin')")
//drag_drop.dragAndDrop(findTestObject('Object Repository/Page_HTML5 Demo Drag and drop/a_three'), findTestObject('Object Repository/Page_HTML5 Demo Drag and drop/div_Drag and drop_bin'))