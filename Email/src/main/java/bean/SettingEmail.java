package bean;

public class SettingEmail {
    private String id;
    private String language;
    private int pageSize;
    private boolean spamFillter;
    private String signature;

    public SettingEmail() {
    }

    public SettingEmail(String id,String language, int pageSize, boolean spamFillter, String signature) {
        this.id = id;
        this.language = language;
        this.pageSize = pageSize;
        this.spamFillter = spamFillter;
        this.signature = signature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamFillter() {
        return spamFillter;
    }

    public void setSpamFillter(boolean spamFillter) {
        this.spamFillter = spamFillter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
