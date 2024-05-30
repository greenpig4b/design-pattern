package ex01;

//초식
abstract class Herbivore extends Animal {
    private String info = "초식";

    @Override
    public String info() {
        return info;
    }
}