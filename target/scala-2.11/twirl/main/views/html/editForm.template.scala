
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editForm_Scope0 {
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

class editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Bio],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, bioForm: Form[Bio]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*10.2*/implicitFieldConstructor/*10.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.32*/("""






"""),format.raw/*9.1*/("""
"""),format.raw/*10.80*/(""" 

"""),_display_(/*12.2*/main/*12.6*/ {_display_(Seq[Any](format.raw/*12.8*/("""
    
    """),format.raw/*14.5*/("""<h1>Editar Biodiversidad</h1>
    
    """),_display_(/*16.6*/form(routes.Application.update(id))/*16.41*/ {_display_(Seq[Any](format.raw/*16.43*/("""
            """),format.raw/*17.13*/("""<fieldset>
        
            """),_display_(/*19.14*/textarea(bioForm("flora"), '_label -> "Flora", '_help -> "",'rows -> 2,'cols -> 600)),format.raw/*19.98*/("""
            """),_display_(/*20.14*/textarea(bioForm("fauna"), '_label -> "Fauna", '_help -> "",'rows -> 2,'cols -> 600)),format.raw/*20.98*/("""
            """),_display_(/*21.14*/textarea(bioForm("contaminacionagua"), '_label -> "Contaminación Agua", '_help -> "",'rows -> 2,'cols -> 600)),format.raw/*21.123*/("""
            """),_display_(/*22.14*/textarea(bioForm("contaminacionacustica"), '_label -> "Contaminacíon Acustica", '_help -> "",'rows -> 2,'cols -> 600)),format.raw/*22.131*/("""
                       
            """),_display_(/*24.14*/select(
                bioForm("calidad.id"), 
                options(Calidad.options), 
                '_label -> "Calidad del Aire", '_default -> "-- Escoge la Calidad del Aire del Lugar--",
                '_showConstraints -> false
            )),format.raw/*29.14*/("""
           
               """),_display_(/*31.17*/select(
                bioForm("departamento.id"), 
                options(Departamento.options), 
                '_label -> "Departamento", '_default -> "-- Escoge un Departamento--",
                '_showConstraints -> false
            )),format.raw/*36.14*/("""
            
            """),_display_(/*38.14*/select(
                bioForm("municipio.id"), 
                options(Municipio.options), 
                '_label -> "Municipio", '_default -> "-- Escoge un Municipio--",
                '_showConstraints -> false
            )),format.raw/*43.14*/("""
            
             """),_display_(/*45.15*/textarea(bioForm("recomendacion"), '_label -> "Recomendaciones", '_help -> "Cualquier nota que desee agregar",'rows -> 2,'cols -> 600)),format.raw/*45.149*/("""

        """),format.raw/*47.9*/("""</fieldset>


        </fieldset>
        <div class="actions">
            <input type="submit" value="Guardar Biodiversidad" class="btn primary"> or 
            <a href=""""),_display_(/*53.23*/routes/*53.29*/.Application.list()),format.raw/*53.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))}),format.raw/*56.6*/("""
    
    """),_display_(/*58.6*/form(routes.Application.delete(id), 'class -> "topRight")/*58.63*/ {_display_(Seq[Any](format.raw/*58.65*/("""
        """),format.raw/*59.9*/("""<input type="submit" value="Eliminar Biodiversidad" class="btn danger">
    """)))}),format.raw/*60.6*/("""
    """),format.raw/*61.5*/("""<div style="position:absolute; left:600px; top:100px; width:728px; height:70px ">

         <img WIDTH=700 HEIGHT=500 align="right" src=""""),_display_(/*63.56*/routes/*63.62*/.Assets.at("images/iquality.jpg")),format.raw/*63.95*/(""""/>
         
         </div> 
         """)))}),format.raw/*66.11*/("""
"""))
      }
    }
  }

  def render(id:Long,bioForm:Form[Bio]): play.twirl.api.HtmlFormat.Appendable = apply(id,bioForm)

  def f:((Long,Form[Bio]) => play.twirl.api.HtmlFormat.Appendable) = (id,bioForm) => apply(id,bioForm)

  def ref: this.type = this

}


}

/**/
object editForm extends editForm_Scope0.editForm
              /*
                  -- GENERATED --
                  DATE: Sun Dec 04 09:19:24 CST 2016
                  SOURCE: C:/Users/win7/Desktop/tareaigf/biodiversidadebean/app/views/editForm.scala.html
                  HASH: 7bf18e01390efd566f6347ec31024357a8fd8b5c
                  MATRIX: 759->1|892->66|925->90|1009->31|1049->63|1079->144|1111->150|1123->154|1162->156|1201->168|1269->210|1313->245|1353->247|1395->261|1457->296|1562->380|1604->395|1709->479|1751->494|1882->603|1924->618|2063->735|2130->775|2408->1032|2466->1063|2736->1312|2792->1341|3050->1578|3107->1608|3263->1742|3302->1754|3509->1934|3524->1940|3564->1959|3652->2017|3691->2030|3757->2087|3797->2089|3834->2099|3942->2177|3975->2183|4142->2323|4157->2329|4211->2362|4286->2406
                  LINES: 27->1|31->10|31->10|32->1|39->9|40->10|42->12|42->12|42->12|44->14|46->16|46->16|46->16|47->17|49->19|49->19|50->20|50->20|51->21|51->21|52->22|52->22|54->24|59->29|61->31|66->36|68->38|73->43|75->45|75->45|77->47|83->53|83->53|83->53|86->56|88->58|88->58|88->58|89->59|90->60|91->61|93->63|93->63|93->63|96->66
                  -- GENERATED --
              */
          