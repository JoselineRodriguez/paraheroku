
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createForm_Scope0 {
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

class createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Bio],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bioForm: Form[Bio]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.22*/("""


"""),format.raw/*5.1*/("""
"""),format.raw/*6.80*/(""" 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
    
    """),format.raw/*10.5*/("""<h1>Agregar Biodiversidad</h1>
    """),_display_(/*11.6*/form(routes.Application.save())/*11.37*/ {_display_(Seq[Any](format.raw/*11.39*/("""
        
        """),format.raw/*13.9*/("""<fieldset>
            """),_display_(/*14.14*/textarea(bioForm("flora"), '_label -> "Flora", '_help -> "",'rows -> 2,'cols -> 600)),format.raw/*14.98*/("""
            """),_display_(/*15.14*/textarea(bioForm("fauna"), '_label -> "Fauna", '_help -> "",'rows -> 2,'cols -> 600)),format.raw/*15.98*/("""
            """),_display_(/*16.14*/textarea(bioForm("contaminacionagua"), '_label -> "Contaminación Agua", '_help -> "",'rows -> 2,'cols -> 600)),format.raw/*16.123*/("""
            """),_display_(/*17.14*/textarea(bioForm("contaminacionacustica"), '_label -> "Contaminacíon Acustica", '_help -> "",'rows -> 2,'cols -> 600)),format.raw/*17.131*/("""
            
            """),_display_(/*19.14*/select(
                bioForm("calidad.id"), 
                options(Calidad.options), 
                '_label -> "Calidad del Aire", '_default -> "-- Escoge la Calidad de Aire--",
                '_showConstraints -> false
            )),format.raw/*24.14*/("""
           
            
               """),_display_(/*27.17*/select(
                bioForm("departamento.id"), 
                options(Departamento.options), 
                '_label -> "Departamento", '_default -> "-- Escoge un Departamento--",
                '_showConstraints -> false
            )),format.raw/*32.14*/("""
            
            """),_display_(/*34.14*/select(
                bioForm("municipio.id"), 
                options(Municipio.options), 
                '_label -> "Municipio", '_default -> "-- Escoge un Municipio--",
                '_showConstraints -> false
            )),format.raw/*39.14*/("""
            
             """),_display_(/*41.15*/textarea(bioForm("recomendacion"), '_label -> "Recomendaciones", '_help -> "Cualquier nota que desee agregar",'rows -> 2,'cols -> 600)),format.raw/*41.149*/("""
            

        """),format.raw/*44.9*/("""</fieldset>
        <div class="actions">
            <input type="submit" value="Crear Biodiversidad" class="btn primary"> or 
            <a href=""""),_display_(/*47.23*/routes/*47.29*/.Application.list()),format.raw/*47.48*/("""" class="btn">Cancel</a> 
        </div>
        
        <div style="position:absolute; left:600px; top:100px; width:728px; height:70px ">

         <img WIDTH=600 HEIGHT=400 align="right" src=""""),_display_(/*52.56*/routes/*52.62*/.Assets.at("images/icas2016.png")),format.raw/*52.95*/(""""/>
         
         </div> 
    """)))}),format.raw/*55.6*/("""
    
""")))}))
      }
    }
  }

  def render(bioForm:Form[Bio]): play.twirl.api.HtmlFormat.Appendable = apply(bioForm)

  def f:((Form[Bio]) => play.twirl.api.HtmlFormat.Appendable) = (bioForm) => apply(bioForm)

  def ref: this.type = this

}


}

/**/
object createForm extends createForm_Scope0.createForm
              /*
                  -- GENERATED --
                  DATE: Sun Dec 04 09:19:23 CST 2016
                  SOURCE: C:/Users/win7/Desktop/tareaigf/biodiversidadebean/app/views/createForm.scala.html
                  HASH: 8fc7d9d7ad97707dcae411956d82c20186e53115
                  MATRIX: 758->1|880->48|912->72|996->21|1028->45|1057->126|1088->132|1099->136|1137->138|1176->150|1239->187|1279->218|1319->220|1366->240|1418->265|1523->349|1565->364|1670->448|1712->463|1843->572|1885->587|2024->704|2080->733|2347->979|2419->1024|2689->1273|2745->1302|3003->1539|3060->1569|3216->1703|3269->1729|3449->1882|3464->1888|3504->1907|3732->2108|3747->2114|3801->2147|3870->2186
                  LINES: 27->1|31->6|31->6|32->1|35->5|36->6|38->8|38->8|38->8|40->10|41->11|41->11|41->11|43->13|44->14|44->14|45->15|45->15|46->16|46->16|47->17|47->17|49->19|54->24|57->27|62->32|64->34|69->39|71->41|71->41|74->44|77->47|77->47|77->47|82->52|82->52|82->52|85->55
                  -- GENERATED --
              */
          