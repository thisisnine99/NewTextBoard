package article.model;

public class Member {
    private int memberId;
    private String Id;
    private String Pw;
    private String Nname;
    private String regDate;
    public Member(String Id, String Pw, String Nname, String regDate, int LastMemberId) {
        this.Id = Id;
        this.Pw = Pw;
        this.Nname = Nname;
        this.regDate = regDate;
        this.memberId = LastMemberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPw() {
        return Pw;
    }

    public void setPw(String pw) {
        Pw = pw;
    }

    public String getNname() {
        return Nname;
    }

    public void setNname(String nname) {
        Nname = nname;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
}
