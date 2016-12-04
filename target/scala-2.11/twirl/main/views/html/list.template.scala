
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
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

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[com.avaje.ebean.PagedList[Bio],String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.PagedList[Bio], currentSortBy: String, currentOrder: String, currentFilter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*32.2*/header/*32.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
    """),format.raw/*33.5*/("""<th class=""""),_display_(/*33.17*/key/*33.20*/.replace(".","_")),format.raw/*33.37*/(""" """),format.raw/*33.38*/("""header """),_display_(/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}}),format.raw/*33.136*/("""">
        <a href=""""),_display_(/*34.19*/link(0, key)),format.raw/*34.31*/("""">"""),_display_(/*34.34*/title),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Application.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.115*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
    """),format.raw/*40.5*/("""<h1 id="homeTitle">"""),_display_(/*40.25*/Messages("bio.list.title", currentPage.getTotalRowCount)),format.raw/*40.81*/("""</h1>

    """),_display_(/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        """),format.raw/*43.9*/("""<div class="alert-message warning">
            <strong>Done!</strong> """),_display_(/*44.37*/flash/*44.42*/.get("success")),format.raw/*44.57*/("""
        """),format.raw/*45.9*/("""</div>
    """)))}),format.raw/*46.6*/(""" 

    """),format.raw/*48.5*/("""<div id="actions">
        
        <form action=""""),_display_(/*50.24*/link(0, "flora")),format.raw/*50.40*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(/*51.66*/currentFilter),format.raw/*51.79*/("""" placeholder="Filtrar por flora de Biodiversidad...">
            <input type="submit" id="searchsubmit" value="Filtar por flora" class="btn primary">
        </form>
       <center><img WIDTH=1150 HEIGHT=250 align=center src=""""),_display_(/*54.62*/routes/*54.68*/.Assets.at("images/a.jpg")),format.raw/*54.94*/(""""/></center> 
        <a class="btn success" id="add" href=""""),_display_(/*55.48*/routes/*55.54*/.Application.create()),format.raw/*55.75*/("""">Agregar una Biodiversidad Nueva</a>
        
    </div>
    
    """),_display_(/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        """),format.raw/*61.9*/("""<div class="well">
            <em>Nada que mostrar</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        """),format.raw/*67.9*/("""<table class="bio zebra-striped">
            <thead>
                <tr>
                    """),_display_(/*70.22*/header("flora", "Flora")),format.raw/*70.46*/("""
                    """),_display_(/*71.22*/header("fauna", "Fauna")),format.raw/*71.46*/("""
                    """),_display_(/*72.22*/header("contaminacionagua", "Contaminación Agua")),format.raw/*72.71*/("""
                    """),_display_(/*73.22*/header("contaminacionacustica", "Contaminación Acustica")),format.raw/*73.79*/("""
                    """),_display_(/*74.22*/header("calidad.nombre", "Calidad del Aire")),format.raw/*74.66*/("""
                    
                    """),_display_(/*76.22*/header("departamento.nombre", "Departamento")),format.raw/*76.67*/("""
                    """),_display_(/*77.22*/header("municipio.nombre", "Municipio")),format.raw/*77.61*/("""
                    """),_display_(/*78.22*/header("recomendacion", "Recomendaciones")),format.raw/*78.64*/("""
                """),format.raw/*79.17*/("""</tr>
            </thead>
            <tbody>

                """),_display_(/*83.18*/for(bio <- currentPage.getList) yield /*83.49*/ {_display_(Seq[Any](format.raw/*83.51*/("""
                    """),format.raw/*84.21*/("""<tr>
                        <td><a href=""""),_display_(/*85.39*/routes/*85.45*/.Application.edit(bio.id)),format.raw/*85.70*/("""">"""),_display_(/*85.73*/bio/*85.76*/.flora),format.raw/*85.82*/("""</a></td>
                        <td>
                            """),_display_(/*87.30*/if(bio.fauna == null)/*87.51*/ {_display_(Seq[Any](format.raw/*87.53*/("""
                                """),format.raw/*88.33*/("""<em>-</em>
                            """)))}/*89.31*/else/*89.36*/{_display_(Seq[Any](format.raw/*89.37*/("""
                                """),_display_(/*90.34*/bio/*90.37*/.fauna),format.raw/*90.43*/("""
                            """)))}),format.raw/*91.30*/("""
                        """),format.raw/*92.25*/("""</td>
                        <td>
                            """),_display_(/*94.30*/if(bio.contaminacionagua == null)/*94.63*/ {_display_(Seq[Any](format.raw/*94.65*/("""
                                """),format.raw/*95.33*/("""<em>-</em>
                            """)))}/*96.31*/else/*96.36*/{_display_(Seq[Any](format.raw/*96.37*/("""
                                """),_display_(/*97.34*/bio/*97.37*/.contaminacionagua),format.raw/*97.55*/("""
                            """)))}),format.raw/*98.30*/("""
                        """),format.raw/*99.25*/("""</td>
                                           <td>
                            """),_display_(/*101.30*/if(bio.contaminacionacustica == null)/*101.67*/ {_display_(Seq[Any](format.raw/*101.69*/("""
                                """),format.raw/*102.33*/("""<em>-</em>
                            """)))}/*103.31*/else/*103.36*/{_display_(Seq[Any](format.raw/*103.37*/("""
                                """),_display_(/*104.34*/bio/*104.37*/.contaminacionacustica),format.raw/*104.59*/("""
                            """)))}),format.raw/*105.30*/("""
                        """),format.raw/*106.25*/("""</td>
                        <td>
                            """),_display_(/*108.30*/if(bio.calidad == null)/*108.53*/ {_display_(Seq[Any](format.raw/*108.55*/("""
                                """),format.raw/*109.33*/("""<em>-</em>
                            """)))}/*110.31*/else/*110.36*/{_display_(Seq[Any](format.raw/*110.37*/("""
                                """),_display_(/*111.34*/bio/*111.37*/.calidad.nombre),format.raw/*111.52*/("""
                            """)))}),format.raw/*112.30*/("""
                        """),format.raw/*113.25*/("""</td>

                        
                         <td>
                            """),_display_(/*117.30*/if(bio.departamento == null)/*117.58*/ {_display_(Seq[Any](format.raw/*117.60*/("""
                                """),format.raw/*118.33*/("""<em>-</em>
                            """)))}/*119.31*/else/*119.36*/{_display_(Seq[Any](format.raw/*119.37*/("""
                                """),_display_(/*120.34*/bio/*120.37*/.departamento.nombre),format.raw/*120.57*/("""
                            """)))}),format.raw/*121.30*/("""
                        """),format.raw/*122.25*/("""</td>
                        <td>
                            """),_display_(/*124.30*/if(bio.municipio == null)/*124.55*/ {_display_(Seq[Any](format.raw/*124.57*/("""
                                """),format.raw/*125.33*/("""<em>-</em>
                            """)))}/*126.31*/else/*126.36*/{_display_(Seq[Any](format.raw/*126.37*/("""
                                """),_display_(/*127.34*/bio/*127.37*/.municipio.nombre),format.raw/*127.54*/("""
                            """)))}),format.raw/*128.30*/("""
                        """),format.raw/*129.25*/("""</td>
                        
                        <td>
                            """),_display_(/*132.30*/if(bio.recomendacion == null)/*132.59*/ {_display_(Seq[Any](format.raw/*132.61*/("""
                                """),format.raw/*133.33*/("""<em>-</em>
                            """)))}/*134.31*/else/*134.36*/{_display_(Seq[Any](format.raw/*134.37*/("""
                                """),_display_(/*135.34*/bio/*135.37*/.recomendacion),format.raw/*135.51*/("""
                            """)))}),format.raw/*136.30*/("""
                        """),format.raw/*137.25*/("""</td>

                    </tr>
                """)))}),format.raw/*140.18*/("""

            """),format.raw/*142.13*/("""</tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(/*147.18*/if(currentPage.hasPrev)/*147.41*/ {_display_(Seq[Any](format.raw/*147.43*/("""
                    """),format.raw/*148.21*/("""<li class="prev">
                        <a href=""""),_display_(/*149.35*/link(currentPage.getPageIndex - 1, null)),format.raw/*149.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*151.19*/else/*151.24*/{_display_(Seq[Any](format.raw/*151.25*/("""
                    """),format.raw/*152.21*/("""<li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))}),format.raw/*155.18*/("""
                """),format.raw/*156.17*/("""<li class="current">
                    <a>Displaying """),_display_(/*157.36*/currentPage/*157.47*/.getDisplayXtoYofZ(" to "," of ")),format.raw/*157.80*/("""</a>
                </li>
                """),_display_(/*159.18*/if(currentPage.hasNext)/*159.41*/ {_display_(Seq[Any](format.raw/*159.43*/("""
                    """),format.raw/*160.21*/("""<li class="next">
                        <a href=""""),_display_(/*161.35*/link(currentPage.getPageIndex + 1, null)),format.raw/*161.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*163.19*/else/*163.24*/{_display_(Seq[Any](format.raw/*163.25*/("""
                    """),format.raw/*164.21*/("""<li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))}),format.raw/*167.18*/("""
            """),format.raw/*168.13*/("""</ul>
        </div>
    """)))}),format.raw/*170.6*/("""
    
""")))}))
      }
    }
  }

  def render(currentPage:com.avaje.ebean.PagedList[Bio],currentSortBy:String,currentOrder:String,currentFilter:String): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def f:((com.avaje.ebean.PagedList[Bio],String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def ref: this.type = this

}


}

