
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/win7/Desktop/tareaigf/biodiversidadebean/conf/routes
// @DATE:Sun Dec 04 09:19:23 CST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:3
package controllers {

  // @LINE:24
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:3
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def delete(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "bios/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
    }
  
    // @LINE:9
    def create(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bios/new")
    }
  
    // @LINE:14
    def edit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bios/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:15
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "bios/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:6
    def list(p:Int = 0, s:String = "flora", o:String = "asc", f:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "bios" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "flora") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
    }
  
    // @LINE:10
    def save(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "bios")
    }
  
    // @LINE:3
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }


}
