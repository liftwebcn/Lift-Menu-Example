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


case class ImmediateParam(name: String)

object MenuImmediateParam {

val exceptions =  List("index", "test", "param")

def parse(b: String) = {if (exceptions.contains(b)) Empty else Full(ImmediateParam(b))}
//def parse(b: String) = Full(ImmediateParam(b))
def encode(c: ImmediateParam) = c.name;

def menus: List[Menu] = List(m)

def m = Menu.param[ImmediateParam]("Immediate", "Immediate",  parse _, encode _) / *   >> Loc.Template(() => TemplateFinder.findAnyTemplate(List("immediate")) openOr <div>Parameter tested</div>)

}


