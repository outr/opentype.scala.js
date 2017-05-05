package opentype

import scala.concurrent.{Future, Promise}

object OpenType {
  def load(url: String): Future[Font] = {
    val promise = Promise[Font]
    TopLevel.load(url, (err, font) => {
      Option(err) match {
        case Some(message) => promise.failure(new OpenTypeException(message))
        case None => promise.success(font)
      }
    })
    promise.future
  }
}