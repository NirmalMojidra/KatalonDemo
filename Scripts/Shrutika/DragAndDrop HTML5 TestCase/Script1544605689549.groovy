import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.openBrowser("https://www.w3schools.com/html/html5_draganddrop.asp");
CustomKeywords.'shrutika.dnd.DragAndDropHelper.dragAndDrop'(findTestObject('Shrutika/DragAndDrop HTML5 Page/drag_img'),findTestObject('Shrutika/DragAndDrop HTML5 Page/DropObj'));
WebUI.verifyElementAttributeValue(findTestObject('Shrutika/DragAndDrop HTML5 Page/DropObj'), 'innerHTML', '<img src="img_w3slogo.gif" draggable="true" ondragstart="drag(event)" id="drag1" alt="W3Schools">', 20);
WebUI.takeScreenshot("E:\\screenShot\\"+getClass()+".png")
WebUI.closeBrowser();