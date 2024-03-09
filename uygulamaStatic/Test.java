package uygulamaStatic;

public class Test {
    public static void main(String[] args) {
        Ogranci ogrenci1= new Ogranci();
        Ogranci ogrenci2= new Ogranci();
        ogrenci2.setName("ahmet");
        ogrenci1.setName("akif");
        System.out.println("adı: "+ ogrenci1.getName());
        System.out.println("adı: "+ ogrenci2.getName());


        //*** okul ortak oldugundan nesneler yerine class ı kullanırsın
        Ogranci.setOkul("medeniyet");
        System.out.println("Okulu: "+ Ogranci.getOkul());

    }
}
