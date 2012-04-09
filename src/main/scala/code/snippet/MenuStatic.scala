package code 
package snippet 

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.sitemap._
import code.lib._
import Helpers._
import net.liftweb.http._


object MenuStatic {

def menus: List[Menu] = List(m_home, m_test,m_param_except)

def m_home = Menu.i("Home") / "index" 
def m_test = Menu.i("Test") / "test" 
def m_param = Menu.i("Param") / "param"   >> Loc.Template(() => TemplateFinder.findAnyTemplate(List("param")) openOr <div>Parameter tested</div>)
def m_param_except = Menu.i("Paramexcept") / "param" / "except"
}