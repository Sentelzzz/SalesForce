package org.example.model;

public class Account {

    private String account;
    private String webSite;
    private String industry;

    public Account(String account, String webSite, String industry) {
        this.account = account;
        this.webSite = webSite;
        this.industry = industry;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
}
