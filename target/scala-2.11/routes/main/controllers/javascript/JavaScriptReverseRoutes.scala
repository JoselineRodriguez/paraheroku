
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/win7/Desktop/tareaigf/biodiversidadebean/conf/routes
// @DATE:Sun Dec 04 09:19:23 CST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:3
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:24
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:3
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.delete",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/delete"})
        }
      """
    )
  
    // @LINE:9
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bios/new"})
        }
      """
    )
  
    // @LINE:14
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:15
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bios/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:6
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.list",
      """
        function(p0,s1,o2,f3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bios" + _qS([(p0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p0)), (s1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s1)), (o2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o2)), (f3 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f3))])})
        }
      """
    )
  
    // @LINE:10
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bios"})
        }
      """
    )
  
    // @LINE:3
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
