package org.example;

public class Matematik {
    String name;
    String surname;
    private int speed; // скорость вычисления математиком 1 - 100
    private int educationLevel; // образование 0 - 10

    public Matematik(int speed, int educationLevel) {
        if (speed < 1 || speed > 100) {
            throw new RuntimeException("Скорость должна быть между 1 - 100, введено значение: " + speed);
        } else {
            this.speed = speed;
        }
        if (educationLevel < 0 || educationLevel > 10) {
            throw new RuntimeException("Уровень образования должен быть между 0 - 10, введено значение: " + educationLevel);
        } else {
            this.educationLevel = educationLevel;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getEducationLevel() {
        return educationLevel;
    }

    public double calculateSquareSurface(double side) throws Exception {
        if (educationLevel >= 2) {
            System.out.println("Я начал работать.");
            if (side <= 0) {
                // нужно выбрасывать ошибку
                System.out.println("Сторона квадрата не может быть отрицательной");
                return -1;
            }
            Thread.sleep(100_000 / speed);
            return side * side;
        } else if (educationLevel == 1) {
            System.out.println("Я только начинаю, могу ошибтся в этом непростом для меня вычислении.");
            if (Math.random() > 0.5) {
                Thread.sleep(200_000 / speed);
                return side * side;
            } else {
                Thread.sleep(200_000 / speed);
                return side * side / 2;
            }

            public double calculateCircleSurface(double rad1) throws Exception {
                if (educationLevel == 10) {

                    System.out.println("Я не хочу это считать.");
                } else if (educationLevel >= 3) {

                    if ((rad1 <= 0)) {
                        // нужно выбрасывать ошибку
                        System.out.println("Сторона не может быть отрицательной");
                        return -1;
                    }
                    Thread.sleep(100_000 / speed);
                    return (Math.PI * rad1 * rad1);

                } else if (educationLevel == 2) {
                    System.out.println("Я только начинаю, могу ошибтся в этом непростом для меня вычислении.");
                    if ((rad1 <= 0)) {
                        // нужно выбрасывать ошибку
                        System.out.println("Сторона не может быть отрицательной");
                        return -1;
                    }
                    if (Math.random() > 0.4) {
                        Thread.sleep(200_000 / speed);
                        return (Math.PI * rad1 * rad1);
                    } else {
                        Thread.sleep(200_000 / speed);
                        return (Math.PI * rad1 * rad1) / 3;

                    }
                } else if (educationLevel == 1) {
                    System.out.println("Я только начинаю, могу ошибтся в этом непростом для меня вычислении.");
                    if ((rad1 <= 0)) {
                        // нужно выбрасывать ошибку
                        System.out.println("Сторона не может быть отрицательной");
                        return -1;
                    }
                    if (Math.random() > 0.6) {
                        Thread.sleep(200_000 / speed);
                        return (Math.PI * rad1 * rad1);
                    } else {
                        Thread.sleep(200_000 / speed);
                        return (Math.PI * rad1 * rad1) / 4;
                    }
                } else {
                    System.out.println("Невозможно");
                    return -999_999_999;
                }
                return rad1;
            }

            public double calculatePrism(double side1, double side2, double hight1) throws Exception {
                if (educationLevel == 10) {
                    System.out.println("Я не хочу это считать.");
                } else if (educationLevel >= 4) {

                    if ((side1 <= 0) || (side2 <= 0) || (hight1 <= 0)) {
                        // нужно выбрасывать ошибку
                        System.out.println("Стороны не могут быть отрицательными");
                        return -1;
                    }
                    Thread.sleep(100_000 / speed);
                    return ((side1 * side2) * 2 + ((side1 * 2 + side2 * 2) * hight1));

                } else if (educationLevel == 0) {
                    System.out.println("Невозможно");
                    return -999_999_999;
                }
                return side1;
            }

            public double calculateSphere(double rad1) throws Exception {

                if (educationLevel == 10) {

                    System.out.println("Я не хочу это считать.");
                } else if (educationLevel >= 5) {

                    if ((rad1 <= 0)) {
                        // нужно выбрасывать ошибку
                        System.out.println("Сторона не может быть отрицательной");
                        return -1;
                    }
                    Thread.sleep(100_000 / speed);
                    return (4*Math.PI * rad1 * rad1);

                } else if (educationLevel == 0) {
                    System.out.println("Невозможно");
                    return -999_999_999;
                }
                return rad1;
            }
        }

        } else {
            System.out.println("Ничего не могу сделать.");
            return -999_999_999;
        }
    }
}
