import com.twitter.finatra._

class HelloWorld extends Controller {

  get("/hello/:name") { request =>
    val name = request.routeParams("name")
    render.plain("hello " + name).toFuture
  }

  get("/") { request =>
    render.plain("pong").toFuture
  }

}

object App extends FinatraServer {
  register(new HelloWorld())
}