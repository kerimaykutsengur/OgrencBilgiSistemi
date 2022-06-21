import java.nio.charset.CoderResult;

public class Student {
    String name;
    int classes;
    String stuNo;
    Course trh;
    Course trhSzl;
    Course mat;
    Course matSzl;
    Course spr;
    Course sprSzl;
    double average;
    double trhOrt, matOrt, sprOrt;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course trh, Course trhSzl, Course mat, Course matSzl, Course spr, Course sprSzl) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.trh = trh;
        this.trhSzl = trhSzl;
        this.mat = mat;
        this.matSzl = matSzl;
        this.spr = spr;
        this.sprSzl = sprSzl;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int trh, int mat, int spr) {
        if (trh >= 0 && trh <= 100) {
            this.trh.note = trh;
        }
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (spr >= 0 && spr <= 100) {
            this.spr.note = spr;
        }
    }

    public void addBulkSzlNote(int trhSzl, int matSzl, int sprSzl) {
        if (trhSzl >= 0 && trhSzl <= 100) {
            this.trhSzl.note = trhSzl;
        }
        if (matSzl >= 0 && matSzl <= 100) {
            this.matSzl.note = matSzl;
        }
        if (sprSzl >= 0 && sprSzl <= 100) {
            this.sprSzl.note = sprSzl;
        }
    }

    public void isPass() {
        if (this.trh.note == 0 || this.trhSzl.note == 0 || this.mat.note == 0 || this.matSzl.note == 0 || this.spr.note == 0 || this.sprSzl.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş!");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortamala : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage() {
        this.trhOrt = this.trh.note * 0.80 + this.trhSzl.note * 0.20;
        this.matOrt = this.mat.note * 0.80 + this.matSzl.note * 0.20;
        this.sprOrt = this.spr.note * 0.80 + this.sprSzl.note * 0.20;
        this.average = this.trhOrt + this.matOrt + +this.sprOrt / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Tarih Notu : " + this.trh.note);
        System.out.println("Tarih Sözlü Notu : " + this.trhSzl.note);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.matSzl.note);
        System.out.println("Spor Notu : " + this.spr.note);
        System.out.println("Spor Sözlü Notu : " + this.sprSzl.note);
    }
}

