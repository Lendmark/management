import api.ProductFacade;
import api.UserRegisterLoginFacade;
import entity.Boots;
import entity.Cloth;
import entity.Product;
import entity.User;
import entity.enums.Color;
import entity.enums.Material;
import entity.enums.SkinType;
import entity.parser.ColorParser;
import entity.parser.MaterialParser;
import entity.parser.SkinParser;
import facade.ProductFacadeImpl;
import facade.UserRegisterLoginFacadeImpl;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void startMenu() {
        System.out.println("MANAGEMENT MENU");
        System.out.println("1 - Zaloguj się");
        System.out.println("2 - Zarejestruj się");
        System.out.println("0 - Wyjdź");
    }

    public static void loggedMenu() {
        System.out.println("MANAGEMENT MENU");
        System.out.println("1 - Dodaj nowy product");
        System.out.println("2 - Usuń product");
        System.out.println("3 - Wyświetl dostepne produkty");
        System.out.println("0 - Wyloguj się");
    }

    public static void productTypeMenu() {
        System.out.println("1 - Dodaj buty");
        System.out.println("2 - Dodaj ubrania");
        System.out.println("3 - Inne");
    }

    public static Product createOtherProduct() {
        String productName;
        Color color;
        Float price, weight;
        Integer count;
        System.out.println("ProductName: ");
        productName = scanner.next();

        System.out.println("Price: ");
        price = scanner.nextFloat();

        System.out.println("Weight: ");
        weight = scanner.nextFloat();

        System.out.println("Choose color: RED, BLUE, GREEN, BLACK, WHITE, YELLOW ");
        color = ColorParser.parseStrToColor(scanner.next());

        System.out.println("Count: ");
        count = scanner.nextInt();


        return new Product(1L, productName, price, weight, color, count);
    }

    public static Product createBootsProduct() {
        String productName;
        Color color;
        Float price, weight;
        Integer count, size;
        SkinType skinType;

        System.out.println("ProductName: ");
        productName = scanner.next();

        System.out.println("Price: ");
        price = scanner.nextFloat();

        System.out.println("Weight: ");
        weight = scanner.nextFloat();

        System.out.println("Choose color: RED, BLUE, GREEN, BLACK, WHITE, YELLOW ");
        color = ColorParser.parseStrToColor(scanner.next());

        System.out.println("Count: ");
        count = scanner.nextInt();

        System.out.println("Size: ");
        size = scanner.nextInt();

        System.out.println("Choose skin type: NATURAL, ARTIFICIAL ");
        skinType = SkinParser.parseStrToSkinType(scanner.next());


        return new Boots(1L, productName, price, weight, color, count, size, skinType);
    }

    public static Product createClothProduct() {
        String productName, size;
        Color color;
        Float price, weight;
        Integer count;
        Material material;

        System.out.println("ProductName: ");
        productName = scanner.next();

        System.out.println("Price: ");
        price = scanner.nextFloat();

        System.out.println("Weight: ");
        weight = scanner.nextFloat();

        System.out.println("Choose color: RED, BLUE, GREEN, BLACK, WHITE, YELLOW ");
        color = ColorParser.parseStrToColor(scanner.next());

        System.out.println("Count: ");
        count = scanner.nextInt();

        System.out.println("Size: ");
        size = scanner.next();

        System.out.println("Choose material: LEATHER, FUR, COTTON, WOOL, POLYESTERS.");
        material = MaterialParser.parseStrToMaterial(scanner.next());


        return new Cloth(1L, productName, price, weight, color, count, size, material);
    }

    public static void main(String[] args) {
        UserRegisterLoginFacade userFacade = UserRegisterLoginFacadeImpl.getInstance();
        ProductFacade productFacade = ProductFacadeImpl.getInstance();
        boolean appOn = true;
        boolean loggedOn = false;
        int read;

        while (appOn) {
            startMenu();
            read = scanner.nextInt();

            switch (read) {
                case 1:
                    System.out.println("Podaj login:");
                    String loginLog = scanner.next();
                    System.out.println("Podaj hasło:");
                    String passwordLog = scanner.next();
                    if (userFacade.loginUser(loginLog, passwordLog)) {
                        loggedOn = true;
                        System.out.println("Zalogowałeś się!");
                    } else {
                        System.out.println("Niepoprawne dane!");
                    }
                    break;
                case 2:
                    System.out.println("Podaj login:");
                    String loginReg = scanner.next();
                    System.out.println("Podaj hasło:");
                    String passwordReg = scanner.next();
                    User user = new User(1L, loginReg, passwordReg);
                    if (userFacade.registerUser(user)) {
                        System.out.println("Zarejestrowałeś się!");
                    } else {
                        System.out.println("Cos poszło nie tak!");
                    }
                    break;
                case 0:
                    appOn = false;
                    break;
            }

            while (loggedOn) {

                loggedMenu();
                read = scanner.nextInt();

                switch (read) {
                    case 1:
                        productTypeMenu();
                        read = scanner.nextInt();
                        Product product = null;
                        switch (read) {
                            case 1:
                                product = createBootsProduct();
                                break;
                            case 2:
                                product = createClothProduct();
                                break;
                            case 3:
                                product = createOtherProduct();
                                break;
                        }
                        System.out.println(productFacade.createProduct(product));
                        break;
                    case 2:
                        System.out.println("Dostępne produkty: " + productFacade.getAllProducts());
                        System.out.println("Podaj nazwę produktu do usunięcia: ");
                        String productName = scanner.next();
                        System.out.println(productFacade.removeProduct(productName));
                        break;
                    case 3:
                        System.out.println("Dostępne produkty: " + productFacade.getAllProducts());
                        break;
                    case 0:
                        loggedOn = false;
                        break;


                }


            }
        }


    }
}