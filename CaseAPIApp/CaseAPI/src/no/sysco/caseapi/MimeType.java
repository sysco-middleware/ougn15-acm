package no.sysco.caseapi;

public enum MimeType {
    IMAGE_JPEG("image/jpeg");

    private String mimeType;

    private MimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String get() {
        return mimeType;
    }
}
