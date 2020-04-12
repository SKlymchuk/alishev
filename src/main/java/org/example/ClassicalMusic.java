package org.example;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSoung() {
        return "Bah Bah";
    }
    public void doMyInit(){
        System.out.println("Initializing ClassMuse....");
    }
    public void doMyDestroy(){
        System.out.println("Destroy everything");
    }
}
