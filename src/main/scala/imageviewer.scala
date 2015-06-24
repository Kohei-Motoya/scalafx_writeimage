import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.image.Image
import scalafx.scene.image.ImageView
import scalafx.scene.image.PixelWriter
import scalafx.scene.image.WritableImage
import scalafx.scene.paint.Color
import scalafx.scene.layout.StackPane
import scalafx.stage.Stage
import scala.util.Random


object WriteImgaeDemo extends JFXApp {
  val width = 512
  val height = 512
  val randGen = new Random
  val imageBuffer = new WritableImage(width, height)
  val writer = imageBuffer.pixelWrit

  for (
    x <- 0 until width;
    y <- 0 until height
  ) writer.setColor(x, y, Color.color(randGen.nextDouble, randGen.nextDouble, randGen.nextDouble))

	stage = new JFXApp.PrimaryStage {
		title.value = "Writeimage Demo"
		width = 512
		height = 512
		scene = new Scene {
			content = new StackPane {
  			content = new ImageView {
  				image = imageBuffer
  			}
			}
		}
	}
}
