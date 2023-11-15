public class ChildrenBook extends Book{

    private int age;

    @Override
    public double getPrice() {
        System.out.println("Price with 70% off : "+0.3*super.getPrice());
        return 0.3*super.getPrice();
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
