package gwt.material.design.addins.client.image.constants;

public enum Format {
    PNG("png"),
    JPEG("jpeg"),
    WEBP("webp");

    private String name;

    Format(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
