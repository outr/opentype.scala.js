package opentype

import org.scalajs.dom._

import scala.scalajs.js.annotation.JSExportTopLevel

import scala.concurrent.ExecutionContext.Implicits.global

object Example {
  @JSExportTopLevel("example")
  def main(): Unit = {
    OpenType.load("fonts/Roboto-Black.ttf").map { font =>
      println(s"Font: ${font.ascender}, ${font.descender}")
    }
  }
}