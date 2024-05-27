package ex01;

//육식
abstract class Carnivorous extends Animal{
    private String info = "육식";

    @Override
    public String info() {
        return info;
    }

}
