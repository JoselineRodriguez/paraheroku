
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Base de datos de Biodiversidades</title>
        """),format.raw/*13.47*/("""
        """),format.raw/*14.9*/("""<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*14.70*/routes/*14.76*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*14.119*/("""">
        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.at("stylesheets/main.css")),format.raw/*16.94*/(""""/> 
    </head>
    <body>
    
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(/*22.27*/routes/*22.33*/.Application.index()),format.raw/*22.53*/("""">
                    Registro de Biodiversidad &mdash; Flora, Fauna, Contaminación de Agua, Contaminación Acustica y Calidad de Aire
                </a>
            </h1>
           
        </header>
        <section id="main">
      
            """),_display_(/*30.14*/content),format.raw/*30.21*/("""
        """),format.raw/*31.9*/("""</section>
        
    </body>
</html>"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun Dec 04 09:19:24 CST 2016
                  SOURCE: C:/Users/win7/Desktop/tareaigf/biodiversidadebean/app/views/main.scala.html
                  HASH: 9d40c057af2086d5c7ffb9f83915f9a944f6bb6f
                  MATRIX: 741->1|851->16|881->20|1011->627|1048->637|1136->698|1151->704|1216->747|1310->814|1325->820|1380->854|1534->981|1549->987|1590->1007|1877->1267|1905->1274|1942->1284
                  LINES: 27->1|32->1|34->3|38->13|39->14|39->14|39->14|39->14|41->16|41->16|41->16|47->22|47->22|47->22|55->30|55->30|56->31
                  -- GENERATED --
              */
          