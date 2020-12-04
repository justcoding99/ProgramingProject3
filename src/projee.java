import java.util.Scanner;

public class projee {
    private static char[][] picture = new char[10000][10000];
    private static int height, width;
    private static void displaymenu() {
            System.out.println("Hello Welcome to Isik Photoshop program");
            System.out.println("---------------------------------------------");
            System.out.println("The following options are available for you:");
            System.out.println("1) Create a picture");
            System.out.println("2) Clear the picture");
            System.out.println("3) Color picture (X,Y) in color C");
            System.out.println("4) Draw vertical segment");
            System.out.println("5) Draw horizontal segment");
            System.out.println("6) Draw filled rectangle in color C");
            System.out.println("7) Fills region with color C starting with pixel (X,Y)");
            System.out.println("8) Exit Program");
            System.out.print("Choose an option: ");
        }

        private static void createpicture() {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    picture[i][j] = '0';
                    System.out.print(picture[i][j]);
                }
                System.out.println();
            }
        }

        private static void displaypicture() {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(picture[i][j]);
                }
                System.out.println();
            }
        }

        private static void clearpicture() {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    picture[i][j] = '0';
                    System.out.print(picture[i][j]);
                }
                System.out.println();
            }
        }

        private static void colorpicture(int x, int y, char c) {
            picture[x - 1][y - 1] = c;
            displaypicture();
        }

        private static void vertical(int y, int x1, int x2, char c) {
            for (int i = x1 - 1; i < x2; i++) {
                picture[i][y - 1] = c;
            }
            displaypicture();
        }

        private static void horizontal(int x, int y1, int y2, char c) {
            for (int i = y1 - 1; i < y2; i++) {
                picture[x - 1][i] = c;
            }
            displaypicture();
        }

        private static void rectangle(int x1, int x2, int y1, int y2, char c) {
            for (int i = x1 - 1; i < x2; i++) {
                for (int j = y1 - 1; j < y2; j++) {
                    picture[i][j] = c;
                }
            }
            displaypicture();
        }


        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            displaymenu();
            int option = scn.nextInt();
            while (option != 8) {
                switch (option) {
                    case 1: {
                        System.out.println("what is the height of picture");
                        height = scn.nextInt();
                        System.out.println("what is the width of picture");
                        width = scn.nextInt();
                        createpicture();
                        displaymenu();
                        option = scn.nextInt();
                        break;
                    }
                    case 2: {
                        clearpicture();
                        System.out.println("picture cleared");
                        displaymenu();
                        option = scn.nextInt();
                        break;

                    }
                    case 3: {
                        int x, y;
                        char c;
                        System.out.println("enter x");
                        x = scn.nextInt();
                        System.out.println("enter y");
                        y = scn.nextInt();
                        System.out.println("enter color");
                        c = scn.next().charAt(0);
                        colorpicture(x, y, c);
                        displaymenu();
                        option = scn.nextInt();
                        break;
                    }
                    case 4: {
                        int x1, x2, y;
                        char c;
                        System.out.println("enter y");
                        y = scn.nextInt();
                        System.out.println("enter  x1");
                        x1 = scn.nextInt();
                        System.out.println("enter x2");
                        x2 = scn.nextInt();
                        System.out.println("enter color");
                        c = scn.next().charAt(0);
                        vertical(y, x1, x2, c);
                        displaymenu();
                        option = scn.nextInt();
                        break;
                    }
                    case 5: {
                        int x, y1, y2;
                        char c;
                        System.out.println("enter x");
                        x = scn.nextInt();
                        System.out.println("enter y1");
                        y1 = scn.nextInt();
                        System.out.println("enter y2");
                        y2 = scn.nextInt();
                        System.out.println("enter color");
                        c = scn.next().charAt(0);
                        horizontal(x, y1, y2, c);
                        displaymenu();
                        option = scn.nextInt();
                        break;
                    }
                    case 6: {
                        System.out.println("enter x1");
                        int x1 = scn.nextInt();
                        System.out.println("enter x2");
                        int x2 = scn.nextInt();
                        System.out.println("enter y1");
                        int y1 = scn.nextInt();
                        System.out.println("enter y2");
                        int y2 = scn.nextInt();
                        System.out.println("enter color");
                        char c = scn.next().charAt(0);
                        rectangle(x1, x2, y1, y2, c);
                        displaymenu();
                        option = scn.nextInt();
                        break;
                    }
                    default:
                        System.out.println("enter correct option number");
                        displaymenu();
                        option=scn.nextInt();
                        break;

                }
            }
        }
    }

