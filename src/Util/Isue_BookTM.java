package Util;

import java.sql.Date;

public class Isue_BookTM {
    private String issueNo;
    private String bookID;
    private String memberID;
    private Date issueDate;
    private Date returnDate;
    private String issueStaffID;

    public Isue_BookTM() {
    }

    public Isue_BookTM(String issueNo, String bookID, String memberID, Date issueDate, Date returnDate, String issueStaffID) {
        this.issueNo = issueNo;
        this.bookID = bookID;
        this.memberID = memberID;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.issueStaffID = issueStaffID;
    }

    public String getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getIssueStaffID() {
        return issueStaffID;
    }

    public void setIssueStaffID(String issueStaffID) {
        this.issueStaffID = issueStaffID;
    }

    @Override
    public String toString() {
        return "Issue_BookTM{" +
                "issueNo='" + issueNo + '\'' +
                ", bookID='" + bookID + '\'' +
                ", memberID='" + memberID + '\'' +
                ", issueDate=" + issueDate +
                ", returnDate=" + returnDate +
                ", issueStaffID='" + issueStaffID + '\'' +
                '}';
    }
}