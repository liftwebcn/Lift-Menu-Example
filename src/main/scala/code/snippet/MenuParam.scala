package code 
package snippet 

import scala.xml.{NodeSeq, Text}
import net.liftweb.util._
import net.liftweb.common._
import net.liftweb.sitemap._
import code.lib._
import Helpers._
import net.liftweb._
import net.liftweb.http._


case class Param(name: String)

object MenuParam {

def parse(b: String) = {if (b == "except" || b == "") Empty else Full(Param(b))}
def encode(c: Param) = c.name;

def menus: List[Menu] = List(m_community_item)

def m_community_item = Menu.param[Param]("Param", "Param",  parse _, encode _) / "param" / *   >> Loc.Template(() => TemplateFinder.findAnyTemplate(List("abc")) openOr <div>Parameter tested</div>)

//

}


