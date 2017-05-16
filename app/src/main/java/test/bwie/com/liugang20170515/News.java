package test.bwie.com.liugang20170515;

/**
 * @ Description:封装类
 * @ Date:2017/5/15
 * @ Author:刘刚
 */

public class News {
  private String title;
  private String content;

    public News() {
    }

    @Override
    public String toString() {
        return "News{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
