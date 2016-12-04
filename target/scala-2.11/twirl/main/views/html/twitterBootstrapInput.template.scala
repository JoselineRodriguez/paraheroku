
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object twitterBootstrapInput_Scope0 {
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

class twitterBootstrapInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.53*/("""
"""),format.raw/*6.1*/("""<div class="clearfix """),_display_(/*6.23*/if(elements.hasErrors)/*6.45*/ {_display_(Seq[Any](format.raw/*6.47*/("""error""")))}),format.raw/*6.53*/("""">
    <label for=""""),_display_(/*7.18*/elements/*7.26*/.id),format.raw/*7.29*/("""">"""),_display_(/*7.32*/elements/*7.40*/.label),format.raw/*7.46*/("""</label>
    <div class="input">
        """),_display_(/*9.10*/elements/*9.18*/.input),format.raw/*9.24*/("""
        """),format.raw/*10.9*/("""<span class="help-inline">"""),_display_(/*10.36*/elements/*10.44*/.infos.mkString(", ")),format.raw/*10.65*/("""</span> 
    </div>
</div>
"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


}

/**/
object twitterBootstrapInput extends twitterBootstrapInput_Scope0.twitterBootstrapInput
              /*
                  -- GENERATED --
                  DATE: Sun Dec 04 09:19:24 CST 2016
                  SOURCE: C:/Users/win7/Desktop/tareaigf/biodiversidadebean/app/views/twitterBootstrapInput.scala.html
                  HASH: 4c7e651f272f7c8ca879e18f9f0d844697c3eadd
                  MATRIX: 791->1|918->33|949->197|977->199|1025->221|1055->243|1094->245|1130->251|1177->272|1193->280|1216->283|1245->286|1261->294|1287->300|1357->344|1373->352|1399->358|1436->368|1490->395|1507->403|1549->424
                  LINES: 27->1|32->1|34->5|35->6|35->6|35->6|35->6|35->6|36->7|36->7|36->7|36->7|36->7|36->7|38->9|38->9|38->9|39->10|39->10|39->10|39->10
                  -- GENERATED --
              */
          