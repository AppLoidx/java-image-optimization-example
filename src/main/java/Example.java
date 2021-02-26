import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Example {
    public static void main(String[] args) throws IOException {
        BufferedImage baseImage = readSampleImage();
        BufferedImage newImage = Scalr.resize(baseImage, 700);
        ImageIO.write(newImage, "jpg", new File("newImage-700-700.jpg"));
        ImageIO.write(baseImage, "jpg", new File("baseImage.jpg"));

    }

    public static BufferedImage readSampleImage() throws IOException {
        return ImageIO.read(Objects.requireNonNull(Example.class.getClassLoader().getResource("sample-image.jpg")));
    }
}
