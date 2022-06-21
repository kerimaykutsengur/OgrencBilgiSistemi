public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Course trh = new Course("Tarih", "TRH101", "TRH");
        Course trhSzl = new Course("Tarih", "TRHS101", "TRH");
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course matSzl = new Course("Matematik", "MAT101", "MAT");
        Course spr = new Course("Spor", "SPR101", "SPR");
        Course sprSzl = new Course("Spor", "SPR101", "SPR");

        Teacher t1 = new Teacher("Mahmut Hoca", "123", "TRH");
        Teacher t2 = new Teacher("Külyutmaz Hoca", "456", "MAT");
        Teacher t3 = new Teacher("Badi Ekrem", "789", "SPR");

        trh.addTeacher(t1);
        mat.addTeacher(t2);
        spr.addTeacher(t3);

        Student s1 = new Student("İnek Şaban",4,"123456",trh,trhSzl,mat,matSzl,spr,sprSzl);
        s1.addBulkExamNote(50,20,30);
        s1.addBulkSzlNote(30,40,30);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi",4,"789012",trh,trhSzl,mat,matSzl,spr,sprSzl);
        s2.addBulkExamNote(80,70,60);
        s2.addBulkSzlNote(20,30,40);
        s2.isPass();

        Student s3 = new Student("Damat Ferit",4,"345678",trh,trhSzl,mat,matSzl,spr,sprSzl);
        s3.addBulkExamNote(30,40,90);
        s3.addBulkSzlNote(50,40,40);
        s3.isPass();



    }
}
