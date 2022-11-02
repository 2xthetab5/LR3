import java.util.Scanner;

public class form {
    String model_of_car;
    int speed;
    int horsepower;

    public form(String model_of_car, int speed, int horsepower) {
        this.model_of_car = model_of_car;
        this.speed = speed;
        this.horsepower = horsepower;
    }

    public void input() {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите в какой транспорт превращается ваш трансформер(sportcar, truck, tank, jeep): ");
        model_of_car = vvod.nextLine();
        System.out.println("Введите количество лошадиных сил у транспорта, в который превращается ваш трансформер(от 100 до 1000): ");
        horsepower = vvod.nextInt();
        System.out.println("Введите максимальную скорость транспорта(в км/ч), в который превращается ваш трансформер(от 120 до 400): ");
        speed = vvod.nextInt();
    }

    public void output() {
        System.out.println("Транспорт, в который превращается ваш трансформер: " + model_of_car);
        System.out.println("Количество лошадиных сил транспорта, в который превращается ваш трансформер: " + horsepower);
        System.out.println("Максимальная скорость транспорта, в который превращается ваш трансформер: " + speed);
    }
}