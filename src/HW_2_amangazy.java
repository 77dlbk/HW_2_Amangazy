public class HW_2_amangazy {
    public static void main(String[] args) {
        System.out.println(permission(20,15));
        System.out.println(permission(12,-17));
        System.out.println(permission(56,3));
        System.out.println(permission(22,-6));
        System.out.println(permission(2,30));
        System.out.println(permission(generateRandomAge(), 10));
        System.out.println(permission(generateRandomAge(), -20));
        System.out.println(permission(generateRandomAge(), 3));
        System.out.println(permission(generateRandomAge(), -30));
        System.out.println(permission(generateRandomAge(), 20));




    }
    public static String permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }

    }
    public static int generateRandomAge(){
        return (int) (Math.random() * 100);

    }
}
