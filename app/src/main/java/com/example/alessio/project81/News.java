package com.example.alessio.project81;

public class News {

    private String mTitle;
    private String mAuthor;
    private String mUrl;
    private String mDate;
    private String mSection;

    public News(String title, String author, String url, String date, String section) {
        mTitle = title;
        mAuthor = author;
        mUrl = url;
        mDate = date;
        mSection = section;
    }

    public String getTitle() {
        return mTitle;
    }
    public String getAuthor() {
        return mAuthor;
    }
    public String getUrl() {
        return mUrl;
    }
    public String getDate() {
        return mDate;
    }
    public String getSection() {
        return mSection;
    }

    @Override
    public String toString() {
        return "News{" +
                "mTitle='" + mTitle + '\'' +
                ", mAuthor='" + mAuthor + '\'' +
                ", mUrl='" + mUrl + '\'' +
                ", mDate='" + mDate + '\'' +
                ", mSection='" + mSection + '\'' +
                '}';
    }
}