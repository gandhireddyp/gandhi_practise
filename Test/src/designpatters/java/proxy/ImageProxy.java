package designpatters.java.proxy;

public class ImageProxy implements Image {

    private final String imageFilePath;

    private Image proxifiedImage;

    public ImageProxy(final String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    @Override
    public void showImage() {
        proxifiedImage = new HighResolutionImage(imageFilePath);
        proxifiedImage.showImage();
    }

}
