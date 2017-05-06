package opentype

import org.scalajs.dom._

import scala.scalajs.js.annotation.JSExportTopLevel

import scala.concurrent.ExecutionContext.Implicits.global

object Example {
  @JSExportTopLevel("example")
  def main(): Unit = {
    val canvas = document.createElement("canvas").asInstanceOf[html.Canvas]
    canvas.width = 800
    canvas.height = 600
    canvas.style.border = "1px solid black"
    document.body.appendChild(canvas)

    val ctx = canvas.getContext("2d").asInstanceOf[CanvasRenderingContext2D]

    OpenType.load("fonts/Roboto-Black.ttf").map { font =>
      val path = font.getPath("Hello, World!", 50.0, 150.0, 72.0)
      path.fill = "blue"
      path.draw(ctx)
    }

    OpenType.load("fonts/FiraSansMedium.woff").map { font =>
      val path = font.getPath("Hello, World!", 50.0, 250.0, 72.0)
      path.fill = "green"
      path.stroke = "black"
      path.strokeWidth = 1.5
      path.draw(ctx)
    }
  }
}