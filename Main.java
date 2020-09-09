class Main {
  public static void main(String[] args) {

    double num1 = 5.2;
    double num2 = -10.5;
    double num4;
    int num5;

    num4 = Math.abs(num2);// absolute value of the number
    System.out.println(num4);
    System.out.println(Math.abs(-584));

    num4 = Math.pow(num1, 3);// power num1 raised to the power of 3
    System.out.println(num4);
    System.out.println(Math.pow(2, 8));

    System.out.println(Math.sqrt(100));// square root

    num4 = Math.random();// returns a double from 0.0 to less than 1
    System.out.println(num4);
    num4 = Math.random() * 20; // returns a double from 0.0 to less tha 20
    System.out.println(num4);
    num5 = (int) (Math.random() * 20);// return an int from 0 - 19
    System.out.println(num5);

    num5 = (int) (Math.random() * 20) + 1; // returns an integer from 1 - 20
    System.out.println(num5);

  }
}