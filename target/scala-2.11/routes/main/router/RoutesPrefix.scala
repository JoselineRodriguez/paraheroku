
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/win7/Desktop/tareaigf/biodiversidadebean/conf/routes
// @DATE:Sun Dec 04 09:19:23 CST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
