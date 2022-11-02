import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        int x = 0;
        melee your_melee = new melee("type_of_melee", 0, "color_of_melee");
        weapon your_weapon = new weapon("color_of_weapon", "type_of_weapon", 0, 0);
        kind your_kind = new kind("color_of_transformer", "genus", 0);
        form your_form = new form("model_of_car", 0, 0);
        transformer your_transformer = new transformer(your_kind, your_melee, your_weapon, your_form);
        transformer.input();
        while (x != 4) {
            System.out.println("Введите:");
            System.out.println("1 - для вывода характеристики вашего трансформера");
            System.out.println("2 - для анализа цветовой гаммы вышего трансформера");
            System.out.println("3 - для анализа скорости вашего трансформера");
            System.out.println("4 - выхода");
            Scanner vvod = new Scanner(System.in);
            x = vvod.nextInt();
            switch (x) {
                case 1:
                    transformer.output();
                    break;
                case 2:
                    transformer.color();
                    break;
                case 3:
                    transformer.speed_type();
                    break;
            }
        }
    }
}