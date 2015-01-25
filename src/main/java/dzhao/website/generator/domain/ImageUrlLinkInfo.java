package dzhao.website.generator.domain;

/**
 * Created with IntelliJ IDEA.
 * User: Dong Zhao
 * Date: 25/01/15
 * Time: 6:28 PM
 */
public class ImageUrlLinkInfo {
    private String navigationName;
    private String imageName;
    private int imageHeight;
    private int imageWidth;

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getNavigationName() {
        return navigationName;
    }

    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
