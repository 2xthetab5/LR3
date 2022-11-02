import java.util.Scanner;

public class weapon {
    String type_of_weapon;
    int durability_of_weapon;
    String color_of_weapon;
    int ammo_of_weapon;

    public weapon(String color_of_weapon, String type_of_weapon, int durability_of_weapon, int ammo_of_weapon) {
        this.type_of_weapon = type_of_weapon;
        this.durability_of_weapon = durability_of_weapon;
        this.color_of_weapon = color_of_weapon;
        this.ammo_of_weapon = ammo_of_weapon;
    }

    public void input() {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите каким оружием дальнего боя владеет ваш трансформер(machinegun, rocketlauncher, laser): ");
        type_of_weapon = vvod.nextLine();
        System.out.println("Введите цвет оружия дальнего боя(eng): ");
        color_of_weapon = vvod.nextLine();
        System.out.println("Введите прочность оружия дальнего боя(от 1 до 100): ");
        durability_of_weapon = vvod.nextInt();
        System.out.println("Введите количество патронов в оружии дальнего боя(от 0 до 200): ");
        ammo_of_weapon = vvod.nextInt();
    }

    public void output() {
        System.out.println("Оружие дальнего боя вашего трансформера: " + type_of_weapon);
        System.out.println("Прочность оружия дальнего боя: " + durability_of_weapon);
        System.out.println("Цвет оружия дальнего боя: " + color_of_weapon);
        System.out.println("Количество патронов в оружии дальнего боя: " + ammo_of_weapon);
    }
}