/**/
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Sun Dec 04 09:19:24 CST 2016
                  SOURCE: C:/Users/win7/Desktop/tareaigf/biodiversidadebean/app/views/list.scala.html
                  HASH: 8f3a84a6e24069b79394a5b398fca834f32095e4
                  MATRIX: 788->1|980->891|994->897|1101->927|1134->933|1173->945|1185->948|1223->965|1252->966|1287->974|1321->1000|1408->1064|1457->1086|1490->1098|1520->1101|1546->1106|1586->248|1597->252|2150->114|2181->245|2210->774|2242->888|2271->1124|2302->1129|2314->1133|2353->1135|2392->1147|2439->1167|2516->1223|2556->1237|2597->1269|2637->1271|2674->1281|2774->1354|2788->1359|2824->1374|2861->1384|2904->1397|2940->1406|3020->1459|3057->1475|3166->1557|3200->1570|3459->1802|3474->1808|3521->1834|3610->1896|3625->1902|3667->1923|3765->1995|3811->2032|3851->2034|3898->2054|4006->2145|4019->2150|4058->2151|4105->2171|4231->2270|4276->2294|4326->2317|4371->2341|4421->2364|4491->2413|4541->2436|4619->2493|4669->2516|4734->2560|4806->2605|4872->2650|4922->2673|4982->2712|5032->2735|5095->2777|5141->2795|5237->2864|5284->2895|5324->2897|5374->2919|5445->2963|5460->2969|5506->2994|5536->2997|5548->3000|5575->3006|5672->3076|5702->3097|5742->3099|5804->3133|5864->3175|5877->3180|5916->3181|5978->3216|5990->3219|6017->3225|6079->3256|6133->3282|6226->3348|6268->3381|6308->3383|6370->3417|6430->3459|6443->3464|6482->3465|6544->3500|6556->3503|6595->3521|6657->3552|6711->3578|6824->3663|6871->3700|6912->3702|6975->3736|7036->3778|7050->3783|7090->3784|7153->3819|7166->3822|7210->3844|7273->3875|7328->3901|7422->3967|7455->3990|7496->3992|7559->4026|7620->4068|7634->4073|7674->4074|7737->4109|7750->4112|7787->4127|7850->4158|7905->4184|8028->4279|8066->4307|8107->4309|8170->4343|8231->4385|8245->4390|8285->4391|8348->4426|8361->4429|8403->4449|8466->4480|8521->4506|8615->4572|8650->4597|8691->4599|8754->4633|8815->4675|8829->4680|8869->4681|8932->4716|8945->4719|8984->4736|9047->4767|9102->4793|9222->4885|9261->4914|9302->4916|9365->4950|9426->4992|9440->4997|9480->4998|9543->5033|9556->5036|9592->5050|9655->5081|9710->5107|9795->5160|9840->5176|9983->5291|10016->5314|10057->5316|10108->5338|10189->5391|10251->5431|10338->5499|10352->5504|10392->5505|10443->5527|10595->5647|10642->5665|10727->5722|10748->5733|10803->5766|10877->5812|10910->5835|10951->5837|11002->5859|11083->5912|11145->5952|11228->6016|11242->6021|11282->6022|11333->6044|11481->6160|11524->6174|11583->6202
                  LINES: 27->1|31->32|31->32|33->32|34->33|34->33|34->33|34->33|34->33|34->33|34->33|34->33|35->34|35->34|35->34|35->34|37->6|37->6|59->1|61->5|62->27|64->31|65->36|67->38|67->38|67->38|69->40|69->40|69->40|71->42|71->42|71->42|72->43|73->44|73->44|73->44|74->45|75->46|77->48|79->50|79->50|80->51|80->51|83->54|83->54|83->54|84->55|84->55|84->55|88->59|88->59|88->59|90->61|94->65|94->65|94->65|96->67|99->70|99->70|100->71|100->71|101->72|101->72|102->73|102->73|103->74|103->74|105->76|105->76|106->77|106->77|107->78|107->78|108->79|112->83|112->83|112->83|113->84|114->85|114->85|114->85|114->85|114->85|114->85|116->87|116->87|116->87|117->88|118->89|118->89|118->89|119->90|119->90|119->90|120->91|121->92|123->94|123->94|123->94|124->95|125->96|125->96|125->96|126->97|126->97|126->97|127->98|128->99|130->101|130->101|130->101|131->102|132->103|132->103|132->103|133->104|133->104|133->104|134->105|135->106|137->108|137->108|137->108|138->109|139->110|139->110|139->110|140->111|140->111|140->111|141->112|142->113|146->117|146->117|146->117|147->118|148->119|148->119|148->119|149->120|149->120|149->120|150->121|151->122|153->124|153->124|153->124|154->125|155->126|155->126|155->126|156->127|156->127|156->127|157->128|158->129|161->132|161->132|161->132|162->133|163->134|163->134|163->134|164->135|164->135|164->135|165->136|166->137|169->140|171->142|176->147|176->147|176->147|177->148|178->149|178->149|180->151|180->151|180->151|181->152|184->155|185->156|186->157|186->157|186->157|188->159|188->159|188->159|189->160|190->161|190->161|192->163|192->163|192->163|193->164|196->167|197->168|199->170
                  -- GENERATED --
              */
          