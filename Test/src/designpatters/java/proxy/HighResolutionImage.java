package designpatters.java.proxy;

public class HighResolutionImage implements Image {

    public HighResolutionImage(final String imageFilePath) {

        loadImage(imageFilePath);
    }

    private void loadImage(final String imageFilePath) {

        // load Image from disk into memory
        // this is heavy and costly operation
    }

    @Override
    public void showImage() {
        // TODO Auto-generated method stub

    }

}
