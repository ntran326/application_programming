// Nhu Tran

public class ch5_7 {
    public static void main(String[] args) {
        int tuition = 10000;
        int totalCost = 0;
        int tuitionTenth = 0;

        for (int year = 1; year <= 14; year++) {
            tuition += (tuition * 0.05);

            if (year > 10)
                totalCost += tuition;

            if (year == 10)
                tuitionTenth = tuition;
        }

        System.out.println("Tuition in ten years: $" + tuitionTenth);
        System.out.println("Total cost for four years' worth of tuition" +
                " after the tenth year: $" + totalCost);
    }
}
