package uygulamaStatic;

public class Ogranci {
    //*** ortak bir özellik varsa bunu *static* olarak yazarsın
    private static String okul;
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    //*** this metodunu kullanamazsın bunun yerine class ismini kullan
    public static void setOkul(String okul){
        Ogranci.okul=okul;
    }
    public static String getOkul(){
        return okul;
    }

}
