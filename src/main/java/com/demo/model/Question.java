package com.demo.model;

public class Question {
    private Integer qid;

    private String qgrade;

    private String qbook;

    private String qcapter;

    private String qsection;

    private String qdescription;

    private String qcollectionname;

    private String answer;

    private String resolve;

    private String a;

    private String b;

    private String c;

    private String d;

    private Integer docount;

    private Integer wrongcount;

    private Integer storeup;

    public Question(Integer qid, String qgrade, String qbook, String qcapter, String qsection, String qdescription, String qcollectionname, String answer, String resolve, String a, String b, String c, String d, Integer docount, Integer wrongcount, Integer storeup) {
        this.qid = qid;
        this.qgrade = qgrade;
        this.qbook = qbook;
        this.qcapter = qcapter;
        this.qsection = qsection;
        this.qdescription = qdescription;
        this.qcollectionname = qcollectionname;
        this.answer = answer;
        this.resolve = resolve;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.docount = docount;
        this.wrongcount = wrongcount;
        this.storeup = storeup;
    }

    public Question() {
        super();
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getQgrade() {
        return qgrade;
    }

    public void setQgrade(String qgrade) {
        this.qgrade = qgrade == null ? null : qgrade.trim();
    }

    public String getQbook() {
        return qbook;
    }

    public void setQbook(String qbook) {
        this.qbook = qbook == null ? null : qbook.trim();
    }

    public String getQcapter() {
        return qcapter;
    }

    public void setQcapter(String qcapter) {
        this.qcapter = qcapter == null ? null : qcapter.trim();
    }

    public String getQsection() {
        return qsection;
    }

    public void setQsection(String qsection) {
        this.qsection = qsection == null ? null : qsection.trim();
    }

    public String getQdescription() {
        return qdescription;
    }

    public void setQdescription(String qdescription) {
        this.qdescription = qdescription == null ? null : qdescription.trim();
    }

    public String getQcollectionname() {
        return qcollectionname;
    }

    public void setQcollectionname(String qcollectionname) {
        this.qcollectionname = qcollectionname == null ? null : qcollectionname.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getResolve() {
        return resolve;
    }

    public void setResolve(String resolve) {
        this.resolve = resolve == null ? null : resolve.trim();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b == null ? null : b.trim();
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c == null ? null : c.trim();
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d == null ? null : d.trim();
    }

    public Integer getDocount() {
        return docount;
    }

    public void setDocount(Integer docount) {
        this.docount = docount;
    }

    public Integer getWrongcount() {
        return wrongcount;
    }

    public void setWrongcount(Integer wrongcount) {
        this.wrongcount = wrongcount;
    }

    public Integer getStoreup() {
        return storeup;
    }

    public void setStoreup(Integer storeup) {
        this.storeup = storeup;
    }
}