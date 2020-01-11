package bean;

public class Message {
    private String word,yanzheng,p1,p2;

    public Message() {
    }

    public Message(String word, String yanzheng, String p1, String p2) {
        super();
        this.word = word;
        this.yanzheng = yanzheng;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getWord() {
        return word;
    }

    public String getYanzheng() {
        return yanzheng;
    }

    public String getP1() {
        return p1;
    }

    public String getP2() {
        return p2;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setYanzheng(String yanzheng) {
        this.yanzheng = yanzheng;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }
}
